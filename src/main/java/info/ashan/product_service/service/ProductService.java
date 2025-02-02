package info.ashan.product_service.service;

import info.ashan.product_service.dto.ProductRequest;

public interface ProductService {
    void createProduct(ProductRequest productRequest);
}
