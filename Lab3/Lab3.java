// ===================================================================
// fil:    ~\tnd002\lab\lab3\Lab3.java
// anm:    lite starthjälp (?)
// skapad: 2011-02-06 / janpe
// ändrad: 2011-02-06 / janpe
// ===================================================================

//kan vara bra att importera
//tror det är nåt med print, skriva ut osv.
import java.util.*;

public class Lab3
{
	//

    public static void main(String[] args) throws IOException //behövs till att skriva ut o shit.
    {

    	//för att kunna skriva in i kommandfönstret vilken fil man vill öppna
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//läser in namnet på textfilen som du vill öppna
		String openfile = in.readLine();
		BufferedReader out = new BufferedReader(new InputStreamReader(System.in));
		String filename = out.readLine();


		//skapar nytt dictionary objekt som heter dic.
		 Dictionary dic = new Dictionary();

		// öppna infil
        BufferedReader infile = new BufferedReader
                               (new FileReader(openfile)); //så den öppnar textfilen.
        String line, lines;

        StringTokenizer tokens; //behövs för att splitta ord.





		//läser rader tills det inte finns fler rader och blir då null.
		while ((line = infile.readLine()) != null)
        {
        	line = line.toLowerCase(); //till gemener/små boktstäver.
            tokens = new StringTokenizer(line, " .,-?!;:"); //splittar order i stringen "line" om de tecknena är emellan orden.

	            while (tokens.hasMoreTokens()) //fortsätter om det finns fler tokens (ord)
	       		 {

	            dic.insert(tokens.nextToken()); //sätter in nästa ord (token) i vektorn.

	       		 }

        }
        	// stäng infil
	        infile.close();



			//sorterar vektorn.
			dic.sort();






          File f = new File(filename); //filename kommer från högst upp i skriptet, namnet vi vill spara txt-filen till.


		//tror måste ha för att skriva text till en txt-fil.
    	PrintWriter fileOut = new PrintWriter(new FileWriter(f));

        	dic.writeToFile(fileOut);


        fileOut.close();
    }


}