import javax.swing.*;

public class App {
    public static void main(String[] args) {
        // Define o tamanho do tabuleiro
        int boardwidth = 800;
        int boardheight = 600;

        // Cria o tabuleiro do jogo para que possa ser adicionado a ele os componentes depois.
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardwidth, boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

