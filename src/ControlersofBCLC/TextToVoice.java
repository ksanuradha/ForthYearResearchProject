
package ControlersofBCLC;

import java.io.*;
import com.sun.speech.freetts.*;
public class TextToVoice 
{
    public static final String VOICENAME="kevin16";
    public static void englishVoice(String text)
    {
        Voice voice;
        VoiceManager vm=VoiceManager.getInstance();
        voice=vm.getVoice(VOICENAME);
        voice.allocate();
        try 
        {
            voice.speak(text);
        }
        catch (Exception e) 
        {
            
        }
        
    }
}
