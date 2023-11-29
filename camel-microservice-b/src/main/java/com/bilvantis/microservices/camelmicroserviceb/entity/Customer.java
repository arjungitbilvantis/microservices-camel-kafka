package com.bilvantis.microservices.camelmicroserviceb.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

}
