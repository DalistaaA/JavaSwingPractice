import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class CheckBox extends JFrame implements ActionListener {

	JButton button;
	JCheckBox cb1, cb2, cb3, cb4;
	CheckBox() {

		JFrame jframe = new JFrame("SGIC");
		jframe.setSize(500,600);
		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		
		cb1 = new JCheckBox();
		cb1.setText("C");
		cb1.setBounds(100,280,80,30);
		jframe.add(cb1);
		
		cb2 = new JCheckBox();
		cb2.setText("C++");
		cb2.setBounds(100,310,80,30);
		jframe.add(cb2);
		
		cb3 = new JCheckBox();
		cb3.setText("JAVA");
		cb3.setBounds(100,340,80,30);
		jframe.add(cb3);
		
		cb4 = new JCheckBox();
		cb4.setText("C#");
		cb4.setBounds(100,370 ,80,30);
		jframe.add(cb4);
	
		button = new JButton("CLICK");
		button.setBounds(50,70,100,50);
		jframe.add(button);
		button.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String msg = "";
		
		if(cb1.isSelected()) {
			msg=msg+"C ";
		}
		if(cb2.isSelected()) {
			msg=msg+"C++ ";
		}
		if(cb3.isSelected()) {
			msg=msg+"JAVA ";
		}
		if(cb4.isSelected()) {
			msg=msg+cb4.getText();
		}
		JOptionPane.showMessageDialog(null, msg);
	}

	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new CheckBox();
			}
		});
	}

}
