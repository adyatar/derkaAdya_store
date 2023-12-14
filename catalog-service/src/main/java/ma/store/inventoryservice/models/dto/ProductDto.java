package ma.store.inventoryservice.models.dto;


import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductDto {
    private Long id_prod;
    private String name_prod;
    private  String desc_prod;
    private  String image_prod;
    private  Double price;
    private  int qte_prod;
    private Long id_cat;
}
