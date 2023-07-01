 /*Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. 
 Получить наименования товаров заданного сорта с наименьшей ценой.*/

 ackage src.main.java.org.example.Object2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items2 {

    private String name;
    private String countryName;
    private Double price;
    private Double weight;
    private Integer sort;



}
