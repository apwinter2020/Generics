package Enum;

import java.awt.event.ActionListener;
import java.util.Random;

public enum CarColor {
    RED(1),
    BLUE(2),
    WHITE(3),
    BLACK,
    GREEN(4),
    OTHER(4);

    Integer value;

    CarColor() {
        this(10);
    }

    CarColor(Integer value) {
        this.value = value;
    }
}
