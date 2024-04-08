package br.ufpb.dcx.rodrigor.atividade;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Person person1 = new Person("Dayanny", 24, "Mamanguape");
        Person person2 = new Person("Ivo", 38, "Mamanguape");

        Aluno aluno1 = new Aluno("Erick", "099881", "2000");
        Aluno aluno2 = new Aluno("Jose", "774421", "1990");

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno1);

        try {
            // salavr par arquivo .xml
          ///  saveToXml("people.xml", people);
            System.out.println("Data saved to people.xml successfully!");
            saveToXml("Aluno.xml", people);
        } catch (ParserConfigurationException | TransformerException | IOException e) {
            e.printStackTrace();
        }
    }


    public static Element createXmlElement(Document doc, Person person) {
        Element personElement = doc.createElement("Person");

        Element nameElement = doc.createElement("Name");
        nameElement.appendChild(doc.createTextNode(person.getName()));
        personElement.appendChild(nameElement);

        Element ageElement = doc.createElement("Age");
        ageElement.appendChild(doc.createTextNode(Integer.toString(person.getAge())));
        personElement.appendChild(ageElement);

        Element addressElement = doc.createElement("Address");
        addressElement.appendChild(doc.createTextNode(person.getAddress()));
        personElement.appendChild(addressElement);

        return personElement;
    }

    public static Element createXmlElement(Document doc, Aluno aluno) {
        return null;
    }

    public static void saveToXml(String filename, List<Person> people) throws ParserConfigurationException, TransformerException, IOException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        Element rootElement = doc.createElement("People");
        doc.appendChild(rootElement);

        for (Person person : people) {
            rootElement.appendChild(createXmlElement(doc, person));
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = null;

        try {
            result = new StreamResult(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        transformer.transform(source, result);
    }
}
