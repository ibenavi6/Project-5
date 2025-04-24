/*
 * Class: CMSC203 30312
 * Instructor: Dr. Ahmed Tarek
 * Description: HolidayBonus / TestStudent
 * Due: 04/14/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here:Isaac Benavides
*/
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTestStudent {

    // Sample data set
    private double[][] dataSet1 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };

    @Before
    public void setUp() throws Exception {
        // Setup if needed
    }

    @After
    public void tearDown() throws Exception {
        // Cleanup if needed
    }

    @Test
    public void testCalculateHolidayBonus() {
        try {
            double[] bonuses = HolidayBonus.calculateHolidayBonus(dataSet1);
            assertEquals(3000.0, bonuses[0], 0.001);
            assertEquals(4000.0, bonuses[1], 0.001);
            assertEquals(15000.0, bonuses[2], 0.001);
        } catch (Exception e) {
            fail("This should not have caused an Exception");
        }
    }

    @Test
    public void testCalculateTotalHolidayBonus() {
        double total = HolidayBonus.calculateTotalHolidayBonus(dataSet1);
        assertEquals(22000.0, total, 0.001);
    }
}