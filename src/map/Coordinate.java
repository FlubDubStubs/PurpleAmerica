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
 
   
    
    Coordinate (double x, double y){
        
        lat = x;
        lon =y;
        
    }
    
    public double getX(){
        
        return lat;
        
    }
    
    public double getY(){
        
        return lon; 
        
    }
    
    public String toString(){
        String str = "";
        
        str += lat;
        str+= " " + lon;
        
        return str;
    }
    
}
