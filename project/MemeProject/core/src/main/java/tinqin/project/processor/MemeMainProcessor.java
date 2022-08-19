package tinqin.project.processor;

import io.vavr.control.Either;
import io.vavr.control.Try;
import org.springframework.stereotype.Service;
import tinqin.project.data.entity.Meme;
import tinqin.project.data.repository.MemeRepository;
import tinqin.project.generics.Error;
import tinqin.project.models.meme.MemeRequest;
import tinqin.project.models.meme.MemeResponse;
import tinqin.project.operation.MemeProcessor;

@Service
public class MemeMainProcessor implements MemeProcessor {
private final MemeRepository memeRepository;

    public MemeMainProcessor(MemeRepository memeRepository) {
        this.memeRepository = memeRepository;
    }

    @Override
    public Either<Error, MemeResponse> process(MemeRequest input)
    {
        return Try.of(()-> {

            final Meme meme = memeRepository.findBy()

                }
        )
    }
}
