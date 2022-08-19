package tinqin.project.models.meme;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import tinqin.project.generics.OperationResult;

@Builder
@Setter(AccessLevel.PRIVATE)
@Getter
public class MemeResponse implements OperationResult {

    private String authorMeme;

    private String memeName;

    private String avatarURL1;

    private String avatarURL2;

    private String text1;

    private String text2;

    private String username;

    private Integer rating;
}
