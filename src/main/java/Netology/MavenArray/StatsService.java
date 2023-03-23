package Netology.MavenArray;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long totalSum(long[] sales) {
        long totalAmount = 0;
        for (long sale : sales) {
            totalAmount = totalAmount + sale;
        }
        return totalAmount;
    }

    public long averageSum(long[] sales) {
        return totalSum(sales) / sales.length;
    }

    public int countBelowAvg(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale < averageSum(sales)) {
                month++;
            }
        }
        return month;
    }

    public int countAboveAvg(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale > averageSum(sales)) {
                month++;
            }
        }
        return month;
    }
}
