package mod4;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Uppertolower implements ActionListener,ItemListener {
  Checkbox c1,c2;
	Label l1,l2;
	TextField t1,t2;
	Button b1;
    Frame f;
   Uppertolower(){
  f=new Frame("Upper case to lower Case");
  f.setSize(500,500);
  f.setLayout(null);
  l1=new Label("Enter first string");
  l1.setBounds(100,100,100,100);
l2=new Label("Converted String is:");
l2.setBounds(100,200,100,100);
t1=new TextField(15);

t1.setBounds(300,100,100,50);
t2=new TextField(15);
t2.setBounds(300,200,100,50);
b1= new Button("convert");
b1.addActionListener(this);
b1.setBounds(100,300,100,50);
c1=new Checkbox("Male");
c2=new Checkbox("Female");

c1.addItemListener(this);
c2.addItemListener(this);
f.add(l1);
f.add(l2);f.add(t1);f.add(t2);
f.add(b1);
f.add(c1);
f.add(c2);
f.setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
       String a=t1.getText();
      t2.setText(a.toUpperCase());
   }
   public void itemStateChanged(ItemEvent e) {
	   if(c1.getState()==true)
		   System.out.println("Male");
	   else
		   System.out.println("Female");
	   
   }
   
   public static void main(String args[])
   {
       new Uppertolower();
   }




   
    	
}

