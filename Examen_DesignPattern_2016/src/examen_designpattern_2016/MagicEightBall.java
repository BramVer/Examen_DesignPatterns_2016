/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_designpattern_2016;

import java.util.Random;

public class MagicEightBall {
    
    Random rand = new Random();
    private static MagicEightBall ball;
//    
//    State it_is_certain;
//    State is_decidedly_so;
//    State without_doubt;
//    State yes_definitely;
//    State most_likely;
//    State yes;
//    
    private State[] stateArr = new State[6];
    private State state;
    
    public static MagicEightBall getInstance() {
        if(ball == null)
            ball = new MagicEightBall();
        return ball;
    }
    
    public MagicEightBall() {
//        this.it_is_certain = new State_It_is_certain(ball);
//        this.is_decidedly_so = new State_Is_decidedly_so(ball);
//        this.without_doubt = new State_Without_doubt(ball);
//        this.yes_definitely = new State_Yes_definitely(ball);
//        this.most_likely = new State_Most_likely(ball);
//        this.yes = new State_Yes(ball);
        
        for(int i = 0; i < stateArr.length ; i++) 
            
        
        this.state = it_is_certain;
    }
    
    public void askQuestion(String question) {
        state.askQuestion();
    }
    
    private void generateState(String question) {
        int r = rand.nextInt(6);
        
    }

}
