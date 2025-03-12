package org.innovibe.spring.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TravelSchecule {

    private String destination;
    private int persons;
    private int trafficCost;
    private int stayCost;
    private int foodCost;

    private boolean planned;
}
