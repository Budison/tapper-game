package com.epam.jap;

import java.util.ArrayList;

    public class ActiveCounter implements Counter {
        ArrayList<Position> positions;

        public ActiveCounter(int barLength) {
            this.positions = new ArrayList<Position>();
            for(int i = 0; i < barLength; i++) {
                this.positions.add(new Position(false));
            }
        }
    }

