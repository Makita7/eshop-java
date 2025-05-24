package tinta.nube.cafe.eshop.service;

import tinta.nube.cafe.eshop.dto.ShoeDTO;

public interface ShoesService {

    ShoeDTO getShoe();
    ShoeDTO addShoe(ShoeDTO ShoeItem);
    void deleteShoe(Long id);
    ShoeDTO updateShoe(ShoeDTO ShoeItem);

}
