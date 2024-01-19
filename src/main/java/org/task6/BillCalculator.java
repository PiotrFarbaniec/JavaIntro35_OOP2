package org.task6;

public class BillCalculator {

    static double calculate(double billValue, float servicePayment) {
        return billValue + servicePayment;
    }

    static double calculate(double billValue, float servicePayment, double percDiscount) {
        return billValue - (billValue * percDiscount / 100) + servicePayment;
    }

    static double calculate (double billValue, float servicePayment, short packagingFee){
        return billValue + servicePayment + packagingFee;
    }
}
