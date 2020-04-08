package checkbox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class JCheckTest4 extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JPanel panel1, panel2, panel3;
	private JLabel label1, label2, label3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckTest4 frame = new JCheckTest4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JCheckTest4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chk1 = new JCheckBox("Apple");
		chk1.addItemListener(this);
		panel.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("Grape");
		chk2.addItemListener(this);
		panel.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("Orange");
		chk3.addItemListener(this);
		panel.add(chk3);
		
		panel1 = new JPanel();
		contentPane.add(panel1);
		panel1.setLayout(new BorderLayout(0, 0));
		
		label1 = new JLabel("");
		panel1.add(label1, BorderLayout.CENTER);
		
		panel2 = new JPanel();
		contentPane.add(panel2);
		panel2.setLayout(new BorderLayout(0, 0));
		
		label2 = new JLabel("");
		panel2.add(label2, BorderLayout.CENTER);
		
		panel3 = new JPanel();
		contentPane.add(panel3);
		panel3.setLayout(new BorderLayout(0, 0));
		
		label3 = new JLabel("");
		panel3.add(label3, BorderLayout.CENTER);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox check = (JCheckBox) e.getItem();
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if (check.getText().equals("Apple")) {
				label1.setIcon(new ImageIcon(getClass().getResource("/checkbox/apple.gif")));
			} else if (check.getText().equals("Grape")) {
				label2.setIcon(new ImageIcon(getClass().getResource("/checkbox/grape.gif")));				
			} else if (check.getText().equals("Orange")) {
				label3.setIcon(new ImageIcon(getClass().getResource("/checkbox/orange.gif")));				
			}
		} else {
			if (check.getText().equals("Apple")) {
				label1.setIcon(new ImageIcon(getClass().getResource("")));
			} else if (check.getText().equals("Grape")) {
				label2.setIcon(new ImageIcon(getClass().getResource("")));				
			} else if (check.getText().equals("Orange")) {
				label3.setIcon(new ImageIcon(getClass().getResource("")));				
			}
		}
	}

}
