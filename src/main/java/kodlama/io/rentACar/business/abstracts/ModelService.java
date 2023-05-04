package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.reponses.GetAllModelsResponse;
import kodlama.io.rentACar.business.requests.CreateModelRequest;
import kodlama.io.rentACar.business.requests.UpdateModelRequest;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
    void add(CreateModelRequest createModelRequest);

    void update(UpdateModelRequest updateModelRequest);
}
