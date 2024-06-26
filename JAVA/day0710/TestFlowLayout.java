package day0710;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * FlowLayout
 * - Container Component의 기본 레이아웃
 * - 컴포넌트는 고유 크기를 유지하고, 
 *   add하는 순서대로 왼쪽에서 오른쪽으로 순서대로 배치된다.
 * - 윈도우의 크기가 늘어나거나 줄어들면 컴포넌트의 위치가 변경된다.
 * @author user
 */
@SuppressWarnings("serial")
//1.Window Component 상속
public class TestFlowLayout extends JFrame {

	public TestFlowLayout() {
		super("FlowLayout 연습");
		
		//2.컴포넌트 생성
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(10);
		JCheckBox jcbSave = new JCheckBox("이름을 저장");
		JButton jbtnInput = new JButton("입력");
		
		//3.배치관리자 생성 및 설정 : BorderLayout => FlowLayout 
		//(BorderLayout이 default)
		setLayout(new FlowLayout());
		
		//4.배치
		add(jlblName);
		add(jtfName);
		add(jcbSave);
		add(jbtnInput);
		
		//5.Window 크기 설정
		setSize(500,200);
		
		//6.가시화
		setVisible(true);
		
		//7.종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//TestFlowLayout
	
	
	public static void main(String[] args) {
		new TestFlowLayout();

	}

}
