// ===================================================================
// fil:    ~\tnd002\java\le4upp\Uppgift0.java
// anm:    kodskelett f�r uppgift 1-4
// skapad: 2006-02-20 / janpe
// �ndrad: 2012-02-17 / janpe
// ===================================================================

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Lab5 extends JFrame implements ActionListener
{
    // instansvariabler

    private JButton soknummer, soknamn, post, bortPost, om, rensa, open, save;
    private JTextField firstname, surname, number, msg ;
	private JPanel pnlText = new JPanel();
	private JPanel pnlEast = new JPanel();



    // konstruktor

    public Lab5()
    {	//ursprungliga koden
       	/*start =  new JButton("Start");
       	start.addActionListener(this);*/

       	//ny kod
       	//Knapparna
       	soknummer =  new JButton("S�k Nummer");
//       	soknummer.addActionListener(this);
       	soknamn =  new JButton("S�k Namn");
  //      soknamn.addActionListener(this);
       	post =  new JButton("S�tt in post");
    //    post.addActionListener(this);
       	bortPost =  new JButton("Ta bort post");
      // 	bortPost.addActionListener(this);
       	om =  new JButton("Om programmet");
      // 	om.addActionListener(this);
       	rensa =  new JButton("Rensa f�lt");
     //   rensa.addActionListener(this);
        open =  new JButton("�ppna register");
    //   	open.addActionListener(this);
       	save =  new JButton("Spara register");
   //     save.addActionListener(this);

		//textf�lten
		firstname = new JTextField();
     //  	firstname.addActionListener(this);
       	surname = new JTextField();
      // 	surname.addActionListener(this);
       	number = new JTextField();
    //   	number.addActionListener(this);
       	msg = new JTextField();
    //   	msg.addActionListener(this);
       	msg.setEditable(false); //meddelande txtrutan kan ej editas

        //textsidan
        pnlText.setLayout(new GridLayout(4,1));
        pnlText.add(new JLabel("F�rnamn:", JLabel.CENTER));
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
       	pnlEast.add(open);
       	pnlEast.add(save);

        Container c = getContentPane();

        c.setLayout(new BorderLayout());     // default
        c.add(pnlText, BorderLayout.CENTER);
        c.add(pnlEast, BorderLayout.EAST);

        setSize(480, 135);
        setTitle("Register Pro 1.0");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // h�ndelsehanterare ...
    public void actionPerformed(ActionEvent e) //kallas n�r man trycker p� tex start knappen.
    {

    	//det som skrivs in som namn ska skickas in till register
	    //och l�ggas dit



	    //s�ka namn om det �r samma s� tex returnera nr

	    //s�ka nr och om det �r samma s� returnera namn

	    //skriva in till en fil

	  	//�ppna en fil











    	/*
    	//tv� �versta if och else if k�rs alltid!!!!!!!!!!!!

    	if(e.getSource() == start){ //om det �r den som heter "start" s� g�rs den
    	Random generator = new Random(); //random nr
    	r = generator.nextInt(100) + 1; // (random tal mellan)nextInt(n) menas 0 till n-1, 1-100 n�r man har +1
    	start.setEnabled(false); //starknappen inaktiveras
    	guess.setEditable(true);  //g�r att edita guess f�ltet
    	}
    	else if(e.getSource() == guess){ //om guess knappen �r den aktiva
    	number = Integer.parseInt(guess.getText()); //H�MTAR alla gissningar (ger dig talet som st�r i guess f�ltet) och s�tter som "number" s� att n�sta if-sats kan k�ras.
     	guess.setText(""); //reset efter varje f�rs�k
		noguesses++; //plussar guesses
		txtNoGuesses.setText(Integer.toString(noguesses));
		if(number > r)
		{
			txtGuess.setText("F�r h�gt");
		}
		else if(number < r)
		{
			txtGuess.setText("F�r l�gt");
		}
		else{ //switchen ligger i else f�r att det h�nder bara om r�tt svar f�s.
		String utdata;
		switch(noguesses = (noguesses + 2) / 3 )
		{
		case 1:
		{
			utdata = "V�lkommen till LiTH.";
			JOptionPane.showMessageDialog(null, utdata);
			break;
		}

		case 2:
		{
			utdata = "V�lkommen till Chalmers.";
			JOptionPane.showMessageDialog(null, utdata);
			break;
		}

		case 3:
		{
			utdata = "V�lkommen till KTH.";
			JOptionPane.showMessageDialog(null, utdata);
			break;
		}

		default:
		{
			utdata = "V�lkommen �ter n�sta �r.";
			JOptionPane.showMessageDialog(null, utdata);
			break;
		}
		}
		//reset allting s� att du kan k�ra allt igen.
		start.setEnabled(true);
		guess.setText("");
		noguesses = 0;
		txtNoGuesses.setText("");
		guess.setEditable(false);
    	}
    	}*/

    }

    // startmetoden main

    public static void main(String[] args)
    {
        Lab5 frame = new Lab5();
    }
}
