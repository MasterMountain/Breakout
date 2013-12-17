package ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import sprites.Ball;
import sprites.Paddle;

public class Canvas extends JPanel implements Updatable {
    private final Paddle paddle;
    private final Ball ball;
    
    public Canvas(Paddle paddle, Ball ball) {
        this.paddle = paddle;
        this.ball = ball;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Paint paddle, just a rectangle for now
        g.setColor(Color.BLACK);
        g.fill3DRect(paddle.getX(), paddle.getY(), paddle.getWidth(), paddle.getHeight(), true);
        
        // Paint ball
        g.setColor(Color.red);
        g.fillOval(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
        g.dispose();
    }

    @Override
    public void update() {
        repaint();
    }
}