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
    
    
    
    
    Coordinate max; // this holds the largest  coordinate value for the bounding box 
    Coordinate min; // this holds the smallest coordinate value for the bounding box
    int numPoints; //this value is decided in pointFinder() and tells the program how many points to read
    int numCounty; // this value is decided in pointFinder() and tells the program how many counties are in the file
    Coordinate[] points; //this is an array of coordinates that hold all the coordinates in a state's document and is filled in pointFinder()
    Scanner scan; //this is the scanner used to read the file and all the values the selected file holds
    
    /*
    *  This constructor allows the program to read files using a scanner.
    *
    * @param    state   holds the file that will be read into the program so it can gather data
    *
    */
    public InputParser(String state) throws Exception{
        
        scan = new Scanner(new File("src\\data\\" + state +".txt") );
    }
    
    /*
    * Uses the InputParser object in order to read in all of the coordinate points in a single county
    *
    * @return Coordinate[]
    */
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
    
        /*
        * Finds the biggest coordinate values in order to create a point for the bounding box of a region
        *
        * @return Coordinate max
        */
         Coordinate getMax(){
                 
             double a = scan.nextDouble();
             double b = scan.nextDouble();
             max = new  Coordinate(a, b);
             
             return max;
         }
         
         /*
         * Finds the smallest coordinate values in order to create a point for the bounding box of a region 
         * 
         * @return Coordinate min
         */
         
         Coordinate getMin(){
             
             double c = scan.nextDouble();
             double d = scan.nextDouble();
             min = new Coordinate(c, d);
             
             return min;
         }
       
         

    
    
}
