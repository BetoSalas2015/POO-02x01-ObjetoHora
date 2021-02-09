import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestTick.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestHora
{
    /**
     * Default constructor for test class TestTick
     */
    private Hora hora;

    @Test    
    public void testCase1()
    {
        hora = new Hora(7,0,58);
        hora.tick();
        hora.tick();
        assertEquals(hora.toString(), "7:01:00 AM");
    }
    
    @Test    
    public void testCase2()
    {
        hora = new Hora(17,59,58);
        hora.tick();
        hora.tick();
        assertEquals(hora.toString(), "6:00:00 PM");
    }
    
    @Test    
    public void testCase3()
    {
        hora = new Hora(23,59,58);
        hora.tick();
        hora.tick();
        assertEquals(hora.toString(), "12:00:00 AM");
    }
    
    @Test
    public void testCase4()
    {
        hora = new Hora(11,59,58);
        hora.tick();
        hora.tick();
        assertEquals(hora.toString(), "12:00:00 PM");
    }
    
    @Test    
    public void testCase5()
    {
        hora = new Hora(17,13,58);
        hora.setMinutos(30);
        assertEquals(hora.toString(), "5:30:58 PM");
    }
    
    @Test    
    public void testCase6()
    {
        hora = new Hora(12,00,00);
        hora.setMinutos(40);
        hora.setSegundos(10);
        hora.tick();
        assertEquals(hora.toString(), "12:40:11 PM");
    }
    
    @Test    
    public void testCase7()
    {
        hora = new Hora(7,0,0);
        hora.setHoras(19);
        assertEquals(hora.toString(), "7:00:00 PM");
    }
    
    @Test    
    public void testCase8()
    {
        hora = new Hora(7,0,0);
        assertEquals(hora.toString(), "7:00:00 AM");
    }
    
    @Test
    public void testCase9()
    {
        hora = new Hora(7,0,0);
        for(int i = 1; i <= 100; i++)
               hora.tick();
        assertEquals(hora.toString(), "7:01:40 AM");
    }
    
    @Test
    public void testCase10()
    {
        hora = new Hora(7,0,0);
        for(int i = 1; i <= 10000; i++)
            hora.tick();
        assertEquals(hora.toString(), "9:46:40 AM");
    }
}
