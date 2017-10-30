package MainPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class DemoForm2D
{
  public static void main( String[] args )
  {
    try 
    {
      Scanner sc = new Scanner( new File( "input.txt" ) );
    
      int numOfTriunghi = 0;
      ArrayList<IPolygon> polygons = new ArrayList<IPolygon>();
      
      while( sc.hasNextLine() )
      {
        int numberOfElements = sc.nextInt();
      
        Punct[] puncte = new Punct[numberOfElements];
        
        for ( int i = 0; i < numberOfElements; i++ )
        {
          int x = sc.nextInt();
          int y = sc.nextInt();
          
          puncte[i] = new Punct( x, y );
        }  
        
        if ( numberOfElements == 3 )
        {
          numOfTriunghi++;
          
          polygons.add( new Triunghi( puncte[0], puncte[1], puncte[2] ) );
        }
        
        if ( numberOfElements == 4 )
        {
          polygons.add( new Patrulater( puncte[0], puncte[1], puncte[2], puncte[3] ) );
        }
      }
      
      sc.close();
      
      System.out.println("Fisierul contine " + ( new Integer( numOfTriunghi )) + " triunghi");
      
      Collections.sort(polygons);
      
      System.out.println( polygons );
      
    }
    catch( FileNotFoundException e )
    {
      System.out.println("File not found");
    }
  }
}
