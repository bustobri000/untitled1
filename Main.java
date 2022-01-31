package org.BehaviorMethods;

public class Main {

    public static void main(String[] args) {
        Rect rect1 = new Rect("Rect1" ,2, 4);

        System.out.println(rect1.output());

        rect1.setLength(5);
        rect1.setWidth(2);

        System.out.println(rect1.output());
    }
}