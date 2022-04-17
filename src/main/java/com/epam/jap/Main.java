package com.epam.jap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println(new GameScreen(new Bars(bars())).toString());
    }

    private static List<Bar> bars() {
        List<Bar> barList = new ArrayList<Bar>();
        barList.add(new ActiveBar(1, 7, new ActiveCounter(7)));
        barList.add(new EmptyBar(2, 7, new EmptyCounter()));
        barList.add(new EmptyBar(3, 7, new EmptyCounter()));
        barList.add(new EmptyBar(4, 7, new EmptyCounter()));

        return barList;
    }
}

