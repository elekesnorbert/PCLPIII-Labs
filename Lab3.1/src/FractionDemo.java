
public class FractionDemo
{
  public static void main( String[] args )
  {
    Fraction a = new Fraction( 1, 3 );
    Fraction b = new Fraction( 1, 6 );
    Fraction c = new Fraction( 2, 6 );
    Fraction d = new Fraction( 6, 3 );
    
    Fraction aPlusB = Operation.plus(a, b);
    Fraction aMinusB = Operation.minus( a, b );
    Fraction bMinusA = Operation.minus( b, a );
    Fraction aTimesB = Operation.times( a , b );
    Fraction aTimesC = Operation.times( a, c );
    Fraction aDivB = Operation.div( a,  b ); 
    Fraction cSimplified = Operation.simplify( c );
    Fraction dSimplified = Operation.simplify( d );
    
    System.out.println( a + " + " + b + " = " + aPlusB );
    System.out.println( a + " - " + b + " = " + aMinusB );
    System.out.println( b + " - " + a + " = " + bMinusA );
    System.out.println( a + " * " + b + " = " + aTimesB );
    System.out.println( a + " * " + c + " = " + aTimesC );
    System.out.println( a + " / " + b + " = " + aDivB );
    System.out.println( c + " simplified: " + cSimplified );
    System.out.println( d + " simplified: " + dSimplified );
  }
}

class Operation
{
  public static Fraction simplify( Fraction one )  
  {
    int c = cmmdc( one.getNumerator(), one.getDenominator() );
    
    return new Fraction( one.getNumerator() / c, one.getDenominator() / c );
  }
  
  public static Fraction plus( Fraction one, Fraction two )
  {
    int c = cmmmc( one.getDenominator(), two.getDenominator() ); 
    
    int numerator = c / one.getDenominator() * one.getNumerator() + c / two.getDenominator() * two.getNumerator(); 
    int denominator = c;
    
    return new Fraction( numerator, denominator );
  }
  
  public static Fraction minus( Fraction one, Fraction two )
  {
    int c = cmmmc( one.getDenominator(), two.getDenominator() ); 
    
    int numerator = c / one.getDenominator() * one.getNumerator() - c / two.getDenominator() * two.getNumerator(); 
    int denominator = c;
    
    return new Fraction( numerator, denominator );
  }
  
  public static Fraction times( Fraction one, Fraction two )
  {
    return new Fraction( one.getNumerator() * two.getNumerator(), one.getDenominator() * two.getDenominator() );
  }
  
  public static Fraction div( Fraction one, Fraction two )
  {
    return new Fraction( one.getNumerator() * two.getDenominator(), one.getDenominator() * two.getNumerator() );
  }
  
  private static int cmmdc( int a, int b )
  {
    int r = a % b;
    
    while( r != 0 )
    {
      a = b;
      b = r;
      r = a % b;
    }
    
    return b;
  }
  
  private static int cmmmc( int a, int b )
  {
    return ( a * b ) / cmmdc( a, b );
  }
}

class Fraction
{
  private int numerator;
  private int denominator;
  
  Fraction( int numerator, int denominator )
  {
    this.numerator = numerator;
    this.denominator = denominator;
  }
  
  public int getNumerator()
  {
    return numerator;
  }
  
  public int getDenominator()
  {
    return denominator;
  }
  
  public void setNumerator( int numerator)
  {
    this.numerator = numerator;
  }
  
  public void setDenominator( int denominator )
  {
    this.denominator = denominator;
  }
 
  @Override
  public String toString()
  {
    return ( new Integer( numerator ) ).toString() + "/" + ( new Integer( denominator ) ).toString();
  }
}
