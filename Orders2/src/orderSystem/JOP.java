package orderSystem;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class JOP {

	public static void msg(String msg) {
		JOptionPane j = new JOptionPane();
		JTextArea jl = new JTextArea(msg);
		jl.setFont(new Font("Monospaced", Font.BOLD, 20));
		j.showMessageDialog(null, jl, "Results", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static String in(String msg){
		JOptionPane j = new JOptionPane();
		JTextArea jl = new JTextArea(msg);
		jl.setFont(new Font("Monospaced", Font.BOLD, 20));
		return j.showInputDialog(null, jl, "Results", JOptionPane.PLAIN_MESSAGE);
	}
}
