package com.project.artem.digitalretailstore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@MappedSuperclass
public class BaseProduct extends Product {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "Serial number cannot be empty")
    private String serialNumber;

    @NotEmpty(message = "Manufacturer cannot be empty")
    private String manufacturer;

    @Min(value = 0, message = "Price must be greater than 0")
    private int price;

    @Min(value = 0, message = "Amount must be greater than 0")
    private int amount;
}
