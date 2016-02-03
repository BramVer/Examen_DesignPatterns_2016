/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_designpattern_2016;

public class State_Without_doubt implements State {
    
    private int count;
    MagicEightBall ball;
    
    public State_Without_doubt(MagicEightBall mEBall) {
        this.ball = mEBall;
        this.count = 3;
    }

    public void askQuestion() {
        System.out.println("Without a doubt.");
    }
    
    public int getCount() {
        return this.count;
    }
}