import javax.swing.*;

public class App {
    public static void main(String[] args) {
        // Define o tamanho do frame
        int boardwidth = 600;
        int boardheight = 600;

        // Cria o frame para o jogo
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardwidth, boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Instancia a classe snakeGame que vai adicionar o painel
        SnakeGame snakeGame = new SnakeGame(boardwidth, boardheight);
        frame.add(snakeGame);
        frame.pack();
    }
}

