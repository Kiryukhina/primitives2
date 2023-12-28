public class Main {

    public static void main(String[] args) {
        int initialAccount = 73; //начальная сумма
        int amount = 1000; //пополнение счета

        int bonus = amount / 100; //количество бонусов
        if (amount < 1000) {
            bonus = 0;
        }
        int result = bonus + initialAccount + amount;
        if (amount < 1000) {
            result = initialAccount + amount;
        }
        System.out.println("Итоговая сумма: " + result);
        System.out.println("Количество бонусных рублей: " + bonus);



    }
}