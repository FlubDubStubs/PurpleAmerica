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
    int points; //the number of coordinates
    double[] xcoords; //x coordinates of the county/state being drawn
    double[] ycoords; //y coordinates of the county/state being drawn
    double[] xcoordsAlbers;//x coordinates in Albers Equal-Area conic projection
    double[] ycoordsAlbers;//y coordinates in Albers Equal-Area conic projection
    double xMax;
    double xMin;
    double yMax;
    double yMin;
          
    //******************Constructor*****************
    public LineDrawer(Coordinate[] c, int dots, double minx, double miny, double maxx, double maxy){
        points = dots;
        coords = new Coordinate [points];
        coords = c;
        xcoords = new double[points];
        ycoords = new double[points]; 
        xcoordsAlbers = new double[points];
        ycoordsAlbers = new double[points];
        xMax = maxx;
        xMin = minx;
        yMax = maxy;
        yMin = miny;
    }
    
    //*****************Public Methods****************
    public void convertCoords(){
        double x;
        double y;
        double rho;
        double rho0;
        double theta;
        double n;
        double c;
        double lambda;
        double lambda0;
        double phi;
        double phi0;
        double phi1 = -60;
        double phi2 = 0;
        
        for(int i = 0; i < xcoords.length; i++){ 
            lambda = coords[i].getX(); //lambda is x
            phi = coords[i].getY(); //phi is y
            n = .5*(Math.sin(phi1)+Math.sin(phi2)); //bunch of equations used to convert the coordinates
            theta = n*(lambda-lambda0);
            c = Math.pow(Math.cos(phi1), 2)+ 2*n*Math.sin(phi1);
            rho = (Math.sqrt(c-(2*n*Math.sin(phi))))/n;
            rho0 = (Math.sqrt(c-(2*n*Math.sin(phi0))))/n;
            x = rho*Math.sin(theta);
            y = rho0 - rho*Math.cos(theta);
            xcoordsAlbers[i] = x; //sets x and y equal to the Albers converted x and y
            ycoordsAlbers[i] = y;
        }//end for
                
    }//end convertCoords
        
    public void draw(){
        StdDraw.setXscale(xMin, xMax);
        StdDraw.setYscale(yMin, yMax);
        for(int n = 0; n < points; n++){
            xcoords[n] = coords[n].getX(); //takes the x coordinate from each coordinate
            ycoords[n] = coords[n].getY(); //takes the y coordinate from each coordinate
        }//end for loop
        
        for(int i = 0; i < points; i++){
            StdDraw.setPenRadius(.005);
            /*FillColor paint = new FillColor();
            //StdDraw.setPenColor(paint.setColor());
            StdDraw.filledpolygon(xcoords, ycoords);
            */
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.polygon(xcoords, ycoords); //draws a polygon with the x and y coordinates w/ .005 radius and the color black
        }//end for loop        
    }//end draw
    
    public void drawAlbers(){
        StdDraw.setXscale(xMin, xMax);
        StdDraw.setYscale(yMin, yMax);
        convertCoords();//calls the convert coordinates function to convert from Mercator to Albers
        
        for(int i = 0; i < points; i++){
            StdDraw.setPenRadius(.005);
            /*FillColor paint = new FillColor();
            //StdDraw.setPenColor(paint.setColor());
            StdDraw.filledpolygon(xcoordsAlbers, ycoordsAlbers);
            */
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.polygon(xcoordsAlbers, ycoordsAlbers); //draws a polygon with the Albers x and y coordinates w/ .005 radius and the color black
        }//end for loop        
    }//end draw
    
}//close class
