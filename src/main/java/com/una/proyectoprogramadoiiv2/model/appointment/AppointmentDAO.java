/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.model.appointment;

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
public class AppointmentDAO extends XmlAdapter{
    
    DocumentNormalice xmlDocu;
    public AppointmentDAO() throws Exception {
        super("citas");
        xmlDocu = new DocumentNormalice();
    }
    
    public boolean exist(String code) throws Exception{
       Document doc = xmlDocu.normalizeXMLDoc(this.url);
        NodeList doctorList = doc.getElementsByTagName("cita"); 

        for (int i = 0; i < doctorList.getLength(); i++) {
            Node doctorNode = doctorList.item(i);
            if (doctorNode.getNodeType() == Node.ELEMENT_NODE) {
                Element doctorElement = (Element) doctorNode;
                
                NodeList idList = doctorElement.getElementsByTagName("codigo");
                if (idList.getLength() > 0) {
                    String idText = idList.item(0).getTextContent();
                    if (idText.equals(code)) {
                        return true;
                    }
                }
            }
        }
         return false;
    }
    
    public boolean add(Appointment ap) throws Exception{
        try{
     Document doc = xmlDocu.normalizeXMLDoc(this.url);
        
        Element apo=doc.createElement("cita");
        
        Element idPat=doc.createElement("idPaciente");
        Element idDoc=doc.createElement("idDoctor");
        Element date=doc.createElement("fecha");
        Element time=doc.createElement("hora");
        Element apCode=doc.createElement("codigo");
        
        idPat.appendChild(doc.createTextNode(ap.getIdPatient()));
        idDoc.appendChild(doc.createTextNode(ap.getIdDoctor()));
        String d = ap.getDate().toString();
        date.appendChild(doc.createTextNode(d));
        time.appendChild(doc.createTextNode(ap.getTime()));
        apCode.appendChild(doc.createTextNode(ap.getAppointmentCode()));
        
        apo.appendChild(idPat);
        apo.appendChild(idDoc);
        apo.appendChild(date);
        apo.appendChild(time);
        apo.appendChild(apCode);
        
        NodeList root=doc.getElementsByTagName("citas");
        root.item(0).appendChild(apo);
        
        this.transformXML(doc);
        return true;
        }catch(Exception e){
            
        }
        return false;
    }
    
    public ArrayList<Appointment> getAll()throws Exception{
        Document doc = xmlDocu.normalizeXMLDoc(this.url);
        
        ArrayList<Appointment> list=new ArrayList<>();
        NodeList appointments=doc.getDocumentElement().getElementsByTagName("cita");
        for(int i=0;i<appointments.getLength();i++){
 
            String[] data = {
            appointments.item(i).getChildNodes().item(0).getTextContent(),
            appointments.item(i).getChildNodes().item(1).getTextContent(),
            appointments.item(i).getChildNodes().item(2).getTextContent(),
            appointments.item(i).getChildNodes().item(3).getTextContent(),
            appointments.item(i).getChildNodes().item(4).getTextContent()
            
        };
            Appointment apo = new Appointment(data);
            list.add(apo);
        }
        return list;
    }
    
    public ArrayList<Appointment> getAppointmentsByPatientId(String patientId) throws Exception {
        Document doc = xmlDocu.normalizeXMLDoc(this.url);

        ArrayList<Appointment> list = new ArrayList<>();
        NodeList appointmentList = doc.getElementsByTagName("cita");

        for (int i = 0; i < appointmentList.getLength(); i++) {
            Node appointmentNode = appointmentList.item(i);
            if (appointmentNode.getNodeType() == Node.ELEMENT_NODE) {
                Element appointmentElement = (Element) appointmentNode;

                NodeList idList = appointmentElement.getElementsByTagName("idPaciente");
                if (idList.getLength() > 0) {
                    String idText = idList.item(0).getTextContent();
                    if (idText.equals(patientId)) {
                        String[] data = {
                            idText,
                            appointmentElement.getElementsByTagName("idDoctor").item(0).getTextContent(),
                            appointmentElement.getElementsByTagName("fecha").item(0).getTextContent(),
                            appointmentElement.getElementsByTagName("hora").item(0).getTextContent(),
                            appointmentElement.getElementsByTagName("codigo").item(0).getTextContent()
                            };
                        Appointment appointment = new Appointment(data);
                        list.add(appointment);
                    }
                }
            }
        }
        return list;
    }     
}
