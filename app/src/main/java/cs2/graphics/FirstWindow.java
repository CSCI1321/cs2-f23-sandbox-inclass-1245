package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class FirstWindow extends Application {
  public void start(Stage stg) {
    Canvas canvas = new Canvas(600, 400);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.show();  

    GraphicsContext g = canvas.getGraphicsContext2D();
    g.setFill(Color.SPRINGGREEN);
    

    g.strokeRect(200,100, 300,200);

    g.setLineWidth(20);

    g.setStroke(Color.rgb(200,100,50));
    g.strokeLine(0,0, 600,400);

    //g.fillOval(200,100, 300,200);
    g.fillArc(200,100, 300,200, 135,270, ArcType.CHORD);
    g.strokeText("Hello, This is some jumping text", 200,100);


    


  }
}
