/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_designpattern_2016;

public class State_Ask_later implements State {
    
    private int count;
    private String answer;
    MagicEightBall ball;
    
    public State_Ask_later(MagicEightBall mEBall) {
        this.ball = mEBall;
        this.count = 0;
        answer = "Ask again later.";
    }

   @Override
    public void askQuestion() {
        System.out.println(answer);
        ball.pushAnswer(answer);
    }
    
    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public String getAnswer() {
        return this.answer;
    }
}
