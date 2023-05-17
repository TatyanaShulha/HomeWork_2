package HW_5;
import HW_5.User;


public class UserTest {


      public void UserTest(){
        User ivanov = new User("Ivanov");
        User popov = new User("Popov");
        User shulha = new User("Shulha", "1234567890");

        ivanov.makePurchase(20);
        ivanov.makePurchase(400);
        popov.makePurchase(50);
        shulha.makePurchase(200);
        shulha.makePurchase(330);

        ivanov.printTotalAmountOfSpentMoney();
        popov.printTotalAmountOfSpentMoney();
        shulha.printTotalAmountOfSpentMoney();

        ivanov.addDiscount(50);
        shulha.addDiscount(30);
    }

}









