/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlersofBCLC;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

/**
 *
 * @author user pc
 */
public class GetingGuisCentral
{
    public static void centreWindow(Window frame) 
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
}
