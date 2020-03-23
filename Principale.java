
package mowCloneProject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Principale extends JPanel {
    private JTextArea jcomp1;
    private JMenuBar Fichier;
    private JScrollPane scrollPane;

    public Principale() {


    	
    	JMenu fileMenu = new JMenu ("Fichier");
        JMenuItem enregistrerItem = new JMenuItem ("Enregistrer");
        fileMenu.add (enregistrerItem);
        JMenuItem modifierItem = new JMenuItem ("Modifier");
        fileMenu.add (modifierItem);
        JMenu policeMenu = new JMenu ("Police");
        JMenuItem agency_fbItem = new JMenuItem ("Agency FB");
        policeMenu.add (agency_fbItem);
        JMenuItem arialItem = new JMenuItem ("Arial");
        policeMenu.add (arialItem);
        JMenuItem franklin_gothic_mediumItem = new JMenuItem ("Franklin Gothic Medium");
        policeMenu.add (franklin_gothic_mediumItem);
        JMenuItem times_new_romanItem = new JMenuItem ("Times New Roman");
        policeMenu.add (times_new_romanItem);
        JMenuItem algerianItem = new JMenuItem ("Algerian");
        policeMenu.add (algerianItem);
        JMenu couleurMenu = new JMenu ("Couleur");
        JMenuItem rougeItem = new JMenuItem ("Rouge");
        couleurMenu.add (rougeItem);
        JMenuItem jauneItem = new JMenuItem ("Jaune");
        couleurMenu.add (jauneItem);
        JMenuItem vertItem = new JMenuItem ("Vert");
        couleurMenu.add (vertItem);
        JMenuItem bleuItem = new JMenuItem ("Bleu");
        couleurMenu.add (bleuItem);
        JMenuItem orangeItem = new JMenuItem ("Orange");
        couleurMenu.add (orangeItem);
        JMenuItem jauneItem1 = new JMenuItem ("Jaune");
        couleurMenu.add (jauneItem1);
        JMenuItem rougeItem2 = new JMenuItem ("Rouge");
        couleurMenu.add (rougeItem2);
        JMenu helpMenu = new JMenu ("Help");
        JMenuItem aboutItem = new JMenuItem ("About");
        helpMenu.add (aboutItem);

      
        jcomp1 = new JTextArea (5, 5);

        Fichier = new JMenuBar();
        Fichier.add (fileMenu);
        Fichier.add (policeMenu);
        Fichier.add (couleurMenu);
        Fichier.add (helpMenu);

        setPreferredSize (new Dimension (1990, 800));
        setLayout (null);

        add (jcomp1);
        add (Fichier);

        jcomp1.setBounds (125, 90, 1100, 4000);
        Fichier.setBounds (0, 0, 2000, 30);
        
        
  
      
        
        
        
    
     
        	  
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("Main");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Principale());
        frame.pack();
        frame.setVisible (true);
        
        
    }
}