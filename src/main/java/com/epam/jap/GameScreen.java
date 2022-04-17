package com.epam.jap;

public class GameScreen {

    private Bars bars;

    public GameScreen(Bars bars) {
        this.bars = bars;
    }

    @Override
    public String toString() {
        return bars.toString();
    }
}
