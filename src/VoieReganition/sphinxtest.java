/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package VoieReganition;


import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.linguist.Linguist;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
//import edu.cmu.sphinx.result.Result;

import edu.cmu.sphinx.util.props.ConfigurationManager;
import static edu.cmu.sphinx.util.props.ConfigurationManagerUtils.setProperty;
import edu.cmu.sphinx.util.props.PropertyException;
import java.io.IOException;





public class sphinxtest {


  
     public static void main(String[] args) throws IOException 
     {
        ConfigurationManager cm;


        if (args.length > 0) {
            cm = new ConfigurationManager(args[0]);
        } else {
            cm = new ConfigurationManager(sphinxtest.class.getResource("helloworld.config.xml"));
        }


        Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
        recognizer.allocate();


        // start the microphone or exit if the programm if this is not possible
        Microphone microphone = (Microphone) cm.lookup("microphone");
        if (!microphone.startRecording()) {
            System.out.println("Cannot start microphone.");
            recognizer.deallocate();
            System.exit(0);
        }


        System.out.println("Say: (umma)");

        // loop the recognition until the programm exits.
        while (true) {
            System.out.println("Start speaking. Press Ctrl-C to quit.\n");


            Result result = recognizer.recognize();
                    System.out.println("llllllll");
           
            if (result != null) {
                 
                String resultText = result.getBestFinalResultNoFiller();
                System.out.println("You said: " + resultText + '\n');
              
            } else {
                System.out.println("I can't hear what you said.\n");
            }
        }
        
    }
       
 
}
