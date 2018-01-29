//lab1b
//Martin Tran
//
//
//

import javax.swing.*;

public class lab1c {
         
     
    public static void main(String[] args) {
    	
    	String utdata ="Celsius    " + "Kelvin    " + "Fahrenheit " + "\n";
    	double Far, Kel;
    	final double nollpunkt = -273.15; 
        		 
     			
				for(int Cel = 0; Cel <101 ; Cel = Cel+10){
				
				
				Far = 1.8 * Cel + 32;
				Kel = Cel - nollpunkt;
				
				
				utdata+= Cel + "              " + Kel + "           " + Far + "\n";     
				
				}
       			JOptionPane.showMessageDialog(null, utdata);
       			//System.exit(0);     			
     			
        	
    }
}
