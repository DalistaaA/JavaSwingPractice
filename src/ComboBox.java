import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ComboBox extends JFrame implements ActionListener {

	JComboBox cmb;
	JButton button;
	ComboBox() {

		JFrame jframe = new JFrame("SGIC");
		jframe.setSize(500,600);
		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		
		cmb = new JComboBox();
		cmb.addItem("C");
		cmb.addItem("C++");
		cmb.addItem("JAVA");
		cmb.addItem("PHP");
		cmb.setBounds(100,250,80,30);
		jframe.add(cmb);
		
		button = new JButton("CLICK");
		button.setBounds(50,70,100,50);
		jframe.add(button);
		button.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String msg = "";
		msg=cmb.getSelectedItem().toString();
		int index = cmb.getSelectedIndex(); 

		JOptionPane.showMessageDialog(null, msg+" Index : "+index);
	}

	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ComboBox();
			}
		});
	}

}
