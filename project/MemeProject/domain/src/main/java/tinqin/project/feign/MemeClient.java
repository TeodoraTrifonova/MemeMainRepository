package tinqin.project.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value="meme", url = "http://localhost:8081/")
public interface MemeClient {
    @PostMapping("/getMemeByID")

}
