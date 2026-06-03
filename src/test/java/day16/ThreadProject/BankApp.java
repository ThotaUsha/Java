package day16.ThreadProject;

import day16.ThreadProject.model.Account;
import day16.ThreadProject.service.BankService;
import day16.ThreadProject.threads.DepositThread;
import day16.ThreadProject.threads.WithdrawThread;

public class BankApp {

    public static void main(String[] args) {

        Account acc = new Account(1000);

        BankService service = new BankService(acc);

        Thread d = new Thread(new DepositThread(service));
        Thread w = new Thread(new WithdrawThread(service));

        d.start();
        w.start();
    }
}