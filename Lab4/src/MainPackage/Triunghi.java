package MainPackage;

public class Triunghi extends IPolygon
{ 
  Triunghi( Punct a, Punct b, Punct c )
  {
    super( 3, a, b ,c );
    super.arie = arie();
  }

  @Override
  public double arie()
  {
    Punct a = super.puncte[0];
    Punct b = super.puncte[1];
    Punct c = super.puncte[2];
    
    return 0.5 * Math.abs( a.getX() * b.getY() + b.getX() * c.getY() + c.getX() * a.getY() - 
                      c.getX() * b.getY() - a.getX() * c.getY() - b.getX() * a.getY() );
  }
}
