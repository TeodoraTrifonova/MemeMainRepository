package tinqin.project.processor;

import io.vavr.control.Either;
import io.vavr.control.Try;
import org.springframework.stereotype.Service;
import tinqin.project.error.general.GeneralServerError;
import tinqin.project.error.meme.NoMemeFound;
import tinqin.project.exeption.MemeNotFoundExeption;
import tinqin.project.feign.MemeClient;
import tinqin.project.feign.MemeCrudClient;
import tinqin.project.generics.Error;
import tinqin.project.models.meme.MemeRequest;
import tinqin.project.models.meme.MemeResponse;
import tinqin.project.models.meme.db.DBMemeRequest;
import tinqin.project.models.meme.db.DBMemeResponse;
import tinqin.project.operation.MemeProcessor;

@Service
public class MemeMainProcessor implements MemeProcessor {
private final MemeCrudClient memeCrudClient;

    public MemeMainProcessor(MemeClient memeClient, MemeCrudClient memeCrudClient) {

        this.memeCrudClient = memeCrudClient;
    }

    @Override
    public Either<Error, MemeResponse> process(MemeRequest input)
    {
        return Try.of(()-> {

            final DBMemeResponse dbMemeResponse = memeCrudClient.getMeme(
                    DBMemeRequest.builder().memeID(input.getMemeID()).build());
            return MemeResponse.builder()
                    .authorMeme(dbMemeResponse.getAuthorMeme())
                    .memeName(dbMemeResponse.getMemeName())
                    .avatarURL1(dbMemeResponse.getAvatarURL1())
                    .avatarURL2(dbMemeResponse.getAvatarURL2())
                    .text1(dbMemeResponse.getText1())
                    .text2(dbMemeResponse.getText2())
                    .username(dbMemeResponse.getUsername())
                    .rating(dbMemeResponse.getRating())
                    .build();

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
