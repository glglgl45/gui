package exam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterRest extends JFrame implements ActionListener{
	
	private JButton btn1;
	private JTextField field1;
	private JTextField field2;
	private JTextField field3;
	
	public InterRest() {
		setTitle("이자계산기");
		setSize(500, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel endPane = new JPanel();
		JPanel totalPane = new JPanel();
		JPanel centerPane1 = new JPanel();
		JPanel centerPane2 = new JPanel();
		JPanel centerPane3 = new JPanel();
		JPanel centerPane4 = new JPanel();
		totalPane.setLayout(new BoxLayout(totalPane, BoxLayout.Y_AXIS));

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label1 = new JLabel("원금을 입력하시오");
		JLabel label2 = new JLabel("이율을 입력하시오");
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		field3 = new JTextField(20);
		btn1 = new JButton("변환");
		btn1.addActionListener(this);
		
		panel1.add(label1);
		panel1.add(field1);
		
		panel2.add(label2);
		panel2.add(field2);
		
		centerPane1.add(panel1);
		centerPane2.add(panel2);
		centerPane3.add(btn1);
		centerPane4.add(field3);
		
		totalPane.add(centerPane1);
		totalPane.add(centerPane2);
		totalPane.add(centerPane3);
		totalPane.add(centerPane4);
		
		endPane.add(totalPane);
		
		add(endPane);
		
		pack();
	}

	public static void main(String[] args) {
		InterRest inter = new InterRest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int op1 = Integer.parseInt(field1.getText());
		double op2 = Double.parseDouble(field2.getText());
		double result = 0;
		if (e.getSource()==btn1) {
			result = op1 + (op1*op2/100);
			field3.setText(result+"");
		}
	}

}
