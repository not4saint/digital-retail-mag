package com.project.artem.digitalretailstore.services.interfaces;

import com.project.artem.digitalretailstore.models.Product;

import java.util.List;

public interface DigitalService {
    List<? extends Product> findAllProductsByType();
    Product findProductById(long id);
}
