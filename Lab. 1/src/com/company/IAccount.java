package com.company;

/*
Put - положить средства на счет
Withdraw - забрать со счета
 */

public interface IAccount {


    void Put(int money);
    void Withdraw(int money);
    double GetCurrentSum(); // Текущая сумма на счету

}
