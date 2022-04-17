package com.epam.jap;

public class ActiveBar implements Bar {
    private int id;
    private int length;
    Counter counter;

    public ActiveBar(int id, int length, Counter counter) {
        this.id = id;
        this.length = length;
        this.counter = counter;
    }

    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("{" + this.id + "}>B");
        ret.append("=".repeat(length) + "|");
        return ret.toString();
    }

}
