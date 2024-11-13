package com.backend.aula09.service;

import com.backend.aula09.exception.ProductNotFoundException;
import com.backend.aula09.model.Product;
import com.backend.aula09.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class GetProductByIdUseCase {

    @Autowired
    private ProductRepository productRepository;

    public Product execute(UUID id) {
        Optional<Product> optionalProduct = productRepository.findById(id);

        if(optionalProduct.isEmpty()){
            throw new ProductNotFoundException();
        }

        return optionalProduct.get();
    }
}
