package com.example.product.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int productId;
    private String name;
    private int quantity;
    private double unitPrice;
    private String image;
    private String description;
    private double discount;
    private Date enterDate;
    private short status;
    private int categoryId;

}
