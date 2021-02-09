

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestHora.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestHora
{
    /**
     * Default constructor for test class TestHora
     */
    public TestHora()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testCase01()
    {
        Hora hora1 = new Hora();
        hora1.setHoras(18);
        assertEquals("6:00:00 PM", hora1.toString());
    }

    @Test
    public void testCase02()
    {
        Hora hora1 = new Hora(10, 15);
        assertEquals("10:15:00 AM", hora1.toString());
    }
}


