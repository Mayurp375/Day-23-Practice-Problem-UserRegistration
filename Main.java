package classProblemByAmolMateSir.Day23PrcticeProblem;


import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        System.out.println("welcome to user registration");
//firstName validation
        boolean firstName = Pattern.matches("[A-Za-z]{0,8}", "Mayur");
        System.out.println(firstName);

//lastName validation
        boolean lastName = Pattern.matches("[A-Za-z]{0,8}", "Polojwar");
        System.out.println(lastName);
    }
}
