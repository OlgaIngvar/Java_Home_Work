/*Дан массив записей: наименование товара, цена, сорт. 
Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».*/

package src.main.java.org.example.Object1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String name;
    private Double price;
    private Integer sort;


}