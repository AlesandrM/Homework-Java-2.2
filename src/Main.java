public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1100;

        int bonus;
        if (replenishment >= 1000) {
            bonus = 1000 / 90;
        } else {
            bonus = 0;
        }

        int finalBalance = balance + bonus + replenishment;

        System.out.println("Ваш баланс: " + finalBalance);


    }

}
