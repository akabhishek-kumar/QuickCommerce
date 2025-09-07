package com.pricecompare.demo.service;

import com.pricecompare.demo.dto.ProductPriceDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PriceComparisonService {

    public List<ProductPriceDTO> comparePrices(String query) {
        return Arrays.asList(
                new ProductPriceDTO("Amul Toned Milk 1L", "Blinkit", 58, "https://blinkit.com/amul"),
                new ProductPriceDTO("Amul Toned Milk 1L", "Zepto", 60, "https://zepto.com/amul"),
                new ProductPriceDTO("Amul Toned Milk 1L", "BigBasket", 59, "https://bigbasket.com/amul"),
                new ProductPriceDTO("Amul Toned Milk 1L", "Swiggy Instamart", 61, "https://swiggy.com/amul")
        );
    }
}
