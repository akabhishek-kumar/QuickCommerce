package com.pricecompare.demo.controller;

import com.pricecompare.demo.dto.ProductPriceDTO;
import com.pricecompare.demo.service.PriceComparisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PriceComparisonController {

    @Autowired
    private PriceComparisonService priceComparisonService;

    @GetMapping("/search")
    public List<ProductPriceDTO> searchProducts(@RequestParam String query) {
        return priceComparisonService.comparePrices(query);
    }
}
