package tinta.nube.cafe.eshop.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "CART")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID clientId;

    /*@ManyToMany
    @JoinTable(name = "CART_PRODUCTS",
          joinColumns = { @JoinColumn(name = "cart_id") },
          inverseJoinColumns = { @JoinColumn(name = "shoe_id") }
    )*/
   // private List<ShoeEntity> selectedProducts;

}
