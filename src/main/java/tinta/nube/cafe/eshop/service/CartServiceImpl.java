package tinta.nube.cafe.eshop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tinta.nube.cafe.eshop.dto.response.CartResponseDTO;
import tinta.nube.cafe.eshop.model.CartEntity;
import tinta.nube.cafe.eshop.model.CartProductsEntity;
import tinta.nube.cafe.eshop.repository.CartRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService{

    private final CartRepository cartRepository;

    @Override
    public CartResponseDTO getCartByClientId(UUID cartId){
        List<CartProductsEntity> filteredCart = cartRepository.getCartList(cartId);

        //TODO map filteredCart to a list of CartResponseDTO and return it
        //TODO add product quantity to product dto

        return CartResponseDTO.builder()
                .id(filteredCart.getId())
                .clientId(filteredCart.getClientId())
                .selectedProducts(filteredCart.getSelectedProducts())
                .build();
    }

}
