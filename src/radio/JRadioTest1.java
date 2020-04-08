package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JRadioButton;

public class JRadioTest1 extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest1 frame = new JRadioTest1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JRadioTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("선호하는 애완동물은?");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdoCat = new JRadioButton("고양이");
		panel.add(rdoCat);
		
		JRadioButton rdoDog = new JRadioButton("강아지");
		panel.add(rdoDog);
		
		JRadioButton rdoHam = new JRadioButton("햄스터");
		panel.add(rdoHam);
		
		JRadioButton rdoRab = new JRadioButton("토끼");
		panel.add(rdoRab);
		
		JRadioButton rdoHog = new JRadioButton("고슴도치");
		panel.add(rdoHog);
		
		// 버튼그룹 생성
		ButtonGroup group = new ButtonGroup();
		group.add(rdoCat);
		group.add(rdoDog);
		group.add(rdoHam);
		group.add(rdoRab);
		group.add(rdoHog);
	}

}
