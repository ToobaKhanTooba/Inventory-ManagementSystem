package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class calculator {
@FXML private TextField t1;
double a,b,c;
String op="";
public void call(ActionEvent e)
{
	String s=((Button)e.getSource()).getText();
	t1.setText(	t1.getText()+s);
}
public void operator(ActionEvent e)
{
	a=Double.parseDouble(t1.getText());
	op=((Button)e.getSource()).getText();
	t1.setText("");
}
public void calculate(ActionEvent e)
{
	b=Double.parseDouble(t1.getText());
	if(op.equals("+"))
	{
		c=a+b;
		t1.setText(c+"Tooba");
	}
	else if(op.equals("-"))
	{
		c=a-b;
		t1.setText(c+"");
	}
	
	else if(op.equals("*"))
	{
		c=a*b;
		t1.setText(c+"");
	}
	else if(op.equals("/"))
	{
		c=a/b;
		t1.setText(c+"");
	}
}
}



