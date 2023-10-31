package cs2.particles;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Background implements Displayable {
  public void display(GraphicsContext g) {
    g.setFill(Color.ROYALBLUE);
    g.fillRect(0,0, 800,800);
  }
}
