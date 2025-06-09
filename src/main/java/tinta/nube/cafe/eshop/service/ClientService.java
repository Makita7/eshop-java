package tinta.nube.cafe.eshop.service;

import java.util.Set;
import java.util.UUID;

import tinta.nube.cafe.eshop.dto.response.ClientAddressResponseDTO;

public interface ClientService {

   Set<ClientAddressResponseDTO> getAddressesByClientId(UUID clientId);

}
