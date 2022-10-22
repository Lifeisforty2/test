
package application.controller;

import application.model.Mission;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * 
 * @author cameron perez yso443
 *
 */
public class MainController implements EventHandler<ActionEvent> {
	@FXML
	Label selectID;
	@FXML
	Label welcomeID;
	@FXML
	Label missionID;
	@FXML
	Label leftSC;
	@FXML
	Label rightSC;
	@FXML
	Label Apollo11ID;
	@FXML
	Label Apollo13ID;
	@FXML
	Label Apollo15ID;
	@FXML
	ImageView leftImageID;
	@FXML
	ImageView rightImageID;
	/**
	 * @param event
	 * handle opening screen actions
	 */
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
		// Button mission = (Button) event.getSource();
		
		// System.out.println("The event source id is: " + mission.getId());
		welcomeID.setText("Welcome!");
		selectID.setText("Select a Mission to view more information");
	}
	/**
	 * 
	 * @param event
	 * handle apollo 11
	 */
	public void handleApollo11(ActionEvent event) {
		welcomeID.setText("");
		selectID.setText("");
		
		Mission apollo11 = new Mission( "apollo11" );
		apollo11.loadMission( "data/Apollo11.csv" );
		// System.out.println( apollo11 );
		missionID.setText(apollo11.toString());
		leftSC.setText(apollo11.getSpace_Crafts().get(0).toString());
		rightSC.setText(apollo11.getSpace_Crafts().get(1).toString());
		
		Image image = new Image("file:images/Apollo11-CM.jpg");
		leftImageID.setImage(image);
		
		Image image1 = new Image("file:images/Apollo11-LM.jpg");
		rightImageID.setImage(image1);
		
	}
	/**
	 * 
	 * @param event
	 * handle apollo 13
	 */
	public void handleApollo13(ActionEvent event) {
		
		welcomeID.setText("");
		selectID.setText("");
		
		Mission apollo13 = new Mission("apollo13");
		apollo13.loadMission("data/Apollo13.csv");
		
		missionID.setText(apollo13.toString());
		leftSC.setText(apollo13.getSpace_Crafts().get(0).toString());
		rightSC.setText(apollo13.getSpace_Crafts().get(1).toString());
		
		Image image = new Image("file:images/Apollo13-CM.jpg");
		leftImageID.setImage(image);
		
		Image image1 = new Image("file:images/Apollo13-LM.jpg");
		rightImageID.setImage(image1);

	}
	/**
	 * 
	 * @param event
	 * handle mission apollo 15
	 */
	public void handleApollo15(ActionEvent event) {
		
		welcomeID.setText("");
		selectID.setText("");
		
		Mission apollo15 = new Mission("apollo15");
		apollo15.loadMission("data/Apollo15.csv");
		
		missionID.setText(apollo15.toString());
		leftSC.setText(apollo15.getSpace_Crafts().get(0).toString());
		rightSC.setText(apollo15.getSpace_Crafts().get(1).toString());
		
		Image img = new Image("file:images/Apollo15-CM.jpg");
		leftImageID.setImage(img);
		
		Image img1 = new Image("file:images/Apollo15-LM.jpg");
		rightImageID.setImage(img1);
		
	}
}
