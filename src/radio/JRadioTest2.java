package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JRadioTest2 extends JFrame implements /*ActionListener*/ItemListener {

	private JPanel contentPane;
	private JTextField textField;
	private JRadioButton rdoCat,rdoHam,rdoDog,rdoRab,rdoHog;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest2 frame = new JRadioTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JRadioTest2() {
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
		
		rdoCat = new JRadioButton("고양이");
//		rdoCat.addActionListener(this);
		rdoCat.addItemListener(this);
		panel.add(rdoCat);
		
		rdoDog = new JRadioButton("강아지");
//		rdoDog.addActionListener(this);
		rdoDog.addItemListener(this);
		panel.add(rdoDog);
		
		rdoHam = new JRadioButton("햄스터");
//		rdoHam.addActionListener(this);
		rdoHam.addItemListener(this);
		panel.add(rdoHam);
		
		rdoRab = new JRadioButton("토끼");
//		rdoRab.addActionListener(this);
		rdoRab.addItemListener(this);
		panel.add(rdoRab);
		
		rdoHog = new JRadioButton("고슴도치");
//		rdoHog.addActionListener(this);
		rdoHog.addItemListener(this);
		panel.add(rdoHog);
		
		// 버튼그룹 생성
		ButtonGroup group = new ButtonGroup();
		group.add(rdoCat);
		group.add(rdoDog);
		group.add(rdoHam);
		group.add(rdoRab);
		group.add(rdoHog);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		JRadioButton radio = (JRadioButton) e.getSource();
//		
//		if (radio.isSelected()) {
//			System.out.println("선택됨");
//		} else {
//			System.out.println("선택 안됨");
//		}
//		
//		textField.setText(e.getActionCommand());
//	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton radio = (JRadioButton) e.getItem();
		
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(radio == rdoCat) {
				System.out.println("rdoCat 선택");
			} else if(radio == rdoDog) {
				System.out.println("rdoDog 선택");
			}
		} else {
			if(radio == rdoCat) {
				System.out.println("rdoCat 해제");
			} else if(radio ==rdoDog) {
				System.out.println("rdoDog 해제");
			}
		}
	}

}
