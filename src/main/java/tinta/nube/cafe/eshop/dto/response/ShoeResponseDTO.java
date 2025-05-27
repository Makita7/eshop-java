package tinta.nube.cafe.eshop.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class ShoeResponseDTO {
    private UUID id;
    private String name;
    private Short size;
    private String gender;

}
