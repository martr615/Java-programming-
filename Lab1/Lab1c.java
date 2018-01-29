/**
 * @(#)Lab1c.java
 *
 * Lab1c application
 *
 * @author
 * @version 1.00 2013/1/18
 */
  import javax.swing.*;
public class Lab1c {

    public static void main(String[] args) {

		String utdata = "Celsius " + "  Fahrenheit " + "  Kelvin \n";
    	double fahrenheit, kelvin;
    	final double NOLLPUNKT = 273.15;

		for(int celsius = 0; celsius <101; celsius = celsius+10)
		{
    	fahrenheit = 1.8 * celsius + 32;
    	kelvin = celsius + NOLLPUNKT;


		utdata += celsius + "        " + fahrenheit + "         " + kelvin + "\n";


    	}
    	JOptionPane.showMessageDialog(null, utdata);
	System.exit(0);
}
}