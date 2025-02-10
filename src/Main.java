public class Main {
    public static void main(String[] args) {


        // Задача 1

        System.out.println("");
        System.out.println("Задача 1");

        int[] expenses = {50000, 55000, 52000, 54000, 51000};
        int total2 = 0;
        for (int i = 0; i < expenses.length; i++) {
            total2 = expenses[i] + total2;
        }
        System.out.println("Сумма трат за месяц составила - " + total2 + " рублей.");

        // Задача 2

        System.out.println("");
        System.out.println("Задача 2");

        int[] expenses2 = {60000, 65000, 62000, 64000, 61000};
        int minExpenses = expenses2[0];
        int maxExpenses = expenses2[0];
        for (int i = 1; i < expenses2.length; i++) {

            if (expenses2[i] > maxExpenses) {
                maxExpenses = expenses2[i];

            }
            if (expenses2[i] < minExpenses) {
                minExpenses = expenses2[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила - " + minExpenses + " рублей. Максимальная сумма трат за неделю составила - " + maxExpenses + " рублей.");

        // Задача 3

        System.out.println("");
        System.out.println("Задача 3");

        float[] expenses3 = {70000, 75000, 72000, 74000, 71000};
        float total = 0;
        for (float i = 0; i < expenses3.length; i++) {
            total = total + expenses3[(int) i];
        }
        float averageAmount = total / expenses3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        // Задача 4

        System.out.println("");
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        StringBuilder firstName1  = new StringBuilder();
        StringBuilder secondName1 = new StringBuilder();
        boolean space = false;

        for (char i : reverseFullName) {
            if (i == ' '){
                space = true;
            } if (!space) {
                firstName1.append(i);
            } else {
                secondName1.append(i);
            }
        }
        String firstName = new StringBuilder(firstName1).reverse().toString();
        String secondName = new StringBuilder(secondName1).reverse().toString();

        System.out.println(firstName + " " + secondName);

    }
}