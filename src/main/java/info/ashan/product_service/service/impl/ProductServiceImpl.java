package info.ashan.product_service.service.impl;

import info.ashan.product_service.dto.ProductRequest;
import info.ashan.product_service.model.Product;
import info.ashan.product_service.repository.ProductRepository;
import info.ashan.product_service.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    @Autowired
    private  ProductRepository productRepository;

    @Override
    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

    //
        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }
}
