package tinta.nube.cafe.eshop.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class ShoeRequestDTO {
    @NotNull(message = "The Shoe ID can't be null")
    private UUID id;

    @NotBlank(message = "Shoe name can't be null")
    private String name;

    @NotNull(message = "Shoe size can't be null")
    private Short size;

    @NotNull(message = "Shoe genre can't be null")
    private String gender;

}
