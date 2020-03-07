package v5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Knappar extends Application implements EventHandler<ActionEvent> {

	// Buttons
	Button _sweKey;
	Button _japKey;

	
	Group _root = new Group(buttons());
	HBox buttonBox = new HBox();
	Scene _mainScene = new Scene(_root, 1000, 600);
	Stage _window;

	@Override
	public void start(Stage window) throws Exception {

		_window = window;
		
		generateFlags();
		
		window.setScene(_mainScene);

		window.show();
	}

	private void generateFlags() {
		
		stb();
		sweden();
	}

	private HBox buttons() {


		_sweKey = new Button("Sweden");
		_sweKey.setOnAction(this);

		_japKey = new Button("STB");
		_japKey.setOnAction(this);

		buttonBox.getChildren().addAll(_sweKey, _japKey);
		
		return buttonBox;
	}

	private Group stb() {

		Rectangle rectB = new Rectangle();
		rectB.setWidth(1000);
		rectB.setHeight(600);
		rectB.setFill(Color.DARKBLUE);
		
		Rectangle rectLR = new Rectangle();
		rectLR.setWidth(1400);
		rectLR.setHeight(100);
		rectLR.setRotate(31);
		rectLR.setX(-100);
		rectLR.setY(310);
		rectLR.setFill(Color.WHITE);

		Rectangle rectRL = new Rectangle();
		rectRL.setWidth(1400);
		rectRL.setHeight(100);
		rectRL.setRotate(-31);
		rectRL.setX(-100);
		rectRL.setY(190);
		rectRL.setFill(Color.WHITE);
		
		Rectangle rectLRR = new Rectangle();
		rectLRR.setWidth(1400);
		rectLRR.setHeight(60);
		rectLRR.setRotate(31);
		rectLRR.setX(-133);
		rectLRR.setY(310);
		rectLRR.setFill(Color.RED);

		Rectangle rectRLR = new Rectangle();
		rectRLR.setWidth(1400);
		rectRLR.setHeight(60);
		rectRLR.setRotate(-31);
		rectRLR.setX(-100);
		rectRLR.setY(210);
		rectRLR.setFill(Color.RED);
		
		Rectangle rectV = new Rectangle();
		rectV.setWidth(150);
		rectV.setHeight(600);
		rectV.setX(425);
		rectV.setFill(Color.WHITE);
		
		Rectangle rectH = new Rectangle();
		rectH.setWidth(1000);
		rectH.setHeight(150);
		rectH.setY(225);
		rectH.setFill(Color.WHITE);
		
		Rectangle rectVR = new Rectangle();
		rectVR.setWidth(100);
		rectVR.setHeight(600);
		rectVR.setX(450);
		rectVR.setFill(Color.RED);
		
		Rectangle rectHR = new Rectangle();
		rectHR.setWidth(1000);
		rectHR.setHeight(100);
		rectHR.setY(250);
		rectHR.setFill(Color.RED);


		Group flagOfSTB = new Group(rectB, rectLR, rectRL, rectLRR, rectRLR, rectV, rectH, rectVR, rectHR);

		

		return flagOfSTB;
	}

	private StackPane sweden() {

		_mainScene.setFill(Color.BLUE);
		Rectangle horizontalLine = new Rectangle(50, 600, Color.YELLOW);
		Rectangle verticalLine = new Rectangle(1000, 50, Color.YELLOW);

		StackPane flagOfSweden = new StackPane();

		flagOfSweden.getChildren().addAll(horizontalLine, verticalLine);
		
		return flagOfSweden;
	}

	@Override
	public void handle(ActionEvent actionEvent) {

		if(actionEvent.getSource() == _sweKey) {
			
			if(_root.getChildren().size() == 1) {
				_root.getChildren().add(sweden());
				return;
			}
			
		_root.getChildren().remove(1);
		_root.getChildren().add(sweden());
		return;
		}
		
		else if (actionEvent.getSource()== _japKey) {
			
			if(_root.getChildren().size() == 1) {
				_root.getChildren().add(stb());
				return;
			}

		_root.getChildren().remove(1);
		_root.getChildren().add(stb());
		return;
		}
		
		
	}

	public static void main(String[] args) {
		launch(args);

	}
}
