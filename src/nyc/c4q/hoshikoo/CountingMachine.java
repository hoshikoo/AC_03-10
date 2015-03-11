package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/10/15.
 */
import java.util.Scanner;
public class CountingMachine {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Please input the number you like");

        int userInput = input.nextInt();

        for (int i = 0; i <= userInput; i= i+1){  /* i=i+1 is the same as i++*/
            System.out.print(i + ", ");
        }



    }

}
