package nvc.it.testfinal.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter @NoArgsConstructor
public class Product {
    @Id
    // private String _id;
    private String prdId;
    private String name;
    private Integer price;
    private Integer unit;

}
