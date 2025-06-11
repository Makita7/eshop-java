package tinta.nube.cafe.eshop.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "SHOES")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShoeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private Short size;
    private String gender;

    @ManyToMany
    private List<CartEntity> carts;
}
