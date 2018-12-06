/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroll.core;

/**
 *
 * @author Dinar
 */
public enum PlayerType {
    
    USER("USER"), COMPUTER("COMPUTER");
    
    private final String type;
    
    private PlayerType(String type){
        this.type = type;        
    }
    
    public String getType(){
        return type;
    }
    
}
