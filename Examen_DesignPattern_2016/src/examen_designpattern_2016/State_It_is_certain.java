/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_designpattern_2016;

public class State_It_is_certain implements State {
    
    private int count;
    MagicEightBall ball;
    
    public State_It_is_certain(MagicEightBall mEBall) {
        this.ball = mEBall;
        this.count = 1;
    }

    public void askQuestion() {
        System.out.println("It is certain.");
    }
    
    public int getCount() {
        return this.count;
    }

}
