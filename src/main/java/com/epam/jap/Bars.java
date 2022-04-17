package com.epam.jap;

import java.util.List;

public class Bars {
    private List<Bar> bars;

    public Bars(List<Bar> bars) {
        this.bars = bars;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        for(Bar b : bars) {
            ret.append(b.toString() + "\n");
        }
        return ret.toString();
    }
}
