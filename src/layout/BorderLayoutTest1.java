package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutTest1 extends JFrame {
	public BorderLayoutTest1() {
		// 타이틀 지정
		setTitle("BorderLayout");
		// 크기지정
		setSize(500, 500);
		// x 버튼 누르면 프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면에 보이기
		setVisible(true);
		
		// JPanel 생성
		JPanel ContentPane = new JPanel();
		// layout 지정
		ContentPane.setLayout(new BorderLayout());
		
		// 버튼 컴포넌트 생성
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		// 패널에 버튼 부착
		ContentPane.add(btn1,BorderLayout.EAST);
		ContentPane.add(btn2,BorderLayout.WEST);
		ContentPane.add(btn3,BorderLayout.CENTER);
		ContentPane.add(btn4,BorderLayout.NORTH);
		ContentPane.add(btn5,BorderLayout.SOUTH);
		
		// 프레임에 패널 부착
		add(ContentPane);
	}
	public static void main(String[] args) {
		BorderLayoutTest1 border = new BorderLayoutTest1();
	}
}
