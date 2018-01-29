//lab1b
//Martin Tran
//
//
//

import javax.swing.*;

public class lab1e {
         
     
    public static void main(String[] args) {
    	
    String indata;
    int talLedare, talDeltagare, gissningar, antalgissningar;
    
    do{
    indata = JOptionPane.showInputDialog("Provledare - ange ett tal från 1-100");
 	talLedare = Integer.parseInt(indata);       	
    }while(talLedare<=0 || talLedare>100);
    
   		
   	indata = JOptionPane.showInputDialog("Provdeltagare - Gissa ett tal från 1-100");
   	talDeltagare = Integer.parseInt(indata);   
   	
   			
    for(gissningar = 1; talLedare != talDeltagare; gissningar = gissningar + 1){
    	
		if(talLedare < talDeltagare){
   			indata = JOptionPane.showInputDialog(talDeltagare + " är för stort - försök igen"); 	  	
   			talDeltagare = Integer.parseInt(indata);    	
    	}
    	else{
    		indata = JOptionPane.showInputDialog(talDeltagare + " är för litet - försök igen");		  	
   			talDeltagare = Integer.parseInt(indata); 
    	}
     }
    	
 		antalgissningar = gissningar;
 		
 			if(antalgissningar == 1 || antalgissningar == 2 || antalgissningar == 3){
   		 	gissningar = 1;
   		 	}
   		 	else if(antalgissningar == 4 || antalgissningar == 5 || antalgissningar == 6){
   		 	gissningar = 2;
   		 	}
   		 	else if(antalgissningar == 7 || antalgissningar == 8 || antalgissningar == 9){
   		 	gissningar = 3;
   		 	}
  
    
   		 switch(gissningar){
   		 			
   			case 1:   	
    				JOptionPane.showMessageDialog(null, "Välkommen till LiTH");
       				break;
   	    	case 2: 
    				JOptionPane.showMessageDialog(null, "Välkommen till Chalmers");
    				break;
   	    	case 3: 
    				JOptionPane.showMessageDialog(null, "Välkommen till KTH");
    				break;
    		default:
    				JOptionPane.showMessageDialog(null, "Välkommen åter nästa år");
    				break; 
		}
    }
}
	
