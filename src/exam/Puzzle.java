package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class MyButton extends JButton{
	static int count=0;
	int index;//자리값을 표시하기 위한 index
	
	public MyButton(String str) {
		super(str);
		index=count++;
	}
}

public class Puzzle extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String numbers[] = {"1","2","3","4","5","6","7","8",""};
	Random random = new Random();
	private MyButton btn[] = new MyButton[9];
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puzzle frame = new Puzzle();
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
	public Puzzle() {
		setTitle("puzzle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));

		//버튼을 생성후 패널에 붙이기		
		for(int i=0;i<btn.length-1;i++)
			btn[i]=new MyButton((i+1)+"");
		//8번 버튼은 비워놓기
		btn[8]=new MyButton("");
		
		for(int i=0;i<btn.length;i++) {
			panel.add(btn[i], Panel.CENTER_ALIGNMENT);
		}
		
		for(int i=0;i<btn.length;i++)
			btn[i].addActionListener(this);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		btnReset = new MyButton("Reset");
		btnReset.addActionListener(this);
		panel_1.add(btnReset);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MyButton b = (MyButton) e.getSource();
		System.out.println("index : " + b.index);
		// 만약 인덱스의 값이 7(버튼이 8)일때 8번 인덱스(버튼이 비어있음
		if(b.equals("")) return;
		if(b.index == 0) {
			if(btn[1].getText().equals("")) {
				btn[1].setText(b.getText());
				b.setText("");
			} else if(btn[3].getText().equals("")) {
				btn[3].setText(b.getText());
				b.setText("");
			}
		} else if(b.index == 1) {
			if(btn[0].getText().equals("")) {
				btn[0].setText(b.getText());
				b.setText("");
			} else if(btn[2].getText().equals("")) {
				btn[2].setText(b.getText());
				b.setText("");
			} else if(btn[4].getText().equals("")) {
				btn[4].setText(b.getText());
				b.setText("");
			}
		} else if(b.index == 2) {
			if(btn[1].getText().equals("")) {
				btn[1].setText(b.getText());
				b.setText("");
			} else if(btn[5].getText().equals("")) {
				btn[5].setText(b.getText());
				b.setText("");
			}
		} else if(b.index == 3) {
			if(btn[0].getText().equals("")) {
				btn[0].setText(b.getText());
				b.setText("");
			} else if(btn[4].getText().equals("")) {
				btn[4].setText(b.getText());
				b.setText("");
			} else if(btn[6].getText().equals("")) {
				btn[6].setText(b.getText());
				b.setText("");
			}
		} else if(b.index == 4) {
			if(btn[1].getText().equals("")) {
				btn[1].setText(b.getText());
				b.setText("");
			} else if(btn[3].getText().equals("")) {
				btn[3].setText(b.getText());
				b.setText("");
			} else if(btn[5].getText().equals("")) {
				btn[5].setText(b.getText());
				b.setText("");
			} else if(btn[7].getText().equals("")) {
				btn[7].setText(b.getText());
				b.setText("");
			}
		} else if(b.index == 5) {
			if(btn[2].getText().equals("")) {
				btn[2].setText(b.getText());
				b.setText("");
			} else if(btn[4].getText().equals("")) {
				btn[4].setText(b.getText());
				b.setText("");
			} else if(btn[8].getText().equals("")) {
				btn[8].setText(b.getText());
				b.setText("");
			}
		} else if(b.index == 6) {
			if(btn[3].getText().equals("")) {
				btn[3].setText(b.getText());
				b.setText("");
			} else if(btn[7].getText().equals("")) {
				btn[7].setText(b.getText());
				b.setText("");
			}
		} else if(b.index == 7) {
			if(btn[4].getText().equals("")) {
				btn[4].setText(b.getText());
				b.setText("");
			} else if(btn[6].getText().equals("")) {
				btn[6].setText(b.getText());
				b.setText("");
			} else if(btn[8].getText().equals("")) {
				btn[8].setText(b.getText());
				b.setText("");
			}
		} else if(b.index == 8) {
			if(btn[5].getText().equals("")) {
				btn[5].setText(b.getText());
				b.setText("");
			} else if(btn[7].getText().equals("")) {
				btn[7].setText(b.getText());
				b.setText("");
			}
		}else if(b.getText().equalsIgnoreCase("Reset")) {
			for(int i=0;i<btn.length-1;i++)
				btn[i].setText((i+1)+"");
			//8번 버튼은 비워놓기
			btn[8].setText("");
		}
	}
}
