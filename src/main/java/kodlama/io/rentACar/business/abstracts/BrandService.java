package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.reponses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.reponses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;

import java.util.List;

public interface BrandService {
    //iş kurallarını yazıcaz yan, aynı markadan 2 defa yazılmaz gibi
    List<GetAllBrandsResponse> getAll();

    GetByIdBrandResponse getById(int id);

    void add(CreateBrandRequest createBrandRequest);

    void update(UpdateBrandRequest updateBrandRequest);

    void delete(int id);
}
