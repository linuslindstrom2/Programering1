package v4;

import javafx.application.Application;
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

	public class SweFlagga extends Application{

		public static void main(String[] args) {
			launch(args);
		}

		@Override
		public void start(Stage window) throws Exception {
			
			
			Rectangle rectback= new Rectangle();
			
			rectback.setWidth(800);
			rectback.setHeight(500);
			
			rectback.setFill(Color.BLUE);
			
			
			Rectangle rect= new Rectangle();
			
			rect.setWidth(800);
			rect.setHeight(130);
			
			rect.setX(0);
			rect.setY(180);

			rect.setFill(Color.YELLOW);

			
			Rectangle rect2= new Rectangle();
			
			rect2.setWidth(130);
			rect2.setHeight(800);
			
			rect2.setX(250);
			rect2.setY(0);
			
			rect2.setFill(Color.YELLOW);

			Group påse = new Group(rectback, rect, rect2);
		
			
			Scene mainScene = new Scene(påse, 800, 500);
			
			window.setScene(mainScene);
			
			window.show();
			
		}
	}

