package org.tura.metamodel.generation;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.epsilon.egl.formatter.Formatter;
import org.w3c.dom.Document;

public class XmlFormatter implements Formatter {

    @Override
    public String format(String text) {

        String outText = text;
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            ByteArrayInputStream in = new ByteArrayInputStream(text.getBytes());
            Document document = builder.parse(in);
            
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            
            Transformer tform = TransformerFactory.newInstance().newTransformer();
            tform.setOutputProperty(OutputKeys.INDENT, "yes");
            tform.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            tform.transform(new DOMSource(document),new StreamResult(out));
            
            outText = out.toString();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return outText;

    }

}