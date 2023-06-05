package com.project.artem.digitalretailstore.controllers;

import com.project.artem.digitalretailstore.models.Product;
import com.project.artem.digitalretailstore.services.impls.DistributionInterfaceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/digital-retail-mag")
@RequiredArgsConstructor
public class DigitalController {
    private final DistributionInterfaceImpl distributionInterfaceImpl;

    @GetMapping("/all-products/{type}")
    public List<? extends Product> getAllProductsByType(@PathVariable String type) {
        return distributionInterfaceImpl.delegateExecutionToInterfaceByTypeAndGetAllProducts(type);
    }

    @GetMapping("/all-products/{type}/{id}")
    public Product getProductById(@PathVariable String type, @PathVariable long id) {
        return distributionInterfaceImpl.delegateExecutionToInterfaceByTypeAndGetAllProductsAndGetProductById(type, id);
    }
}
