package ma.store.inventoryservice.models.dto;


import lombok.*;
import ma.store.inventoryservice.models.entities.Category;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductDto {
    private String name_prod;
    private  String desc_prod;
    private  Double price;
    private  int qte_prod;
    private Category category;
}
