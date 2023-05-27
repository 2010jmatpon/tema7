package Actividad7_4;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ContactosXML {
    public static void main(String[] args) {
        try {
            Document document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();

            // Creación del nodo raíz
            Element listaContactos = document.createElement("contactos");
            document.appendChild(listaContactos);

            // Creamos el primer nodo contacto
            Element Contacto = document.createElement("contacto");
            listaContactos.appendChild(Contacto);

            // Creamos el primer nodo nombre
            Element Nombre = document.createElement("nombre");
            Contacto.appendChild(Nombre);

            // Creamos el primer nodo de texto
            Text nombre = document.createTextNode("Manuel Pellegrini");
            Nombre.appendChild(nombre);

            // Creamos el nodo de dirección
            Element Direccion = document.createElement("direccion");
            Contacto.appendChild(Direccion);

            // Creamos el nodo texto de dirección
            Text direccion = document.createTextNode("Calle Betis nº 17, Sevilla");
            Direccion.appendChild(direccion);

            // Creamos el nodo de teléfono
            Element telefono = document.createElement("telefono");
            Contacto.appendChild(telefono);

            // Creamos el segundo nodo de texto
            Text tel = document.createTextNode("648980990");
            telefono.appendChild(tel);

            // Clases necesarias para la transformación del fichero
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("src/contactos.xml"));

            // Se realiza la transformación de document a fichero
            transformer.transform(source, result);

            System.out.println("Archivo XML creado.");
        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}