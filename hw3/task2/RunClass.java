package hw3.task2;

import java.util.ArrayList;

public class RunClass {

    public static void main(String[] args) {
        Apple[] apples = new Apple[10];
        ArrayList<Apple> applesList = new ArrayList<>(10);

        Apple apple0 = new Apple(3f);
        Apple apple1 = new Apple(3f);
        Apple apple2 = new Apple(3f);
        Apple apple3 = new Apple(3f);
        apples[0] = apple0;
        applesList.add(apple0);
        apples[1] = apple1;
        applesList.add(apple1);
        apples[2] = apple2;
        applesList.add(apple2);
        apples[3] = apple3;
        applesList.add(apple3);
        Box<Apple> box1 = new Box<>(apples,applesList);

        Apple[] apples2 = new Apple[10];
        ArrayList<Apple> appleList2 = new ArrayList<>();
        apples2[0] = apple0;
        appleList2.add(apple0);
        apples2[1] = apple1;
        appleList2.add(apple1);
        apples2[2] = apple2;
        appleList2.add(apple2);
        apples2[3] = apple3;
        appleList2.add(apple3);
        Apple apple4 = new Apple(3f);
        apples2[4] = apple4;
        Box<Apple> box2 = new Box<>(apples2,appleList2);

        System.out.println(box1.getWeightArray());
        System.out.println(box2.getWeightList());

        System.out.println(box1.compare(box2));
        System.out.println(box1.compareList(box2));

        box1.toEmptyArray(box2);
        box1.toEmptyList(box2);

        System.out.println(box2);

        Orange[] oranges = new Orange[10];
        ArrayList<Orange> orangeArrayList = new ArrayList<>(10);
        Box<Orange> box3 = new Box<>(oranges,orangeArrayList);
        box1.compare(box3);
//        box1.compareList(box3);

    }
}

