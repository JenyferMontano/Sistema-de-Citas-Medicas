/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.view;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author brimo
 */
public class Background extends JDesktopPane{
    private Image image;
    
    public Background(String path){
        this.image=new ImageIcon(path).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0,getWidth() , getHeight(), this); 
        setOpaque(false);
        setBorder(null);
        setBackground(new Color(0,0,0,0));
    }
    
}
