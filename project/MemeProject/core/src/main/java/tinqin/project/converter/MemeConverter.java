package tinqin.project.converter;

import org.springframework.core.convert.converter.Converter;
import tinqin.project.data.entity.Meme;
import tinqin.project.models.meme.MemeResponse;

public class MemeConverter implements Converter<Meme, MemeResponse> {
    @Override
    public MemeResponse convert(Meme meme){
    return MemeResponse.builder()
            .authorMeme(meme.getAuthorMeme().getAuthorName())
            .memeName(meme.getMemeName())
            .avatarURL1(meme.getAvatarURL1())
            .avatarURL2(meme.getAvatarURL2())
            .text1(meme.getText1())
            .text2(meme.getText2())
            .username(meme.getUsername())
            .rating(meme.getRating())
            .build();
    }
}
