package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class calculator{
	@FXML private Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17;
	@FXML private TextField t1,t2;
	char op='\0';
	Double a,b,c;
	public void calculate(ActionEvent ee) {
		
		String st=((Button)ee.getSource()).getText();
		if(st.length()==1 && Character.isDigit(st.charAt(0)))
				{
			t1.setText(t1.getText()+st.charAt(0));
				}
		else if(st.length()==1) {
if( st.charAt(0)=='+' || st.charAt(0)=='-' || st.charAt(0)=='*' || st.charAt(0)=='/')
			{a=Double.parseDouble(t1.getText());
			t1.setText("");
			op=st.charAt(0);
			}
else if(st.charAt(0)=='=')
{
	b=Double.parseDouble(t1.getText());
	if(op=='+') {c=a+b;t2.setText(c+"");}
	if(op=='-') {c=a-b;t2.setText(c+"");}
	if(op=='*') {c=a*b;t2.setText(c+"");}
	if(op=='/') {c=a/b;t2.setText(c+"");}
	}
if(st.charAt(0)=='.')
{if(t1.getText().indexOf('.')==-1)
{
	if(t1.getText()=="")
		t1.setText("0.");
		else
			t1.setText(t1.getText()+st.charAt(0));
			
}
}
else if(st.charAt(0)=='c')
{
	t1.setText("");
	t2.setText("");
}
	
	}
		else if(t1.getText().equals("00"))
			{
		if(t1.getText()=="")
			t1.setText("00");
		else
			t1.setText(t1.getText()+st);
			}
	

	}
	
}
