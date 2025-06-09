package tinta.nube.cafe.eshop.service;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tinta.nube.cafe.eshop.dto.response.ClientAddressResponseDTO;
import tinta.nube.cafe.eshop.model.AddressEntity;
import tinta.nube.cafe.eshop.repository.AddressesRepository;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

   private final AddressesRepository addressesRepository;

   @Override
   public Set<ClientAddressResponseDTO> getAddressesByClientId(UUID id) {
      Set<AddressEntity> addresses = addressesRepository.getAddressesByClientId(id);

      return addresses.stream().map(addressEntity -> ClientAddressResponseDTO
            .builder()
            .addressId(addressEntity.getId())
            .clientId(id)
            .street(addressEntity.getStreet())
            .number(addressEntity.getNumber())
            .province(addressEntity.getProvince())
            .zipCode(addressEntity.getZipCode())
            .country(addressEntity.getCountry())
            .label(addressEntity.getLabel())
            .build())
      .collect(Collectors.toSet());
   }
}
