package Main;
import javax.swing.JFrame;

public class Game {
	public Game() {
		JFrame window= new JFrame("Dragon Tale");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
	}
}
