package ru.netology.stats;

public class StatsService {

    public long calcAnnualSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return calcAnnualSum(sales) / sales.length;
    }

    public long maxSales(long[] sales) {
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

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long salesUnderAvrg(long[] sales) {
        int month = 0;
        long av = average(sales);

        for (int index = 0; index < sales.length; index++) {
            if (sales[index] < av) {
                month++;
            }
        }
        return month;
    }

    public long salesAboveAvrg(long[] sales) {
        int month = 0;
        long av = average(sales);
        for (int index = 0; index < sales.length; index++) {
            if (sales[index] > av) {
                month++;
            }
        }
        return month;
    }
}

