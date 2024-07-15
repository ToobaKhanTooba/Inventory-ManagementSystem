package mod4;

import java.awt.*;
import java.awt.event.*;
class tooba implements ActionListener
{
    Label l1,l2;TextField t1,t2; Button b1;
    Frame f;
    public tooba()
    {
        f=new Frame("even odd");
        f.setSize(500,500);
        f.setLayout(null);
    
        l1= new Label("enter num");
        l1.setBounds(100,100,100,50);
        l2= new Label("result");
        l2.setBounds(100,200,100,50);
        t1=new TextField(8);
        t1.setBounds(300,100,100,50);;
        t2=new TextField(8);
        t2.setBounds(300,200,100,50);
        b1= new Button("check");
        b1.addActionListener(this);
        b1.setBounds(100,400,100,50);

        f.add(l1);
        f.add(l2);f.add(t1);f.add(t2);
        f.add(b1);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        int a=Integer.parseInt(t1.getText());
        if(a%2==0)
        t2.setText("even");
        else
        t2.setText("odd");
    }
    public static void main(String args[])
    {
        new tooba();
    }

}