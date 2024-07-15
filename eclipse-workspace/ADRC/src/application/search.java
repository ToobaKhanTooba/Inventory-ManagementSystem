package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.ResultSet;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.*;

public class search {
@FXML private ObservableList<ObservableList> data;
@FXML private TableView tableview;
@FXML TextField t1;
@FXML public void initialize() {
print();
}
public void sea() {
	System.out.print("Hello");
	try{
    	Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/issue","root","root");  
      //SQL FOR SELECTING ALL OF CUSTOMER
      PreparedStatement stmt =con.prepareStatement("SELECT * from records where Enrollment_no =?");
      stmt.setString(1, t1.getText());
      ResultSet rs = stmt.executeQuery();
      while(rs.next()) {
    	  System.out.println(rs.getString(1));
              //Iterate Row
              /*ObservableList<String> row = FXCollections.observableArrayList();
              for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                  //Iterate Column
                  row.(rs.getString(i));
              }
              System.out.println("Row [1] added "+row );
              data.add(row);
*/
          }}
      
      
	catch(Exception e) {};
}
public void print()
{
	data = FXCollections.observableArrayList();
    try{
    	Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/issue","root","root");  
      //SQL FOR SELECTING ALL OF CUSTOMER
      String SQL = "SELECT * from records ";
      //ResultSet
      ResultSet rs = con.createStatement().executeQuery(SQL);

      /************
       * TABLE COLUMN ADDED DYNAMICALLY *
       ************/
      for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
          //We are using non property style for making dynamic table
          final int j = i;                
          TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
          col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
              public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                  return new SimpleStringProperty(param.getValue().get(j).toString());                        
              }                    
          });

          tableview.getColumns().addAll(col); 
          System.out.println("Column ["+i+"] ");
      }

      /************
       * Data added to ObservableList *
       ************/
      while(rs.next()){
          //Iterate Row
          ObservableList<String> row = FXCollections.observableArrayList();
          for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
              //Iterate Column
              row.add(rs.getString(i));
          }
          System.out.println("Row [1] added "+row );
          data.add(row);

      }

      //FINALLY ADDED TO TableView
      tableview.setItems(data);
    }catch(Exception e){
        e.printStackTrace();
        System.out.println("Error on Building Data");             
    }
    
}
}
