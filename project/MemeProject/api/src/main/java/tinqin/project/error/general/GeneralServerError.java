package tinqin.project.error.general;

import org.springframework.http.HttpStatus;
import tinqin.project.generics.Error;

public class GeneralServerError implements Error {
    @Override
    public String getMessage() {
        return "Unhandled exceptions!";
    }

    @Override
    public HttpStatus getCode() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
