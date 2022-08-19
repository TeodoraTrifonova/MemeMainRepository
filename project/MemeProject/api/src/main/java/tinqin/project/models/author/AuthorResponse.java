package tinqin.project.models.author;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import tinqin.project.generics.OperationResult;
@Builder
@Setter(AccessLevel.PRIVATE)
@Getter
public class AuthorResponse implements OperationResult {

    private String authorName;
}
