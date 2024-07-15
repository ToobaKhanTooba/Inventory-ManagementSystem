package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class insert implements Initializable{
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
    private TextField type;
    
    public void submit() {
    	String st = mysqlconnect.add(Integer.parseInt(sno.getText()),name.getText(),type.getText(),Integer.parseInt(quantity.getText()), Integer.parseInt(price.getText()));
    	message.setText(st);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		exit.setOnMouseClicked(event ->{
			Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
		});
		
	}
}
