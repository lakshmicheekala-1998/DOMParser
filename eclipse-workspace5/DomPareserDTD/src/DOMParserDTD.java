import java.io.IOException;
// DOM
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import org.xml.sax.InputSource;



public class DOMParserDTD {

private DOMParserDTD() {}

public static boolean validateWithDTDUsingDOM(String xmlFiles)
throws ParserConfigurationException, IOException
{
try {
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
factory.setValidating(true);
factory.setNamespaceAware(true);

DocumentBuilder builder = factory.newDocumentBuilder();
builder.parse(new InputSource(xmlFiles));
System.out.print("XML files is valid using Dom Parser:");
return true;
}
catch (ParserConfigurationException pce) {
throw pce;
}
catch (IOException io) {
throw io;
}
catch (SAXException se){
return false;
}
}


public static void main (String args[]) throws Exception{

System.out.println(DOMParserDTD.validateWithDTDUsingDOM("C:\\Users\\bhava\\eclipse-workspace5\\DomPareserDTD\\employees1_dtd.xml"));

}
}