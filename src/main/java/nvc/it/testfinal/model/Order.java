package nvc.it.testfinal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
// import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Document("orders")
@Getter @Setter @NoArgsConstructor
public class Order {
    @Id
    private String _id;
    private String orderId;

    @CreatedDate
    private Date orderDate;

    private String payment;
    private List<Product> products = new ArrayList<Product>();
    
}
