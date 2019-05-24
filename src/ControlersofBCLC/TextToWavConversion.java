/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlersofBCLC;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.AudioPlayer;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;
import javax.sound.sampled.AudioFileFormat;
import javax.swing.JOptionPane;

public class TextToWavConversion 
{
    public static void convertEnglishTestToWav(String text) 
    {
        AudioPlayer audioPlayer = null;
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("kevin16");
        voice.allocate();
        String input = JOptionPane.showInputDialog(null, "Enter File Name:", "Language Translator and Braille Converter", JOptionPane.WARNING_MESSAGE);
        audioPlayer = new SingleFileAudioPlayer("C:\\Users\\user pc\\Desktop\\" + input, AudioFileFormat.Type.WAVE);
        voice.setAudioPlayer(audioPlayer);
        voice.speak(text);
        voice.deallocate();
        audioPlayer.close();
    }
}
