package tinqin.project.models.meme.db;

import lombok.*;

@Setter(AccessLevel.PRIVATE)
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DBMemeRequest {
    private Long memeID;
}
