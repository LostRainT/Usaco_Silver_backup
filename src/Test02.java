import java.util.Random;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        int result = 0;
        for (int i = 0 ; i < 21 ; i++){
            System.out.println("Please choose A or B");
            s = sc.nextLine();
            System.out.println(s);

            Random randomNo = new Random();
            boolean value = randomNo.nextBoolean();

            System.out.println("Your answer is:" + value);
            if(value == true){
                result++;
            }
        }

        System.out.println("You have got " + result + " correct answer");
        sc.close();
    }
}
