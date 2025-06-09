package tinta.nube.cafe.eshop.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tinta.nube.cafe.eshop.model.ClientEntity;

@Repository
public interface ClientsRepository extends JpaRepository<ClientEntity, UUID> {

}
