package HW_5;
public  class User {
    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public double amountSpendMoney;


    public int getAge (){
        return age;
    }
    public void setAge (int age){
        if (age < 18){
            System.out.println("Purchase impossible! ");
        } ;
    }

    public String getPassword (){
        return password;
    }
    public void setPassword(String password){
        if (password.length() < 5){
            System.out.println("Password is very short!");
        } else password = password;
        System.out.println(password);
    }

    public void makePurchase (double purchasePrice){
        amountSpendMoney = amountSpendMoney + purchasePrice;
        System.out.println("Purchase price " + userName+ "= " +  purchasePrice);
    }

    public double printTotalAmountOfSpentMoney (){
        System.out.println("Total amount of spent Money" + userName+ ": "  + amountSpendMoney);
        return 0;
    }

    public User (){

    }

    public User (String userName){
        this.userName = userName;
    }

    public User (String userName, String password){
        this.userName = userName;
        this.password = password;
    }
}
