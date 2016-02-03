
package examen_designpattern_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examen_DesignPattern_2016 {

    public static void main(String[] args) {
        MagicEightBall meb = new MagicEightBall();
        
        try {
            System.out.println("De magische achtbal groet u!");
            do {
                System.out.println("Hoe luidt uw 'ja/nee-vraag' aan de alwetende MagicEightBall?");
                String vraag = new BufferedReader(new InputStreamReader(System.in)).readLine();
                
                //Loop designed for easier testing, not necessary irl:
                //for(int i = 0; i < 10 ; i++)
                    meb.askQuestion(vraag);
                    
                System.out.println("\nNog een vraag voor de wijze der wijzen? y/n");
            } while ("y".equals(new BufferedReader(new InputStreamReader(System.in)).readLine()));
            System.out.println("De magische achtbal wenst u nog veel succes in toekomstige ondernemingen.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
