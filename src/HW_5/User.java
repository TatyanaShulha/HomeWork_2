package HW_5;
public  class User {
    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public double amountSpendMoney;

    public User (){

    }

    public User (String userName){
        this.userName = userName;
    }

    public User (String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public int getAge (){
        return age;
    }
    public void setAge (int age){
        if (age < 18){
            System.out.println("Purchase impossible! ");
        } else this.age = age ;
    }

    public String getPassword (){
        return password;
    }
    public void setPassword(String password){
        if (password.length() < 5){
            System.out.println("Password is very short!");
        } else this.password = password;
        System.out.println(password);
    }

    public void makePurchase (double purchasePrice){
        amountSpendMoney = amountSpendMoney + purchasePrice;
        System.out.println("Purchase price " + userName+ "= " +  purchasePrice);
    }

    public void printTotalAmountOfSpentMoney (){
        System.out.println("Total amount of spent Money" + userName+ ": "  + amountSpendMoney);

    }

    public void addDiscount (int percent){
        amountSpendMoney = (amountSpendMoney / 100) * percent;
        System.out.println("Discount " + percent + "% " + "for " + userName + "= " + amountSpendMoney);
    }


}
