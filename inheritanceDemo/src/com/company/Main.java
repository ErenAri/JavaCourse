package com.company;

public class Main {

    public static void main(String[] args) {
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        teacherCreditManager.Calculate();

        CreditUI creditUI = new CreditUI();
        creditUI.CalculateCredits(new TeacherCreditManager());
        creditUI.CalculateCredits(new FarmerCreditManager());
        creditUI.CalculateCredits(new SoldierCreditManager());
    }
}
