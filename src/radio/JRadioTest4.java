package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;

public class JRadioTest4 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel labelCost;
	private ButtonGroup groupMenu;
	private ButtonGroup groupTopping;
	private ButtonGroup groupSize;
	private JRadioButton rdoMenu1;
	private JRadioButton rdoMenu2;
	private JRadioButton rdoMenu3;
	private JRadioButton rdoTopping1;
	private JRadioButton rdoTopping2;
	private JRadioButton rdoTopping3;
	private JRadioButton rdoTopping4;
	private JRadioButton rdoSize1;
	private JRadioButton rdoSize2;
	private JRadioButton rdoSize3;
	private int menuCost = 0;
	private int toppingCost = 0;
	private int sizeCost = 0;
	private String choiceMenu;
	private String choiceTopping;
	private String choiceSize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest4 frame = new JRadioTest4();
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
	public JRadioTest4() {
		setTitle("피자주문");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("자바 피자에 오신 것을 환영합니다");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC885\uB958", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 0, 0, 0));
		
		rdoMenu1 = new JRadioButton("콤비네이션");
		panel_3.add(rdoMenu1);
		
		rdoMenu2 = new JRadioButton("포테이토");
		panel_3.add(rdoMenu2);
		
		rdoMenu3 = new JRadioButton("불고기");
		panel_3.add(rdoMenu3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "\uCD94\uAC00 \uD1A0\uD551", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(4, 0, 0, 0));
		
		rdoTopping1 = new JRadioButton("피망");
		panel_4.add(rdoTopping1);
		
		rdoTopping2 = new JRadioButton("치즈");
		panel_4.add(rdoTopping2);
		
		rdoTopping3 = new JRadioButton("페퍼로니");
		panel_4.add(rdoTopping3);
		
		rdoTopping4 = new JRadioButton("베이컨");
		panel_4.add(rdoTopping4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "\uD06C\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 0, 0, 0));
		
		rdoSize1 = new JRadioButton("Small");
		panel_5.add(rdoSize1);
		
		rdoSize2 = new JRadioButton("Medium");
		panel_5.add(rdoSize2);
		
		rdoSize3 = new JRadioButton("Large");
		panel_5.add(rdoSize3);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnOrder = new JButton("주문");
		btnOrder.addActionListener(this);
		panel_2.add(btnOrder);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		panel_2.add(btnCancel);
		
		labelCost = new JLabel("금액 : 0");
		labelCost.setFont(new Font("굴림", Font.BOLD, 12));
		panel_2.add(labelCost);
		
		groupMenu = new ButtonGroup();
		groupMenu.add(rdoMenu1);
		groupMenu.add(rdoMenu2);
		groupMenu.add(rdoMenu3);
		
		groupTopping = new ButtonGroup();
		groupTopping.add(rdoTopping1);
		groupTopping.add(rdoTopping2);
		groupTopping.add(rdoTopping3);
		groupTopping.add(rdoTopping4);
		
		groupSize = new ButtonGroup();
		groupSize.add(rdoSize1);
		groupSize.add(rdoSize2);
		groupSize.add(rdoSize3);
		
		rdoMenu1.addActionListener(this);
		rdoMenu2.addActionListener(this);
		rdoMenu3.addActionListener(this);
		rdoTopping1.addActionListener(this);
		rdoTopping2.addActionListener(this);
		rdoTopping3.addActionListener(this);
		rdoTopping4.addActionListener(this);
		rdoSize1.addActionListener(this);
		rdoSize2.addActionListener(this);
		rdoSize3.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==rdoMenu1) {
			menuCost = 13000;
			choiceMenu = rdoMenu1.getText();
		} else if (e.getSource()==rdoMenu2) {
			menuCost = 14000;
			choiceMenu = rdoMenu2.getText();
		} else if (e.getSource()==rdoMenu3) {
			menuCost = 15000;
			choiceMenu = rdoMenu3.getText();
		}
		labelCost.setText("금액 : " + (menuCost + toppingCost + sizeCost));
		
		if (e.getSource()==rdoTopping1) {
			toppingCost = 300;
			choiceTopping = rdoTopping1.getText();
		} else if (e.getSource()==rdoTopping2) {
			toppingCost = 500;
			choiceTopping = rdoTopping2.getText();
		} else if (e.getSource()==rdoTopping3) {
			toppingCost = 700;
			choiceTopping = rdoTopping3.getText();
		} else if (e.getSource()==rdoTopping4){
			toppingCost = 1000;
			choiceTopping = rdoTopping4.getText();
		}
		labelCost.setText("금액 : " + (menuCost + toppingCost + sizeCost));
		
		if (e.getSource()==rdoSize1) {
			sizeCost = 0;
			choiceSize = rdoSize1.getText();
		} else if (e.getSource()==rdoSize2) {
			sizeCost = 2000;
			choiceSize = rdoSize2.getText();
		} else if (e.getSource()==rdoSize3) {
			sizeCost = 4000;
			choiceSize = rdoSize3.getText();
		}
		labelCost.setText("금액 : " + (menuCost + toppingCost + sizeCost));
		int sumCost = menuCost + toppingCost + sizeCost;
		if (e.getActionCommand().equals("주문")) {
			if(JOptionPane.showConfirmDialog(	this, 
												"주문내역\n\n종류 : "+choiceMenu+"\n토핑 : "+choiceTopping+"\n크기 : "+choiceSize+"\n\n가격은 "+sumCost+"원 입니다. 주문하시겠습니까?\n",
												"주문 확인", 
												JOptionPane.OK_CANCEL_OPTION, 
												JOptionPane.INFORMATION_MESSAGE, 
												null) == 0) {
				JOptionPane.showMessageDialog(this, "주문이 완료되었습니다.", "주문 완료", JOptionPane.CLOSED_OPTION, null);
				labelCost.setText("주문이 완료되었습니다.");		
				menuCost = 0;
				toppingCost = 0;
				sizeCost = 0;
				groupMenu.clearSelection();
				groupTopping.clearSelection();
				groupSize.clearSelection();		
			} else {
				JOptionPane.showMessageDialog(this, "주문이 취소되었습니다.", "주문 취소", JOptionPane.CLOSED_OPTION, null);
			}
		} else if (e.getActionCommand().equals("취소")){
			labelCost.setText("주문이 취소되었습니다.");
			menuCost = 0;
			toppingCost = 0;
			sizeCost = 0;
			groupMenu.clearSelection();
			groupTopping.clearSelection();
			groupSize.clearSelection();
		}
		
	}

}
