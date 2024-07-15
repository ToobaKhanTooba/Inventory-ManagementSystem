package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class create {
@FXML TextField t1,t2,t3;
public void insert(ActionEvent event) throws IOException
{System.out.println("Hello");
try
{
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/school","root","root");  
PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?)");
int Rollno=Integer.parseInt(t1.getText());
int number=Integer.parseInt(t3.getText());
stmt.setInt(1,Rollno);  String name=t2.getText(); 
stmt.setString(2,name);
stmt.setInt(3,number);
int i=stmt.executeUpdate();
System.out.println(i+"recordsinserted");
con.close();
}
catch(Exception e)
{
	System.out.println(e);
}
}
	
}

