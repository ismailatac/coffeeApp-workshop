package com.kodlamaio.starbucks.business.dtos.responses.get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetProductResponse {
    private int id;
    private String name;
    private String description;
    private double price;
}
