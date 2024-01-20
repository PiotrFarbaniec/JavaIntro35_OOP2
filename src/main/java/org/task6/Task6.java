package org.task6;

public class Task6 {
    public static void main(String[] args) {
        double [] bill = new double[3];
        bill[0] = BillCalculator.calculate(120d, 5.50f);
        bill[1] = BillCalculator.calculate(120d, 5.50f, 15f);
        bill[2] = BillCalculator.calculate(120d, 5.50f, (short) 3);

        for (Double bills: bill) {
            System.out.println(bills);
        }
    }
}
