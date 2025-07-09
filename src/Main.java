import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] weeklyPayments = {30000, 40107, 40000, 50500, 40100};
        int totalExpenses = 0;
        for (int expenses : weeklyPayments) {
            totalExpenses = totalExpenses + expenses;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");

        System.out.println("Task 2");
        int maxWeeklypayments = weeklyPayments[0];
        int minWeeklypayments = weeklyPayments[0] ;
        for (int i = 1; i < weeklyPayments.length; i++){
            if (weeklyPayments[i] > maxWeeklypayments) {
                maxWeeklypayments = weeklyPayments[i];
                if (weeklyPayments[i] < minWeeklypayments)
                    minWeeklypayments = weeklyPayments[i];
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minWeeklypayments + " рублей. Максимальная сумма трат за неделю составила " + maxWeeklypayments + " рублей");

        System.out.println("Task 3");
        int total = 0;
        for (int week : weeklyPayments)
        {
            total = total + week;
        }
        float avarage =(float) total / weeklyPayments.length;
        System.out.printf("Средняя сумма трат за месяц составила " + avarage + " рублей");

        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int left = 0;
        int right = reverseFullName.length - 1;

        while (left < right) {
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;

            left++;
            right--;
        }
        for (char c : reverseFullName) {
            System.out.print(c);
        }
    }
}
