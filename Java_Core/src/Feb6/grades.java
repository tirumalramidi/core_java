package Feb6;

import java.util.Scanner;

public class grades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        String status = "c";

        while (!status.equals("q")){

            System.out.println("Enter student's mark:");
            int mark = scanner.nextInt();

                char grade;
            if (mark >= 90) {
                grade = 'A';
            } else if (mark >= 80) {
                grade = 'B';
            } else if (mark >= 70) {
                grade = 'C';
            } else if (mark >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
        }
            System.out.println("Corresponding grade: " + grade);
        System.out.println("Enter 'q' to quit");
        status = scanner.next();


            System.out.print("\033[2J");



    }


    }
}
