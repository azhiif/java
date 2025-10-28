import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number: ");
    int number = sc.nextInt();
    sc.close();

    if(number%2 == 0){
        System.out.println("the number is even");
    }
    else{
        System.out.println("the number is odd");
    }

    }

}
