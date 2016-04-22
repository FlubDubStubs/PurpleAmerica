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
    
    public void draw(){
        
        System.out.print("Please enter a state's initials (ex. NY) and then .txt");
        Scanner scanText = new Scanner(System.in);
        String file = scanText.next();
        File in = new File (file);
        
        StdDraw.setPenRadius(.005);
        StdDraw.setPenColor(StdDraw.BLACK);
        
    }//end draw
    
}
