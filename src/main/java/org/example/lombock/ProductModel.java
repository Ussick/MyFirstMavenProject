package org.example.lombock;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@EqualsAndHashCode
@Getter
@Setter
@ToString(exclude = "name")
public class ProductModel {
//    @Getter только на поле name
//    @Setter - только на поле name
    private String name;
    private String category;
    @Setter(AccessLevel.PRIVATE)
    private BigDecimal price;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
}
