package tinta.nube.cafe.eshop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import tinta.nube.cafe.eshop.dto.request.ShoeRequestDTO;
import tinta.nube.cafe.eshop.dto.response.ShoeResponseDTO;
import tinta.nube.cafe.eshop.model.ShoeEntity;
import tinta.nube.cafe.eshop.repository.ShoesStoreRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ShoeServiceImpl implements ShoesService {

    private final ShoesStoreRepository shoeRepository;

    //getReferenceById
    @Override
    public ShoeResponseDTO getShoe(UUID id) {
        ShoeEntity shoeEntity = shoeRepository.getReferenceById(id);

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

        try {
            validateShoeRequest(shoeRequestDTO, true);
        } catch (Exception e){
            return ShoeResponseDTO.builder().build();
        }

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

    private boolean validateShoeRequest(ShoeRequestDTO shoeRequestDTO, Boolean isCreation) throws Exception {
        if(ObjectUtils.isEmpty(shoeRequestDTO.getName())){
            throw new Exception("Name must not be empty");
        }
        if(!isCreation && shoeRequestDTO.getId() == null){
            throw new Exception("Id can't be null");
        }
        if (shoeRequestDTO.getSize() == null){
            throw new Exception("Size cannot be null");
        }
        if(shoeRequestDTO.getGender() == null){
            throw new Exception("Gender cannot be null");
        }
    }

    //delete
    @Override
    public void deleteShoe(UUID id) {
        shoeRepository.deleteById(id);
    }

    @Override
    public ShoeResponseDTO updateShoe(ShoeRequestDTO shoeItem) {
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