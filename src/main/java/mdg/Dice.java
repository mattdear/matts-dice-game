package mdg;

import java.util.Random;

/**
 * Developer: Matthew Dear 
 * GitHub: http://www.github.com/mattdear
 */

public class Dice {

    private int value;
    private boolean hold;

    public Dice(int value) {
        this.value = value;
        this.hold = false;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean getHold() {
        return hold;
    }

    public void setHold(boolean hold) {
        this.hold = hold;
    }

    public void roll() {
        int rollValue = new Random().nextInt(5) + 1;
        this.value = rollValue;
    }
}
