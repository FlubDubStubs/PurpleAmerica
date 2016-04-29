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
    
    double[] xcoord;
    double[] ycoord;
    
    public void draw()throws Exception{
        
        try{
            /*System.out.print("Please enter a state's initials (ex. NY) and then .txt");
            Scanner scanText = new Scanner(System.in);
            String file = scanText.next();*/
            File in = new File ("VA.txt");
            Scanner scan = new Scanner(in);
            scan.nextLine();
            scan.nextLine();
            int counties = scan.nextInt();

            for(int i = 0; i < counties; i++){
                scan.next();
                String countyName = scan.next();
                scan.nextLine();
                int points = scan.nextInt();
                xcoord = new double [points];
                ycoord = new double [points];
                for(int x = 0; x < points; x++){
                    xcoord[0] = scan.nextInt();
                    ycoord[0] = scan.nextInt();
                }//end for loop
                StdDraw.setPenRadius(.005);
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.polygon(xcoord, ycoord);
            }//end for loop
        }
        catch(IOException e){
            System.out.println("hello world");
        }
        
        
    }//end draw
    
}
