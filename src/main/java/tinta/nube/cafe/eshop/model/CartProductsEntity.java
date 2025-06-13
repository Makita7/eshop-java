package tinta.nube.cafe.eshop.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "CART_PRODUCTS")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartProductsEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.UUID)
   private UUID id;

   @ManyToOne
   @JoinColumn(name = "client_id")
   private ClientEntity clientEntity;

   @ManyToOne
   @JoinColumn(name = "product_id")
   private ShoeEntity shoeEntity;

   @ManyToOne
   @JoinColumn(name = "cart_id")
   private CartEntity cartEntity;

   private Integer quantity;

}
