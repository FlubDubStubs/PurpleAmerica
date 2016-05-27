/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package map;
import edu.princeton.cs.introcs.*;
import java.awt.Color;

/**
 *
 * @author hcps-kamencinb
 */
public class FillColor {
    
    @SuppressWarnings("empty-statement")
    Color map;
    public void draw(){
      //StdDraw.setPenColor(StdDraw.BLUE);
      //StdDraw.filledRectangle(0.4, 0.3, 0.3, 0.25);
      int rep = 1;//will be republicans for every county and state
      int dem = 2;//wil be democrats for every country and state
      int other = 3;//will be third party or non voting
      map = new Color((rep/(rep+dem+other)),(dem/(rep+dem+other)),(other/(rep+dem+other)));//makes an rgb color of how all 3 ints relate to one another
      StdDraw.setPenColor(map);//sets pen color as the rgb color
      StdDraw.line(.2, .2, .4, .4);//test draw a line of that color
    }
    
    public Color setColor(){
        return map;
    }
                                                                                                                                                                                        
}
