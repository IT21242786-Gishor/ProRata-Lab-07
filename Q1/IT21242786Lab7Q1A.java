import java.util.Scanner;

public class IT21242786Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter marks for four subjects:");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            sum += input.nextInt();
        }

        double average = sum / 4.0;

        System.out.println();
        System.out.println("Average is : " + average);

        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
        } else {
            System.out.println("Overall Grade is : Fail");
        }
    }
}