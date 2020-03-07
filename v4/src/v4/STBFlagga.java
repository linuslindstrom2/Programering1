package v4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class STBFlagga extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {

		Rectangle rectB = new Rectangle();
		rectB.setWidth(800);
		rectB.setHeight(500);
		rectB.setFill(Color.DARKBLUE);
		
		Rectangle rectLR = new Rectangle();
		rectLR.setWidth(1000);
		rectLR.setHeight(100);
		rectLR.setRotate(31);
		rectLR.setX(-100);
		rectLR.setY(195);
		rectLR.setFill(Color.WHITE);

		Rectangle rectRL = new Rectangle();
		rectRL.setWidth(1000);
		rectRL.setHeight(100);
		rectRL.setRotate(-31);
		rectRL.setX(-100);
		rectRL.setY(195);
		rectRL.setFill(Color.WHITE);
		
		Rectangle rectLRR = new Rectangle();
		rectLRR.setWidth(1000);
		rectLRR.setHeight(60);
		rectLRR.setRotate(31);
		rectLRR.setX(-100);
		rectLRR.setY(215);
		rectLRR.setFill(Color.RED);

		Rectangle rectRLR = new Rectangle();
		rectRLR.setWidth(1000);
		rectRLR.setHeight(60);
		rectRLR.setRotate(-31);
		rectRLR.setX(-100);
		rectRLR.setY(215);
		rectRLR.setFill(Color.RED);
		
		Rectangle rectH = new Rectangle();
		rectH.setWidth(150);
		rectH.setHeight(500);
		rectH.setX(325);
		rectH.setFill(Color.WHITE);
		
		Rectangle rectV = new Rectangle();
		rectV.setWidth(800);
		rectV.setHeight(150);
		rectV.setY(170);
		rectV.setFill(Color.WHITE);
		
		Rectangle rectHR = new Rectangle();
		rectHR.setWidth(100);
		rectHR.setHeight(500);
		rectHR.setX(350);
		rectHR.setFill(Color.RED);
		
		Rectangle rectVR = new Rectangle();
		rectVR.setWidth(800);
		rectVR.setHeight(100);
		rectVR.setY(195);
		rectVR.setFill(Color.RED);


		Group påse = new Group(rectB, rectLR, rectRL, rectLRR, rectRLR, rectH, rectV, rectHR, rectVR);

		Scene mainScene = new Scene(påse, 800, 500);

		window.setScene(mainScene);

		window.show();

	}
}
