package box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter object's length: ");
        int length = scanner.nextInt();
        System.out.print("Please enter object's width: ");
        int width = scanner.nextInt();
        System.out.print("Please enter object's height: ");
        int height = scanner.nextInt();

        BoxThree box3 = new BoxThree(length, width, height);
        BoxFive box5 = new BoxFive(length, width, height);
        if (box3.validate()){
            System.out.println("Please use box3 for your package");
        } else if (box5.validate()) {
            System.out.println("Please use box5 for your package");
        } else {
            System.out.println("There is no suitable boxes for your package");
        }

        /*BoxNumber box3 = new BoxThreeO(length, width, height);
        BoxNumber box5 = new BoxFiveO(length, width, height);
        if (box3.validate())
            System.out.println("box3");
        else if (box5.validate())
            System.out.println("box5");
        else
            System.out.println("Thank you!");*/
    }
}
