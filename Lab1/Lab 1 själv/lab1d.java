//lab1b
//Martin Tran
//
//
//

import javax.swing.*;

public class lab1d {
         
     
    public static void main(String[] args) {
    	
    	String utdata ="Celsius    " + "Kelvin    " + "Fahrenheit " + "\n";
    	String indata;
    	double Far, Kel;
    	double Cel, startCel, slutCel;
    	int Steg;
    	final double nollpunkt = -273.15; 
        		 
     		
			
			do{
			indata = JOptionPane.showInputDialog("Ange start temperatur i C");
			startCel = Integer.parseInt(indata);
			}while(startCel < nollpunkt);
			
			do{
			indata = JOptionPane.showInputDialog("Ange slut temperatur i C");
			slutCel = Integer.parseInt(indata);
			}while(slutCel<=startCel);
			
			do{
			indata = JOptionPane.showInputDialog("Ange steglängden (heltal)");
			Steg = Integer.parseInt(indata);
			}while(Steg<=0);
			
			while(startCel <= slutCel){
			
			Cel = startCel;
						
			Far = 1.8 * Cel + 32;
			Kel = Cel - nollpunkt;
				
			utdata+= Cel + "              " + Kel + "           " + Far + "\n";     
			
			startCel += Steg;
				
			}
			JOptionPane.showMessageDialog(null, utdata);
			//System.exit(0);     							
  			
   			
     			
        	
    }
}
