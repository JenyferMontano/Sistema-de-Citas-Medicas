/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.model.doctor;

import com.una.proyectoprogramadoiiv2.model.XmlAdapter;
import com.una.proyectoprogramadoiiv2.utilities.DocumentNormalice;
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author brimo
 */
public class DoctorDAO extends XmlAdapter {
    
    DocumentNormalice xmlDocu;
     public DoctorDAO() throws Exception {
        super("doctores");
        xmlDocu = new DocumentNormalice();
    }
    
      public boolean exist(String id) throws Exception {
        Document doc = xmlDocu.normalizeXMLDoc(this.url);

        NodeList doctorList = doc.getElementsByTagName("doctor");
 
        for (int i = 0; i < doctorList.getLength(); i++) {
            Node doctorNode = doctorList.item(i);
            if (doctorNode.getNodeType() == Node.ELEMENT_NODE) {
                Element doctorElement = (Element) doctorNode;
                
                NodeList idList = doctorElement.getElementsByTagName("id");
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
      
          public boolean add(Doctor doctor) throws Exception {
              try{
        Document doc = xmlDocu.normalizeXMLDoc(this.url);

        Element doct = doc.createElement("doctor");
        Element id = doc.createElement("id");
        Element name = doc.createElement("nombre");
        Element lastName = doc.createElement("apellido");
        Element phone = doc.createElement("telefono");
        Element email = doc.createElement("correo");
        Element direction = doc.createElement("direccion");
        Element birthdate = doc.createElement("nacimiento");
        Element speciality = doc.createElement("especialidad");

        id.appendChild(doc.createTextNode(doctor.getId()));
        name.appendChild(doc.createTextNode(doctor.getName()));
        lastName.appendChild(doc.createTextNode(doctor.getLastName()));
        phone.appendChild(doc.createTextNode(doctor.getPhone()));
        email.appendChild(doc.createTextNode(doctor.getEmail()));
        direction.appendChild(doc.createTextNode(doctor.getDirection()));
        birthdate.appendChild(doc.createTextNode(doctor.getBirthdate().toString()));
        speciality.appendChild(doc.createTextNode(doctor.getSpeciality()));

        doct.appendChild(id);
        doct.appendChild(name);
        doct.appendChild(lastName);
        doct.appendChild(phone);
        doct.appendChild(email);
        doct.appendChild(direction);
        doct.appendChild(birthdate);
        doct.appendChild(speciality);

        NodeList root = doc.getElementsByTagName("doctores");
        root.item(0).appendChild(doct);

        this.transformXML(doc);
        return true;
              }catch(Exception e){
                  
              }
      return false;
    }
          
 public Doctor find(String id) throws Exception {
        Document doc = xmlDocu.normalizeXMLDoc(this.url);

        NodeList doctorList = doc.getDocumentElement().getElementsByTagName("doctor");

            for (int i = 0; i < doctorList.getLength(); i++) {
                Node nodeDoctor = doctorList.item(i);
                if (nodeDoctor.getNodeType() == Node.ELEMENT_NODE) {
                    Element doctorElement = (Element) nodeDoctor;

                    NodeList idList = doctorElement.getElementsByTagName("id");

                        String idText = idList.item(0).getTextContent();
                        if (idText.equals(id)) {
                            String[] data = {
                                doctorElement.getElementsByTagName("id").item(0).getTextContent(),
                                doctorElement.getElementsByTagName("nombre").item(0).getTextContent(),
                                doctorElement.getElementsByTagName("apellido").item(0).getTextContent(),
                                doctorElement.getElementsByTagName("telefono").item(0).getTextContent(),
                                doctorElement.getElementsByTagName("correo").item(0).getTextContent(),
                                doctorElement.getElementsByTagName("direccion").item(0).getTextContent(),
                                doctorElement.getElementsByTagName("nacimiento").item(0).getTextContent(),
                                doctorElement.getElementsByTagName("especialidad").item(0).getTextContent()
                            };
                            Doctor doctor = new Doctor(data);
                            return doctor;
                        }
                    }
                }
        return null;
    }
 
     public boolean update(Doctor doctor, String id) throws Exception {
        Document doc = xmlDocu.normalizeXMLDoc(this.url);
        NodeList list = doc.getElementsByTagName("doctor");

            for (int i = 0; i < list.getLength(); i++) {
                Node listDoctor = list.item(i);
                if (listDoctor.getNodeType() == Node.ELEMENT_NODE) {
                    Element doctorElement = (Element) listDoctor;
                    if (doctorElement.getElementsByTagName("id").item(0).getTextContent().equals(id)) {
                        doctorElement.getElementsByTagName("nombre").item(0).setTextContent(doctor.getName());
                        doctorElement.getElementsByTagName("apellido").item(0).setTextContent(doctor.getLastName());
                        doctorElement.getElementsByTagName("telefono").item(0).setTextContent(doctor.getPhone());
                        doctorElement.getElementsByTagName("correo").item(0).setTextContent(doctor.getEmail());
                        doctorElement.getElementsByTagName("direccion").item(0).setTextContent(doctor.getDirection());
                        doctorElement.getElementsByTagName("nacimiento").item(0).setTextContent(doctor.getBirthdate().toString());
                        doctorElement.getElementsByTagName("especialidad").item(0).setTextContent(doctor.getSpeciality());
                        this.transformXML(doc);
                        return true;
                    }
                }

            }
        return false;
    }
     
         public boolean delete(String id) throws Exception {
        Document doc = xmlDocu.normalizeXMLDoc(this.url);

        NodeList list = doc.getElementsByTagName("doctor");
        if (this.exist(id)) {
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
        }

        return false;

         }
      public ArrayList<Doctor> getAll()throws Exception{
        Document doc = xmlDocu.normalizeXMLDoc(this.url);
        
        ArrayList<Doctor> list = new ArrayList<>();
        NodeList doctorList = doc.getDocumentElement().getElementsByTagName("doctor");
        for(int i=0;i<doctorList.getLength();i++){
            String[] data ={
              doctorList.item(i).getChildNodes().item(0).getTextContent(),
              doctorList.item(i).getChildNodes().item(1).getTextContent(),
              doctorList.item(i).getChildNodes().item(2).getTextContent(),
              doctorList.item(i).getChildNodes().item(3).getTextContent(),
              doctorList.item(i).getChildNodes().item(4).getTextContent(),
              doctorList.item(i).getChildNodes().item(5).getTextContent(),
              doctorList.item(i).getChildNodes().item(6).getTextContent(),
              doctorList.item(i).getChildNodes().item(7).getTextContent()
            };
            
            Doctor doctor = new Doctor(data);
            list.add(doctor);
        }
        return list;
    }
      
         
}
