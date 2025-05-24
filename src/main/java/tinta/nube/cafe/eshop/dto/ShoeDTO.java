package tinta.nube.cafe.eshop.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class ShoeDTO {
    @NotNull(message = "The Shoe ID can't be null")
    private Long id;

    @NotNull(message = "Shoe name can't be null")
    private String name;

    @NotNull(message = "Shoe size can't be null")
    private Number size;

    @NotNull(message = "Shoe genre can't be null")
    private String gender = "unisex";

}
