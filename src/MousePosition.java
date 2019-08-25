import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MousePosition extends JFrame implements MouseMotionListener {

	JLabel label1, label2;
	JButton jbutton;
	
	MousePosition() {

		JFrame jframe = new JFrame("SGIC");
		jframe.setSize(500,500);
		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		
		jframe.getContentPane().setBackground(Color.GRAY);
		//jframe.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("phone.png")));
		
		label1 = new JLabel();
		label1.setText("Sgic Swing Practice");
		label1.setBounds(150, 20, 250, 50);
		jframe.add(label1);
		
		label2 = new JLabel();
		label2.setBounds(100, 150, 100, 30);
		jframe.add(label2);
				
		jframe.addMouseMotionListener(this);
		
		jbutton = new JButton("CLICK");
		jbutton.setBounds(50,70,100,50);
		jbutton.setBackground(Color.blue);
		jframe.add(jbutton);
		
		Font font = new Font("Impact", Font.BOLD, 15);
		label1.setFont(font);
		label2.setFont(font);
		jbutton.setFont(font);
		label1.setForeground(Color.GREEN);
	}
	
	public void mouseDragged(MouseEvent me) {
		int x = me.getX();
		int y = me.getY();
		label2.setText("X : "+x+ "Y : "+y);
	}

	public void mouseMoved(MouseEvent me) {
		int x = me.getX();
		int y = me.getY();
		label2.setText("X : "+x+ "Y : "+y);
		
	}

	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new MousePosition();
			}
		});
	}	
}
