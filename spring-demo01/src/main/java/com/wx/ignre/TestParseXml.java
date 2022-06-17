package com.wx.ignre;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/3/15 0:15
 */

public class TestParseXml {

	@Test
	public void parseXml(){
		try {
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document parse = documentBuilder.parse(ClassLoader.getSystemResourceAsStream("student.xml"));
			NodeList student = parse.getElementsByTagName("student");
			for (int i = 0; i < student.getLength(); i++) {
				Node item = student.item(i);

			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			throw new RuntimeException("SAX 解析失败");
			//e.printStackTrace();
		}
	}

}
