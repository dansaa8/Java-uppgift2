package org.example;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.testArrayList();
        app.testHashSet();

    }

    private void testArrayList() {
        ArrayList<Shape> myList = new ArrayList<>();
        myList.add(Shape.circle(4));
        myList.add(Shape.rectangle(5, 2));
        myList.add((Shape.circle(10)));
        myList.add((Shape.rectangle(10, 12)));
        myList.add(Shape.circle(2));

        System.out.println("\nUnsorted: ");
        for (Shape s : myList) {
            System.out.println(s.getArea());
        }

        System.out.println("\nSorted: ");
        myList.sort(null);
        for (Shape s : myList) {
            System.out.println(s.getArea());
        }
    }

    private void testHashSet() {
        Set<Shape> mySet = new HashSet<>();
        mySet.add(Shape.circle(4));
        mySet.add(Shape.circle(4));
        mySet.add(Shape.circle(5));
        mySet.add(Shape.circle(4));
        mySet.add(Shape.circle(7));
        mySet.add(Shape.rectangle(4, 4));
        mySet.add(Shape.rectangle(1, 6));
        mySet.add(Shape.rectangle(4, 4));
        mySet.add(Shape.rectangle(11, 7));
        mySet.add(Shape.rectangle(4, 4));

        System.out.println("\nTest HashSet");
        for (Shape s : mySet) {
            if (s instanceof Circle c) {
                System.out.println("En cirkel med radien: " + c.getRadius());

            }
            if (s instanceof Rectangle r) {
                System.out.println("En rektangel med basen: " + r.getBase() + ", höjden: " + r.getHeight());
            }
            else continue;
        }
    }
}
