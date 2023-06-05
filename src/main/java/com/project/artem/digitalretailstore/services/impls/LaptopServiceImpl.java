package com.project.artem.digitalretailstore.services.impls;

import com.project.artem.digitalretailstore.models.Product;
import com.project.artem.digitalretailstore.repositories.HardDrivesRepository;
import com.project.artem.digitalretailstore.services.interfaces.LaptopService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class LaptopServiceImpl implements LaptopService {
    private final HardDrivesRepository hardDrivesRepository;
    @Override
    public List<? extends Product> findAllProductsByType() {
        return hardDrivesRepository.findAll();
    }
}
