package guirifat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;


public class GuiRifat {
    public static void GuiRifat() {
        JFrame frame = new JFrame("Md Robayet Ahasan  011201433");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(null);
        
        JPanel panelTop = new JPanel();
        panelTop.setBorder(new TitledBorder("Name"));
        panelTop.setBounds(10, 10, 670, 270);
        panelTop.setLayout(null);
        
         JPanel panelBottom = new JPanel();
        panelBottom.setBorder(new TitledBorder("Email: "));
        panelBottom.setBounds(10, 300, 670, 250);
        panelBottom.setLayout(null);
        
        JLabel nm1 = new JLabel("First Name: ");
        JLabel nm2 = new JLabel("Last Name: ");
        JLabel nm3 = new JLabel("Title: ");
        JLabel nm4 = new JLabel("NIckname: ");
        JLabel nm5 = new JLabel("Format: ");
        
        JTextField tf1 = new JTextField(20);
        JTextField tf2 = new JTextField(20);
        JTextField tf3 = new JTextField(20);
        JTextField tf4 = new JTextField(20);
        
        JComboBox jb = new JComboBox();
        String item[] = {"Item1","Item2","Item3","Item4","Item5","Item6","Item7","Item8"};
        jb = new JComboBox(item);
        //PanelBottom
        
        JLabel nm6 = new JLabel("Email Address");
        JLabel nm7 = new JLabel("Mail Format");
        
        JTextField tf5 = new JTextField(50);
        JTextArea ta1  = new JTextArea(10,20);
        JScrollPane jsp = new JScrollPane(ta1, 
        ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        JButton add = new JButton("Add");
        JButton e = new JButton("Edit");
        JButton r = new JButton("Remove");
        JButton ad = new JButton("As Default");
        JButton ok = new JButton("Ok");
        JButton cl = new JButton("Cancel");
        
        JRadioButton html = new JRadioButton("HTML");
        JRadioButton pt = new JRadioButton("Plain Text");
        JRadioButton cm = new JRadioButton("Custom");
        
        
        //Setbound
        
        nm1.setBounds(10, 20, 100, 20);
        nm2.setBounds(300, 20, 100, 20);
        nm3.setBounds(45, 50, 100, 20);
        nm4.setBounds(300, 50, 100, 20);
        nm5.setBounds(20, 80, 100, 20);
        nm6.setBounds(10, 20, 100, 20);
        nm7.setBounds(10, 185, 100, 20);
        
        jb.setBounds(120,80,400,20);
        
        tf1.setBounds(120, 20, 150, 20);
        tf2.setBounds(370, 20, 150, 20);
        tf3.setBounds(120, 50, 150, 20);
        tf4.setBounds(370, 50, 150, 20);
        tf5.setBounds(120, 20, 400, 20);
        
       // ta1.setBounds(20, 50, 500, 130);
        jsp.setBounds(20, 50, 500, 100);
        //Button set Bound
        
        add.setBounds(530, 20, 100, 20);
        e.setBounds(530, 50, 100, 20);
        r.setBounds(530, 80, 100, 20);
        ad.setBounds(530, 110, 100, 20);
        ok.setBounds(450, 550, 100, 20);
        cl.setBounds(560, 550, 100, 20);
        
        html.setBounds(20, 210, 100, 20);
        pt.setBounds(100, 210, 100, 20);
        cm.setBounds(180, 210, 100, 20);
        
        
        
        
        //panel add
        
        panelTop.add(nm1);
        panelTop.add(nm2);
        panelTop.add(nm3);
        panelTop.add(nm4);
        panelTop.add(nm5);
        
        panelTop.add(tf1);
        panelTop.add(tf2);
        panelTop.add(tf3);
        panelTop.add(tf4);
        
        panelTop.add(jb);
        
        panelBottom.add(nm6);
        panelBottom.add(nm7);
        panelBottom.add(tf5);
        //panelBottom.add(ta1);
        
        panelBottom.add(jsp);
        
        panelBottom.add(add);
        panelBottom.add(e);
        panelBottom.add(r);
        panelBottom.add(ad);
        
        panelBottom.add(html);
        panelBottom.add(pt);
        panelBottom.add(cm);
       

        
        frame.add(ok);
        frame.add(cl);
        frame.add(panelTop);
        frame.add(panelBottom);
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        GuiRifat();
    }
}
