package org.example;

public class Main {
    public static void main(String[] args) {

        //створюю користувачів
        User[] arrayOfUsers = new User [4];

        arrayOfUsers[0] = new User();
         arrayOfUsers[0].email = "anonymous@gmail.com";
         arrayOfUsers[0].setAge(160);
         arrayOfUsers[0].setPassword("Qwerty12345");

        arrayOfUsers[1] = new User("Maksim Vlasov");
         arrayOfUsers[1].email = "mvlasov@gmail.com";
         arrayOfUsers[1].setAge(35);
         arrayOfUsers[1].setPassword("Qwerty1234");

        arrayOfUsers[2] = new User("Petia Pupkin","Qwerty12345");
         arrayOfUsers[2].email = "p_pupkin@gmail.com";
         arrayOfUsers[2].setAge(25);
         arrayOfUsers[2].setPassword("Qwerty_!$&");

        arrayOfUsers[3] = new User("Bodya Girkiy","Qwerty1234");
         arrayOfUsers[3].email = "b_girkiy@gmail.com";
         arrayOfUsers[3].setAge(30);
         arrayOfUsers[3].setPassword("Qwerty_222");

        // користувачі йдуть в маркет
        arrayOfUsers[0].makePurchase(55);
        arrayOfUsers[1].makePurchase(550);
        arrayOfUsers[2].makePurchase(500);
        arrayOfUsers[3].makePurchase(123);
        System.out.print("\n");

        // виводжу інфо про користувачів
        for (User myUser:arrayOfUsers) {
            System.out.println("Im'я:     " + myUser.userName);
            System.out.println("E-Mail:   " + myUser.email);
            System.out.println("Password: " + myUser.getPassword());
            System.out.println("Age:      " + myUser.getAge());
            System.out.println("Status:   " + myUser.isActive);
            System.out.print("\n");
        }
        User.printTotalAmountOfSpentMoney();

        // CALCULATOR завдання номер -2-
        double myFirstOperand = 3;
        double mySecondOperand = 3;

        System.out.println(myFirstOperand + " + " + mySecondOperand + " = " + Calculator.addition( myFirstOperand, mySecondOperand));
        System.out.println(myFirstOperand + " - " + mySecondOperand + " = " + Calculator.substraction( myFirstOperand, mySecondOperand));
        System.out.println(myFirstOperand + " * " + mySecondOperand + " = " + Calculator.multiplication( myFirstOperand, mySecondOperand));
        System.out.println(myFirstOperand + " / " + mySecondOperand + " = " + Calculator.division( myFirstOperand, mySecondOperand));
    }
}
