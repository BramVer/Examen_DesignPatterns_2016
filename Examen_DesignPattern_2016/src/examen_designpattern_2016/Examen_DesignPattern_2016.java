
package examen_designpattern_2016;

public class Examen_DesignPattern_2016 {

    public static void main(String[] args) {
        MagicEightBall meb = new MagicEightBall();
        
        System.out.println("Wat is uw vraag aan de alwetende MagicEightBall?");
        String vraag = System.console().readLine();
        
        meb.askQuestion(vraag);
    }
    
}
