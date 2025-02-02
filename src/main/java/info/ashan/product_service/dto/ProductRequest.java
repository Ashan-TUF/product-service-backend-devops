package info.ashan.product_service.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@ToString
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
