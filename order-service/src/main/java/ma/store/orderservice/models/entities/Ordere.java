package ma.store.orderservice.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
@Builder
public class Ordere {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_order;
  private Double total;
  private Long id_user;
    @ElementCollection
    private List<Long> idproducts;

}