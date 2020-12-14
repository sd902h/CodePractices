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
        int averageScore;

        public Student(String myfirstName, String mylastName, ArrayList<Integer> mytestScores) {
            this.firstName = myfirstName;
            this.lastName = mylastName;
            this.testScores = mytestScores;
            setLetterGrade(mytestScores);
        }

        public void setLetterGrade(ArrayList<Integer> testScores) {
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
        String text = "";
        String fName = new String();
        String lName = new String();
        ArrayList<MapsAreCool.Student> students = new ArrayList<MapsAreCool.Student>();

        while (!text.equals("C")) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            System.out.println("Enter student first name");
            fName = scanner.next();
            System.out.println("Enter student last name");
            lName = scanner.next();
            System.out.println("Enter student first score");
            list.add(scanner.nextInt());
            System.out.println("Enter student second score");
            list.add(scanner.nextInt());
            System.out.println("Enter student third score");
            list.add(scanner.nextInt());
            System.out.println("Enter student fourth score");
            list.add(scanner.nextInt());
            System.out.println("Want to enter another student information? Enter 'Y' to continue or 'C' to end.");
            text = scanner.next();
            MapsAreCool.Student eachStudent = mapsAreCool.new Student(fName, lName, list);
            students.add(eachStudent);
        }
        scanner.close();

        Comparator<MapsAreCool.Student> cmp = new Comparator<MapsAreCool.Student>() {
            public int compare(MapsAreCool.Student s1, MapsAreCool.Student s2) {
                return s1.lastName.compareToIgnoreCase(s2.lastName);
            }
        };
        Collections.sort(students, cmp);

        for (MapsAreCool.Student student : students) {
            System.out.println("First name: " + student.firstName + "\n" + "Last name: " + student.lastName + "\n"
                    + "Average score: " + student.averageScore + "\n" + "Student grade: " + student.letterGrade
                    + "\n\n");
        }
    }

}