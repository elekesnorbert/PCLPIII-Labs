package MainPackage;

public class Punct
{
  private double x;
  private double y;
  
  Punct( double x, double y )
  {
    this.x = x;
    this.y = y;
  }
  
  public void setX( double x )
  {
    this.x = x;
  }
  
  public void setY( double y )
  {
    this.y = y;
  }
  
  public double getX()
  {
    return x;
  }
  
  public double getY()
  {
    return y;
  }  
}
