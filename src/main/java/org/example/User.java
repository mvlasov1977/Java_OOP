package org.example;
/*
Створити клас User, у якого будуть:
 - поля userName, age, email, password, isActive(boolean), amountSpentMoney.
   password та age повинні мати модифікатор доступу private.
   Зробити геттери і сеттери з валідацією для private полів(валідація довільна).

 - методи: makePurchase, який приймає параметр purchasePrice(вартість покупки) типу double,
   і виводить на яку суму була здійснена покупка та додає цю вартість до глобальної змінної amountSpentMoney.

 printTotalAmountOfSpentMoney, який виводить загальну суму витрачених грошей.

  -конструктори: дефолтний; конструктор який приймає userName та контруктор який приймає userName та password.
 */
public class User {
    public String myValue; //

    private int age;
    private String password;

    public String userName;
    public String email;
    public boolean isActive;

    // створюю глобальну змінну классу
    public static double amountSpentMoney;

    // Створюю конструктори
    public User(){
        age = 0;
        password = "";
        userName = "NULL";
        email = "-";
        isActive = false; // Не заданий username
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

    // створюю get / set методи
    public int getAge(){
        return age;
    }

    public void setAge(int myAge){
        if ( (myAge > 0) && (myAge < 150) ) {
            age = myAge;
        }else{
            if (myAge < 0) {
                age = 0;
            }
            if (myAge > 150) {
                age = 150;
            }
        }
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String myPassword){
        if (myPassword.length() > 10) {
            myPassword = myPassword.substring(0, 10);
        }
        password = myPassword;
    }

    // створрюю методи класу
    public void makePurchase(double purchasePrice){
        System.out.println(userName + " придбав на: " + purchasePrice + " грн.");
        amountSpentMoney = amountSpentMoney + purchasePrice;
    }

    public double addDiscount(int percent){
        return (amountSpentMoney * percent / 100 );
    }

    public static void printTotalAmountOfSpentMoney(){
        System.out.println("Всього витрачено: " + amountSpentMoney + " грн.\n");
    }
}
