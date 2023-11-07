package cs2.particles;

import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
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

    canvas.setOnKeyPressed((KeyEvent e) -> {
      if(e.getCode() == KeyCode.SPACE) {
      //if(e.getCharacter().equals(" ")) {
        lst.clear();
      }
    });
    
    Image starImg = new Image("file:star.png");
    System.out.println(starImg.getHeight());

    Background bg = new Background();

    AnimationTimer timer = new AnimationTimer() {
      public void handle(long t) {
        //g.setFill(Color.BLACK);
        //g.fillRect(0,0,600,600);
        //g.drawImage(starImg, 0, 0, 500,200);
        bg.display(g);

        for(ParticleSystem ps : lst) {
          ps.display(g);
          ps.update();
          ps.addParticle(starImg);
          ps.addForce(new Vec2(0,1));
        }
      }
    };
    timer.start();


  }
}
