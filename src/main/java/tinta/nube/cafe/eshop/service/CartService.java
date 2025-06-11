package tinta.nube.cafe.eshop.service;

import tinta.nube.cafe.eshop.dto.response.CartResponseDTO;

import java.util.List;
import java.util.UUID;

public interface CartService {
    CartResponseDTO getCartByClientId(UUID clientId);
}
