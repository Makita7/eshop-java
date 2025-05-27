package tinta.nube.cafe.eshop.service;

import tinta.nube.cafe.eshop.dto.request.ShoeRequestDTO;

import java.util.UUID;

public interface ShoesService {

    ShoeRequestDTO getShoe(UUID id);
    ShoeRequestDTO addShoe(ShoeRequestDTO ShoeItem);
    void deleteShoe(UUID id);
    ShoeRequestDTO updateShoe(ShoeRequestDTO ShoeItem);

}
