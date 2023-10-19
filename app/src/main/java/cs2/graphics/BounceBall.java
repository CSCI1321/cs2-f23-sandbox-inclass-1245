package cs2.graphics;

import org.checkerframework.checker.units.qual.A;

import cs2.particles.Particle;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BounceBall extends Application {
  public void start(Stage stg) {
    stg.setTitle("Bounce Ball!");
    Canvas canvas = new Canvas(600, 600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.show();  

    GraphicsContext g = canvas.getGraphicsContext2D();


    g.setFill(Color.ORCHID);
  
    //Particle p = new Particle();

    AnimationTimer timer = new AnimationTimer() {
      double x = 200;
      double y = 200;
      double vx = Math.random()*10-5;
      double vy = Math.random()*10-5;
      public void handle(long t) {
        g.setFill(Color.BLACK);
        g.fillRect(0,0,canvas.getWidth(), canvas.getHeight());
        g.setFill(Color.ORCHID);
        g.fillOval(x,y, 50,50);
        x += vx;
        y += vy;
        if(x + 50 >= canvas.getWidth() || x < 0) {
          vx *= -1;
        }
        if(y + 50 >= canvas.getHeight() || y < 0) {
          vy *= -1;
        }
        //p = new Particle();
      }
    };
    timer.start();
    



  }
}
