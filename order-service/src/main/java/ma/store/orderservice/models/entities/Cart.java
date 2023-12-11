package ma.store.orderservice.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder
@IdClass(MyCompositId.class)
public class Cart {
@Id
    private Long id_prod;
@Id
    private Long id_user;
private int qte;
private Double price;
private double somme;


}
