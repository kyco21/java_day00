
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        if (!is_arg_ok(num)){
            System.err.println("Illegal Argument");
            return;
        }
        int count = 0;
        boolean is_primal = true;
        count++;
        if (num % 2 == 0) {
            is_primal = false;
        }
        else{
            for (int i = 2; i * i < num; i += 2) {
                count++;
                if (num % i == 0) {
                    is_primal = false;
                    break;
                }
            }
        }


        System.out.println(is_primal + " " + count );

    }
    private static boolean is_arg_ok(int num){
        if (num <= 0){
            return false;
        }
        if (num == 1){
            return false;
        }
        return true;
    }
}


