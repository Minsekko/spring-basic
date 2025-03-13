package org.innovibe.spring.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TravelModel {
    private String destination;
    private int stayCost;
    private int transportationCost;
    private int foodCost;
    private int additionalCosts;
    private int headCount;

}
