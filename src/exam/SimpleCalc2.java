package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class SimpleCalc2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtOp1;
	private JTextField txtOp2;
	private JTextField txtResult;
	private JButton btnReset;
	private JButton btnDiv;
	private JButton btnMul;
	private JButton btnSub;
	private JButton btnPlus;
	private JLabel labelOp;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalc2 frame = new SimpleCalc2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimpleCalc2() {
		setTitle("사직연산 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txtOp1 = new JTextField();
		panel.add(txtOp1);
		txtOp1.setColumns(10);
		
		labelOp = new JLabel("?");
		panel.add(labelOp);
		
		txtOp2 = new JTextField();
		panel.add(txtOp2);
		txtOp2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		panel.add(lblNewLabel_1);
		
		txtResult = new JTextField();
		panel.add(txtResult);
		txtResult.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(this);
		panel_1.add(btnPlus);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(this);
		panel_1.add(btnSub);
		
		btnMul = new JButton("*");
		btnMul.addActionListener(this);
		panel_1.add(btnMul);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(this);
		panel_1.add(btnDiv);
		
		btnReset = new JButton("reset");
		btnReset.addActionListener(this);
		panel_1.add(btnReset);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton) e.getSource();
		int op1 = Integer.parseInt(txtOp1.getText());
		int op2 = Integer.parseInt(txtOp2.getText());
		int result = 0;
		
		if (btn==btnPlus) {
			labelOp.setText("+");
			result = op1 + op2;
		} else if (btn==btnSub) {
			labelOp.setText("-");
			result = op1 - op2;
		} else if (btn==btnMul) {
			labelOp.setText("*");	
			result = op1 * op2;	
		} else if (btn==btnDiv) {
			labelOp.setText("/");		
			result = op1 / op2;
		} else {
			txtOp1.setText("");
			txtOp2.setText("");
			txtResult.setText("");			
		}
		txtResult.setText(result+"");
	}
}
