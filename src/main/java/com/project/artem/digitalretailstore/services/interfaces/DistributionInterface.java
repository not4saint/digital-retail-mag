package com.project.artem.digitalretailstore.services.interfaces;

import com.project.artem.digitalretailstore.models.Product;

import java.util.List;

public interface DistributionInterface {
    List<? extends Product> delegateExecutionToInterfaceByTypeAndGetAllProducts(String type);
    Product delegateExecutionToInterfaceByTypeAndGetAllProductsAndGetProductById(String type, long id);
    void delegateExecutionToInterfaceAndAddProduct(Product product);
    void delegateExecutionToInterfaceAndUpdateProduct(Product product);
}
