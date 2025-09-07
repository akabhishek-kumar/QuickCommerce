package com.pricecompare.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductPriceDTO {
    private String productName;
    private String store;
    private double price;
    private String url;
}
