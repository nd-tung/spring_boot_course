package com.tea.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Order {
    //Ánh xạ cột c_name trong database với customerName trong class Order
    @JsonProperty("c_name")
    private String customerName;
    @JsonProperty("p_name")
    private String productName;

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @JsonProperty("quantity")
    private int quantity;

}
