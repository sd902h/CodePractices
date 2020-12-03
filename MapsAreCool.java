import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

/*
 * This example source code demonstrates the use of  
 * put() method of HashMap class
 */

public class HashMapPutExample {

    public static void main(String[] args) throws InterruptedException {

        // declare the hashmap
        Map<String, List<Integer>> mapStudent = new HashMap<String, List<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean loopAgain = true;
        Scanner scan = new Scanner(System.in);

        // loop while user not entering no
        do {
            // ask for user input for student name
            System.out.print("Enter Students Name (Last Name, First Name):");
            String studentName = scan.nextLine();

            // ask for user input which corresponds to student grades
            System.out.print("Enter 4 test score grades:");
            List<Integer> studentGrade = list.add(scanner.nextInt());
            Integer[] nums = list.toArray(new Integer[0]);
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }

            // add the key value pair from user input to the hashmap

            String oldVal = mapStudent.put(studentName, studentGrade);

            if (oldVal != null) {
                System.out
                        .println("Student Name:" + studentName + " is " + oldVal + " student's Grades " + studentGrade);
            }

            // ask user to check if another entry is required
            System.out.print("Enter another student (y/n)?");
            String answer = scan.nextLine();

            // condition to satisfy in order to loop again
            if (answer.equals("y") || answer.equals("Y")) {
                continue;
            } else {
                break;
            }

        } while (loopAgain);
        scan.close();

        System.out.println("\n**********************************");
        System.out.println("The following students are in database");
        System.out.println("   studentName  " + "      studentGrade");
        for (String i : mapStudent.keySet()) {
            System.out.println("   " + i + "     " + mapStudent.get(i));
        }
        System.out.println("\n**********************************");
    }

}