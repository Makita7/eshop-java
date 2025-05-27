package tinta.nube.cafe.eshop.service;

import org.springframework.stereotype.Service;
import tinta.nube.cafe.eshop.dto.request.ShoeRequestDTO;

import java.util.UUID;

@Service
public class ShoeServiceImpl implements ShoesService {

    @Override
    public ShoeRequestDTO getShoe(UUID id) {
        return null;
    }

    @Override
    public ShoeRequestDTO addShoe(ShoeRequestDTO ShoeItem) {
        return null;
    }

    @Override
    public void deleteShoe(UUID id) {

    }

    @Override
    public ShoeRequestDTO updateShoe(ShoeRequestDTO ShoeItem) {
        return null;
    }
}
