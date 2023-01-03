package classProblemByAmolMateSir.Day23PrcticeProblem;


import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to user registration");

        boolean firstName = Pattern.matches("[A-Za-z]{0,8}",input.next());
        System.out.println(firstName);


    }
}
