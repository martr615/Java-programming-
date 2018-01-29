/**
 * @(#)jjjjjjj.java
 *
 *
 * @author
 * @version 1.00 2013/3/1
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


public class Headprogram extends JFrame implements ActionListener
{
    // instansvariabler

    private JButton soknummer, soknamn, post, bortPost, om, rensa, oppna, spara;
    private JTextField surname, firstname, msg, number;
	private JPanel pnlText = new JPanel();
	private JPanel pnlEast = new JPanel();


	//skapa ett Register objekt
	Register r1 = new Register();





    // konstruktor

    public Headprogram()
    {

       	//ny kod
       	//Knapparna
       	soknummer =  new JButton("Sök Nummer");
       	soknummer.addActionListener(this);
       	soknamn =  new JButton("Sök Namn");
       	soknamn.addActionListener(this);
       	post =  new JButton("Sätt in post");
       	post.addActionListener(this);
       	bortPost =  new JButton("Ta bort post");
       	bortPost.addActionListener(this);
       	om =  new JButton("Om programmet");
       	om.addActionListener(this);
       	rensa =  new JButton("Rensa fält");
       	rensa.addActionListener(this);
       	oppna =  new JButton("Öppna register");
       	oppna.addActionListener(this);
       	spara =  new JButton("Spara register");
       	spara.addActionListener(this);

       	/*guess = new JTextField();
       	guess.addActionListener(this);
       	guess.setEditable(false);
       	txtNoGuesses = new JTextField();
       	txtNoGuesses.setEditable(false); //ändra i en textruta går ej*/

		//textfälten
		firstname = new JTextField();
       	firstname.addActionListener(this);
       	surname = new JTextField();
       	surname.addActionListener(this);
       	number = new JTextField();
       	number.addActionListener(this);
       	msg = new JTextField();
       	msg.addActionListener(this);
       	msg.setEditable(false); //meddelande txtrutan kan ej editas

        //textsidan
        pnlText.setLayout(new GridLayout(4,1));
        pnlText.add(new JLabel("Förnamn:", JLabel.CENTER));
        pnlText.add(firstname);
        pnlText.add(new JLabel("Efternamn:", JLabel.CENTER));
        pnlText.add(surname);
        pnlText.add(new JLabel("Telefonnr:", JLabel.CENTER));
        pnlText.add(number);
        pnlText.add(new JLabel("Meddelande:", JLabel.CENTER));
        pnlText.add(msg);


      	//knappsidan
        pnlEast.setLayout(new GridLayout(4, 2));  // default
        pnlEast.add(soknummer);
        pnlEast.add(soknamn);
       	pnlEast.add(post);
       	pnlEast.add(bortPost);
        pnlEast.add(om);
       	pnlEast.add(rensa);
       	pnlEast.add(oppna);
       	pnlEast.add(spara);

        Container c = getContentPane();

        c.setLayout(new BorderLayout());     // default
        c.add(pnlText, BorderLayout.CENTER);
        c.add(pnlEast, BorderLayout.EAST);

        setSize(500, 135);
        setTitle("Awesome shit");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
    	//About us knappen
    	if(e.getSource() == om){ // om man trycker på knappen om programmet så visas en dialog ruta med
    		r1.about();
    	}
    	//Öppna fil knappen
    	else if (e.getSource() == oppna)
		{
			//ursprungliga koden
	       	/*start =  new JButton("Start");
	       	start.addActionListener(this);*/

			try{
	    		//All your IO Operations
	    		r1.openRegister(msg);
			}catch(IOException ioe){
	 		   //Handle exception here, most of the time you will just log it.
			}

	    }
	    else if (e.getSource() == soknummer)
	    {
			r1.sokNummer(firstname, surname, number, msg);
	    }
	    else if (e.getSource()== soknamn)
	    {
	    	r1.sokNamn(firstname, surname, number, msg);
	    }
	    else if (e.getSource() == rensa)
	    {
	    	r1.rensa(firstname, surname, number, msg);
	    }
	    else if (e.getSource() == spara ) //måste testa
	    {
			try{
	    		//All your IO Operations
	    		r1.saveToFile(msg);
			}catch(IOException ioe){
	 		   //Handle exception here, most of the time you will just log it.
			}
	    }
	    else if (e.getSource() == bortPost)
	    {
	    	r1.erasePost(firstname, surname, number, msg);
	    }
	    else if (e.getSource() == post)
	    {
	    	r1.setPost(firstname, surname, number, msg);
	    }







    }


    public static void main(String[] args)
    {
    	Headprogram frame = new Headprogram();
    }
}