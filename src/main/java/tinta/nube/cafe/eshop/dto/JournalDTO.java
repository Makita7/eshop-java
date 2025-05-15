package tinta.nube.cafe.eshop.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class JournalDTO {
    @NotNull(message = "The Journal ID can't be null")
    private Long id;

    @NotNull(message = "Journal name can't be null")
    private String name;

    @NotNull(message = "Journal cover type can't be null")
    private String coverType;

    @NotNull(message = "Journal modal type can't be null")
    private String model;

}
