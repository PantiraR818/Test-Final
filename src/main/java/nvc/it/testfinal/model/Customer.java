package nvc.it.testfinal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("customers")
@Getter @Setter @NoArgsConstructor
public class Customer {
    @Id
    private String _id;
    private String cusId;
    private String name;
    private String address;
    private String tel;

    // ใช้เก็บข้อมูลของ Order
    private List<Order> orders = new ArrayList<Order>();

    // เก็บวันที่
    @CreatedDate
    private Date createdAt;

    // เก็บค่าที่มีการแก้ไขแล้ว
    @LastModifiedDate
    private Date updateDate;



}
