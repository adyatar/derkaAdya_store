package ma.store.inventoryservice.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prod;
    private String name_prod;
    private  String desc_prod;
    private  Double price;
    private  int qte_prod;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cat")
    @JsonIgnore
    private Category category;
    @Transient
    private Long id_cat;
}