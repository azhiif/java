package mashup;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Attendance {

    
    public static int avg(int total, int num) {
        return total / num;
    }

    public static void main(String[] args) {
        int total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = sc.nextInt();
        sc.nextLine(); 

        String[] students = new String[num];
        int[] marks = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter student name: ");
            students[i] = sc.nextLine();

            System.out.print("Enter mark: ");
            marks[i] = sc.nextInt();
            sc.nextLine(); 
        }

        System.out.println("\nSTUDENT DETAILS:");
        for (int i = 0; i < num; i++) {
            System.out.println(students[i] + " - " + marks[i]);
            total += marks[i];
            if (marks[i] < 35) {
                System.out.print(" : Needs Improvement");
            }
        }

        int average = avg(total, num);
        System.out.println("\nAverage Marks: " + average);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("\nProgram ended at: " + now.format(format));

        sc.close();
    }
}
