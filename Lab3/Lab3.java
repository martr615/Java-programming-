// ===================================================================
// fil:    ~\tnd002\lab\lab3\Lab3.java
// anm:    lite starthj�lp (?)
// skapad: 2011-02-06 / janpe
// �ndrad: 2011-02-06 / janpe
// ===================================================================

//kan vara bra att importera
//tror det �r n�t med print, skriva ut osv.
import java.util.*;

public class Lab3
{
	//

    public static void main(String[] args) throws IOException //beh�vs till att skriva ut o shit.
    {

    	//f�r att kunna skriva in i kommandf�nstret vilken fil man vill �ppna
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//l�ser in namnet p� textfilen som du vill �ppna
		String openfile = in.readLine();
		BufferedReader out = new BufferedReader(new InputStreamReader(System.in));
		String filename = out.readLine();


		//skapar nytt dictionary objekt som heter dic.
		 Dictionary dic = new Dictionary();

		// �ppna infil
        BufferedReader infile = new BufferedReader
                               (new FileReader(openfile)); //s� den �ppnar textfilen.
        String line, lines;

        StringTokenizer tokens; //beh�vs f�r att splitta ord.





		//l�ser rader tills det inte finns fler rader och blir d� null.
		while ((line = infile.readLine()) != null)
        {
        	line = line.toLowerCase(); //till gemener/sm� boktst�ver.
            tokens = new StringTokenizer(line, " .,-?!;:"); //splittar order i stringen "line" om de tecknena �r emellan orden.

	            while (tokens.hasMoreTokens()) //forts�tter om det finns fler tokens (ord)
	       		 {

	            dic.insert(tokens.nextToken()); //s�tter in n�sta ord (token) i vektorn.

	       		 }

        }
        	// st�ng infil
	        infile.close();



			//sorterar vektorn.
			dic.sort();






          File f = new File(filename); //filename kommer fr�n h�gst upp i skriptet, namnet vi vill spara txt-filen till.


		//tror m�ste ha f�r att skriva text till en txt-fil.
    	PrintWriter fileOut = new PrintWriter(new FileWriter(f));

        	dic.writeToFile(fileOut);


        fileOut.close();
    }


}