import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.random.*;
import javax.swing.*;


public class SnakeGame extends JPanel {
    private class Tile{
        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    int boardwidth;
    int boardheight;
    int tileSize = 25;

    Tile snakeHead;

    SnakeGame(int boardwidth, int boardheight) {
        this.boardwidth = boardwidth;
        this.boardheight = boardheight;
        setPreferredSize(new Dimension(this.boardwidth, this.boardheight));
        setBackground(Color.BLACK);

        snakeHead = new Tile(5, 5);


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize);
    }
}
