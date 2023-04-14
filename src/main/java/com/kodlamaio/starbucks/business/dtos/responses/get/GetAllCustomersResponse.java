package com.kodlamaio.starbucks.business.dtos.responses.get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllCustomersResponse {
    private int id;
    private String firstName;
    private String lastName;
    private int birthOfYear;
    private String identityNumber;
}
