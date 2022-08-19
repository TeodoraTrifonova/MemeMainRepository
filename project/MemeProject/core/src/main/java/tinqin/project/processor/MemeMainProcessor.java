package tinqin.project.processor;

import io.vavr.control.Either;
import io.vavr.control.Try;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import tinqin.project.data.entity.Meme;
import tinqin.project.data.repository.MemeRepository;
import tinqin.project.error.general.GeneralServerError;
import tinqin.project.error.meme.NoMemeFound;
import tinqin.project.exeption.MemeNotFoundExeption;
import tinqin.project.generics.Error;
import tinqin.project.models.meme.MemeRequest;
import tinqin.project.models.meme.MemeResponse;
import tinqin.project.operation.MemeProcessor;

@Service
public class MemeMainProcessor implements MemeProcessor {
private final MemeRepository memeRepository;
private final ConversionService conversionService;
    public MemeMainProcessor(MemeRepository memeRepository, ConversionService conversionService) {
        this.memeRepository = memeRepository;
        this.conversionService = conversionService;
    }

    @Override
    public Either<Error, MemeResponse> process(MemeRequest input)
    {
        return Try.of(()-> {

            final Meme meme = memeRepository.findById(input.getMemeID())
                    .orElseThrow(MemeNotFoundExeption::new);
            return conversionService.convert(meme,MemeResponse.class);
            }).toEither()
                .mapLeft(throwable -> {
                    if(throwable instanceof MemeNotFoundExeption)
                    {
                        return new NoMemeFound();
                    }
                    return new GeneralServerError();
                });
    }
}
