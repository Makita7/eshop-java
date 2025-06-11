package tinta.nube.cafe.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tinta.nube.cafe.eshop.model.AddressEntity;
import tinta.nube.cafe.eshop.model.CartEntity;
import tinta.nube.cafe.eshop.model.CartProductsEntity;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Repository
public interface CartRepository extends JpaRepository<CartProductsEntity, UUID> {

   @Query(value = "Select * from CART_PRODUCTS WHERE cart_id = :cartId", nativeQuery = true)
   List<CartProductsEntity> getCartList(UUID cartId);

}
