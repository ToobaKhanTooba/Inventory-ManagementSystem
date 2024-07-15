package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class update implements Initializable{
	 	@FXML
	    private ImageView exit;

	    @FXML
	    private Label message;

	    @FXML
	    private TextField name;

	    @FXML
	    private TextField price;

	    @FXML
	    private TextField quantity;

	    @FXML
	    private TextField sno;

	    @FXML
	    private TextField text1;

	    @FXML
	    private TextField type;
	    
	    @FXML
	    private Button update;
	    
	    ObservableList<user> listM;
	    int n;
	    int index = -1;
	    
	    public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			exit.setOnMouseClicked(event ->{
				Node node = (Node) event.getSource();
	            Stage stage = (Stage) node.getScene().getWindow();
	            stage.close();
	            System.out.print("Bye");
			});
	    }
	    
	    public void search() {
	    	n = Integer.parseInt(text1.getText());
			listM = mysqlconnect.search_data(n);
			name.setText(listM.get(0).getItem());
			sno.setText(listM.get(0).getSno()+"");
			price.setText(listM.get(0).getPrice()+"");
			quantity.setText(listM.get(0).getQty()+"");
			type.setText(listM.get(0).getItemtype());
			update.setDisable(false);
	    }
	    public void submit() {
	    	mysqlconnect.modify(Integer.parseInt(sno.getText()),name.getText(),type.getText(),Integer.parseInt(quantity.getText()),Double.parseDouble(price.getText()));
	    }
}
