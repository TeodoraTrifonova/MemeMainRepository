package tinqin.project.models.meme;

import lombok.*;
import tinqin.project.generics.OperationInput;

@Setter(AccessLevel.PRIVATE)
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemeRequest implements OperationInput {
    private Long memeID;
}
