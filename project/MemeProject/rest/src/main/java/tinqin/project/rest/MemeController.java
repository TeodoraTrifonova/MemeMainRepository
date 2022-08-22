package tinqin.project.rest;

import io.vavr.control.Either;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tinqin.project.generics.Error;
import tinqin.project.models.meme.MemeRequest;
import tinqin.project.models.meme.MemeResponse;
import tinqin.project.processor.MemeMainProcessor;

@RestController
public class MemeController {
    private final MemeMainProcessor memeMainProcessor;

    public MemeController(MemeMainProcessor memeMainProcessor) {
        this.memeMainProcessor = memeMainProcessor;
    }

    @PostMapping("/getMeme")
    public ResponseEntity<?> getMeme(@RequestBody final MemeRequest memeRequest)
    {
        Either<Error, MemeResponse> response = memeMainProcessor.process(memeRequest);
        if(response.isLeft())
        {
            return ResponseEntity.status(response.getLeft().getCode()).body(response.getLeft().getMessage());
        }
        return ResponseEntity.status(HttpStatus.OK).body(response.get());
    }
}
