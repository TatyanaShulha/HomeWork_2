import HW_4.Palindrome2;
import HW_5.Calculator;
import HW_5.User;
import HW_5.UserTest;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {


        UserTest userTest = new UserTest();
        userTest.UserTest();

        User user1 = new User();

        user1.setAge(16);


        user1.setPassword("34k555k");

        user1.makePurchase(10);
        user1.printTotalAmountOfSpentMoney();


        User user2 = new User("Ivanova");
        User user3 = new User("Popova", "qwerty123");


        Calculator result = new Calculator();
        System.out.println("Sum = " + result.plus(4,9));
        System.out.println("Minus = " + result.minus(5,4));
        System.out.println("Division = " + result.division(2,7));
        System.out.println("Multiplication = " + result.multiplication(3,9));








    }
}