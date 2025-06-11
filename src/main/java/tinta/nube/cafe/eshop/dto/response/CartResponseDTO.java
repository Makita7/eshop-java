package tinta.nube.cafe.eshop.dto.response;

import lombok.Builder;
import tinta.nube.cafe.eshop.model.ShoeEntity;

import java.util.List;
import java.util.UUID;

@Builder
public class CartResponseDTO {

    private UUID id;

    private String clientId;

    private List<ShoeEntity> selectedProducts;
}
