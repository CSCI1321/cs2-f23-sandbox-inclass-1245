package cs2.particles;

import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ParticleApp extends Application {
  public void start(Stage stg) {
    stg.setTitle("Particles!");
    Canvas canvas = new Canvas(600, 600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.show();  
    GraphicsContext g = canvas.getGraphicsContext2D();

    canvas.requestFocus();
    ArrayList<ParticleSystem> lst = new ArrayList<ParticleSystem>();
    //ParticleSystem ps = new ParticleSystem(new Vec2(300,300));
    
    canvas.setOnMouseClicked((MouseEvent e) -> {
      lst.add(new ParticleSystem(new Vec2(e.getX(), e.getY())));
    });

    canvas.setOnKeyTyped((KeyEvent e) -> {
      if(e.getCharacter().equals(" ")) {
        lst.clear();
      }
    });
    

    AnimationTimer timer = new AnimationTimer() {
      public void handle(long t) {
        g.setFill(Color.BLACK);
        g.fillRect(0,0,600,600);
        for(ParticleSystem ps : lst) {
          ps.display(g);
          ps.update();
          ps.addParticle();
        }
      }
    };
    timer.start();


  }
}
