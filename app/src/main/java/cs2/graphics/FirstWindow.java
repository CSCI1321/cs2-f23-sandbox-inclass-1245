package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class FirstWindow extends Application {
  public void start(Stage stg) {
    Canvas canvas = new Canvas(600, 600);
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

    //OWL
    g.setFill(Color.WHITE);
    g.fillRect(0,0, 600,600);

    g.setFill(Color.BLACK);
    g.fillRect(200,200, 200,200);
    g.fillOval(200,100, 200,200);
    g.fillOval(200,300, 200,200);
    g.setFill(Color.WHITE);
    g.fillArc(200,100, 200,200, 180,180, ArcType.ROUND);
    g.fillOval(200,150, 100,100);
    g.fillOval(300,150, 100,100);


    g.setStroke(Color.BLACK);
    g.setLineWidth(2);
    for(int x=0; x<canvas.getWidth(); x++) {
      g.setStroke(Color.rgb(x*255/600,0,0));
      g.strokeLine(x,0, x,canvas.getHeight());
    }

    //Fractals
    g.setFill(Color.WHITE);
    g.fillRect(0,0, 600,600);
    //drawCircle(g, 300, 300, 150);


    double px = 0;
    double py = 0;
    canvas.setOnMouseDragged( (MouseEvent e) -> {
      g.setStroke(Color.rgb(0,0,0, 0.5));
      g.strokeLine(300,300, e.getX(),e.getY());
      //g.strokeLine(px,py, e.getX(),e.getY());
      System.out.println("DRAG!!");
    });

    canvas.setOnKeyTyped( (KeyEvent e) -> {
      g.setFill(Color.WHITE);
      g.fillRect(0,0, 600,600);
    });
    canvas.requestFocus();



  }

  public static void drawCircle(GraphicsContext g, double x, double y, double r) {
    g.setStroke(Color.BLACK);
    g.setLineWidth(1);
    g.strokeOval(x-r,y-r, r*2,r*2);
    if(r > 10) {
      drawCircle(g, x-r, y, r/2);
      drawCircle(g, x+r, y, r/2);
      drawCircle(g, x, y-r, r/2);
      drawCircle(g, x, y+r, r/2);
    }
  }



}
