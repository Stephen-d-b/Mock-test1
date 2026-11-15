/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Q1UnitTest;

import com.mycompany.question1.MovieTicket;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ricka
 */
// Q.1.3 - Unit test class for the MovieTickets class.
// Lives in the test package as required by the exam.
public class MovieTicketTest {

    // Create a test instance of the class being tested
    MovieTicket mt = new MovieTicket();

    // Q.1.3 - Test 1: Verifies TotalMovieSales returns the correct sum.
    // Sample data: 3000 + 1500 + 1700 = 6200
    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {
        int[] sales = {3000, 1500, 1700};    // Input (Jan, Feb, Mar)
        assertEquals(6200, mt.TotalMovieSales(sales)); // Expected vs actual
    }

    // Q.1.3 - Test 2: Verifies TopMovie returns the correct movie name.
    // Oppenheimer (6300) is greater than Napoleon (6200), so Oppenheimer should win.
    @Test
    public void TopMovieSales_ReturnsTopMovie() {
        String[] movies = {"Napoleon", "Oppenheimer"}; // Movie names
        int[] totals = {6200, 6300};                   // Total sales per movie
        assertEquals("Oppenheimer", mt.TopMovie(movies, totals)); // Expected result
    }
}
