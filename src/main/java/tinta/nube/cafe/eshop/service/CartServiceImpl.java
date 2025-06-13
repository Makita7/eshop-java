package tinta.nube.cafe.eshop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tinta.nube.cafe.eshop.dto.response.CartResponseDTO;
import tinta.nube.cafe.eshop.model.CartEntity;
import tinta.nube.cafe.eshop.model.CartProductsEntity;
import tinta.nube.cafe.eshop.repository.CartRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService{

    private final CartRepository cartRepository;

    @Override
    public CartResponseDTO getCartByClientId(UUID cartId){
        List<CartProductsEntity> filteredCart = cartRepository.getCartList(cartId);

        return filteredCart.stream().map(product -> CartResponseDTO.builder()
                .id(product.getId())
                .clientId(product.getClientEntity().getId())
                .selectedProducts(product.getShoeEntity().getId())
                .quantity(product.getQuantity())
                .build())
            .collect(Collectors.toList());
    }

}
