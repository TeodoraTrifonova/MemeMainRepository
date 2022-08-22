package tinqin.project.models.author.db;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
public class DBAuthorResponse {

    private Long authorID;

    private String authorName;
}
