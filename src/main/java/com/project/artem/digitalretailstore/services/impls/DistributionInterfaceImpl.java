package com.project.artem.digitalretailstore.services.impls;

import com.project.artem.digitalretailstore.exceptions.DigitalTypeNotFoundException;
import com.project.artem.digitalretailstore.models.Product;
import com.project.artem.digitalretailstore.services.interfaces.*;
import lombok.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Value
public class DistributionInterfaceImpl implements DistributionInterface {
    DisplayService displayService;
    HardDriveService hardDriveService;
    LaptopService laptopService;
    PCService pcService;
    public List<? extends Product> delegateExecutionToInterfaceByTypeAndGetAllProducts(String type) {
        DigitalService digitalService = getDigitalService(type);

        return digitalService.findAllProductsByType();
    }

    @Override
    public Product delegateExecutionToInterfaceByTypeAndGetAllProductsAndGetProductById(String type, long id) {
        DigitalService digitalService = getDigitalService(type);

        return digitalService.findProductById(id);
    }

    @Override
    public void delegateExecutionToInterfaceAndAddProduct(Product product) {

    }

    @Override
    public void delegateExecutionToInterfaceAndUpdateProduct(Product product) {

    }

    private DigitalService getDigitalService(String type) {
        return switch (type) {
            case "displays" -> displayService;
            case "hard-drives" -> hardDriveService;
            case "laptops" -> laptopService;
            case "personal-computers" -> pcService;
            default -> throw new DigitalTypeNotFoundException("This type of product does not exist");
        };
    }
}
