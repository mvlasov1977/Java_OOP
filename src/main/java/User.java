public class User {
    private int age;
    private String password;

    public String userName;
    public String email;
    public boolean isActive;
    public double amountSpentMoney;

    public User(){
        age = 0;
        password = "";
        userName = "";
        email = "";
        isActive = false;
        amountSpentMoney = 0;
    }

    public User(String userName){
        age = 0;
        password = "";
        this.userName = userName;
        email = "";
        isActive = true;
        amountSpentMoney = 0;
    }

    public User(String userName, String password){
        age = 0;
        this.password = password;
        this.userName = userName;
        email = "";
        isActive = true;
        amountSpentMoney = 0;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int myAge){
        if ( (myAge > 0) && (myAge < 150) ) {
            age = myAge;
        }else{
            if myAge < 0 {
                age = 0;
            }
            if myAge > 150 {
                age = 150;
            }
        }
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String myPassword){
        if myPassword.length() > 10{
            myPassword = myPassword.substring(1, 10);
        }
        password = myPassword;
    }

    public void makePurchase(double purchasePrice){
        System.out.println("Покупка на: " + purchasePrice + " грн.");
        amountSpentMoney = amountSpentMoney + purchasePrice;
    }

    public void printTotalAmountOfSpentMoney(){
        System.out.println("Всього витрачено : " + amountSpentMoney + " грн.");
    }
}
