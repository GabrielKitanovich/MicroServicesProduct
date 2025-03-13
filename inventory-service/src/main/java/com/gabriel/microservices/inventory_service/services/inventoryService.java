package com.gabriel.microservices.inventory_service.services;
import com.gabriel.microservices.inventory_service.repository.inventoryRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class inventoryService {
    private final inventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, Integer quantity) {
        
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    
    }

}
