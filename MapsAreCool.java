
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MapsAreCool {
    // Hint: Create a class or data strucsture hold a student first name
    // last name, the student's 4 test scores, and letter grade.
    // Then create your ArrayList to hold objects of this type.

    public class Student {
        String firstName;
        String lastName;
        ArrayList<Integer> testScores;
        char letterGrade;

        public Student(String myfirstName, String mylastName, ArrayList<Integer> mytestScores) {
            this.firstName = myfirstName;
            this.lastName = mylastName;
            this.testScores = mytestScores;
            setLetterGrade(mytestScores);
        }

        public void setLetterGrade(ArrayList<Integer> testScores) {
            int averageScore = 0;
            int totalScore = 0;
            for (int i = 0; i < testScores.size(); i++) {
                totalScore += testScores.get(i);
            }
            averageScore = totalScore / testScores.size();

            if (averageScore >= 90) {
                letterGrade = 'A';
            } else if (averageScore >= 80) {
                letterGrade = 'B';
            } else if (averageScore >= 70) {
                letterGrade = 'C';
            } else if (averageScore >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }
        }
    }

    public static void main(String[] args) {
        MapsAreCool mapsAreCool = new MapsAreCool();

        Scanner scanner = new Scanner(System.in);
        String fName = new String();
        String lName = new String();
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter student first name");
        fName = scanner.nextLine();
        System.out.println("Enter student last name");
        lName = scanner.nextLine();

        System.out.print("Enter integers please or ");
        System.out.println("(C to terminate): ");

        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        Integer[] nums = list.toArray(new Integer[0]);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        scanner.close();

        ArrayList<Integer> testScores2 = new ArrayList<>();
        testScores2.add(80);
        testScores2.add(85);
        testScores2.add(90);
        testScores2.add(100);
        MapsAreCool.Student student1 = mapsAreCool.new Student(fName, lName, list);

        MapsAreCool.Student student2 = mapsAreCool.new Student("Ebomb", "Chel", testScores2);
        ArrayList<MapsAreCool.Student> students = new ArrayList<MapsAreCool.Student>();
        students.add(student1);
        students.add(student2);

        Comparator<MapsAreCool.Student> cmp = new Comparator<MapsAreCool.Student>() {
            public int compare(MapsAreCool.Student s1, MapsAreCool.Student s2) {
                return s1.lastName.compareToIgnoreCase(s2.lastName);
            }
        };
        Collections.sort(students, cmp);

        for (MapsAreCool.Student student : students) {
            System.out.println(student.lastName + student.testScores + student.letterGrade);
        }
    }

}