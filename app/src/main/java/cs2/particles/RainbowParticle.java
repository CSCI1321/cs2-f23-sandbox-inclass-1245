package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.paint.Color;

public class RainbowParticle extends RoundParticle {
  private double hue;
  
  public RainbowParticle(Vec2 p, Vec2 v) {
    super(p,v);
    hue = 0;
  }

  @Override
  public void update() {
    super.update();
    this.col = Color.hsb(hue, 0.8, 0.8);
    hue += 1;
  }
  
}
