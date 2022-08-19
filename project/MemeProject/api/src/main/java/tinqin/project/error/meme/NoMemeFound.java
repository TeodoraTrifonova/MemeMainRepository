package tinqin.project.error.meme;

import org.springframework.http.HttpStatus;
import tinqin.project.generics.Error;

public class NoMemeFound implements Error {
    @Override
    public String getMessage() {
        return "Meme doesn't extist!";
    }

    @Override
    public HttpStatus getCode() {
        return HttpStatus.NOT_FOUND;
    }
}
