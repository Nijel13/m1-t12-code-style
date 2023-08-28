import java.util.Scanner;
public class DepositCalculator {
double calculateComplexPercent(double amount, double year, int days ) {
       double pay = amount * Math.pow((1 + year / 12), 12 * days);
          return round(pay, 2);
}
  double calculateSimplePercent(double doubleAmount, double doubleYearRate, int depositPeriod) {
         return round(doubleAmount + (doubleAmount * doubleYearRate * depositPeriod), 2);
    }
    double round(double value, int places) {
       double scale = Math.pow(10, places);
       return Math.round(value * scale) / scale;
}

    void calculateIncome() {
      int period, action;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");

      int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");

        period = scanner.nextInt();
            System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");

        action = scanner.nextInt();
            double out = 0;

        if (action ==1) out = calculateSimplePercent(amount, 0.06, period);

        else if (action == 2)
        {
            out = calculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + out);
    }
public static void main(String[] args)
    {
        new DepositCalculator().calculateIncome();
    }
}