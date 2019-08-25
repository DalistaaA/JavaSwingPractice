import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;


public class JTableEx extends JFrame implements ActionListener{


	JTable table;
	JScrollPane jsp;
	JRadioButton jr1,jr2;
	ButtonGroup bg;
	JButton button;
	JTableEx() {

		JFrame jframe = new JFrame("SGIC");
		jframe.setSize(500,600);
		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		
		jr1 = new JRadioButton();
		jr1.setText("Male");
		jr1.setBounds(150,100, 80,30);
		jframe.add(jr1);
		
		jr2 = new JRadioButton();
		jr2.setText("Female");
		jr2.setBounds(200,100, 80,30);
		jframe.add(jr2);
		
		bg = new ButtonGroup();
		bg.add(jr1);
		bg.add(jr2);
		
		button = new JButton("CLICK");
		button.setBounds(50,70,100,50);
		jframe.add(button);
		button.addActionListener(this);	
		
		String head[] = {"S.No","Name","Mark"}; 
		
		String data[][] = {
				{"1","Joes","90"},{"2","Raja","90"},{"3","Arjun","90"}
		};
		
		table = new JTable(data, head);
		jsp = new JScrollPane(table);
		jsp.setBounds(200,200,200,100);
		jframe.add(jsp);
	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String msg = "";
		if(jr1.isSelected()) {
			msg="Male";
		}
		if(jr2.isSelected()) {
			msg="Female";
		}

		JOptionPane.showMessageDialog(null, msg);
	}

	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new JTableEx();
			}
		});
	}
}
