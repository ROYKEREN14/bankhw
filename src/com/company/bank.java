package com.company;

import java.util.List;

public interface bank {
    List<iAccount> OpenAccount(iAccount account);
    void CloseAccount(int accountNumber);
    List<iAccount> GetALLAccounts();
    List<iAccount>GetAllAccountsInDebt();
    List<iAccount>GetAllAccountsWithBalance(double BalanceAbove);





}
