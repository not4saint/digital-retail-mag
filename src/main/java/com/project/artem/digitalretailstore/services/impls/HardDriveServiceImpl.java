package com.project.artem.digitalretailstore.services.impls;

import com.project.artem.digitalretailstore.exceptions.ProductNotFoundException;
import com.project.artem.digitalretailstore.models.Product;
import com.project.artem.digitalretailstore.repositories.HardDrivesRepository;
import com.project.artem.digitalretailstore.services.interfaces.HardDriveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class HardDriveServiceImpl implements HardDriveService {
    private final HardDrivesRepository hardDrivesRepository;
    @Override
    public List<? extends Product> findAllProductsByType() {
        return hardDrivesRepository.findAll();
    }

    @Override
    public Product findProductById(long id) {
        return hardDrivesRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(String.format("Product not found with id: %d", id)));
    }
}
