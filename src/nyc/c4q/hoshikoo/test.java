package nyc.c4q.hoshikoo;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        boolean quit = false;
        Scanner input = new Scanner (System.in);


        while (!quit){
            System.out.println("What should I do next?");
            String response = input.next();
            quit = response.equalsIgnoreCase("exit") || response.equalsIgnoreCase("quit");
        }
    }
}
