package exam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConvertMile extends JFrame implements ActionListener {
	
	private JTextField field1;
	private JTextField field2;
	private JButton btn1;
	
	public ConvertMile() {
		setTitle("마일을 킬로미터로 변환");
		setSize(500, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
		JPanel totalPane = new JPanel();
		JPanel topPane = new JPanel();
		JPanel centerPane = new JPanel();
		JPanel bottomPane = new JPanel();
		JPanel endPane = new JPanel();
		
		totalPane.setLayout(new BoxLayout(totalPane, BoxLayout.Y_AXIS));
		
		JLabel label1 = new JLabel("거리를 마일 단위로 입력하세요");
		field1 = new JTextField(10);
		btn1 = new JButton("변환");
		btn1.addActionListener(this);
		field2 = new JTextField(20);
		
		topPane.add(label1);
		topPane.add(field1);
		
		centerPane.add(btn1);
		
		bottomPane.add(field2);
		
		totalPane.add(topPane);
		totalPane.add(centerPane);
		totalPane.add(bottomPane);
		
		endPane.add(totalPane);
		
		add(endPane);
		pack();
	}

	public static void main(String[] args) {
		ConvertMile mile = new ConvertMile();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double op1 = Double.parseDouble(field1.getText());
		double result = 0;
		if (e.getSource()==btn1) {
			result = op1 * 1.6;
			field2.setText(result + "km");
		}
	}
}
