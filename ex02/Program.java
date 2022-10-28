
import java.util.Scanner;
public class Program {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int num;
        int coffee = 0;
        while (true) {
            num = input.nextInt();
            if (num == 42) {
                break;
            }
            if (isPrimal(sum(num))) {
                coffee++;
            }
        }
        System.out.println(" Count of coffee-request - " + coffee);
    }
    public static boolean isPrimal(int number) {
        boolean isPrimal = true;
        if (number % 2 == 0) {
            isPrimal = false;
        }
        else {
            for (int i = 2; i * i < number; i += 2) {
                if (number % i == 0) {
                    isPrimal = false;
                }
            }
        }
        return isPrimal;
    }
    public static int sum(int num) {
        int sum = 0;
        while (num>0) {
            int temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }
        return sum;
    }

}
