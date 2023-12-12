package ma.store.cartservice.Entitie;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import ma.store.cartservice.dto.ProductDto;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "db_cartitem")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;
    private int qte;
    private Double price;
    @Transient
    private ProductDto product;
    private Long productId;
}
