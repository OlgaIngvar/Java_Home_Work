/*Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. 
Найти названия книг, в которых простое количество страниц, фамилия автора 
содержит «А» и год издания после 2010 г, включительно.*/

package src.main.java.org.example.Object3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Books {

    private String name;
    private String author;
    private Double price;
    private Integer year;
    private Integer pgNum;
}
