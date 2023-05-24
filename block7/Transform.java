package org.example;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
public class Transform {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Transform имя_файла_xsl имя_ффйла_xml");
            System.exit(0);
        }
        File xslFile = new File(args[0]);
        File xmlFile = new File(args[1]);
        StreamSource xslSource = new StreamSource(xslFile);
        StreamSource xmlSource = new StreamSource(xmlFile);
        StreamResult outResult = new StreamResult(System.out);
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(xslSource);
            transformer.transform(xmlSource, outResult);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

