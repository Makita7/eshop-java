package tinta.nube.cafe.eshop.dto.response;

import java.util.UUID;

import lombok.Builder;

@Builder
public class ClientAddressResponseDTO {
   private UUID addressId;

   private UUID clientId;

   private String street;

   private Integer number;

   private String province;

   private Integer zipCode;

   private String country;

   private String label;

}
