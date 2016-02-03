/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_designpattern_2016;

public class State_Yes_definitely implements State {
    
    private int count;
    MagicEightBall ball;
    
    public State_Yes_definitely(MagicEightBall mEBall) {
        this.ball = mEBall;
        this.count = 5;
    }

    public void askQuestion() {
        System.out.println("Yes, definitely.");
    }
    
    public int getCount() {
        return this.count;
    }

}
