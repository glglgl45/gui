package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;

public class Rock extends JFrame implements ActionListener {
	
	private static final int ROCK = 0;
	private static final int PAPER = 1;
	private static final int SCISSOR = 2;
	
	private int win = 0;
	private int lose = 0;
	private int draw = 0;
	private int game = 0;

	private JPanel contentPane;
	private JTextField field1;
	private JButton btnRock;
	private JButton btnPaper;
	private JButton btnScissors;
	private JTextField fieldCom;
	private JTextField fieldWin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rock frame = new Rock();
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
	public Rock() {
		setTitle("가위바위보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("아래의 버튼 중에서 하나를 클릭하시오!");
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		field1 = new JTextField();
		panel_2.add(field1);
		field1.setColumns(10);
		
		fieldCom = new JTextField();
		panel_2.add(fieldCom, BorderLayout.NORTH);
		fieldCom.setColumns(10);
		
		fieldWin = new JTextField();
		panel_2.add(fieldWin, BorderLayout.SOUTH);
		fieldWin.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnRock = new JButton();
		btnRock.setIcon(new ImageIcon(Rock.class.getResource("/exam/rock.png")));
		btnRock.addActionListener(this);
		panel_1.add(btnRock);
		
		btnPaper = new JButton();
		btnPaper.setIcon(new ImageIcon(Rock.class.getResource("/exam/paper.png")));
		btnPaper.addActionListener(this);
		panel_1.add(btnPaper);
		
		btnScissors = new JButton();
		btnScissors.setIcon(new ImageIcon(Rock.class.getResource("/exam/scissor.png")));
		btnScissors.addActionListener(this);
		panel_1.add(btnScissors);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 컴퓨터의 가위, 바위, 보 생성하기
		Random random = new Random();
		// random.nextInt(3) : 괄호안의 숫자는 미포함해서 0,1,2 중에서 나오게 함
		int computer = random.nextInt(3);
		String resultCom;
		if (computer == 0) {
			resultCom = "묵";
		} else if(computer == 1) {
			resultCom = "빠";
		} else {
			resultCom = "찌";
		}
		
		// 사용자가 누른 버튼의 값을 가져온 후
		String result;
		// 가위, 바위,보 를 해서 누가 이겼는지 textField에 보여주기
		if (e.getSource()==btnRock) {
			if (computer == ROCK) {
				result = "무";
				draw++;
			} else if (computer == PAPER) {
				result = "패";
				lose++;
			} else {
				result = "승";
				win++;
			}
		} else if (e.getSource()==btnPaper) {
			if (computer == ROCK) {
				result = "승";
				win++;
			} else if (computer == PAPER) {
				result = "무";
				draw++;
			} else {
				result = "패";
				lose++;
			}			
		} else {
			if (computer == ROCK) {
				result = "패";
				lose++;
			} else if (computer == PAPER) {
				result = "승";
				win++;
			} else {
				result = "무";
				draw++;
			}			
		}
		game++;
		double rate = win / (double)game * 100 ;
		fieldCom.setText(fieldCom.getText()+resultCom);
		field1.setText(field1.getText()+result);
		fieldWin.setText("판수 : " + game + " 승 : " + win + " 무 : " + draw + " 패 : " + lose + " 승률 : " + rate + "%");
	}
}
