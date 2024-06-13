package app;

public class Main {

    private static final double MILES_TO_KILOMETERS = 1.60934;
    private static final double KILOMETERS_TO_MILES = 1 / MILES_TO_KILOMETERS;

    public static double convertMilesToKilometers(double miles) {
        return miles * MILES_TO_KILOMETERS;
    }

    public static double convertKilometersToMiles(double kilometers) {
        return kilometers * KILOMETERS_TO_MILES;
    }

    public static void main(String[] args){
    System.out.println("Distance unit converter");

        double miles = 5;
        double kilometers = convertMilesToKilometers(miles);
        double convertedMiles = convertKilometersToMiles(kilometers);
        System.out.printf("%.2f miles is equal to %.2f kilometers%n", miles, kilometers);
        System.out.printf("%.2f kilometers is equal to %.2f miles%n", kilometers, convertedMiles);
    }
}

