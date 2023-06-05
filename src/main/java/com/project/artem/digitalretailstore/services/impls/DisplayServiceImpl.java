package com.project.artem.digitalretailstore.services.impls;

import com.project.artem.digitalretailstore.models.Product;
import com.project.artem.digitalretailstore.repositories.DisplaysRepository;
import com.project.artem.digitalretailstore.services.interfaces.DisplayService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DisplayServiceImpl implements DisplayService {
    private final DisplaysRepository displaysRepository;
    @Override
    public List<? extends Product> findAllProductsByType() {
        return displaysRepository.findAll();
    }

    @Override
    public Product findProductById(long id) {
        return displaysRepository.fin;
    }
}
