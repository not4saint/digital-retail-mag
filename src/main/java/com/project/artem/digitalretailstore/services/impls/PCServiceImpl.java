package com.project.artem.digitalretailstore.services.impls;

import com.project.artem.digitalretailstore.models.Product;
import com.project.artem.digitalretailstore.repositories.PCsRepository;
import com.project.artem.digitalretailstore.services.interfaces.PCService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PCServiceImpl implements PCService {
    private final PCsRepository pCsRepository;
    @Override
    public List<? extends Product> findAllProductsByType() {
        return pCsRepository.findAll();
    }
}
