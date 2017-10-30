package MainPackage;

public abstract class IPolygon implements Comparable<IPolygon>
{
  protected Punct[] puncte;
  protected int numPuncte;
  protected double arie;
  
  public abstract double arie();
  
  public IPolygon( int numPuncte, Punct... punct )
  {
    this.numPuncte = numPuncte;
    this.puncte = new Punct[numPuncte]; 

    for (int i = 0; i < numPuncte; i++ )
    {
      this.puncte[i] = punct[i];
    }
  }
  
  public int compareTo( IPolygon poly )
  {
    if ( this.arie == poly.arie )
    {
      return 0;
    }
    else
    {
      if ( this.arie < poly.arie )
      {
        return -1;
      }
      else
      {
        return 1;
      }
    }
  }
  
  public String toString()
  {
    if ( numPuncte == 3 )
    {
      return "Triunghi cu arie " + arie;
    }
    if ( numPuncte == 4 )
    {
      return "Patrulater cu arie " + arie;
    }
    return "altceva";
  }
}
