//lab1b
//Martin Tran
//
//
//

import javax.swing.*;

public class lab1b {
         
     
    public static void main(String[] args) {
    	
    	String indata, utdata;
    	double Cel, Far, Kel;
    	final double nollpunkt = -273.15; 
        		 
     	do{
		indata = JOptionPane.showInputDialog("Ange temperatur i Celcius:");
		Cel = Integer.parseInt(indata);    
       
        	if(Cel < nollpunkt){
        		 JOptionPane.showMessageDialog(null, "Exit program");
       		}
        	else{
        
        		Far = 1.8 * Cel + 32;
				Kel = Cel - nollpunkt;
     	
     			utdata = "Kelvin = " + Kel + "\n" + "Fahrenheit = " + Far;     
        
       			JOptionPane.showMessageDialog(null, utdata);
        		}
        
     	}while(Cel > nollpunkt);
     	         			
    }
}
