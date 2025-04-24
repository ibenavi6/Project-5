/*
 * Class: CMSC203 30312
 * Instructor: Dr. Ahmed Tarek
 * Description: TwoDimRaggedArrayUtility / TestStudent
 * Due: 04/14/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here:Isaac Benavides
*/

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilityTestStudent {

    private double[][] dataSet1 = { {1, 2, 3}, {4, 5}, {6, 7, 8, 9} };

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetRowTotal() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 1), 0.001);
    }
    
    @Test
    public void testGetTotal() {
        assertEquals(45.0, TwoDimRaggedArrayUtility.getTotal(dataSet1), 0.001);
    }
    
    @Test
    public void testGetAverage() {
        assertEquals(5.0, TwoDimRaggedArrayUtility.getAverage(dataSet1), 0.001);
    }
    
    @Test
    public void testGetColumnTotal() {
        assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 2), 0.001);
    }
}