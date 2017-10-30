package MainPackage;

public class Patrulater extends IPolygon
{
  Patrulater( Punct a, Punct b, Punct c, Punct d )
  {
    super( 4, a, b, c, d );
    super.arie = arie();
  }
  
  public double arie()
  {
    Punct a = puncte[0];
    Punct b = puncte[1];
    Punct d = puncte[3];
    
    return ( a.getX() - d.getX() ) * ( a.getY() - b.getY() );
  }
}
