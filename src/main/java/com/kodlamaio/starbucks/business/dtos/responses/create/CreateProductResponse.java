package com.kodlamaio.starbucks.business.dtos.responses.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateProductResponse {
    private int id;
    private String name;
    private String description;
    private double price;
}
