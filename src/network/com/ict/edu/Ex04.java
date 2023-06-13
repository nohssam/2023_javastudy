package network.com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// 파싱 : 구분분석, 문장을 이루고 있는 구성 성분을 분해하고 분해된 성분의 관계를 분석하여 구조를 결정하는 것
//       즉 데이터를 분해 분석하여 원하는 형태로 조립하고, 다시 빼는 과정을 말한다.
// HTML :  Hyper Text MarkUp Language   => 하이퍼 텍스트 마크업 언어
// XML  :  eXtensiable MarkUp Language  => 확장된 마크업 언어
//         사용자가 태그를 만들어서 사용하는 언어
// 태그  :  <시작태그 속성="값" 속성="값"> 텍스트 </끝태그>

// XML 파싱 : xml 구성된 데이너를 원하는 데이터만 추출, 가공하는 것
// DOM(Document Object Modeling) 방식 : 웹 브라우저가 태그를 해석하고 표현하는 방식
public class Ex04 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// 파일 쓰기 
		String pathname = "D:"+File.separator+"njm"+File.separator+"오늘날씨.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			
			is = conn.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg);
			}
			InputSource in = new InputSource(new StringReader(sb.toString()));
			// XML 파싱 : DOM 방식
			DocumentBuilderFactory  factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(in);
			
			// 원하는 태그 찾기 
			NodeList locals =  document.getElementsByTagName("local");
			StringBuffer sb2 = new StringBuffer();
			
			for (int i = 0; i < locals.getLength(); i++) {
			  // 태그의 텍스트 구하기 	
			  String txt = locals.item(i).getFirstChild().getNodeValue();
			  
			  // 속성구하기
			  String attr1 = ((Element)(locals.item(i))).getAttribute("ta");
			  String attr2 = ((Element)(locals.item(i))).getAttribute("desc");
			  
			  sb2.append(txt+"\t");
			  sb2.append(attr1+"\t");
			  sb2.append(attr2+"\n");
			}
			System.out.println("도시\t온도\t상태");
			System.out.println(sb2.toString());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}














