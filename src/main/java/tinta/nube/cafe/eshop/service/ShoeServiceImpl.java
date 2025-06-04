package tinta.nube.cafe.eshop.service;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import lombok.RequiredArgsConstructor;
import tinta.nube.cafe.eshop.dto.request.ShoeRequestDTO;
import tinta.nube.cafe.eshop.dto.response.ShoeResponseDTO;
import tinta.nube.cafe.eshop.error.EShopCustomException;
import tinta.nube.cafe.eshop.model.ShoeEntity;
import tinta.nube.cafe.eshop.repository.ShoesStoreRepository;

@Service
@RequiredArgsConstructor
public class ShoeServiceImpl implements ShoesService {

    private final ShoesStoreRepository shoeRepository;

    @Override
    public ShoeResponseDTO getShoe(UUID id) {
        ShoeEntity shoeEntity = shoeRepository.getReferenceById(id);
        shoeRepository.
        return ShoeResponseDTO
                .builder()
                .name(shoeEntity.getName())
                .size(shoeEntity.getSize())
                .gender(shoeEntity.getGender())
                .id(shoeEntity.getId())
                .build();
    }

    @Override
    public ShoeResponseDTO addShoe(ShoeRequestDTO shoeRequestDTO) {

        validateShoeRequest(shoeRequestDTO, true);

        ShoeEntity newShoe = ShoeEntity
                .builder()
                .name(shoeRequestDTO.getName())
                .size(shoeRequestDTO.getSize())
                .gender(shoeRequestDTO.getGender())
                .build();

        ShoeEntity savedShoe = shoeRepository.save(newShoe);

        return ShoeResponseDTO
                .builder()
                .name(savedShoe.getName())
                .size(savedShoe.getSize())
                .gender(savedShoe.getGender())
                .id(savedShoe.getId())
                .build();
    }

    private void validateShoeRequest(ShoeRequestDTO shoeRequestDTO, Boolean isCreation) {
        if(ObjectUtils.isEmpty(shoeRequestDTO.getName())){
            throw new RuntimeException("Name must not be empty");
        }
        if(!isCreation && shoeRequestDTO.getId() == null){
            throw new RuntimeException("Id can't be null");
        }
        if (shoeRequestDTO.getSize() == null){
            throw new RuntimeException("Size cannot be null");
        }
        if(shoeRequestDTO.getGender() == null) {
            throw new RuntimeException("Gender cannot be null");
        }
        /*if (ObjectUtils.isEmpty(shoeRequestDTO.getName()) || (!isCreation && shoeRequestDTO.getId() == null)
              || shoeRequestDTO.getSize() == null || shoeRequestDTO.getGender() == null) {
            throw new EShopCustomException("Error validating show creation input", "Check your provide data", "", HttpStatus.BAD_REQUEST);
        }*/
    }

    //delete
    @Override
    public void deleteShoe(UUID id) {
        shoeRepository.deleteById(id);
    }

    @Override
    public ShoeResponseDTO updateShoe(ShoeRequestDTO shoeItem) {

        validateShoeRequest(shoeItem, false);

        ShoeEntity shoeEntity = ShoeEntity
                .builder()
                .id(shoeItem.getId())
                .name(shoeItem.getName())
                .gender(shoeItem.getGender())
                .size(shoeItem.getSize())
                .build();

        ShoeEntity updatedShoe = shoeRepository.save(shoeEntity);

        return ShoeResponseDTO
                .builder()
                .id(updatedShoe.getId())
                .name(updatedShoe.getName())
                .size(updatedShoe.getSize())
                .gender(updatedShoe.getGender())
                .build();
    }
}