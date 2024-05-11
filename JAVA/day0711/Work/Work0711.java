package day0711.Work;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Work0711 extends JFrame {
	
	public Work0711() {
		super("숙제");
		
		//JLabel
		JLabel name = new JLabel("이름");
		JLabel age = new JLabel("나이");
		JLabel gender = new JLabel("성별");
		JLabel phone = new JLabel("전화번호");
				
		//JTextField
		JTextField nameField = new JTextField();
		JTextField phoneField = new JTextField();
		
		//JComboBox
		JComboBox<Integer> ageCombo = new JComboBox<Integer>();
		for(int i = 20; i < 36; i++) {
			ageCombo.addItem(i);			
		}
		
		//JRadioButton
		JRadioButton male = new JRadioButton("남자");
		JRadioButton female = new JRadioButton("여자",true);
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
		
		//JTextArea
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta);
		
		//JButton
		JButton inputBtn = new JButton("입력");
		JButton alteBtn = new JButton("변경");
		JButton delBtn = new JButton("삭제");
		JButton exitBtn = new JButton("종료");
		
		//수동배치
		setLayout(null);
		
		//이름
		name.setBounds(40,30,40,25);
		nameField.setBounds(100,30,100,25);
		
		//나이
		age.setBounds(40,60,40,25);
		ageCombo.setBounds(100,60,100,25);
		
		//성별
		gender.setBounds(40,90,40,25);
		male.setBounds(100,90,50,25);
		female.setBounds(150,90,50,25);
		
		//전화번호
		phone.setBounds(40,120,60,25);
		phoneField.setBounds(100,120,100,25);
		
		//메모
		jsp.setBounds(210, 30, 150, 120);
		
		//버튼
		inputBtn.setBounds(30,180,70,30);
		alteBtn.setBounds(120,180,70,30);
		delBtn.setBounds(210,180,70,30);
		exitBtn.setBounds(300,180,70,30);
		
		//추가
		add(name);
		add(nameField);
		add(age);
		add(ageCombo);
		add(gender);
		add(male);
		add(female);
		add(phone);
		add(phoneField);
		add(jsp);
		add(inputBtn);
		add(alteBtn);
		add(delBtn);
		add(exitBtn);
		
		setSize(420,290);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
