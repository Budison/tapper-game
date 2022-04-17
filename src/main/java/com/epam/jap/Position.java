package com.epam.jap;

public class Position {
    boolean occupied;
    Customer currentCustomer;

    public Position(boolean occupied) {
        this.occupied = occupied;
    }

    public Position(boolean occupied, Customer currentCustomer) {
        this.occupied = occupied;
        this.currentCustomer = currentCustomer;
    }
}
