package com.company;

public class Main {

    public static void main(String[] args) {

        BankSystem client1 = new BankSystem("Maxim", 200, "12d12");

        if(myPassword() == "12d12" && myName() == "Maxim"){
            client1.Put(40);
            System.out.println(client1.GetCurrentSum());

            client1.Withdraw(50);
            System.out.println(client1.GetCurrentSum());
        }

        else System.out.println("Error.");

    }

    public static String myPassword(){

        String myPass = "12d12";
        return myPass;
    }

    public static String myName(){

        String myName = "Maxim";
        return myName;
    }

}
