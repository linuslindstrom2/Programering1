package v4;

import javafx.application.Application;
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Flagga extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		
		// Circle
		Circle circle= new Circle();
		
		circle.setRadius(75);
		
		Group påse = new Group(circle);
		
		circle.setCenterX(200);
		circle.setCenterY(125);
		
		circle.setFill(Color.RED);
		
		Scene mainScene = new Scene(påse, 400, 250);
		
		window.setScene(mainScene);
		
		window.show();
		
	}
}

