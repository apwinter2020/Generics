package Enum;

import java.awt.*;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Scanner;

public class Main {
    public static <T> void f(String a) {
        System.out.println(a);
    }

    public static void main(String[] args) {

        f("sdfsdf");

        CarColor first = CarColor.RED,second = CarColor.RED;
        first.value = 10;
        second.value = 20;

        System.out.println(first.value);
        System.out.println(second.value);

        Scanner scanner = new Scanner(System.in);

        CarColor carColor = CarColor.BLUE;
        System.out.println(carColor.toString());

        carColor = CarColor.valueOf("RED");
        System.out.println(carColor.toString());

        String inputString = scanner.next();
        final String other = null;
//        other = "sadasd";

        final A myA = new A(""), b = null;

        myA.value = 324;
        final String str = "44"+"345";

        switch ("") {
            case str:
                break;
        }

        CarColor input = CarColor.valueOf(inputString);
        input.value = 6;

        switch (input) {
            case BLUE:
                System.out.println("Input is blue: " + input.value);
                break;
            case WHITE:
                System.out.println("Input is white");
                break;
            case BLACK:
                System.out.println("Input is black");
                break;
            default:
                System.out.println("Not a valid input");
        }

        System.out.println("Color Values: ");
        for(CarColor color: CarColor.values()) {
            System.out.println(color + ": " + color.value);
        }

        EnumMap<CarColor, Object> values = new EnumMap<CarColor, Object>(CarColor.class);
        values.put(CarColor.BLUE, null);
        values.put(CarColor.RED, "red");

        EnumSet<CarColor> set = EnumSet.of(CarColor.BLUE, CarColor.RED);

        set.add(CarColor.BLACK);

        System.out.println(set.contains(CarColor.RED));
        System.out.println(set.contains(CarColor.WHITE));
        System.out.println(set.contains(CarColor.BLUE));

        String stringValue = "sfdfsdfKJHDF";
        String stringCommand = scanner.next();
        String resultString = StringOperator.valueOf(stringCommand).perform(stringValue);
        System.out.println(resultString);
    }
}

class A {
    Integer value;
    final String stringValue;

    A(String value) {
        stringValue = value;
    }
}
