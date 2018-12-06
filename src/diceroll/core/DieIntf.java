/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroll.core;

import javax.swing.ImageIcon;



/**
 *
 * @author Dinar
 */
public interface DieIntf {
    
    public ImageIcon getImage();
    
    public void setImage(ImageIcon Image);
        
    public void setValue(int val);
    
    public int getValue();

    
}
