package xml1101;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import kr.co.sist.member.vo.PersonVO;

public class CreateAttributeXml {
	
	public CreateAttributeXml() throws IOException {
		//1.Builder 생성
		SAXBuilder sb = new SAXBuilder();
		
		//2.문서 객체 생성
		Document doc = new Document();
		
		//3.최상위 노드 생성
		Element rootNode = new Element("persons");
		
		List<PersonVO> list = new ArrayList<PersonVO>();
		list.add(new PersonVO("담곰","농","남자", 7));
		list.add(new PersonVO("짱구","신","남자", 5));
		list.add(new PersonVO("짱아","신","여자", 3));
		list.add(new PersonVO("둥이","흰","남자", 2));
		
		//4.자식 노드 생성
		Element personNode = null;
		Element nameNode = null;
		Attribute genderAttr = null;
		Attribute ageAttr = null;
		
		for(PersonVO pVO : list) {
			personNode = new Element("person");
			nameNode = new Element("name");
			nameNode.setText(pVO.getFirstName());
			
			//Element Class에서 제공하는 속성 추가 method 사용
			nameNode.setAttribute("lastName", pVO.getLastName());
			
			//속성 생성
			genderAttr = new Attribute("gender", pVO.getGender());
			ageAttr = new Attribute("age", String.valueOf(pVO.getAge()));
			
			//노드에 속성 설정
			personNode.setAttribute(genderAttr);
			personNode.setAttribute(ageAttr);
			
			
			//자식노드를 부모노드에 배치
			personNode.addContent(nameNode);
			
			//자식을 가진 부모노드를 최상위 부모노드에 배치
			rootNode.addContent(personNode);
		}
		
		//5.최상위 부모 노드를 문서에 배치
		doc.setRootElement(rootNode);
		
		//6.출력
		XMLOutputter xOut = new XMLOutputter(Format.getPrettyFormat());
		xOut.output(doc, System.out);
		xOut.output(doc, new FileOutputStream(new File("E:/dev/workspace/jsp_prj/src/main/webapp/xml1101/attr.xml")));
	}

	public static void main(String[] args) {
		try {
			new CreateAttributeXml();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
