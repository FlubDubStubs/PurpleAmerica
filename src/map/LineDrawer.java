/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package map;
import edu.princeton.cs.introcs.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author hcps-mabrysh
 */
public class LineDrawer {
    
    //*******************Variables******************
    Coordinate[] coords; //coordinates of the county/state being drawn
    int counties; //number of counties/states
    //String name; //name of the county/state for reference (might not need it)
    int points; //the number of coordinates
    double[] xcoords;
    double[] ycoords;
      
    //******************Constructor*****************
    public LineDrawer(Coordinate[] c, int divs, int dots){
        points = dots;
        coords = new Coordinate [points];
        coords = c;
        counties = divs;
        xcoords = new double [points];
        ycoords = new double [points];
    }
    
    //*****************Public Methods****************
    public void draw(){
        for(int n = 0; n < counties; n++){
            xcoords[n] = coords[n].getX();
            ycoords[n] = coords[n].getY();
        }//end for loop
        
        for(int i = 0; i < counties; i++){
            StdDraw.setPenRadius(.005);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.polygon(xcoords, ycoords);
        }//end for loop        
    }//end draw
    
}//close class
