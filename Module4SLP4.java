import java.io.*;
import java.util.*;

class Module4SLP4 {

    public static void main(String[] args) {
        // Size of the
        // Vector
        int vectorSize = 10;
        // Increment size
        int vectorInt = 2;

        // Declaring the Vector with
        // initial size n
        Vector vector = new Vector(vectorSize, vectorInt);

        // Appending new elements at
        // the end of the vector
        for (int i = 1; i <= vectorSize; i++)
            vector.add(i);

        System.out.println("Inital vector size is: " + vector.size());

        // Add two more elements
        vector.add(11);
        vector.add(12);

        // Printing elements
        System.out.println("The elements in the vector are: " + vector);
        // Printing elements size
        System.out.println("The vector size is: " + vector.size());
        // Printing elements capacity
        System.out.println("The vector capacity is: " + vector.capacity());

        // Adding 6 more elements
        vector.add(13);
        vector.add(14);
        vector.add(15);
        vector.add(16);
        vector.add(17);
        vector.add(18);

        // Printing elements
        System.out.println("The elements in the vector are: " + vector);
        // Printing vector size
        System.out.println("The vector size is: " + vector.size());
        // Printing vector capacity size
        System.out.println("The vector capacity is: " + vector.capacity());
    }
}