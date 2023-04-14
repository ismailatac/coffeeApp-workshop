package com.kodlamaio.starbucks.business.dtos.requests.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateProductRequest {
    private String name;
    private String description;
    private double price;
}
