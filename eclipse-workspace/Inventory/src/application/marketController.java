package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class marketController implements Initializable {
	@FXML
    private TextField searchbox;

    @FXML
    private VBox chosentoolcard;

    @FXML
    private Label toolnamelabel;

    @FXML
    private Label toolpricelabel;

    @FXML
    private ImageView toolimg;

    @FXML
    private ScrollPane scroll;

    @FXML
    private GridPane grid;
    private Image image;
    private MyListener mylistener;

    private List<Tool>tools=new ArrayList<>();
	private List<Tool> getData(){
		List<Tool>tools=new ArrayList<>();
		Tool tool;
		
			tool=new Tool();
			tool.setName("Motor");
			tool.setImgsrc("/Images/High-power-drone-motors.jpeg");
			tool.setColor("6A7324");
			tools.add(tool);
			
			tool=new Tool();
			tool.setName("Battery");
			tool.setImgsrc("/Images/battery_drone.jpg");
			tool.setColor("F16C31");
			tools.add(tool);
			
			tool=new Tool();
			tool.setName("Frame");
			tool.setImgsrc("/Images/drone_frame_kit.jpg");
			tool.setColor("A7745B");
			tools.add(tool);
			
			tool=new Tool();
			tool.setName("Raspberry-pi");
			tool.setImgsrc("/Images/IMG_0133-scaled.jpeg");
			tool.setColor("22371D");
			tools.add(tool);
		
		return tools;
}
	@Override
	public void initialize(URL Location,ResourceBundle resources) {
		tools.addAll(getData());
		if(tools.size()>0)
		{setChosenTool(tools.get(0));}
		mylistener=new MyListener() {
		@Override
		public void OnClickListener(Tool tool) {
			setChosenTool(tool);
		}
		};
		
		int column=0,row=1;
		try {
		for(int i=0;i<tools.size();i++) {
			FXMLLoader fxmlLoader=new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource("/Forms/item.fxml"));
			AnchorPane anchorpane=fxmlLoader.load();
			itemcontroller itm=fxmlLoader.getController();
			itm.setData(tools.get(i),mylistener);
			if(column==3) {
				column=0;
			row++;}
			grid.add(anchorpane,column++,row);
			//set grid width
			grid.setMinWidth(Region.USE_COMPUTED_SIZE);
			grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
			grid.setMaxWidth(Region.USE_PREF_SIZE);
			//set grid height
			grid.setMinHeight(Region.USE_COMPUTED_SIZE);
			grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
			grid.setMaxHeight(Region.USE_PREF_SIZE);
			GridPane.setMargin(anchorpane, new Insets(10));
		}
		}catch(IOException e) {
			e.printStackTrace();
		}}
	
	private void setChosenTool(Tool tool) {
		toolnamelabel.setText(tool.getName());
		toolpricelabel.setText(Main.CURRENCY+tool.getPrice());
		image=new Image(getClass().getResourceAsStream(tool.getImgsrc()));
		toolimg.setImage(image);
		chosentoolcard.setStyle("-fx-background-color: #"+tool.getColor()+"\n"
				+ "	-fx-background-radius:30;");
	}
	}
