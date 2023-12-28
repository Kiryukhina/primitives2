public class Main {

    public static void main(String[] args) {
        int initialAccount = 73; //начальная сумма
        int amount = 100; //пополнение счета

        int bonus;
        if (amount > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }

        int quantity = amount / 100; //количество бонусов
        if (amount < 1000) {
            bonus = initialAccount + 0;
        }
        int result = quantity + initialAccount + amount;
        if (amount < 1000) {
            result = initialAccount + amount;
        }
        System.out.println("Итоговая сумма: " + result);



    }
}


