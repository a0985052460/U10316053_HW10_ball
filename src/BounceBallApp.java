//U10316053 �{�f��
import java.awt.*;
import javax.swing.*;
public class BounceBallApp extends JApplet {
  public BounceBallApp() {
    add(new BallControl());
  }
  public static void main(String[] args) {
    BounceBallApp applet = new BounceBallApp();
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("U10316053 �{�f�� Balllllllll");
    frame.add(applet, BorderLayout.CENTER);
    frame.setSize(400, 320);
    frame.setVisible(true);
  }
}
