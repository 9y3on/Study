package kr.co.sist.menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JavaMemo extends JFrame {
	
	public JavaMemo() {
		super("메모장");
		
		JMenuBar jmb = new JMenuBar();
		
		JMenu file = new JMenu("파일");
		JMenu help = new JMenu("도움말");
		
		JMenuItem write = new JMenuItem("새글");
		JMenuItem open = new JMenuItem("열기");
		JMenuItem save = new JMenuItem("저장");
		JMenuItem exit = new JMenuItem("종료");
		JMenuItem info = new JMenuItem("메모장정보");
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta);
		
		file.add(write);
		file.addSeparator();
		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		help.add(info);
		
		jmb.add(file);
		jmb.add(help);
		
		setJMenuBar(jmb);
		
		add(jsp);
		
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
