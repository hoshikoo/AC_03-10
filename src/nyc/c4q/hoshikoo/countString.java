package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/10/15.
 */

public class countString {

    public static void main (String[] args){

        String text="hello, world";
        //int len = test.length();
        //System.out.println(len);

        for (int i =0; i <text.length(); i++){
            char currentLetter = text.charAt(i);
            System.out.println(currentLetter);
        }

    }
}
