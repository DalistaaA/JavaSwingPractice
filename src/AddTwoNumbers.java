import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class AddTwoNumbers extends JFrame implements ActionListener{

	JLabel label1, label2, label3, label4;
	JTextField textfield1, textfield2;
	JButton button1,button2;
	
	AddTwoNumbers() {

		JFrame jframe = new JFrame("SGIC");
		jframe.setSize(500,500);
		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		
		label1 = new JLabel();
		label1.setText("Sgic Swing Practice");
		label1.setBounds(50, 20, 250, 50);
		jframe.add(label1);
		
		Font font = new Font("Impact", Font.BOLD, 15);
		label1.setFont(font);
		label1.setForeground(Color.BLACK);
		
		label2 = new JLabel();
		label2.setText("Enter Number :");
		label2.setBounds(100, 75, 100, 30);
		jframe.add(label2);
		
		label3 = new JLabel();
		label3.setText("Enter Number :");
		label3.setBounds(100, 115, 100, 30);
		jframe.add(label3);
		
		label4 = new JLabel();
		label4.setText("Answer :");
		label4.setBounds(210, 210, 100, 30);
		jframe.add(label4);
		
		textfield1 = new JTextField();
		textfield1.setBounds(250,75,100,30);
		jframe.add(textfield1);

		textfield2 = new JTextField();
		textfield2.setBounds(250,115,100,30);
		jframe.add(textfield2);
		
		button1 = new JButton("Clear");
		button1.setBounds(125,160,70,30);
		jframe.add(button1);
		
		button2 = new JButton("Add");
		button2.setBounds(210,160,70,30);
		jframe.add(button2);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String str;
		str = e.getActionCommand();
		
		if(str.equals("Clear")) {
			
			textfield1.setText("");
			textfield2.setText("");
		}
		if(str.equals("Add")) {
			
			if(!textfield1.getText().equals("")&&!textfield2.getText().equals("")) {
				
				String t1 = textfield1.getText();
				int number1 = Integer.parseInt(t1);
				
				String t2 = textfield2.getText();
				int number2 = Integer.parseInt(t2);
				
				int total = number1+number2;
				String ans = Integer.toString(total);
				label4.setText("Answer is : "+ans);
				
			}
			else {
				
				JOptionPane.showMessageDialog(null, "Please Enter Two Numbers");
				//JOptionPane.showConfirmDialog(null, "Please Enter Two Numbers");
			}
			
		}
	}

	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new AddTwoNumbers();
			}
		});
	}
}
