package tinqin.project.models.author;

import lombok.*;
import tinqin.project.generics.OperationInput;
@Setter(AccessLevel.PRIVATE)
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorRequest implements OperationInput {
    private String memeName;
}
