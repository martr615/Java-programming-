// ===================================================================
// fil:    ~\tnd002\java\le4upp\Uppgift0.java
// anm:    kodskelett för uppgift 1-4
// skapad: 2006-02-20 / janpe
// ändrad: 2012-02-17 / janpe
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
       	soknummer =  new JButton("Sök Nummer");
//       	soknummer.addActionListener(this);
       	soknamn =  new JButton("Sök Namn");
  //      soknamn.addActionListener(this);
       	post =  new JButton("Sätt in post");
    //    post.addActionListener(this);
       	bortPost =  new JButton("Ta bort post");
      // 	bortPost.addActionListener(this);
       	om =  new JButton("Om programmet");
      // 	om.addActionListener(this);
       	rensa =  new JButton("Rensa fält");
     //   rensa.addActionListener(this);
        open =  new JButton("Öppna register");
    //   	open.addActionListener(this);
       	save =  new JButton("Spara register");
   //     save.addActionListener(this);

		//textfälten
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

    // händelsehanterare ...
    public void actionPerformed(ActionEvent e) //kallas när man trycker på tex start knappen.
    {

    	//det som skrivs in som namn ska skickas in till register
	    //och läggas dit



	    //söka namn om det är samma så tex returnera nr

	    //söka nr och om det är samma så returnera namn

	    //skriva in till en fil

	  	//öppna en fil











    	/*
    	//två översta if och else if körs alltid!!!!!!!!!!!!

    	if(e.getSource() == start){ //om det är den som heter "start" så görs den
    	Random generator = new Random(); //random nr
    	r = generator.nextInt(100) + 1; // (random tal mellan)nextInt(n) menas 0 till n-1, 1-100 när man har +1
    	start.setEnabled(false); //starknappen inaktiveras
    	guess.setEditable(true);  //går att edita guess fältet
    	}
    	else if(e.getSource() == guess){ //om guess knappen är den aktiva
    	number = Integer.parseInt(guess.getText()); //HÄMTAR alla gissningar (ger dig talet som står i guess fältet) och sätter som "number" så att nästa if-sats kan köras.
     	guess.setText(""); //reset efter varje försök
		noguesses++; //plussar guesses
		txtNoGuesses.setText(Integer.toString(noguesses));
		if(number > r)
		{
			txtGuess.setText("För högt");
		}
		else if(number < r)
		{
			txtGuess.setText("För lågt");
		}
		else{ //switchen ligger i else för att det händer bara om rätt svar fås.
		String utdata;
		switch(noguesses = (noguesses + 2) / 3 )
		{
		case 1:
		{
			utdata = "Välkommen till LiTH.";
			JOptionPane.showMessageDialog(null, utdata);
			break;
		}

		case 2:
		{
			utdata = "Välkommen till Chalmers.";
			JOptionPane.showMessageDialog(null, utdata);
			break;
		}

		case 3:
		{
			utdata = "Välkommen till KTH.";
			JOptionPane.showMessageDialog(null, utdata);
			break;
		}

		default:
		{
			utdata = "Välkommen åter nästa år.";
			JOptionPane.showMessageDialog(null, utdata);
			break;
		}
		}
		//reset allting så att du kan köra allt igen.
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
