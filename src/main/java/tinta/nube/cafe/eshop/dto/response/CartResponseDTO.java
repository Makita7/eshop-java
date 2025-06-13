package tinta.nube.cafe.eshop.dto.response;

import jakarta.persistence.OneToMany;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
public class CartResponseDTO {

    private UUID id;

    private UUID clientId;

    private List<ShoeResponseDTO> selectedProducts;

    private Integer quantity;
}
