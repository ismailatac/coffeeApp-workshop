package com.kodlamaio.starbucks.business.dtos.responses.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateProductResponse {
    private int id;
    private String name;
    private String description;
    private double price;
}
