package tinqin.project.error.author;

import org.springframework.http.HttpStatus;
import tinqin.project.generics.Error;

public class NoAuthorFound implements Error {
    @Override
    public String getMessage() {
        return "Author doesn't extist!";
    }

    @Override
    public HttpStatus getCode() {
        return HttpStatus.NOT_FOUND;
    }
}

