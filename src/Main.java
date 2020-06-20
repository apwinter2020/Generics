import java.util.ArrayList;
import java.util.Date;

public class Main {
    ArrayList<String> list = new ArrayList<>();

    public static <T> void print(T value, String prefix) {
        System.out.println(prefix + value.toString());
    }

    public static <T extends Number> void printValue(T number) {
        System.out.println(number.doubleValue());
    }

    public static void printList(ArrayList<?> list) {
        System.out.println(list.size());
    }

    public static void addToList(ArrayList<? super Integer> list, Integer number) {
        list.add(number);
    }

    public static <T> T topList(ArrayList<T> list) {
        return list.get(0);
    }

    public static <T> T createInstance(T value) {

        T result = null;

//        result = new T[10];

        return result;
    }

    public static void main(String[] args) {

        LinkedList<String> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();

        System.out.println(a.getClass());
        System.out.println(b.getClass());

        int[] array = new int[10];

        printValue(34);
        printValue(34.564);
//        printValue("23432");

        createInstance(2342);

        print("Salaam", "String Prefix: ");
        print(24234,"Integer Prefix: ");
        print(new Date(), "Date Prefix: ");

        LinkedList<String> stringList = new LinkedList<>();
        stringList.pushFront("A");
        stringList.pushFront("B");
        stringList.pushFront("C");
        stringList.print();

        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.pushFront(1);
        integerList.pushFront(2);
        integerList.pushFront(3);
        integerList.pushFront(4);
        integerList.print();

        ArrayList<String> stringArray = new ArrayList<>();
        ArrayList<Integer> integerArray = new ArrayList<>();
        ArrayList<Number> numberArray = new ArrayList<>();
        ArrayList<Object> objectArray = new ArrayList<>();

        integerArray.add(234);
        numberArray.add(234.234324);

        stringArray.add("dfsdgsdg");

        ArrayList generalArray = new ArrayList<>();
        generalArray = integerArray;

        generalArray.add("adsadad");

        for(Integer integer: integerArray) {
            System.out.println(integer.doubleValue());
        }

        printList(integerArray);
        addToList(numberArray, 2423);
    }
}
