package tinta.nube.cafe.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tinta.nube.cafe.eshop.model.ShoeItem;

@Repository
public interface ShoesStoreRepository extends JpaRepository<ShoeItem, Long> {
}
