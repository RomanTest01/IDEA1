import java.awt.*;

public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int add = 13000;
        
        /* Объявляете переменные для входных данных и
           параметров программы: начального счёта,
           суммы пополнения и тп */
        int bonus;
        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Ваш баланс: " + (balance + add));
        System.out.println("Начислено бонусов: " + bonus);
    }

        /* Условным оператором проверяете, превысила ли
           сумма пополнения порог, и для этих двух разных
           сценариев рассчитываете сумму бонуса и выводите
           на экран. */
}
