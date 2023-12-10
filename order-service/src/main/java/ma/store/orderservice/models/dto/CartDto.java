package ma.store.orderservice.models.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import ma.store.orderservice.models.entities.Order;

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

