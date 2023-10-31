package cs2.particles;

import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ParticleSystem {
  private Vec2 origin;
  private ArrayList<Particle> parts;

  public ParticleSystem(Vec2 o) {
    origin = o;
    parts = new ArrayList<Particle>();
  }

  public void addParticle(Image img) {
    
    parts.add(new ImageParticle(img, origin.clone(), Vec2.fromRandom(5)));
    

    /*
    if(Math.random() > 0.5) {
      parts.add(new SquareParticle(origin.clone(), Vec2.fromRandom(5)));
    } else {
      parts.add(new RainbowParticle(origin.clone(), Vec2.fromRandom(5)));
    }*/
  }

  public void display(GraphicsContext g) {
    System.out.println(parts.size());
    for(int i=0; i<parts.size(); i++) {
      parts.get(i).display(g);
    } 
  }
  
  public void update() {
    for(Particle p : parts) {
      p.update();
    }
  }
  public void addForce(Vec2 force) {
    for(Particle p : parts) {
      p.addForce(force);
    }
  }
  
}
