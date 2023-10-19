package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Particle {
  private Vec2 pos, vel;
  private double sz;

  public Particle(Vec2 p, Vec2 v) {
    this.pos = p;
    this.vel = v;
    sz = 50;
  }

  public void display(GraphicsContext g) {
    g.setFill(Color.rgb(100,200,150, 0.5));
    g.fillOval(pos.getX(), pos.getY(), sz,sz);
  }

  public void update() {
    this.pos.moveThis(this.vel);
  }
}
