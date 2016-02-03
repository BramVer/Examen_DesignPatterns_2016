/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_designpattern_2016;

public class State_Is_decidedly_so implements State {
    
    private int count;
    MagicEightBall ball;
    
    public State_Is_decidedly_so(MagicEightBall mEBall) {
        this.ball = mEBall;
        this.count = 0;
    }

    public void askQuestion() {
        System.out.println("It is decidedly so.");
    }
    
    public int getCount() {
        return this.count;
    }

}
