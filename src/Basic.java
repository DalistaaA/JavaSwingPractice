import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Basic extends JFrame implements ActionListener{

	JLabel jlabel;
	JButton jbutton;
	JTextField jtextfield;
	
	Basic() {

		JFrame jframe = new JFrame("SGIC");
		jframe.setSize(500,500);
		jframe.setLayout(null);
		
		jlabel = new JLabel();
		jlabel.setText("Sgic Swing Practice");
		jlabel.setBounds(50, 20, 250, 50);
		jframe.add(jlabel);
		
		Font font = new Font("Impact", Font.BOLD, 15);
		jlabel.setFont(font);
		jlabel.setForeground(Color.GREEN);
		
		jbutton = new JButton("CLICK");
		jbutton.setBounds(50,70,100,50);
		jframe.add(jbutton);
		jbutton.addActionListener(this);
		
		jtextfield = new JTextField();
		jtextfield.setBounds(50,150,250,30);
		jframe.add(jtextfield);
		
		
		
//		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
//		int screen_height = dimension.height;
//		int screen_width = dimension.width;
//		int frame_height = jframe.getSize().height;
//		int frame_width = jframe.getSize().width;
//		int x =(screen_height-frame_height)/2;
//		int y =(screen_width-frame_width)/2;
//		jframe.setLocation(x,y);
		
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String msg = jtextfield.getText();
		JOptionPane.showMessageDialog(null, msg);
		
		//jtextfield.setText("Tutor Joes");
	}

	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Basic();
			}
		});
	}

}
