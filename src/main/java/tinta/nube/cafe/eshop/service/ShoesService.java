package tinta.nube.cafe.eshop.service;

import org.h2.mvstore.Page;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Pageable;
import tinta.nube.cafe.eshop.dto.request.ShoeRequestDTO;
import tinta.nube.cafe.eshop.dto.response.ShoeResponseDTO;
import tinta.nube.cafe.eshop.model.ShoeEntity;

import java.util.UUID;

public interface ShoesService {

    ShoeResponseDTO getShoe(UUID id);
    ShoeResponseDTO addShoe(ShoeRequestDTO ShoeItem);
    void deleteShoe(UUID id);
    ShoeResponseDTO updateShoe(ShoeRequestDTO ShoeItem);
    Page<ShoeResponseDTO> findAll(Pageable pageable);

}
