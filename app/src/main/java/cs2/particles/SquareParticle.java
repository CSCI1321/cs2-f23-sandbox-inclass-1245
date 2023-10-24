package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SquareParticle extends Particle {
  public SquareParticle(Vec2 p, Vec2 v) {
    super(p,v);
  }

  @Override
  public void display(GraphicsContext g) {
    g.setFill(this.col);
    g.fillRect(this.pos.getX(), this.pos.getY(), this.sz, this.sz);
  }
}
