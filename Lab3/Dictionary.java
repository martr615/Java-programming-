 /**
 * @(#)Dictionary.java
 *
 *
 * @author
 * @version 1.00 2013/2/6
 */
import java.io.*;
import java.util.*;

public class Dictionary
{
	//skapar en vektor, varje position är en entry. Som i vårt fall är word & counter.
	private Vector<Entry> vect = new Vector<Entry>();
	



    public Dictionary() {
    }
	     //sortera
	    public void sort(){

	     	Collections.sort(vect);

	     }

		public void insert(String s){


			for(int i = 0; i < vect.size(); i++)
			{
				String word = vect.get(i).getWord(); //tar positionen med get(i) och tar ordet som är där.
				
				//kollar om samma ord
				if(s.compareTo(word) == 0) //om det är samma ord så blir det = 0.
				{

						//count = vect.get(i).getNumber();
						//count++;
						//vect.get(i).setNumber(count);
						vect.get(i).increment();
						return;

				}
			}




			vect.add(new Entry(s, 1));



		}

		public void writeToFile(PrintWriter file)
		{
			for(int i = 0; i < vect.size(); i++)
			{	
				//tar varje ord och siffra från varje position i vektorn.
				String word = vect.get(i).getWord();
				int number = vect.get(i).getNumber();
				file.format("%-15s(%d)\r\n", word, number);
				//använder format för hur texten ska se ut. Kolla i boken vad skumma tecken betyder.

			}
		}


}