
/**
 * Clase Hora
 * 
 * @author Roberto Salazar
 * @version 1.0
 */
public class Hora
{
    private int horas;
    private int minutos;
    private int segundos;
    
    public Hora(int h, int m, int s) {
        setHoras(h);
        setMinutos(m);
        setSegundos(s);
    }
    
    public Hora() {
        setHoras(0);
        setMinutos(0);
        setSegundos(0);
    }
    
    public Hora(int h) {
        setHoras(h);
        setMinutos(0);
        setSegundos(0);
    }
    
    public Hora(int h, int m) {
        setHoras(h);
        setMinutos(m);
        setSegundos(0);
    }
    
    public void setHoras(int h)  // modificador
    {
       horas = (horas >= 0 && horas < 24) ? h : 0;
    }
    
    public int getHoras() 
    {
        return horas;
    }
    
    public void setMinutos(int m)
    {
        minutos = (m >= 0 && m < 60) ?  m :  0;
    }
    
    public int getMinutos()
    {
        return minutos;
    }
    
    public int getSegundos()
    {
        return segundos;
    }
    
    public void setSegundos(int s)
    {
        segundos = (s >= 0 && s < 60) ?  s :  0;
    }
    
    public String toString()
    {
        return ((horas == 12 || horas == 0 ? 12 : horas % 12) + ":" +
                (minutos < 10 ? "0" : "") + minutos + ":" +
                (segundos < 10 ? "0" : "") + segundos +
                (horas < 12 ? " AM" : " PM"));
    }

}









