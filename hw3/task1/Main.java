package hw3.task1;

import java.util.Arrays;

public class Main {

    static Integer[] arrayInteger = {1, 2, 3, 5};

    public static void main(String[] args) {
        ArrayClass<Integer> arrayClass = new ArrayClass<>();
        System.out.println(Arrays.toString(arrayClass.change(arrayInteger, 1, 2)));
    }
}