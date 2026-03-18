import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String str = "conflict1"
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("enter your number: ");
        x = scanner.nextInt();
        if (x % 2 == 0){
            System.out.println("your number is even");
        }
        else{
            System.out.println("your number is odd");
        }
        int[] test = {2,4,6,1,9,5,7,8};
        System.out.println("Test array: " + Arrays.toString(test));
        System.out.println("the median of test array equals: " + StatisticHelper.calcMedian(test));
    }
}