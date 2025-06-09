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

@Entity(name = "ADDRESSES")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.UUID)
   private UUID id;

   private String street;

   private Integer number;

   private String province;

   private Integer zipCode;

   private String country;

   private String label;

   @ManyToOne
   @JoinColumn(name = "client_id")
   private ClientEntity clientEntity;
}
