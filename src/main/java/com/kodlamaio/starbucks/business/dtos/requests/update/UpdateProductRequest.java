package com.kodlamaio.starbucks.business.dtos.requests.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateProductRequest {
    private String name;
    private String description;
    private double price;
}
