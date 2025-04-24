/*
 * Class: CMSC203 30312
 * Instructor: Dr. Ahmed Tarek
 * Description: Utility class to calculate totals.
 * Due: 04/14/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here:Isaac Benavides
*/
public class HolidayBonus {

    public static final double HIGH = 5000.0;
    public static final double LOW = 1000.0;
    public static final double OTHER = 2000.0;

    public static double[] calculateHolidayBonus(double[][] data) {
        double[] bonuses = new double[data.length];

        int maxCols = 0;
        for (double[] row : data) {
            if (row.length > maxCols)
                maxCols = row.length;
        }

        for (int col = 0; col < maxCols; col++) {
            int highIndex = -1, lowIndex = -1;
            double high = Double.NEGATIVE_INFINITY, low = Double.POSITIVE_INFINITY;
            int validCount = 0;

            for (int row = 0; row < data.length; row++) {
                if (col < data[row].length && data[row][col] > 0) {
                    validCount++;
                    if (data[row][col] > high) {
                        high = data[row][col];
                        highIndex = row;
                    }
                    if (data[row][col] < low) {
                        low = data[row][col];
                        lowIndex = row;
                    }
                }
            }

            if (validCount == 1) {
                bonuses[highIndex] += HIGH;
            } else if (validCount > 1) {
                for (int row = 0; row < data.length; row++) {
                    if (col < data[row].length && data[row][col] > 0) {
                        if (row == highIndex)
                            bonuses[row] += HIGH;
                        else if (row == lowIndex)
                            bonuses[row] += LOW;
                        else
                            bonuses[row] += OTHER;
                    }
                }
            }
        }

        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] data) {
        double total = 0;
        double[] bonuses = calculateHolidayBonus(data);
        for (double bonus : bonuses) {
            total += bonus;
        }
        return total;
    }
}
