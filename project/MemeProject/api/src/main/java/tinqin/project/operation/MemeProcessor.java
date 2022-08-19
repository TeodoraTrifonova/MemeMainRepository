package tinqin.project.operation;

import org.springframework.stereotype.Service;
import tinqin.project.generics.OperationProcessor;
import tinqin.project.models.meme.MemeRequest;
import tinqin.project.models.meme.MemeResponse;


public interface MemeProcessor extends OperationProcessor<MemeRequest, MemeResponse> {

}
