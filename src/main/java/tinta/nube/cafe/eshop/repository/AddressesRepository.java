package tinta.nube.cafe.eshop.repository;

import java.util.Set;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tinta.nube.cafe.eshop.model.AddressEntity;

@Repository
public interface AddressesRepository extends JpaRepository<AddressEntity, UUID> {

   @Query(value = "SELECT * FROM ADDRESSES WHERE client_id = :clientId", nativeQuery = true)
   Set<AddressEntity> getAddressesByClientId(UUID clientId);
}
