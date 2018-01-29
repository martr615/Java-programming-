// ===================================================================
// fil:    ~\tnd002\java\le4upp\Uppgift0.java
// anm:    kodskelett för uppgift 1-4
// skapad: 2006-02-20 / janpe
// ändrad: 2012-02-17 / janpe
// ===================================================================

//importera allt det här
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Lab5 extends JFrame implements ActionListener //måste ha för att du ska kunna klicka på saker osv.
{
    // instansvariabler

    private JButton start;
    private JTextField guess, txtNoGuesses;
	private JPanel pnlText = new JPanel();
	private JPanel pnlEast = new JPanel();
	int r;
    int noguesses = 0;
    int number;
	JLabel txtGuess = new JLabel("Skriv gissning: ", JLabel.CENTER);


    // konstruktor

    public Lab5()
    {
       	start =  new JButton("Start");
       	start.addActionListener(this);

       	guess = new JTextField();
       	guess.addActionListener(this);
       	guess.setEditable(false);

       	txtNoGuesses = new JTextField();
       	txtNoGuesses.setEditable(false); //ändra i en textruta går ej


        pnlText.setLayout(new GridLayout(3,1)); //3 rader och en kolumn.
        pnlText.add(new JLabel("Klicka här för att starta", JLabel.CENTER));
        pnlText.add(txtGuess);
        pnlText.add(new JLabel("Antal gissningar", JLabel.CENTER));



        pnlEast.setLayout(new GridLayout(3, 1));  // default
        pnlEast.add(start);
        pnlEast.add(guess);
       	pnlEast.add(txtNoGuesses);

        Container c = getContentPane();

		//du placerar dina panels med hjälp av borderlayout.
        c.setLayout(new BorderLayout());     // default
        c.add(pnlText, BorderLayout.CENTER);
        c.add(pnlEast, BorderLayout.EAST);

		//bara standard skit
        setSize(300, 105);
        setTitle("Lab 5");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // händelsehanterare ...
    public void actionPerformed(ActionEvent e) //kallas när man trycker på tex start knappen.
    {
    	//två översta if och else if körs alltid!!!!!!!!!!!!

    	if(e.getSource() == start){ //om det är den som heter "start" så görs den
    	Random generator = new Random(); //random nr
    	r = generator.nextInt(100) + 1; // (random tal mellan)nextInt(n) menas 0 till n-1, 1-100 när man har +1
    	start.setEnabled(false); //starknappen inaktiveras
    	guess.setEditable(true);  //går att edita guess fältet
    	}
    	else if(e.getSource() == guess){ //om guess knappen är den aktiva
    	//tror parseInt gör om en string till int, men är inte säker på det.
    	number = Integer.parseInt(guess.getText()); //HÄMTAR alla gissningar (ger dig talet som står i guess fältet) och sätter som "number" så att nästa if-sats kan köras.
     	guess.setText(""); //reset efter varje försök
		noguesses++; //plussar guesses
		txtNoGuesses.setText(Integer.toString(noguesses)); //antal gissningar är i int, men vi vill ha den i string, därför "toString".
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

			switch(noguesses = (noguesses + 2) / 3 ) //noguesses är en int, så decimaltal avrundas till närmaste heltal. Om du gissar fel fler än 4ggr, så blir defaultsvar.
			{
				case 1:
				{
					utdata = "Välkommen till LiTH.";
					JOptionPane.showMessageDialog(null, utdata); //popup, utdata är texten.
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
    }

    }

    // startmetoden main

    public static void main(String[] args)
    {
        Lab5 frame = new Lab5();
    }
}
