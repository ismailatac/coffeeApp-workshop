package com.kodlamaio.starbucks.business.dtos.requests.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCustomerRequest {
    private String firstName;
    private String lastName;
    private int birthOfYear;
    private String identityNumber;
}
