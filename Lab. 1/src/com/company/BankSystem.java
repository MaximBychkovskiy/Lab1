package com.company;

public class BankSystem implements IAccount, IClient {

    private int _money; // переменная для хранения средств
    private String name;
    private String password;


    // IC
    public String getName(){

        return name;
    }

    public void setName(String Name){

        name = Name;
    }

    public void setPassword(String pass){

        if(pass != null)
            password = pass;

        else
            password = "11111";
    }

    public String getPassword(){

        return password;
    }


    // IA
    public double GetCurrentSum(){

        return _money;
    }

    public void Put(int money){

        _money += money ;
    }

    public void Withdraw(int money){
        if (_money >= money)
        {
            _money -= money;
        }
    }


    BankSystem(String name, int money, String password ){

        this.name = name;
        this._money = money;
        this.password = password;
    }

}
