package tinqin.project.models.author.db;

import lombok.*;

@Setter(AccessLevel.PRIVATE)
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DBAuthorRequest {
    private String memeName;
}
