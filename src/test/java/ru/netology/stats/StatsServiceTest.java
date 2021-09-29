package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calcAnnualSum() {
        StatsService service = new StatsService();

        long[] sales = {856_345, 1_578_000, 1_350_000, 828_523, 1_976_001, 1_923_434, 1_893_242, 1_923_434, 743_342, 1_235_000, 1_235_000, 1_622_000};
        long expected = 17_164_321;
        long actual = service.calcAnnualSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        StatsService service = new StatsService();
        long[] sales = {856_345, 1_578_000, 1_350_000, 828_523, 1_976_001, 1_923_434, 1_893_242, 1_923_434, 743_342, 1_235_000, 1_235_000, 1_622_000};
        long expected = 1_430_360;
        long actual = service.average(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxSale() {
        StatsService service = new StatsService();

        long[] sales = {856_345, 1_578_000, 1_350_000, 828_523, 1_976_001, 1_923_434, 1_893_242, 1_923_434, 743_342, 1_235_000, 1_235_000, 1_622_000};
        long expected = 5;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minSale() {
        StatsService service = new StatsService();

        long[] sales = {856_345, 1_578_000, 1_350_000, 828_523, 1_976_001, 1_923_434, 1_893_242, 1_923_434, 743_342, 1_235_000, 1_235_000, 1_622_000};
        long expected = 9;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void salesUnderAvrg() {
        StatsService service = new StatsService();

        long[] sales = {856_345, 1_578_000, 1_350_000, 828_523, 1_976_001, 1_923_434, 1_893_242, 1_923_434, 743_342, 1_235_000, 1_235_000, 1_622_000};
        long expected = 6;
        long actual = service.salesUnderAvrg(sales);
        assertEquals(expected, actual);
    }

    @Test
    void salesAboveAvrg() {
        StatsService service = new StatsService();

        long[] sales = {856_345, 1_578_000, 1_350_000, 828_523, 1_976_001, 1_923_434, 1_893_242, 1_923_434, 743_342, 1_235_000, 1_235_000, 1_622_000};
        long expected = 6;
        long actual = service.salesAboveAvrg(sales);
        assertEquals(expected, actual);
    }

}