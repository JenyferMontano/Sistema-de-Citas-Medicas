 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.model.patient;

import com.una.proyectoprogramadoiiv2.model.XmlAdapter;
import com.una.proyectoprogramadoiiv2.utilities.DocumentNormalice;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author brimo
 */
public class PatientDAO extends XmlAdapter{
 DocumentNormalice xmlDocu;
 
 public PatientDAO() throws Exception{
        super("pacientes");
        xmlDocu = new DocumentNormalice();
    }
 
 public boolean exist(String id) throws Exception {
    Document doc = xmlDocu.normalizeXMLDoc(this.url);

    NodeList patientList = doc.getElementsByTagName("paciente");

    for (int i = 0; i < patientList.getLength(); i++) {
        Node patientNode = patientList.item(i);
        if (patientNode.getNodeType() == Node.ELEMENT_NODE) {
            Element patientElement = (Element) patientNode;
            

            NodeList idList = patientElement.getElementsByTagName("id");
            if (idList.getLength() > 0) {
                String idText = idList.item(0).getTextContent();
                if (idText.equals(id)) {
                    return true;
                }
            }
        }
    }
    
  return false;
}
 
 public boolean add(Patient patient) throws Exception{
     try{
        Document doc = xmlDocu.normalizeXMLDoc(this.url);  
        
        Element pat = doc.createElement("paciente");
        Element id = doc.createElement("id");
        Element name = doc.createElement("nombre");
        Element lastName = doc.createElement("apellido");
        Element phone = doc.createElement("telefono");
        Element email = doc.createElement("correo");
        Element direction = doc.createElement("direccion");
        Element birthdate = doc.createElement("nacimiento");
        Element pContactE = doc.createElement("personaEmergencia");
        Element tContactE = doc.createElement("telefonoEmergencia");
        
        id.appendChild(doc.createTextNode(patient.getId()));
        name.appendChild(doc.createTextNode(patient.getName()));
        lastName.appendChild(doc.createTextNode(patient.getLastName()));
        phone.appendChild(doc.createTextNode(patient.getPhone()));
        email.appendChild(doc.createTextNode(patient.getEmail()));
        direction.appendChild(doc.createTextNode(patient.getDirection()));
        birthdate.appendChild(doc.createTextNode(patient.getBirthdate().toString()));
        pContactE.appendChild(doc.createTextNode(patient.getpContactEmergency()));
        tContactE.appendChild(doc.createTextNode(patient.gettContactEmergency()));
        
        pat.appendChild(id);
        pat.appendChild(name);
        pat.appendChild(lastName);
        pat.appendChild(phone);
        pat.appendChild(email);
        pat.appendChild(direction);
        pat.appendChild(birthdate);
        pat.appendChild(pContactE);
        pat.appendChild(tContactE);
        
        NodeList root = doc.getElementsByTagName("pacientes");
        root.item(0).appendChild(pat);
        
        this.transformXML(doc);
        return true;
     }catch(Exception e){
         
     }
     return false;
 }
 
public Patient find(String id) throws Exception {
    Document doc = xmlDocu.normalizeXMLDoc(this.url); 
    
    NodeList patientList = doc.getElementsByTagName("paciente");

    for (int i = 0; i < patientList.getLength(); i++) {
        Node patientNode = patientList.item(i);
        if (patientNode.getNodeType() == Node.ELEMENT_NODE) {
            Element patientElement = (Element) patientNode;
            

            NodeList idList = patientElement.getElementsByTagName("id");

                String idText = idList.item(0).getTextContent();
                if (idText.equals(id)) {
                  String[] data = {
                    patientElement.getElementsByTagName("id").item(0).getTextContent(),
                    patientElement.getElementsByTagName("nombre").item(0).getTextContent(),
                    patientElement.getElementsByTagName("apellido").item(0).getTextContent(),
                    patientElement.getElementsByTagName("telefono").item(0).getTextContent(),
                    patientElement.getElementsByTagName("correo").item(0).getTextContent(),
                    patientElement.getElementsByTagName("direccion").item(0).getTextContent(),
                    patientElement.getElementsByTagName("nacimiento").item(0).getTextContent(),
                    patientElement.getElementsByTagName("personaEmergencia").item(0).getTextContent(),
                    patientElement.getElementsByTagName("telefonoEmergencia").item(0).getTextContent()
                    };
                  Patient patient = new Patient(data);
                  return patient;
                }
            }
        }

    return null;
}

public boolean update(Patient patient, String id) throws Exception {
        Document doc = xmlDocu.normalizeXMLDoc(this.url);
        
        NodeList list = doc.getElementsByTagName("paciente");

            for (int i = 0; i < list.getLength(); i++) {
                Node listPatient = list.item(i);
                if (listPatient.getNodeType() == Node.ELEMENT_NODE) {
                    Element patientElement = (Element) listPatient;
                    if (patientElement.getElementsByTagName("id").item(0).getTextContent().equals(id)) {
                        patientElement.getElementsByTagName("nombre").item(0).setTextContent(patient.getName());
                        patientElement.getElementsByTagName("apellido").item(0).setTextContent(patient.getLastName());
                        patientElement.getElementsByTagName("telefono").item(0).setTextContent(patient.getPhone());
                        patientElement.getElementsByTagName("correo").item(0).setTextContent(patient.getEmail());
                        patientElement.getElementsByTagName("direccion").item(0).setTextContent(patient.getDirection());
                        patientElement.getElementsByTagName("nacimiento").item(0).setTextContent(patient.getBirthdate().toString());
                        patientElement.getElementsByTagName("personaEmergencia").item(0).setTextContent(patient.getpContactEmergency());
                        patientElement.getElementsByTagName("telefonoEmergencia").item(0).setTextContent(patient.gettContactEmergency());
                        
                        this.transformXML(doc);
                        return true;

                    }
                }

}
             return false;
}

public boolean delete(String id) throws Exception {
        Document doc = xmlDocu.normalizeXMLDoc(this.url);

        NodeList list = doc.getElementsByTagName("paciente");

            for (int i = 0; i < list.getLength(); i++) {
                Node listDoctor = list.item(i);
                if (listDoctor.getNodeType() == Node.ELEMENT_NODE) {
                    Element doctorElement = (Element) listDoctor;
                    if (doctorElement.getElementsByTagName("id").item(0).getTextContent().equals(id)) {
                        doctorElement.getParentNode().removeChild(doctorElement);
                        this.transformXML(doc);
                        return true;
                    }
                }

            }
        
        return false;
    }
 }
 
 

