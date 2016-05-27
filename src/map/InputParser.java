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
import java.io.File;
public class InputParser {
    
    Coordinate max;
    Coordinate min;
    int numPoints;
    int numCounty;
    Coordinate[] points; 
    Votes[] votes;
    Scanner scan;
    
    public InputParser(String state) throws Exception{
        
        scan = new Scanner(new File("src\\data\\" + state +".txt") );
    }
    
    //This method is used to all of the points within a single county
    Coordinate[] pointFinder(){
            
            
                scan.nextLine();
                scan.nextLine();
                scan.nextLine();
                scan.nextLine();
                scan.nextLine();
                scan.nextLine();
                numPoints = scan.nextInt();
                points = new Coordinate[numPoints];
        
                for(int i = 0; i < numPoints; i ++){
                    
                        double a = scan.nextDouble();
                        double b = scan.nextDouble();
                        points[i] = new Coordinate(a, b);  
                        
                    
                }
            
            
            return points;
        }
    
        //These methods are used to find the outer limits of the bounding box surrounding the state
         Coordinate getMax(){
                 
             double a = scan.nextDouble();
             double b = scan.nextDouble();
             max = new  Coordinate(a, b);
             
             return max;
         }
         
         Coordinate getMin(){
             
             double c = scan.nextDouble();
             double d = scan.nextDouble();
             min = new Coordinate(c, d);
             
             return min;
         }
       
         
         Votes[] getVotes(){
             
             
             
             
             return votes;
         }
    
    
}
