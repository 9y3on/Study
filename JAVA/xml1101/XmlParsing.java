package xml1101;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class XmlParsing {
	
	public XmlParsing() throws JDOMException, IOException {
		//1.Builder 생성
		SAXBuilder sb = new SAXBuilder();
		
		//2.Builder를 사용하여 XML에 접근하고, XML문서 객체(Document)에 저장
		//local 컴퓨터에 존재하는 file -> File 클래스
		//Web Server에 존재하는 file -> URL 클래스
		//Document doc = sb.build(new File("E:/dev/workspace/jsp_prj/src/main/webapp/xml1031/hello.xml"));
		Document doc = sb.build(new URL("http://localhost/jsp_prj/xml1031/hello.xml"));

		//3.최상위 부모 노드 얻기
		Element rootNode = doc.getRootElement();
		
		//4.자식 노드 얻기
		Element msgNode = rootNode.getChild("msg");
		
		//5.노드 명 얻기
		String nodeName = msgNode.getName();
		
		//6.노드 값 얻기
		String nodeValue = msgNode.getText();
		
		System.out.println(nodeName + " / " + nodeValue);
		
		System.out.println(msgNode);
		
	}//XmlParsing

	public static void main(String[] args) {
		try {
			new XmlParsing();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}
