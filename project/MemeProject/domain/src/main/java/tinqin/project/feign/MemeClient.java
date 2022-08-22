package tinqin.project.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tinqin.project.models.meme.MemeRequest;
import tinqin.project.models.meme.MemeResponse;

@FeignClient(value="meme", url = "http://localhost:8081/")
public interface MemeClient {
    @PostMapping("/getMemeFromDB")
    MemeResponse getMeme(@RequestBody MemeRequest memeRequest);

}
