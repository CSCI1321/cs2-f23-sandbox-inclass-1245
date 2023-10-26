package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ImageParticle extends Particle {
  private Image img;
  public ImageParticle(Image i, Vec2 p, Vec2 v) {
    super(p,v);
    img = i;
  }

  @Override
  public void display(GraphicsContext g) {
    g.drawImage(img, pos.getX(), pos.getY(), sz, sz);
  }
}
