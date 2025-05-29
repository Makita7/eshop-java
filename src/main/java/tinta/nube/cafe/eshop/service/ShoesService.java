package tinta.nube.cafe.eshop.service;

import tinta.nube.cafe.eshop.dto.request.ShoeRequestDTO;
import tinta.nube.cafe.eshop.dto.response.ShoeResponseDTO;

import java.util.UUID;

public interface ShoesService {

    ShoeResponseDTO getShoe(UUID id);
    ShoeResponseDTO addShoe(ShoeRequestDTO ShoeItem);
    void deleteShoe(UUID id);
    ShoeResponseDTO updateShoe(ShoeRequestDTO ShoeItem);

}
