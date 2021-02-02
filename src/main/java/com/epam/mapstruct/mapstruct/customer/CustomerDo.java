package com.epam.mapstruct.mapstruct.customer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDo {
    private String firstName;
    private String lastName;
}