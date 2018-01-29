/**
 * @(#)Lab1d.java
 *
 * Lab1d application
 *
 * @author
 * @version 1.00 2013/1/18
 */
import javax.swing.*;
public class Lab1d {

      public static void main(String[] args) {

		String utdata = "Celsius " + "  Fahrenheit " + "  Kelvin \n";
		String indata;
    	double fahrenheit, kelvin, starttemp, sluttemp, steg, celsius;
    	final double NOLLPUNKT = 273.15;

    	do
		{
    	indata = JOptionPane.showInputDialog("Ange sluttemperatur:");
		sluttemp = Integer.parseInt(indata);
		}while(sluttemp < -NOLLPUNKT);

		do
		{
		indata = JOptionPane.showInputDialog("Ange starttemperatur:");
		starttemp = Integer.parseInt(indata);
		}while(starttemp < -NOLLPUNKT && starttemp > sluttemp);

		do
		{
    	indata = JOptionPane.showInputDialog("Ange steglängden:");
		steg = Integer.parseInt(indata);
		}while(steg <= 0);

		celsius = starttemp;
		while(celsius <= sluttemp)
		{
    	fahrenheit = 1.8 * celsius + 32;
    	kelvin = celsius + NOLLPUNKT;


		utdata += celsius + "        " + fahrenheit + "         " + kelvin + "\n";
		celsius += steg;

    	}
    	JOptionPane.showMessageDialog(null, utdata);
	System.exit(0);
}
}