/**
 * @(#)Entry.java
 *
 *
 * @author
 * @version 1.00 2013/2/6
 */

import java.io.*;
import java.util.*;

public class Entry implements Comparable<Entry>
{
	private String word;
	private int counter;


	public Entry(String theWord, int numbers)
	{
		word = theWord;
		counter = numbers;

	}

	public String getWord()
	{
		return word;
	}

	public void setNumber(int theCounter)
	{
		counter = theCounter;
	}

	public int getNumber()
	{
		return counter;
	}

	public void increment() {
		counter++;
	}

	public int compareTo(Entry e)
	{
		return word.compareTo(e.word);
	}






	/*public Entry(String theWords) {

		word = theWords;
    }*/

	//räknar hur ofta ett ord finns i texten
/*	public void compareTo(Vector<String> v){

			for (int i = 0; i < v.size(); i++)
			{
				counter = 1;

				for (int k = i + 1; k < v.size(); k++)
				{
					if (v.get(i).compareTo(v.get(k)) == 0){

						counter++;

					}

					else{
						break;
					}
					    count[i] = counter;


				}
			}

	}

	public void visa(){
			 for (int i = 0; i < count.length; i++)
        {

            System.out.println(count[i]);
        }
	}

*/

}