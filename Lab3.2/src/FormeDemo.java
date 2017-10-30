
import java.lang.Math;

public class FormeDemo
{
  public static void main( String[] args )
  {
    Cerc cerc = new Cerc( 6, 6 );
    Integer lungime = new Integer( cerc.getLungime() );
    Double suprafata = new Double( cerc.suprafata() );
    
    System.out.println( "Cerc: " + cerc );
    System.out.println( "Latimea cercului: " + lungime );
    System.out.println( "Suprafata cercului: " + suprafata );
  }
}

abstract class Forme2D
{
  protected int lungime;
  protected int latime;
  
  public int getLungime()
  {
    return lungime;
  }
  
  public int getLatime()
  {
    return latime;
  }
  
  public void setLungime( int lungime )
  {
    this.lungime = lungime;
  }
  
  public void setLatime( int latime )
  {
    this.latime = latime;
  }
  
  abstract public double suprafata();
  
  @Override
  public String toString()
  {
    return "lungime: " + ( new Integer( lungime ) ).toString() + ", latime: " + ( new Integer( latime ) ).toString(); 
  }
}

class Cerc extends Forme2D
{
  Cerc( int lungime, int latime )
  {
    super.lungime = lungime;
    super.latime = latime;
  }
  
  public double suprafata()
  {
    int r = lungime / 2;
    
    return Math.PI * r * r; 
  }
}
