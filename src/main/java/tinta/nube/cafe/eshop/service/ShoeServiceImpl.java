package tinta.nube.cafe.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tinta.nube.cafe.eshop.dto.request.ShoeRequestDTO;
import tinta.nube.cafe.eshop.repository.ShoesStoreRepository;

import java.util.UUID;

@Service
public class ShoeServiceImpl implements ShoesService {

    @Override
    public ShoeRequestDTO getShoe(UUID id) {
        return null;
    }

    @Override
    public ShoeRequestDTO addShoe(ShoeRequestDTO ShoeItem) {
        ShoeRequestDTO newShoe = ShoeRequestDTO.builder()
                .id()
                .name("Nike Air")
                .size(40)
                .gender("unisex")
                .build();


        return ShoesStoreRepository.saveShoe(newShoe);
    }

    @Override
    public void deleteShoe(UUID id) {
        ShoesStoreRepository.deleteShoeById(id);
    }

    @Override
    public ShoeRequestDTO updateShoe(ShoeRequestDTO ShoeItem) {
        return null;
    }
}
