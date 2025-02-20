/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.view;

import com.una.proyectoprogramadoiiv2.view.appointment.*;
import com.una.proyectoprogramadoiiv2.view.doctor.*;
import com.una.proyectoprogramadoiiv2.view.patient.*;
import com.una.proyectoprogramadoiiv2.view.user.*;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author brimo
 */
public class FrmMain extends javax.swing.JFrame {

    FrmNewUser newUserView;
    FrmModifyUser modifyUserView;
    FrmNewAppointment newAppointmentView;
    FrmDoctor newDoctorView;
    FrmGestorDoctor gestorDoctorView;
    FrmAddPA newPatientView;
    FrmAdmiPA admiPatientView;
    FrmGetAllUsers getAllUsersView;
    FrmGetAppointment getAppointmentsView;
    FrmAbout aboutView;

    public FrmMain() {
        
        initComponents();
        //this.setExtendedState(this.MAXIMIZED_BOTH);
        this.jlImage.setBounds(0, 0, this.getWidth(), this.getHeight());
        this.setAlwaysOnTop(true);
        newUserView = new FrmNewUser();
        this.desktopPane.add(newUserView);
        modifyUserView = new FrmModifyUser();
        this.desktopPane.add(modifyUserView);
        newAppointmentView = new FrmNewAppointment();
        this.desktopPane.add(newAppointmentView);
        newDoctorView = new FrmDoctor();
        this.desktopPane.add(newDoctorView);
        gestorDoctorView = new FrmGestorDoctor();
        this.desktopPane.add(gestorDoctorView);
        newPatientView = new FrmAddPA();
        this.desktopPane.add(newPatientView);
        admiPatientView = new FrmAdmiPA();
        this.desktopPane.add(admiPatientView);
        getAllUsersView = new FrmGetAllUsers();
        this.desktopPane.add(getAllUsersView);
        getAppointmentsView = new FrmGetAppointment();
        this.desktopPane.add(getAppointmentsView);
        aboutView = new FrmAbout();
        this.desktopPane.add(aboutView);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jlImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newUserMenu = new javax.swing.JMenuItem();
        modifyUserMenu = new javax.swing.JMenuItem();
        listUserMenu = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        newPatientMenu = new javax.swing.JMenuItem();
        findPatientMenu = new javax.swing.JMenuItem();
        editMenu1 = new javax.swing.JMenu();
        newDoctorMenu = new javax.swing.JMenuItem();
        findDoctorMenu = new javax.swing.JMenuItem();
        listAppointmentMenu = new javax.swing.JMenu();
        cutMenuItem2 = new javax.swing.JMenuItem();
        copyMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);

        jlImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical center 100x675.png"))); // NOI18N
        jlImage.setMaximumSize(new java.awt.Dimension(0, 0));
        jlImage.setMinimumSize(new java.awt.Dimension(0, 0));
        jlImage.setPreferredSize(new java.awt.Dimension(desktopPane.getWidth(), desktopPane.getHeight()));
        jlImage.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        desktopPane.add(jlImage);
        jlImage.setBounds(0, 0, 1210, 640);

        jButton1.setBackground(new java.awt.Color(205, 23, 25));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane.setLayer(jButton1, javax.swing.JLayeredPane.POPUP_LAYER);
        desktopPane.add(jButton1);
        jButton1.setBounds(1040, 20, 100, 50);

        jButton4.setBackground(new java.awt.Color(205, 23, 25));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Acerca de..");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        desktopPane.setLayer(jButton4, javax.swing.JLayeredPane.POPUP_LAYER);
        desktopPane.add(jButton4);
        jButton4.setBounds(40, 20, 150, 40);

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuBar.setPreferredSize(new java.awt.Dimension(200, 40));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Usuarios");
        fileMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        newUserMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newUserMenu.setMnemonic('o');
        newUserMenu.setText("Agregar");
        newUserMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserMenuActionPerformed(evt);
            }
        });
        fileMenu.add(newUserMenu);

        modifyUserMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        modifyUserMenu.setMnemonic('s');
        modifyUserMenu.setText("Usuarios");
        modifyUserMenu.setToolTipText("");
        modifyUserMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyUserMenuActionPerformed(evt);
            }
        });
        fileMenu.add(modifyUserMenu);

        listUserMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listUserMenu.setMnemonic('x');
        listUserMenu.setText("Listar");
        listUserMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listUserMenuActionPerformed(evt);
            }
        });
        fileMenu.add(listUserMenu);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Pacientes");
        editMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        newPatientMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newPatientMenu.setMnemonic('t');
        newPatientMenu.setText("Agregar");
        newPatientMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatientMenuActionPerformed(evt);
            }
        });
        editMenu.add(newPatientMenu);

        findPatientMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        findPatientMenu.setMnemonic('y');
        findPatientMenu.setText("Pacientes");
        findPatientMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findPatientMenuActionPerformed(evt);
            }
        });
        editMenu.add(findPatientMenu);

        menuBar.add(editMenu);

        editMenu1.setMnemonic('e');
        editMenu1.setText("Doctores");
        editMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        newDoctorMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newDoctorMenu.setMnemonic('t');
        newDoctorMenu.setText("Agregar");
        newDoctorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newDoctorMenuActionPerformed(evt);
            }
        });
        editMenu1.add(newDoctorMenu);

        findDoctorMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        findDoctorMenu.setMnemonic('y');
        findDoctorMenu.setText("Doctores");
        findDoctorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findDoctorMenuActionPerformed(evt);
            }
        });
        editMenu1.add(findDoctorMenu);

        menuBar.add(editMenu1);

        listAppointmentMenu.setMnemonic('e');
        listAppointmentMenu.setText("Citas");
        listAppointmentMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cutMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cutMenuItem2.setMnemonic('t');
        cutMenuItem2.setText("Agendar cita");
        cutMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem2ActionPerformed(evt);
            }
        });
        listAppointmentMenu.add(cutMenuItem2);

        copyMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        copyMenuItem2.setMnemonic('y');
        copyMenuItem2.setText("Ver citas");
        copyMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem2ActionPerformed(evt);
            }
        });
        listAppointmentMenu.add(copyMenuItem2);

        menuBar.add(listAppointmentMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listUserMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listUserMenuActionPerformed
        getAllUsersView.setVisible(true);
    }//GEN-LAST:event_listUserMenuActionPerformed

    private void modifyUserMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyUserMenuActionPerformed
        // TODO add your handling code here:
        modifyUserView.setVisible(true);
        newUserView.setVisible(false);
    }//GEN-LAST:event_modifyUserMenuActionPerformed

    private void cutMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem2ActionPerformed
        // TODO add your handling code here:
        newAppointmentView.setVisible(true);
        
    }//GEN-LAST:event_cutMenuItem2ActionPerformed

    private void findDoctorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findDoctorMenuActionPerformed
        // TODO add your handling code here:
        gestorDoctorView.setVisible(true);
    }//GEN-LAST:event_findDoctorMenuActionPerformed

    private void newDoctorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDoctorMenuActionPerformed
        // TODO add your handling code here:
        newDoctorView.setVisible(true);
    }//GEN-LAST:event_newDoctorMenuActionPerformed

    private void newPatientMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatientMenuActionPerformed
        // TODO add your handling code here:
        newPatientView.setVisible(true);
    }//GEN-LAST:event_newPatientMenuActionPerformed

    private void findPatientMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findPatientMenuActionPerformed
        // TODO add your handling code here:
        admiPatientView.setVisible(true);
    }//GEN-LAST:event_findPatientMenuActionPerformed
                                       
    private void newUserMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserMenuActionPerformed
        // TODO add your handling code here:
        newUserView.setVisible(true);
        modifyUserView.setVisible(false);
    }//GEN-LAST:event_newUserMenuActionPerformed

    private void copyMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem2ActionPerformed
        // TODO add your handling code here:
        getAppointmentsView.setVisible(true);
    }//GEN-LAST:event_copyMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        aboutView.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyMenuItem2;
    private javax.swing.JMenuItem cutMenuItem2;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu editMenu1;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem findDoctorMenu;
    private javax.swing.JMenuItem findPatientMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jlImage;
    private javax.swing.JMenu listAppointmentMenu;
    private javax.swing.JMenuItem listUserMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem modifyUserMenu;
    private javax.swing.JMenuItem newDoctorMenu;
    private javax.swing.JMenuItem newPatientMenu;
    private javax.swing.JMenuItem newUserMenu;
    // End of variables declaration//GEN-END:variables


}
