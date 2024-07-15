package fxml_files;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class login {
	@FXML private TextField sname;
	@FXML private TextField Rno;
	private Stage stage;
	private Scene scene;
public void check(ActionEvent event)
{try {
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/school","root","root");  
	//here sonoo is database name, root is username and password  
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from student"); 
	int f=0;
	while(rs.next())  
	{//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	
	String s2;
	int s1=Integer.parseInt(Rno.getText());
	s2=sname.getText();
	if(s1==rs.getInt(1) && s2.equals(rs.getString(2)) )
	{
		f=1;
		 Parent root = FXMLLoader.load(getClass().getResource("/login.fxml"));
			stage= (Stage)((Node)event.getSource()).getScene().getWindow();
			scene= new Scene(root);
			stage.setScene(scene);
			stage.show();
	}
	
	}
	if(f==0)
		System.out.println("Invalid name and rollno");
	con.close();
}catch(Exception ee) {
	System.out.print(ee);
}

}
}