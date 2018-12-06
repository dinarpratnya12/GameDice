/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroll.controller;

import diceroll.core.*;

/**
 *
 * @author Dinar
 */
public class GameController {
    
    private Player user;
    private Player computer;
    private int maxScore = 100;
    
    public GameController() {
        user = new Player(PlayerType.USER);
        computer = new Player(PlayerType.COMPUTER);
    }
    
    public Player getUser() {
        return user;
    }
    
    public void setUser(Player user) {
        this.user = user;
    }
    
    public Player getComputer(){
        return computer;
    }
    
    public void setComputer(Player computer) {
        this.computer = computer;
    }
    
    public Player getPlayer (PlayerType playerType) {
      switch (playerType) {
        case COMPUTER:
            return computer;
        case USER:
            return user;
    }
        return null;
    }
    
    public Boolean isGameGoingOn() {
        if (computer.getAttempt() > 0 || user.getAttempt() > 0){
            return true;
        }
        return false;
    }
    
    public void setNewGame() {
        user.setCurrentGame(new DiceRollController());
        computer.setCurrentGame(new DiceRollController());
    }
    
    public void setNewZeroReRollGame() {
        user.setCurrentGame(new DiceRollController(1));
        computer.setCurrentGame(new DiceRollController(1));
    }
    
    public boolean checkScore() {
        if (user.getScore() > maxScore || computer.getScore() > maxScore) {
            return Boolean.FALSE;
        }
        else {
            return Boolean.TRUE;
        }
     }
    
    public int getMaxScore() {
        return maxScore;
    }
    
    public void setMaxScore(Integer scoreInt) {
        this.maxScore = scoreInt;
    }
    
}
