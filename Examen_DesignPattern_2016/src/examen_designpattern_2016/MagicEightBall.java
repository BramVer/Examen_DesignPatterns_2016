/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_designpattern_2016;

import java.util.ArrayList;
import java.util.Random;

public class MagicEightBall {
    
    private static MagicEightBall ball;
//    
//    State it_is_certain;
//    State is_decidedly_so;
//    State without_doubt;
//    State yes_definitely;
//    State most_likely;
//    State yes;
//    
    private State[] stateArr = new State[11];
    private State state;
    
    private ArrayList<String> answers = new ArrayList<String>();
    private ArrayList<String> questions = new ArrayList<String>();
    
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
                
        stateArr[0] = new State_It_is_certain(this);
        stateArr[1] = new State_Is_decidedly_so(this);
        stateArr[2] = new State_Without_doubt(this);
        stateArr[3] = new State_Yes_definitely(this);
        stateArr[4] = new State_Most_likely(this);
        stateArr[5] = new State_Yes(this);
        stateArr[6] = new State_Reply_hazy(this);
        stateArr[7] = new State_Ask_later(this);
        stateArr[8] = new State_Cannot_predict(this);
        stateArr[9] = new State_Dont_count(this);
        stateArr[10] = new State_Very_doubtful(this);
        
        state = stateArr[0];
    }
    
    public void askQuestion(String question) {
        state = generateState(question);
        if( questions.isEmpty() || questions.get(questions.size()-1) != question)
            questions.add(question);
        state.askQuestion();
    }
    
    private State generateState(String question) {
        State temp = stateArr[(int)(Math.random() * stateArr.length)];
        if(questions.contains(question)) {
            while(answers.contains(temp.getAnswer())) {
             temp = stateArr[(int)(Math.random() * stateArr.length)];
             if(answers.size() >= stateArr.length) {
                 answers = new ArrayList<String>();
                 System.out.println("LIMIET BEREIKT");
             }
            }
        }
        
        return temp;
    }
    
    public void pushAnswer(String answer) {
        answers.add(answer);
    }

}
