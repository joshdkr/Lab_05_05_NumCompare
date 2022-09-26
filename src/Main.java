import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String userA;
        String userB;
        int userAnum;
        int userBnum;


        System.out.println("Input user 1's number: ");
        userA = kb.nextLine();

        System.out.println("Input user 2's number: ");
        userB = kb.nextLine();



        try {
            Integer.parseInt(userA);
        }
        catch (NumberFormatException e){
            System.out.println(userA + " is not a valid integer.");
            return;
        }
        try {
            Integer.parseInt(userB);
        }
        catch (NumberFormatException e){
            System.out.println(userB + " is not a valid integer.");
            return;
        }

        userAnum = Integer.parseInt(userA);
        userBnum = Integer.parseInt(userB);

        if (userAnum == userBnum)
        {
            System.out.println("You picked the same number!");
        }
        if (userAnum < userBnum)
        {
            System.out.println("User 2's number is larger!");
        }
        if (userAnum > userBnum)
        {
            System.out.println("User 1's number is larger!");
        }
    }
}