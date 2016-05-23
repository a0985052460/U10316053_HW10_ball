//U10316053 µ{¬fºú
import javax.swing.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ball extends JPanel {
  private int delay = 10;

  // Create a timer with delay 1000 ms
  private Timer timer = new Timer(delay, new TimerListener());

  private int x = 0; private int y = 0; // Current ball position
  private int radius = 15; // Ball radius
  private int dx = 2; // Increment on ball's x-coordinate
  private int dy = 2; // Increment on ball's y-coordinate

  public Ball() {
    timer.start();
  }

  private class TimerListener implements ActionListener {
    @Override /** Handle the action event */
    public void actionPerformed(ActionEvent e) {
      repaint();
    }
  }

  int red=0;
  int green=0;
  int blue=0;
  int count=256;
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    count++;
    red=count%256;
    green=count%128;
    blue=count%64;
    Color myColor = new Color(red,green,blue);
    g.setColor(myColor);
    //g.setColor(Color.red);
    // Check boundaries
    if (x < 0 || x > getWidth()) 
      dx *= -1;
    if (y < 0 || y > getHeight()) 
      dy *= -1;

    // Adjust ball position
    x += dx;
    y += dy;
    g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
  }

  public void suspend() {
    timer.stop(); // Suspend timer
  }

  public void resume() {
    timer.start(); // Resume timer
  }

  public void setDelay(int delay) {
    this.delay = delay;
    timer.setDelay(delay);
  }
}
