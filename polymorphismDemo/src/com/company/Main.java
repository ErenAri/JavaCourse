package com.company;

public class Main {

    public static void main(String[] args) {
//        BaseLogger[] baseLoggers = new BaseLogger[]{
//                new FileLogger(),
//                new EmailLogger(),
//                new DatabaseLogger(),
//                new ConsoleLogger()
//        };
//
//        for (BaseLogger loggers:baseLoggers){
//            loggers.Log("Log mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
