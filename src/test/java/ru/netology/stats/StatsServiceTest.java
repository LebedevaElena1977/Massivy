package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void testSum() {

        StatsServise service = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testAverage() {

        StatsServise service = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testmaximumSales() {
        StatsServise service = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.maximumSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testminSales() {
        StatsServise service = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actual = service.minSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void monthBelowAverage(){
        StatsServise service = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthBelowAverage(sales);

        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void monthAboveAverage(){
        StatsServise service = new StatsServise();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthAboveAverage(sales);

        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }
}
