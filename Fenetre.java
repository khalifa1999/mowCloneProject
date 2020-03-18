package mowClone;
import java.awt.*;
import java.sql.*;

import javax.swing.*;

public class Fenetre extends JFrame{
	private JPanel p_nord,p_centre, p_sud; 
	private JTextArea tA;
	private JMenuBar jmb;
	private JLabel l_Titre;
	public Fenetre() {
		this.setTitle("CI/UGB"); 
		this.setLayout(new BorderLayout());
		p_nord = new JPanel();
		l_Titre = new JLabel("Formulaire d'authentification"); 
		l_Titre.setFont(new Font(null, Font.BOLD, 15)); 
		l_Titre.setForeground(Color.WHITE); 
		p_nord.setBackground(Color.darkGray); 
		p_nord.add(l_Titre); 
		this.add(p_nord, BorderLayout.NORTH);
		//p_nord.add(tA);
		jmb = new JMenuBar();
		jmb.setBackground(Color.GRAY);
		//jmb.setSize(5,100);
		JMenu fichier = new JMenu("Fichier");
		JMenu edit = new JMenu("Edit");
		JMenuItem nouveau = new JMenuItem("New");
		JMenuItem enregistrer = new JMenuItem("Save");
		JMenuItem copier = new JMenuItem("Copy");
		JMenuItem coller = new JMenuItem("Pate");
		fichier.add(nouveau);fichier.add(enregistrer);
		edit.add(copier);edit.add(coller);
		jmb.add(edit);
		jmb.add(fichier);
		this.setJMenuBar(jmb);
		
		p_centre=new JPanel(new GridLayout(1,1)); 
		tA = new JTextArea(30,30);
		//p_sud= new JPanel(); 
		//this.add(p_nord, BorderLayout.NORTH);
		p_centre.add(tA);
		this.add(p_centre,BorderLayout.CENTER);
		//this.add(p_sud,BorderLayout.SOUTH);

	}
	
}

