import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ExMouseListener extends JFrame implements MouseListener  {

	JLabel label;
	ExMouseListener() {

		JFrame jframe = new JFrame("SGIC");
		jframe.setSize(500,500);
		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.addMouseListener(this);
		
		jframe.getContentPane().setBackground(Color.WHITE);
		
		label = new JLabel();
		label.setBounds(150, 20, 250, 50);
		jframe.add(label);

	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		label.setText("mouseClicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setText("mousePressed");		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		label.setText("mouseReleased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		label.setText("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setText("mouseExited");
	}	


	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ExMouseListener();
			}
		});
	}

	
}
