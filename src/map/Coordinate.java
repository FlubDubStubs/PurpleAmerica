/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package map;

import java.util.Scanner;

/**
 *
 * @author hcps-taylorsd
 */
public class Coordinate {
    
    double lat;
    double lon;
    int numPoints;
    Coordinate[] points; 
    Scanner scan = new Scanner(System.in);
   
    
    Coordinate (double x, double y){
        
        lat = x;
        lon =y;
        
    }
    
    
    public Coordinate[] pointFinder(){
            
            
        
                scan.nextLine();
                scan.nextLine();
                numPoints = scan.nextInt();
                points = new Coordinate[numPoints];
        
                for(int i = 0; i > numPoints; i ++){
                    
                        lat = scan.nextDouble();
                        lon = scan.nextDouble();
                        points[i] = new Coordinate(lat, lon);  
                    
                }
            
            //LineDrawer draw = new LineDrawer(points, numPoints, );
            
            return points;
        }
    
    public double getX(){
        
        return lat;
        
    }
    
    public double getY(){
        
        return lon; 
        
    }
    
}
