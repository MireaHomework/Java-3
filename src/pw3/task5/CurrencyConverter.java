package pw3.task5;

public class CurrencyConverter {
    static double dollarCost = 88.82;

    public static double rublesToDollars(double rubles) {
        return rubles / dollarCost;
    }

    public static double dollarsToRubles(double dollars) {
        return dollars * dollarCost;
    }
}
