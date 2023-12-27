public class Main {

    public static void main(String[] args) {
        int initialAccount = 73; //начальная сумма
        int amount = 1200; //пополнение счета

        int bonus;
        if (amount > 1000) {
            bonus = 1;
        }

        if (amount < 1000) {
            bonus = 0;
        }

        int quantity = amount / 100; //количество бонусов
        int result = quantity + initialAccount;

        System.out.println("Итоговая сумма: " + result);



    }
}


