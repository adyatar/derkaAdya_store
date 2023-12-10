package ma.store.orderservice.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_order;
    @OneToMany(mappedBy="order" , cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Cart> carts;
  private Double total;

}