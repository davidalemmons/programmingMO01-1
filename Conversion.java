public class Conversion {
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}

class TestConversion {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "Feet", "Meters");
        System.out.println("-------------------");

        for (double feet = 1.0; feet <= 10.0; feet++) {
            double meters = Conversion.footToMeter(feet);
            System.out.printf("%-10.1f%-10.3f\n", feet, meters);
        }

        System.out.println();

        System.out.printf("%-10s%-10s\n", "Meters", "Feet");
        System.out.println("-------------------");

        for (double meters = 20.0; meters <= 65.0; meters += 5.0) {
            double feet = Conversion.meterToFoot(meters);
            System.out.printf("%-10.1f%-10.3f\n", meters, feet);
        }
    }
}
