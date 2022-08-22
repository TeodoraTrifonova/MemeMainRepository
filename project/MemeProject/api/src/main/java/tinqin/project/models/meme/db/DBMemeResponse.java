package tinqin.project.models.meme.db;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
public class DBMemeResponse {

    private Long memeID;

    private String authorMeme;

    private String memeName;

    private String avatarURL1;

    private String avatarURL2;

    private String text1;

    private String text2;

    private String username;

    private Integer rating;
}
