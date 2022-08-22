package tinqin.project.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tinqin.project.models.meme.db.DBMemeRequest;
import tinqin.project.models.meme.db.DBMemeResponse;

import java.util.List;

@FeignClient(value="memeCrud", url = "http://localhost:8082/")
public interface MemeCrudClient {
    @PostMapping("/getMemeFromDB")
    DBMemeResponse getMeme(@RequestBody DBMemeRequest dbMemeRequest);

}
