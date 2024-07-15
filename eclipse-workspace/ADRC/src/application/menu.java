package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class menu {
@FXML private BorderPane bp;
@FXML public void initialize() {
	count();
}
@FXML private Button B1,B2;
private Stage stage;
private Scene scene;
@FXML	private StackPane sp;
@FXML protected Label l1;
public void print(ActionEvent event)throws IOException
{
	 Parent root = FXMLLoader.load(getClass().getResource("add.fxml"));

}
public void count() {
	int a=0;
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/issue","root","root");  
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select count(*) from records");  
	while(rs.next())  
	a=rs.getInt(1);
	con.close();
	}
	catch(Exception ee)
	{
		System.out.println(ee);
	}			
	l1.setText(a+"");
}
public void logg(ActionEvent e)throws IOException
{
	 Parent root = FXMLLoader.load(getClass().getResource("/login.fxml"));
	   bp.setCenter(root);
	   
}
public void check(ActionEvent e)throws IOException
{
	 Parent root = FXMLLoader.load(getClass().getResource("/even_odd.fxml"));
	   bp.setCenter(root);
	   
}
public void radio(ActionEvent e)throws IOException
{
	 Parent root = FXMLLoader.load(getClass().getResource("/radio.fxml"));
	   bp.setCenter(root);
	
}
public void radio_select(ActionEvent e)throws IOException
{
	 Parent root = FXMLLoader.load(getClass().getResource("/radio_select.fxml"));
	   bp.setCenter(root);
	
}
public void Check(ActionEvent e)throws IOException
{
	 Parent root = FXMLLoader.load(getClass().getResource("/check.fxml"));
	   bp.setCenter(root);
	
}
}