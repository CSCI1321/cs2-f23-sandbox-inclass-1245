package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Particle {
  protected Vec2 pos, vel;
  protected double sz;
  protected Color col;

  public Particle(Vec2 p, Vec2 v) {
    this.pos = p;
    this.vel = v;
    sz = 50;
    col = Color.ORANGERED;
  }

  public abstract void display(GraphicsContext g);

  public void update() {
    this.pos.moveThis(this.vel);
  }
}
