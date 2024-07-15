package fxml_files;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class multiple {
	
	@FXML TextField t1,t2,t3;
	public void insert(ActionEvent event)throws IOException {
	try {	
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/school","root","root");  
		PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?)");
		int Rollno=Integer.parseInt(t2.getText());
		String sname=t1.getText();
		int age=Integer.parseInt(t3.getText());
		stmt.setInt(1,Rollno); 
		stmt.setString(2,sname);
		stmt.setInt(3,age); 
		int i=stmt.executeUpdate();
		System.out.println(i+"recordsinserted");
		con.close();
	}
	catch(Exception ee) {
		System.out.print(ee);
	}
	
	}
public void delete(ActionEvent event)
{try {
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/school","root","root");  
	PreparedStatement stmt=con.prepareStatement("delete from student where rno= ?");
	int Rollno=Integer.parseInt(t2.getText());
	stmt.setInt(1,Rollno); 
	int i=stmt.executeUpdate();
	System.out.println(i+"records delete");
con.close();
}
catch(Exception ee) {
	System.out.print(ee);
}

}
	
}