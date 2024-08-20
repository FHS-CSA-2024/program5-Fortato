//import stuff here?
import java.util.Scanner;
import java.lang.Math;
//Your code here
public class program5 
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
            
        //create my variables
        int mile1 = 0;
        int gallon1 = 0;
        int mile2 = 0;
        int gallon2 = 0;
        int mile3 = 0;
        int gallon3 = 0;
        int mile4 = 0;
        int gallon4 = 0;
        
        //ask for user input
        System.out.println("Please enter how many miles Royale went");
        
        double royaleMiles = (double) mile1;
        royaleMiles = myObj.nextDouble();
        
        System.out.println("Please enter how much gas Royale used");
        
        double royaleGallons = (double) gallon1;
        royaleGallons = myObj.nextDouble();
        
        System.out.println("Please enter how many miles Koopa King went");
        
        double koopaKingMiles = (double) mile2;
        koopaKingMiles = myObj.nextInt();
        
        System.out.println("Please enter how much gas Koopa King used");
        
        double koopaKingGallons = (double) gallon2;
        koopaKingGallons = myObj.nextInt();
         
        System.out.println("Please enter how far Pipe Frame went");
        
        double pipeFrameMiles = (double) mile3;
        pipeFrameMiles = myObj.nextInt();
         
        System.out.println("Please enter how much gas Pipe Frame used");
        
        double pipeFrameGallons = (double) gallon3;
        pipeFrameGallons = myObj.nextInt();
         
        System.out.println("Please enter how far Badwagon went");
        
        double badwagonMiles = (double) mile4;
        badwagonMiles = myObj.nextInt();
         
        System.out.println("Please enter how much gas Badwagon used");
        
        double badwagonGallons = (double) gallon4;
        badwagonGallons = myObj.nextInt();
        
        //Math
        double royaleFinal = (royaleMiles / royaleGallons);
        double koopaKingFinal = (koopaKingMiles / koopaKingGallons);
        double pipeFrameFinal = (pipeFrameMiles / pipeFrameGallons);
        double badwagonFinal = (badwagonMiles / badwagonGallons);
        
        //Output
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon");
        System.out.println("Royale averaged " + (Math.round(royaleFinal * 10.0) / 10.0) + "m/g");
        System.out.println("Koopa King averaged " + (Math.round(koopaKingFinal * 10.0) / 10.0) + "m/g");
        System.out.println("Pipe Frame averaged " + (Math.round(pipeFrameFinal * 10.0) / 10.0) + "m/g");
        System.out.print("Badwagon averaged " + (Math.round(badwagonFinal * 10.0) / 10.0) + "m/g");
    }
}
//Paste console output below:
/*

Please enter how many miles Royale went
286
Please enter how much gas Royale used
9
Please enter how many miles Koopa King went
412
Please enter how much gas Koopa King used
40
Please enter how far Pipe Frame went
361
Please enter how much gas Pipe Frame used
18
Please enter how far Badwagon went
161
Please enter how much gas Badwagon used
11
Mushroom Cup Prix Racer Average Miles/Per Gallon
Royale averaged 31.8m/g
Koopa King averaged 10.3m/g
Pipe Frame averaged 20.1m/g
Badwagon averaged 14.6m/g

*/
