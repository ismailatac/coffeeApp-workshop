package com.kodlamaio.starbucks.business.dtos.requests.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateCustomerRequest {
    private String firstName;
    private String lastName;
    private int birthOfYear;
    private String identityNumber;
}
