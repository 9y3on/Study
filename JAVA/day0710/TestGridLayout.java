package day0710;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
//1.WindowComponent 상속
public class TestGridLayout extends JFrame {
	
	public TestGridLayout() {
		super("GridLayout");
		
		//2.일반 컴포넌트 생성
		JLabel jlblGender = new JLabel("성별");
		JLabel jlblHobby = new JLabel("취미");
		
		JRadioButton jrbM = new JRadioButton("남자");
		JRadioButton jrbF = new JRadioButton("여자");
		//라디오 버튼은 여러개 중 하나만 선택되어야한다.
		//ButtonGroup이 사용 됨
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbF);
		bg.add(jrbM);
		
		JCheckBox jcb1 = new JCheckBox("야구관람");
		JCheckBox jcb2 = new JCheckBox("롤");
		
		JButton jbtn1 = new JButton("성별 입력");
		JButton jbtn2 = new JButton("취미 입력");
			
		//3.배치 관리자 생성 및 적용 : BorderLayout => GridLayout
		setLayout(new GridLayout(2,4));
		
		//4.배치
		add(jlblGender);
		add(jrbM);
		add(jrbF);
		add(jbtn1);
		
		add(jlblHobby);
		add(jcb1);
		add(jcb2);
		add(jbtn2);

		//5.윈도우 크기 설정
		setSize(400,400);
		
		//6.가시화
		setVisible(true);
		
		//7.종료이벤트
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new TestGridLayout();

	}

}
