package ma.store.cartservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

    private Long id_prod;
    private String name_prod;
    private  String desc_prod;
    private  String image_prod;
    private  Double price;
    private  int qte_prod;
    private Long id_cat;

}
