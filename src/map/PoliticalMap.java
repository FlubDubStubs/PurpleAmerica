/*
 * Political Map Project
 * Name: 
 * Block:
 * 
 * Program Purpose:
 *
 * Algorithm:
 * 
 * Future/possible improvements:
 *
 */
package map;
import edu.princeton.cs.introcs.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 
 */
public class PoliticalMap {
    public static void main(String[] args){
        StdDraw.setCanvasSize(700,700);
        
            File state = new File("src\\data\\VA.txt");
            Scanner scan;
            
        try {
            scan = new Scanner(state);
            //Trying to read the files and just print them for a test
                        
                        
            System.out.println(scan.next());

        } catch (FileNotFoundException ex) {
            System.out.println("here");
        }

        Coordinate coord = new Coordinate(0, 0); 
        //coord.pointFinder();
        
        
    }
}
