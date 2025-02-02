package info.ashan.product_service.controller;

import info.ashan.product_service.dto.ProductRequest;
import info.ashan.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }


}
