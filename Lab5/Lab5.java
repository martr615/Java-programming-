// ===================================================================
// fil:    ~\tnd002\java\le4upp\Uppgift0.java
// anm:    kodskelett f�r uppgift 1-4
// skapad: 2006-02-20 / janpe
// �ndrad: 2012-02-17 / janpe
// ===================================================================

//importera allt det h�r
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Lab5 extends JFrame implements ActionListener //m�ste ha f�r att du ska kunna klicka p� saker osv.
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
       	txtNoGuesses.setEditable(false); //�ndra i en textruta g�r ej


        pnlText.setLayout(new GridLayout(3,1)); //3 rader och en kolumn.
        pnlText.add(new JLabel("Klicka h�r f�r att starta", JLabel.CENTER));
        pnlText.add(txtGuess);
        pnlText.add(new JLabel("Antal gissningar", JLabel.CENTER));



        pnlEast.setLayout(new GridLayout(3, 1));  // default
        pnlEast.add(start);
        pnlEast.add(guess);
       	pnlEast.add(txtNoGuesses);

        Container c = getContentPane();

		//du placerar dina panels med hj�lp av borderlayout.
        c.setLayout(new BorderLayout());     // default
        c.add(pnlText, BorderLayout.CENTER);
        c.add(pnlEast, BorderLayout.EAST);

		//bara standard skit
        setSize(300, 105);
        setTitle("Lab 5");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // h�ndelsehanterare ...
    public void actionPerformed(ActionEvent e) //kallas n�r man trycker p� tex start knappen.
    {
    	//tv� �versta if och else if k�rs alltid!!!!!!!!!!!!

    	if(e.getSource() == start){ //om det �r den som heter "start" s� g�rs den
    	Random generator = new Random(); //random nr
    	r = generator.nextInt(100) + 1; // (random tal mellan)nextInt(n) menas 0 till n-1, 1-100 n�r man har +1
    	start.setEnabled(false); //starknappen inaktiveras
    	guess.setEditable(true);  //g�r att edita guess f�ltet
    	}
    	else if(e.getSource() == guess){ //om guess knappen �r den aktiva
    	//tror parseInt g�r om en string till int, men �r inte s�ker p� det.
    	number = Integer.parseInt(guess.getText()); //H�MTAR alla gissningar (ger dig talet som st�r i guess f�ltet) och s�tter som "number" s� att n�sta if-sats kan k�ras.
     	guess.setText(""); //reset efter varje f�rs�k
		noguesses++; //plussar guesses
		txtNoGuesses.setText(Integer.toString(noguesses)); //antal gissningar �r i int, men vi vill ha den i string, d�rf�r "toString".
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

			switch(noguesses = (noguesses + 2) / 3 ) //noguesses �r en int, s� decimaltal avrundas till n�rmaste heltal. Om du gissar fel fler �n 4ggr, s� blir defaultsvar.
			{
				case 1:
				{
					utdata = "V�lkommen till LiTH.";
					JOptionPane.showMessageDialog(null, utdata); //popup, utdata �r texten.
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
    }

    }

    // startmetoden main

    public static void main(String[] args)
    {
        Lab5 frame = new Lab5();
    }
}
