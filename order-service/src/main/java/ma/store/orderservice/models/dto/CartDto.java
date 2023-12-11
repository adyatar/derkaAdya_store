package ma.store.orderservice.models.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CartDto {

    private Long id_prod;
    private Long id_user;
    private int qte;
    private Double price;
    private double somme;

}

