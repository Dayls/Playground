package com.company;

public class Main {

    public static void main(String[] args) {
       printMaxEarning();
    }


    public static void printMaxEarning() {
        Point firstPoint = new Point(750, 50);
        Point secondPoint = new Point(0, 200);

        // equation(relationship between p and d):
        // p = md + b (m = -0.2, b = 200)
        // p = -0.2d + 200
        double mCoefficient = -0.2;
        int b = 200;

        double currentDemand = 0.0;
        int currentPrice;

        double demandResult = 0;
        int priceResult = 0;

        double currentProfit = 0.0;
        double previousProfit = 0.0;
        double resultProfit = 0.0;

        for(currentPrice = firstPoint.getY(); currentPrice <= secondPoint.getY(); currentPrice++) {
            currentDemand = calculateDemand(mCoefficient, b, currentPrice);
            currentProfit = currentDemand * currentPrice;

            if(currentProfit > previousProfit) {
                resultProfit = currentProfit;
                demandResult = currentDemand;
                priceResult = currentPrice;
            }

            previousProfit = currentProfit;
        }

        System.out.println("Recommended daily rent price is " + priceResult + " Turkish Liras and number of daily rented cars " +
                demandResult + " under following constraints:\n");
        System.out.println("Number of rentable cars: " + firstPoint.getX() +
                "\nIn case of rent price: " + firstPoint.getY() + ", demand: " + firstPoint.getX() +
                "\nIn case of rent price; " + secondPoint.getY() + ", demand: " + secondPoint.getX());
    }

    private static double calculateDemand(double m, double b, int price) {
         double demand = (price - b) / m;
         return demand;
    }

}
