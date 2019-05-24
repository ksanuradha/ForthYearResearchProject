package ControlersofBCLC;

import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import javazoom.jl.player.Player;

public class Sound 
{
 static String[] words;
 static String[] tamilWords;
    public static void SinhalaSound(String text) 
    {

        if (text.endsWith("අ")) {//1
            try {
                File fl = new File(".\\src\\Audios\\a-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ආ")) {//2
            try {
                File fl = new File(".\\src\\Audios\\aa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } 
        else if (text.endsWith("ඉ")) //3
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\i-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඊ")) //4
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("උ")) //5
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\u-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඌ") )//6
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\uu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("එ") )//7
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\e-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඒ") )//8
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඔ") )//9
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\0-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඕ") )//10
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\00-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඇ") )//11
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\aaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඈ") )//12
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\aaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඓ") )//13
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඖ") )//14
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\au-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ර්") )//15
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\r-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ර") )//16
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ra-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("රෛ") )//17
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\rai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("රා") )//18
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\raa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("රි") )//19
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ri-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("රී") )//20
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\rii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("රෝ") )//21
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\roo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
          else if (text.endsWith("රො") )//22
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ro-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රෙ") )//23
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ree-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රේ") )//24
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\re-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රු") )//25
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ru-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("රූ") )//26
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ruu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රූ") )//26
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ruu-Part 2_1.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රැ") )//27
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\raaa-Part 2_1.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රෑ") )//28
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\raaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රෟ") )//29 okkkkk
        {
            try 
            {
                File fl = new File("\\src\\Audios\\rau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        ////////////////////////////Start newly//////////////////////////////
        else if (text.endsWith("න") )//30noooo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\na-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නා") )//31
        {
            try 
            {
                File fl = new File("\\src\\Audios\\naa-Part 2_1.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නි") )//32ok
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ni-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නී") )//33
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නෝ") )//34 noo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\noo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නො") )//35 no
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\no-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නෙ") )//36
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ne-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නේ") )//37
        {
            try 
            {
                File fl = new File("\\src\\Audios\\nee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නෛ") )//38 nai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නු") )//39 nu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නූ") )//40 nuuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nuuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නැ") )//41 naaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\naaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        //////////////////////////////////////////////////////////////// NEW ONE
        else if (text.endsWith("නෑ") )//41 naaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\naaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නෟ") )//42 nau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("න්") )//43 n did
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\n-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        ////////////////////////////////HAAAAA START HERE ///////////////////
        else if (text.endsWith("හ්") )//44 h
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\h-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හ") )//45 ha
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ha-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හා") )//46 haa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\haa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හි") )//47 hi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\hi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හී") )//48 hii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\hii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හී") )//49 ho
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ho-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හෝ") )//50 hoo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\hoo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හෙ") )//51 he
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\he-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හේ") )//52 hee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\hee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හෛ") )//53 hai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\hai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හු") )//54 hu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\hu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හූ") )//55 huu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\huu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හැ") )//56 haaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\haaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }else if (text.endsWith("හෑ") )//57 haaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\haaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("හෟ") )//58 hau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\hau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        ////////////////////////////KKKKKKKKKKKKKKKKKKKKK////////////////////////////////
        else if (text.endsWith("ක්") )//59 k
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\k-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ක") )//60 ka
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ka-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කා") )//61 kaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කි") )//62 ki
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ki-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කී") )//63 kii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කො") )//64 ko
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ko-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කෝ") )//65 koo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\koo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කෙ") )//66 ke
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ke-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කේ") )//67 kee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කෛ") )//68 kai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කු") )//69 ku
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ku-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කූ") )//70 kuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කැ") )//71 kaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කෑ") )//72 kaaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kaaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("කෟ") )//73 kau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("kra") )//74 kra
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kra-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("kraa") )//75 kraa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kraa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("kraaa") )//76 kraaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kraaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("kraaa") )//77 kraaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kraaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("kraaaa") )//78 kraaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kraaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("krau") )//79 krau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\krau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("kre") )//80 kre
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kre-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("kree") )//81 kree
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kree-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("kri") )//82 kri
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kri-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("krii") )//83 krii
        {
            try 
            {
                File fl = new File(".\\src\\udios\\krii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("kro") )//84 kro
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kro-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("kroo") )//85 kroo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\kroo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        ////////////////////////////////////start/////////////////////////////////////////
        else if (text.endsWith("ග්") )//86 g
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\g-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ග") )//87 ga_
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ga-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගා") )//88 gaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\gaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගි") )//89 gi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\gi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගී") )//90 gii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\gii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගො") )//91 go
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\go-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගෝ") )//92 goo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\goo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගෙ") )//93 ge
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ge-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගේ") )//94 gee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\gee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගෛ") )//95 gai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\gai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගු") )//96 gu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\gu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගූ") )//97 guu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\guu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගැ") )//98 ge
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ge-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගෑ") )//99 gee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\gee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ගෟ") )//100 gau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\gau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("grii") )//101 grii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\grii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("gra") )//102
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\gra-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("graa") )//103
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\graa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("graaa") )//104
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\graaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("graaaa") )//105
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\graaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("grau") )//106
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\grau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("groo") )//107
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\groo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("graaa") )//108
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\graaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        //////////////////////////////////////////FIN GAAA?????? START CHA/////////////////
        else if (text.endsWith("ච්") )//109 ch
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ch-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ච") )//110 cha
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\cha-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("චා") )//111 chaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("චි") )//112 chi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("චී") )//113 chii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("චො") )//14 cho
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\cho-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("චෝ") )//15 choo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\choo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("චෙ") )//16 che
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\che-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("චේ") )//17 chee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("චු") )//18 chu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("චූ") )//19 chuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("චැ") )//20 chaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("චෑ") )//21 chaaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chaaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("චෟ") )//22 chau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("chra") )//23
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chra-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("chai") )//24
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("chraa") )//25
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chraa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("chraaa") )//26
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chraaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("chraaaa") )//27
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chraaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("chrau") )//28
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chrau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("chree") )//29
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chree-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("chri") )//30 chri
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chri-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("chrii") )//31 chrii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chrii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("chro") )//32 chro
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chro-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("chroo") )//33 chroo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\chroo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        /////////////////////////////////////////////////////////
        else if (text.endsWith("ජ්") )//34 j
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\j-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජ") )//35 ja
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ja-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජා") )//36 jaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\jaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජි") )//37 ji
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ji-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජී") )//38 jii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\jii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජො") )//39 jo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\jo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජෝ") )//40 joo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\joo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජෙ") )//41 je
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\je-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජේ") )//42 jee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\jee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජු") )//43 ju
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ju-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජූ") )//44 juu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\juu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජැ") )//45 jaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\jaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජෑ") )//46 jaaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\jaaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ජෟ") )//47 jai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\jai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("jre") )//48 jre
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\jre-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("jree") )//49 jree
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\jree-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("jro") )//50 jro
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\jro-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("jroo") )//51 jroo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\jroo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("jrau") )//52 jrau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\jrau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        //////////////////////////////////TA/////////////////////////////
        else if (text.endsWith("ට") )//53 ta
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ta-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ට්") )//54 t
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\t-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටා") )//55 taa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\taa-Part 4.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටි") )//56 ti
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ti-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටී") )//57 tii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටො") )//58 to
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\to-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටෝ") )//59 too
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\too-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටෙ") )//60 te
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\te-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටේ") )//61 tee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටෛ") )//62 tai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("tre") )//63 tre
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tre-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("tree") )//64
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tree-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("tro") )//65
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tro-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("troo") )//66
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\troo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටු") )//67 tu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටූ") )//68 tuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටැ") )//69 taaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\taaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටෑ") )//70 taaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\taaaa-Part 4.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ටෟ") )//71 tau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        ////////////////////////////////////////FIN TA/ START DA//////////////////////
        else if (text.endsWith("ඩ") )//72 da
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\da-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩා") )//73 daa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\daa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩි") )//74 di
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\di-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩී") )//75 dii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩො") )//76 do
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\do-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩෝ") )//77  doo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\doo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩෙ") )//78 de
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\de-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩේ") )//79 dee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩෛ") )//80 dai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩු") )//81du
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\du-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩූ") )//82duu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\duu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩැ") )//83daaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\daaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩෑ") )//84 daaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\daaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඩෟ") )//85 dau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ණ්") )//86 n
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\n-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ණ") )//87 na
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\na-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ණා") )//88 naa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\naa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ණි") )//89 ni
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ni-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ණී") )//90 nii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        ////////////////////////////////////FIN//////////////////////
        else if (text.endsWith("ණො") )//96 no_Part_2
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\no-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
  else if (text.endsWith("ණෝ") )//91 noo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\noo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ණෙ") )//92 ne
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ne-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ණේ") )//93 nee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ණෛ") )//94 nai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ණු") )//95 nu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ණූ") )//96 nuuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nuuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ණැ") )//97 naaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\naaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ණෑ") )//98 naaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\naaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ණෟ") )//99 nau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         /////////////////////FIN NAAA?///////////////////
         else if (text.endsWith("ත්") )//100 th
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\th-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ත") )//1 tha
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tha-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("තා") )//2 thaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ති") )//3thi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("තී") )//4 thii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("තො") )//5tho
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tho-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("තෝ") )//6thoo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thoo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("තෙ") )//7 de
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\de-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("තේ") )//8 dee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dee-Part 2_1.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("තෛ") )//9 thai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("තු") )//10 thu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("තූ") )//11 thuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("තැ") )//12 thaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("තෑ") )//13 thaaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thaaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("තෟ") )//14 thau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ත්‍ර") )//15 thra
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thra-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("thraa") )//16 thraa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thraa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("thraaa") )//17 thraaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thraaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("thre") )//18 thre
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thre-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("thri") )//19 thri
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thri-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("thrii") )//20 thrii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thrii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("thro") )//21 thro
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thro-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("throo") )//22 throo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\throo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ද්") )//23//////////////////////STAR DH// dh
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dh-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ද") )//24 dha
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dha-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("දා") )//25 dhaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhaa-Part 4.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("දි") )//26 dhi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("දී") )//27 dhii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("දො") )//28 dho
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dho-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("දෝ") )//29 dhoo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhoo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("දෙ") )//30 dhe
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhe-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("දේ") )//31 dhee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("දෛ") )//32 dhai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("දැ") )//33 dhaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("දෑ") )//34 dhaaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhaaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("දdra") )//35 dhra
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhra-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("draa") )//36 dhraa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhraa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("dhraaa") )//37 dhraaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhraaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("dhraaaa") )//38 dhraaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhraaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("dhree") )//39 dhree
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhree-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("dhri") )//40 dhri
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhri-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("dhrii") )//41 dhrii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhrii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("dhro") )//42 dhro
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhro-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("dhroo") )//43 dhroo_
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhroo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
            
            ///////////////////////////////ALL FIN UP to THIS POINT /////////////////////////////////
        }
         else if (text.endsWith("ප්") )//44p
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\p-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ප") )//45pa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("පා") )//46paa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\paa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("පි") )//47pi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("පී") )//48pii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("පො") )//po
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\po-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("පෝ") )//poo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\poo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("පෙ") )//pe
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pe-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("පේ") )//pee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("පෛ") )//pai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("පු") )//pu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("පූ") )//puu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\puu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("පැ") )//paaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\paaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("පෑ") )//paaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\paaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("පෟ") )//pau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ප්‍ර") )//pra
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pra-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("praa") )//60 praa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\praa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("praaa") )//praaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\praaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("praaaa") )//praaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\praaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("pre") )//pre
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pre-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("pre") )//pree
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pree-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("pri") )//pri
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pri-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("prii") )//prii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\prii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("pro") )//pro
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\pro-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("proo") )//proo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\proo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        ////////////////////////////START BBB////////////////////////////////////////
        else if (text.endsWith("බ්") )//b 69
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\b-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("බ") )//ba
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ba-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("බා") )//baa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\baa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("බි") )//72bi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\bi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("බී") )//bii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\bii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("බො") )//bo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\bo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("බෝ") )//boo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\boo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("බෙ") )//be
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\be-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("බෛ") )//bai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\bai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("බැ") )//baaa 78
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\baaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("bra") )//bra
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\bra-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("braa") )//braa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\braa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("bre") )//bre
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\bre-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("bree") )//bree
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\bree-Part 3.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("bri") )//bri
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\bri-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("brii") )//brii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\brii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("bro") )//bro
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\bro-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("broo") )//broo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\broo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        /////////////////MMMMMMMMMMMMMMMMMMMMM//////////
        else if (text.endsWith("ම්") )//87  m
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\m-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ම") )//ma
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ma-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මා") )//maa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\maa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මි") )//mi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\mi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මී") )//mii 91
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\mii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මො") )//mo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\mo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මෝ") )//moo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\moo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මෙ") )//me
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\me-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මේ") )//mee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\mee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මෛ") )//mai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\mai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මු") )//mu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\mu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මූ") )//muu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\muu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මැ") )//me
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\me-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මෑ") )//mee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\mee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("මෟ") )//mau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\mau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (text.endsWith("ෆ") )//1 fa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\fa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆා") )//faa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\faa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆි") )//fi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\fi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆී") )//fii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\fii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆො") )//foo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\foo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆෝ") )//foo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\foo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆෙ") )//fe
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\fe-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆේ") )//fee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\fee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆෛ") )//fai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\fai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆු") )//fu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\fu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆූ") )//fuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\fuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆැ") )//faaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\faaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆෑ") )//faaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\faaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෆෟ") )//fau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\fau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        //////////////////////////////////////////YYYYYYYYYYYYYY////////////////
        else if (text.endsWith("ය්") )//y
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\y-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ය") )//ya
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ya-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යා") )//yaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\yaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යි") )//yi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\yi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යී") )//yii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\yii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යො") )//yo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\yo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යෝ") )//yoo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\yoo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යෙ") )//ye
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ye-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යේ") )//yee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\yee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යෛ") )//yai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\yai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යු") )//yu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\yu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යූ") )//yuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\yuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යැ") )//yaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\yaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යෑ") )//yaaaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\yaaaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("යෟ") )//yau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\yau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        //////////////////////////////////////////////////////////////////////////////////
        else if (text.endsWith("ල්") )//30 l
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\l-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ල") )//la
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\la-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ලා") )//laa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\laa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ලි") )//li
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\li-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ලී") )//lii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\lii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ලො") )//lo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\lo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ලෝ") )//loo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\loo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ලෙ") )//le
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\le-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ලේ") )//lee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\lee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ලෛ") )//lai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\lai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        
                else if (text.endsWith("ලු") )//lu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\lu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
                else if (text.endsWith("ලූ") )//luu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\luu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
                else if (text.endsWith("ලැ") )//laaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\laaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
                else if (text.endsWith("ලෑ") )//laaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\laaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
                else if (text.endsWith("ලෟ") )//lau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\lau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
                else if (text.endsWith("ළ්") )//l
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\l-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
                
        else if (text.endsWith("ළ") )//la
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\la-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ළා") )//laa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\laa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ළි") )//li
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\li-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ළී") )//lii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\lii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ළො") )//lo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\lo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ළෝ") )//loo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\loo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ළෙ") )//le
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\le-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ළේ") )//lee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\lee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ළෛ") )//lai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\lai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ළැ") )//laaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\laaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ළෑ") )//laaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\laaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ළෟ") )//lau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\lau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }//////////////////////////////VVVVVVVVVVVVVv/////////////////////////////////
        else if (text.endsWith("ව්") )//58v
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\v-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ව") )//va
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\va-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වා") )//vaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\vaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වි") )//vi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\vi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වී") )//vii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\vii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වො") )//vo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\vo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වෝ") )//voo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\voo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වෙ") )//ve
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ve-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වේ") )//vee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\vee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වෛ") )//vai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\vai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වු") )//vu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\vu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වූ") )//vuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\vuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වැ") )//vaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\vaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වෑ") )//vaaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\vaaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("වෟ") )//vau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\vau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }/////////////////////////////////////////////////////////////////////////////////////////////////////////
        else if (text.endsWith("ෂ්") )//73 sh
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\sh-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂ") )//sha
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\sha-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂා") )//shaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂි") )//shi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂී") )//shii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂො") )//sho78
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\sho-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂෝ") )//shoo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shoo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂෙ") )//she
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\she-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂේ") )//shee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂෛ") )//shi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂු") )//shu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂූ") )//shuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂැ") )//shaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂෑ") )//shaaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shaaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ෂෟ") )//shau   87
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ස්") )//s
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\s-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ස") )//sa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\sa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සා") )//saa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\saa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සි") )//si
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\si-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සී") )//sii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\sii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සො") )//so
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\so-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සෝ") )//sooo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\soo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සෙ") )//se
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\se-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සේ") )//see
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\see-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සෛ") )//sai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\sai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සු") )//su
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\su-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සූ") )//suu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\suu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සැ") )//saaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\saaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සෑ") )//saaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\saaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("සෟ") )//sau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\sau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශ්") )//sh
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\sh-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශ") )//sha
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\sha-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශා") )//shaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශි") )//shi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශී") )//shii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශ්‍රී") )///shri
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shri-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශො") )//sho
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\sho-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශෝ") )//shoo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shoo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශෙ") )//she
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\she-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශේ") )//shee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශෛ") )//shai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශු") )//shu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශූ") )//shuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශැ") )//shaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශෑ") )//shaaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shaaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ශෟ") )//shau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\shau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        ////////////////////////////////////////////////////////////////////////////////////////
        else if (text.endsWith("ඞ්") )//d
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\d-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞ") )//da
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\da-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞා") )//daa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\daa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞි") )//di
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\di-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞී") )//dii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞො") )//do
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\do-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞෝ") )//doo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\doo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞෙ") )//de
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\de-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞේ") )//dee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞු") )//du
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\du-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞූ") )//duu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\duu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞැ") )//daaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\daaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞෑ") )//daaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\daaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඞෟ") )//dau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඟ්") )//g///////////////////////////////////////////////////////////////////////
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\g-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඳ්") )//dh
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dh-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඳ") )//dha35
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dha-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඳා") )//dhaa ok
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhaa-Part 4.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }//////////////////////////////////////////////////////////
        else if (text.endsWith("ඳි") )//dhi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඳී") )//dhii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඳො") )//dho
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dho-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("දෝ") )//dhoo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhoo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඳෙ") )//dhe
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhe-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඳේ") )//dhee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\dhee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඳැ") )//daaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\daaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඳෑ") )//daaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\daaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඹා") )//baaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\baaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඹි") )//bi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\bi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඹො") )//bo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\bo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඹෝ") )//boo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\boo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඹෙ") )//be
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\be-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඹැ") )//boo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\boo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඨ්") )//t_  200
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\t-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඨ") )//ta
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ta-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }else if (text.endsWith("ඨා") )//taa202
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\taa-Part 4.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඨි") )//ti
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ti-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඨී") )//tii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඨො") )//to
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\to-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඨෝ") )//too
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\too-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඨෙ") )//te
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\te-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        
        else if (text.endsWith("ඨේ") )//te
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\te-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඨු") )//205 tu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඨූ") )//tuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඨැ") )//taaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\taaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඨෑ") )//taaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\taaaa-Part 4.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථ්") )//th
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\th-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථ") )//tha
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tha-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථා") )//thaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථි") )//thi
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථී") )//thii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථො") )//tho
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\tho-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථෝ") )//thoo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thoo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථෙ") )//the
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\the-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථේ") )//thee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථු") )//thu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථූ") )//thuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථැ") )//thaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ථෑ") )//thaaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\thaaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        /////////////////////////////////////////////
        else if (text.endsWith("") )
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\space.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }//////////////////////////////////////////////////////////////
        else if (text.endsWith("අ") )//1a
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\a-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ආ") )//aa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\aa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඉ") )//i
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\i-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඊ") )//ii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("උ") )//u
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\u-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඌ") )//uu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\uu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("එ") )//e
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\e-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඒ") )//ee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඔ") )//o
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\0-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඕ") )//oo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\00-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඇ") )//aaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\aaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඈ") )//aaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\aaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඓ") )//ai
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ඖ") )//au
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\au-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ර්") )//r
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\r-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ර") )//ra
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ra-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රා") )//raa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\raa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රි") )//ri
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ri-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රී") )//rii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\rii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රෝ") )//roo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\roo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රො") )//ro
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ro-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රෙ") )//ree
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ree-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රේ") )//re
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\re-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රු") )//ru
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ru-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රූ") )//ruu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ruu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රැ") )//raaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\raaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("රෑ") )//raaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\raaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("න") )//na
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\na-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        
        else if (text.endsWith("නා") )//naa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\naa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නි") )//ni
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ni-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නී") )//nii
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නෝ") )//nooo
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\noo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නො") )//no
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\no-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නෙ") )//ne
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\ne-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        
        else if (text.endsWith("නේ") )//nee
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නු") )//nu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නූ") )//nuuu
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nuuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("නැ") )//naaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\naaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("නෑ") )//naaaa
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\naaaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("නෟ") )//nau
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\nau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("න්") )//n
        {
            try 
            {
                File fl = new File(".\\src\\Audios\\n-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }            
    }
    public static void prepareSound(String pp) 
    {
        pp = pp.replace("D9", "");
        pp = pp.replace(".", " *");
        pp = pp.replace(",", " *");
        pp = pp.replace(" ", " *");
        pp = pp.replace("අ", "අ*");
        pp = pp.replace("ආ", "ආ*");
        pp = pp.replace("ඉ", "ඉ*");
        pp = pp.replace("ඊ", "ඊ*");

        pp = pp.replace("උ", "උ*");
        pp = pp.replace("ඌ", "ඌ*");

        pp = pp.replace("එ", "එ*");
        pp = pp.replace("ඒ", "ඒ*");

        pp = pp.replace("ඔ", "ඔ*");
        pp = pp.replace("ඕ", "ඕ*");

        pp = pp.replace("ඇ", "ඇ*");
        pp = pp.replace("ඈ", "ඈ*");

        pp = pp.replace("ඓ", "ඓ*");
        pp = pp.replace("අ*ඉ*", "ඓ*");
        pp = pp.replace("ඖ", "ඖ*");

        pp = pp.replace("ර", "ර*");
        pp = pp.replace("ර*ි", "රි*");
        pp = pp.replace("ර*ී", "රී*");
        pp = pp.replace("ර*ෝ ", "රෝ*");
        pp = pp.replace("ර*ො", "රො*");
        pp = pp.replace("ර*ෙ", "රෙ*");

        pp = pp.replace("ර*ේ", "රේ*");

        pp = pp.replace("ර*ු", "රු*");
        pp = pp.replace("ර*ූ", "රූ*");
        pp = pp.replace("ර*ැ", "රැ*");
        pp = pp.replace("ර*ෑ", "රෑ*");
        pp = pp.replace("ර*ෟ", "රෟ*");
        pp = pp.replace("ර*ා", "රා*");
        pp = pp.replace("ර*්", "ර්*");

        pp = pp.replace("න", "න*");
        pp = pp.replace("න*්", "න්*");
        pp = pp.replace("න*ා", "නා*");
        pp = pp.replace("න*ි", "නි*");
        pp = pp.replace("න*්‍ර", "න්‍ර*");
        pp = pp.replace("න*ී", "නී*");
        pp = pp.replace("න*ෝ", "නෝ*");
        pp = pp.replace("න*ො", "නො*");
        pp = pp.replace("න*ෙ", "නෙ*");
        pp = pp.replace("න*ේ", "නේ*");
        pp = pp.replace("න*ෛ", "නෛ*");
        pp = pp.replace("න*ු", "නු*");
        pp = pp.replace("න*ූ", "නූ*");
        pp = pp.replace("න*ැ", "නැ*");
        pp = pp.replace("න*ෑ", "නෑ*");
        pp = pp.replace("න*ෟ", "නෟ*");

        pp = pp.replace("ං", "ං*");

        pp = pp.replace("හ", "හ*");
        pp = pp.replace("හ*්", "හ්*");
        pp = pp.replace("හ*ා", "හා*");
        pp = pp.replace("හ*ි", "හි*");
        pp = pp.replace("හ*ී", "හී*");
        pp = pp.replace("හ*ො", "හො*");
        pp = pp.replace("හ*ෝ", "හෝ*");
        pp = pp.replace("හ*ෙ", "හෙ*");
        pp = pp.replace("හ*ේ", "හේ*");
        pp = pp.replace("හ*ෛ", "හෛ*");
        pp = pp.replace("හ*ු", "හු*");
        pp = pp.replace("හ*ූ", "හූ*");
        pp = pp.replace("හ*ැ", "හැ*");
        pp = pp.replace("හ*ෑ", "හෑ*");
        pp = pp.replace("හ*ෟ", "හෟ*");

        pp = pp.replace("ක", "ක*");
        pp = pp.replace("ක*්", "ක්*");
        pp = pp.replace("ක*ා", "කා*");
        pp = pp.replace("ක*ි", "කි*");
        pp = pp.replace("ක*ී", "කී*");
        pp = pp.replace("ක*ො", "කො*");
        pp = pp.replace("ක*ෝ", "කෝ*");
        pp = pp.replace("ක*ෙ", "කෙ*");
        pp = pp.replace("ක*ේ", "කේ*");
        pp = pp.replace("ක*ෛ", "කෛ*");
        pp = pp.replace("ක*ු", "කු*");
        pp = pp.replace("ක*ූ", "කූ*");
        pp = pp.replace("ක*ැ", "කැ*");
        pp = pp.replace("ක*ෑ", "කෑ*");
        pp = pp.replace("ක*ෟ", "කෟ*");
        pp = pp.replace("ක*්‍ර", "ක්‍ර*");

        pp = pp.replace("ග", "ග*");
        pp = pp.replace("ග*්", "ග්*");
        pp = pp.replace("ග*ා", "ගා*");
        pp = pp.replace("ග*ි", "ගි*");
        pp = pp.replace("ග*ී", "ගී*");
        pp = pp.replace("ග*ො", "ගො*");
        pp = pp.replace("ග*ෝ", "ගෝ*");
        pp = pp.replace("ග*ෙ", "ගෙ*");
        pp = pp.replace("ග*ේ", "ගේ*");
        pp = pp.replace("ග*ෛ", "ගෛ*");
        pp = pp.replace("ග*ු", "ගු*");
        pp = pp.replace("ග*ූ", "ගූ*");
        pp = pp.replace("ග*ැ", "ගැ*");
        pp = pp.replace("ග*ෑ", "ගෑ*");
        pp = pp.replace("ග*ෟ", "ගෟ*");
        pp = pp.replace("ග*්‍ර", "ග්‍ර*");

        pp = pp.replace("ච", "ච*");
        pp = pp.replace("ච*්", "ච්*");
        pp = pp.replace("ච*ා", "චා*");
        pp = pp.replace("ච*ි", "චි*");
        pp = pp.replace("ච*ී", "චී*");
        pp = pp.replace("ච*ො", "චො*");
        pp = pp.replace("ච*ෝ", "චෝ*");
        pp = pp.replace("ච*ෙ", "චෙ*");
        pp = pp.replace("ච*ේ", "චේ*");
        pp = pp.replace("ච*ෛ", "චෛ*");
        pp = pp.replace("ච*ු", "චු*");
        pp = pp.replace("ච*ූ", "චූ*");
        pp = pp.replace("ච*ැ", "චැ*");
        pp = pp.replace("ච*ෑ", "චෑ*");
        pp = pp.replace("ච*ෟ", "චෟ*");
        pp = pp.replace("ච*්‍ර", "ච්‍ර*");

        pp = pp.replace("ජ", "ජ*");
        pp = pp.replace("ජ*්", "ජ්*");
        pp = pp.replace("ජ*ා", "ජා*");
        pp = pp.replace("ජ*ි", "ජි*");
        pp = pp.replace("ජ*ී", "ජී");
        pp = pp.replace("ජ*ො", "ජො*");
        pp = pp.replace("ජ*ෝ", "ජෝ*");
        pp = pp.replace("ජ*ෙ", "ජෙ*");
        pp = pp.replace("ජ*ේ", "ජේ*");
        pp = pp.replace("ජ*ෛ", "ජෛ*");
        pp = pp.replace("ජ*ු", "ජු*");
        pp = pp.replace("ජ*ූ", "ජූ*");
        pp = pp.replace("ජ*ැ", "ජැ*");
        pp = pp.replace("ජ*ෑ", "ජෑ*");
        pp = pp.replace("ජ*ෟ", "ජෟ*");
        pp = pp.replace("ජ*්‍ර", "ජ්‍ර*");

        pp = pp.replace("ට", "ට*");
        pp = pp.replace("ට*්", "ට්*");
        pp = pp.replace("ට*ා", "ටා*");
        pp = pp.replace("ට*ි", "ටි*");
        pp = pp.replace("ට*ී", "ටී*");
        pp = pp.replace("ට*ො", "ටො*");
        pp = pp.replace("ට*ෝ", "ටෝ*");
        pp = pp.replace("ට*ෙ", "ටෙ*");
        pp = pp.replace("ට*ේ", "ටේ*");
        pp = pp.replace("ට*ෛ", "ටෛ*");
        pp = pp.replace("ට*ු", "ටු*");
        pp = pp.replace("ට*ූ", "ටූ*");
        pp = pp.replace("ට*ැ", "ටැ*");
        pp = pp.replace("ට*ෑ", "ටෑ*");
        pp = pp.replace("ට*ෟ", "ටෟ*");
        pp = pp.replace("ට*්‍ර", "ට්‍ර*");

        pp = pp.replace("ඩ", "ඩ*");
        pp = pp.replace("ඩ*්", "ඩ්*");
        pp = pp.replace("ඩ*ා", "ඩා*");
        pp = pp.replace("ඩ*ි", "ඩි*");
        pp = pp.replace("ඩ*ී", "ඩී*");
        pp = pp.replace("ඩ*ො", "ඩො*");
        pp = pp.replace("ඩ*ෝ", "ඩෝ*");
        pp = pp.replace("ඩ*ෙ", "ඩෙ*");
        pp = pp.replace("ඩ*ේ", "ඩේ*");
        pp = pp.replace("ඩ*ෛ", "ඩෛ*");
        pp = pp.replace("ඩ*ු", "ඩු*");
        pp = pp.replace("ඩ*ූ", "ඩූ*");
        pp = pp.replace("ඩ*ැ", "ඩැ*");
        pp = pp.replace("ඩ*ෑ", "ඩෑ*");
        pp = pp.replace("ඩ*ෟ", "ඩෟ*");
        pp = pp.replace("ඩ*්‍ර", "ඩ්‍ර*");

        pp = pp.replace("ණ", "ණ*");
        pp = pp.replace("ණ*්", "ණ්*");
        pp = pp.replace("ණ*ා", "ණා*");
        pp = pp.replace("ණ*ි", "ණි*");
        pp = pp.replace("ණ*ී", "ණී*");
        pp = pp.replace("ණ*ො", "ණො*");
        pp = pp.replace("ණ*ෝ", "ණෝ*");
        pp = pp.replace("ණ*ෙ", "ණෙ*");
        pp = pp.replace("ණ*ේ", "ණේ*");
        pp = pp.replace("ණ*ෛ", "ණෛ*");
        pp = pp.replace("ණ*ු", "ණු*");
        pp = pp.replace("ණ*ූ", "ණූ*");
        pp = pp.replace("ණ*ැ", "ණැ*");
        pp = pp.replace("ණ*ෑ", "ණෑ*");
        pp = pp.replace("ණ*ෟ", "ණෟ*");

        pp = pp.replace("ත", "ත*");
        pp = pp.replace("ත*්", "ත්*");
        pp = pp.replace("ත*ා", "තා*");
        pp = pp.replace("ත*ි", "ති*");
        pp = pp.replace("ත*ී", "තී*");
        pp = pp.replace("ත*ො", "තො*");
        pp = pp.replace("ත*ෝ", "තෝ*");
        pp = pp.replace("ත*ෙ", "තෙ*");
        pp = pp.replace("ත*ේ", "තේ*");
        pp = pp.replace("ත*ෛ", "තෛ*");
        pp = pp.replace("ත*ු", "තු*");
        pp = pp.replace("ත*ූ", "තූ*");
        pp = pp.replace("ත*ැ", "තැ*");
        pp = pp.replace("ත*ෑ", "තෑ*");
        pp = pp.replace("ත*ෟ", "තෟ*");
        pp = pp.replace("ත*්‍ර", "ත්‍ර*");


        pp = pp.replace("ද", "ද*");
        pp = pp.replace("ද*්", "ද්*");
        pp = pp.replace("ද*ා", "දා*");
        pp = pp.replace("ද*ි", "දි*");
        pp = pp.replace("ද*ී", "දී*");
        pp = pp.replace("ද*ො", "දො*");
        pp = pp.replace("ද*ෝ", "දෝ*");
        pp = pp.replace("ද*ෙ", "දෙ*");
        pp = pp.replace("ද*ේ", "දේ*");
        pp = pp.replace("ද*ෛ", "දෛ");
        pp = pp.replace("ද*ු", "දු*");
        pp = pp.replace("ද*ූ", "දූ*");
        pp = pp.replace("ද*ැ", "දැ*");
        pp = pp.replace("ද*ෑ", "දෑ*");
        pp = pp.replace("ද*ෟ", "දෟ*");
        pp = pp.replace("ද*්‍ර", "ද්‍ර*");

        pp = pp.replace("ප", "ප*");
        pp = pp.replace("ප*්", "ප්*");
        pp = pp.replace("ප*ා", "පා*");
        pp = pp.replace("ප*ි", "පි*");
        pp = pp.replace("ප*ී", "පී*");
        pp = pp.replace("ප*ො", "පො*");
        pp = pp.replace("ප*ෝ", "පෝ*");
        pp = pp.replace("ප*ෙ", "පෙ*");
        pp = pp.replace("ප*ේ", "පේ*");
        pp = pp.replace("ප*ෛ", "පෛ*");
        pp = pp.replace("ප*ු", "පු*");
        pp = pp.replace("ප*ූ", "පූ*");
        pp = pp.replace("ප*ැ", "පැ*");
        pp = pp.replace("ප*ෑ", "පෑ*");
        pp = pp.replace("ප*ෟ", "පෟ*");
        pp = pp.replace("ප*්‍ර", "ප්‍ර*");

        pp = pp.replace("බ", "බ*");
        pp = pp.replace("බ*්", "බ්*");
        pp = pp.replace("බ*ා", "බා*");
        pp = pp.replace("බ*ි", "බි*");
        pp = pp.replace("බ*ී", "බී*");
        pp = pp.replace("බ*ො", "බො*");
        pp = pp.replace("බ*ෝ", "බෝ*");
        pp = pp.replace("බ*ෙ", "බෙ*");
        pp = pp.replace("බ*ේ", "බේ*");
        pp = pp.replace("බ*ෛ", "බෛ*");
        pp = pp.replace("බ*ු", "බු*");
        pp = pp.replace("බ*ූ", "බූ*");
        pp = pp.replace("බ*ැ", "බැ*");
        pp = pp.replace("බ*ෑ", "බෑ*");
        pp = pp.replace("බ*ෟ", "බෟ*");
        pp = pp.replace("බ*්‍ර", "බ්‍ර*");

        pp = pp.replace("ම", "ම*");
        pp = pp.replace("ම*්", "ම්*");
        pp = pp.replace("ම*ා", "මා*");
        pp = pp.replace("ම*ි", "මි*");
        pp = pp.replace("ම*ී", "මී*");
        pp = pp.replace("ම*ො", "මො*");
        pp = pp.replace("ම*ෝ", "මෝ*");
        pp = pp.replace("ම*ෙ", "මෙ*");
        pp = pp.replace("ම*ේ", "මේ*");
        pp = pp.replace("ම*ෛ", "මෛ*");
        pp = pp.replace("ම*ු", "මු*");
        pp = pp.replace("ම*ූ", "මූ*");
        pp = pp.replace("ම*ැ", "මැ*");
        pp = pp.replace("ම*ෑ", "මෑ*");
        pp = pp.replace("ම*ෟ", "මෟ*");
        pp = pp.replace("ම*්‍ර", "ම්‍ර*");

        pp = pp.replace("ෆ", "ෆ*");
        pp = pp.replace("ෆ*්", "ෆ්*");
        pp = pp.replace("ෆ*ා", "ෆා*");
        pp = pp.replace("ෆ*ි", "ෆි*");
        pp = pp.replace("ෆ*ී", "ෆී*");
        pp = pp.replace("ෆ*ො", "ෆො*");
        pp = pp.replace("ෆ*ෝ", "ෆෝ*");
        pp = pp.replace("ෆ*ෙ", "ෆෙ*");
        pp = pp.replace("ෆ*ේ", "ෆේ*");
        pp = pp.replace("ෆ*ෛ", "ෆෛ*");
        pp = pp.replace("ෆ*ු", "ෆු*");
        pp = pp.replace("ෆ*ූ", "ෆූ*");
        pp = pp.replace("ෆ*ැ", "ෆැ*");
        pp = pp.replace("ෆ*ෑ", "ෆෑ*");
        pp = pp.replace("ෆ*ෟ*", "ෆෟ*");
        pp = pp.replace("ෆ*්‍ර", "ෆ්‍ර*");

        pp = pp.replace("ය", "ය*");
        pp = pp.replace("ය*්", "ය්*");
        pp = pp.replace("ය*ා", "යා*");
        pp = pp.replace("ය*ි", "යි*");
        pp = pp.replace("ය*ී", "යී*");
        pp = pp.replace("ය*ො", "යො*");
        pp = pp.replace("ය*ෝ", "යෝ*");
        pp = pp.replace("ය*ෙ", "යෙ*");
        pp = pp.replace("ය*ේ", "යේ*");
        pp = pp.replace("ය*ෛ", "යෛ*");
        pp = pp.replace("ය*ු", "යු*");
        pp = pp.replace("ය*ූ", "යූ*");
        pp = pp.replace("ය*ැ", "යැ*");
        pp = pp.replace("ය*ෑ", "යෑ*");
        pp = pp.replace("ය*ෟ*", "යෟ*");
        pp = pp.replace("ය*්‍ර", "ය්‍ර*");

        pp = pp.replace("ල", "ල*");
        pp = pp.replace("ල*්", "ල්*");
        pp = pp.replace("ල*ා", "ලා*");
        pp = pp.replace("ල*ි", "ලි*");
        pp = pp.replace("ල*ී", "ලී*");
        pp = pp.replace("ල*ො", "ලො*");
        pp = pp.replace("ල*ෝ", "ලෝ*");
        pp = pp.replace("ල*ෙ", "ලෙ*");
        pp = pp.replace("ල*ේ", "ලේ*");
        pp = pp.replace("ල*ෛ", "ලෛ*");
        pp = pp.replace("ල*ු", "ලු*");
        pp = pp.replace("ල*ූ", "ලූ*");
        pp = pp.replace("ල*ැ", "ලැ*");
        pp = pp.replace("ල*ෑ", "ලෑ*");
        pp = pp.replace("ල*ෟ", "ලෟ*");

        pp = pp.replace("ළ", "ළ*");
        pp = pp.replace("ළ*්", "ළ්*");
        pp = pp.replace("ළ*ා", "ළා*");
        pp = pp.replace("ළ*ි", "ළි*");
        pp = pp.replace("ළ*ී", "ළී*");
        pp = pp.replace("ළ*ො", "ළො*");
        pp = pp.replace("ළ*ෝ", "ළෝ*");
        pp = pp.replace("ළ*ෙ", "ළෙ*");
        pp = pp.replace("ළ*ේ", "ළේ*");
        pp = pp.replace("ළ*ෛ", "ළෛ*");
        pp = pp.replace("ළ*ැ", "ළැ*");
        pp = pp.replace("ළ*ෑ", "ළෑ*");
        pp = pp.replace("ළ*ෟ", "ළෟ*");

        pp = pp.replace("ව", "ව*");
        pp = pp.replace("ව*්", "ව්*");
        pp = pp.replace("ව*ා", "වා*");
        pp = pp.replace("ව*ි", "වි*");
        pp = pp.replace("ව*ී", "වී*");
        pp = pp.replace("ව*ො", "වො*");
        pp = pp.replace("ව*ෝ", "වෝ*");
        pp = pp.replace("ව*ෙ", "වෙ*");
        pp = pp.replace("ව*ේ", "වේ*");
        pp = pp.replace("ව*ෛ", "වෛ*");
        pp = pp.replace("ව*ු", "වු*");
        pp = pp.replace("ව*ූ", "වූ*");
        pp = pp.replace("ව*ැ", "වැ*");
        pp = pp.replace("ව*ෑ", "වෑ*");
        pp = pp.replace("ව*ෟ", "වෟ*");
        pp = pp.replace("ව*්‍ර", "ව්‍ර*");

        pp = pp.replace("ෂ", "ෂ*");
        pp = pp.replace("ෂ*්", "ෂ්*");
        pp = pp.replace("ෂ*ා", "ෂා*");
        pp = pp.replace("ෂ*ි", "ෂි*");
        pp = pp.replace("ෂ*ී", "ෂී*");
        pp = pp.replace("ෂ*ො", "ෂො*");
        pp = pp.replace("ෂ*ෝ", "ෂෝ*");
        pp = pp.replace("ෂ*ෙ", "ෂෙ*");
        pp = pp.replace("ෂ*ේ", "ෂේ*");
        pp = pp.replace("ෂ*ෛ", "ෂෛ*");
        pp = pp.replace("ෂ*ු", "ෂු*");
        pp = pp.replace("ෂ*ූ", "ෂූ*");
        pp = pp.replace("ෂ*ැ", "ෂැ*");
        pp = pp.replace("ෂ*ෑ", "ෂෑ*");
        pp = pp.replace("ෂ*ෟ", "ෂෟ*");
        pp = pp.replace("ෂ*්‍ර", "ෂ්‍ර*");

        pp = pp.replace("ස", "ස*");
        pp = pp.replace("ස*්", "ස්*");
        pp = pp.replace("ස*ා", "සා*");
        pp = pp.replace("ස*ි", "සි*");
        pp = pp.replace("ස*ී", "සී*");
        pp = pp.replace("ස*ො", "සො*");
        pp = pp.replace("ස*ෝ", "සෝ*");
        pp = pp.replace("ස*ෙ", "සෙ*");
        pp = pp.replace("ස*ේ", "සේ*");
        pp = pp.replace("ස*ෛ", "සෛ*");
        pp = pp.replace("ස*ු", "සු*");
        pp = pp.replace("ස*ූ", "සූ*");
        pp = pp.replace("ස*ැ", "සැ*");
        pp = pp.replace("ස*ෑ", "සෑ*");
        pp = pp.replace("ස*ෟ", "සෟ*");
        pp = pp.replace("ස*්‍ර", "ස්‍ර*");

        pp = pp.replace("ශ", "ශ*");
        pp = pp.replace("ශ*්", "ශ්*");
        pp = pp.replace("ශ*ා", "ශා*");
        pp = pp.replace("ශ*ි", "ශි*");
        pp = pp.replace("ශ*ී", "ශී*");
        pp = pp.replace("ශ*ො", "ශො*");
        pp = pp.replace("ශ*ෝ", "ශෝ*");
        pp = pp.replace("ශ*ෙ", "ශෙ*");
        pp = pp.replace("ශ*ේ", "ශේ*");
        pp = pp.replace("ශ*ෛ", "ශෛ*");
        pp = pp.replace("ශ*ු", "ශු*");
        pp = pp.replace("ශ*ූ", "ශූ*");
        pp = pp.replace("ශ*ැ", "ශැ*");
        pp = pp.replace("ශ*ෑ", "ශෑ*");
        pp = pp.replace("ශ*ෟ", "ශෟ*");
        pp = pp.replace("ශ*්‍ර", "ශ්‍ර*");

        pp = pp.replace("ඞ", "ඞ*");
        pp = pp.replace("ඞ*්", "ඞ්*");
        pp = pp.replace("ඞ*ා", "ඞා*");
        pp = pp.replace("ඞ*ි", "ඞි*");
        pp = pp.replace("ඞ*ී", "ඞී*");
        pp = pp.replace("ඞ*ො", "ඞො*");
        pp = pp.replace("ඞ*ෝ", "ඞෝ*");
        pp = pp.replace("ඞ*ෙ", "ඞෙ*");
        pp = pp.replace("ඞ*ේ", "ඞේ*");
        pp = pp.replace("ඞ*ෛ", "ඞෛ*");
        pp = pp.replace("ඞ*ු", "ඞු*");
        pp = pp.replace("ඞ*ූ", "ඞූ*");
        pp = pp.replace("ඞ*ැ", "ඞැ*");
        pp = pp.replace("ඞ*ෑ", "ඞෑ*");
        pp = pp.replace("ඞ*ෟ", "ඞෟ*");
        pp = pp.replace("ඞ*්‍ර", "ඞ්‍ර*");

        pp = pp.replace("ඟ", "ඟ*");
        pp = pp.replace("ඟ*්", "ඟ්*");
        pp = pp.replace("ඟ*ා", "ඟා*");
        pp = pp.replace("ඟ*ි", "ඟි*");
        pp = pp.replace("ඟ*ී", "ඟී*");
        pp = pp.replace("ඟ*ො", "ඟො*");
        pp = pp.replace("ඟ*ෝ", "ඟෝ*");
        pp = pp.replace("ඟ*ෙ", "ඟෙ*");
        pp = pp.replace("ඟ*ේ", "ඟේ*");
        pp = pp.replace("ඟ*ෛ", "ඟෛ*");
        pp = pp.replace("ඟ*ු", "ඟු*");
        pp = pp.replace("ඟ*ූ", "ඟූ*");
        pp = pp.replace("ඟ*ැ", "ඟැ*");
        pp = pp.replace("ඟ*ෑ", "ඟෑ*");
        pp = pp.replace("ඟ*්‍ර", "ඟ්‍ර*");

        pp = pp.replace("ඤ", "ඤ*");
        pp = pp.replace("ඤ*්", "ඤ්*");
        pp = pp.replace("ඤ*ා", "ඤා*");
        pp = pp.replace("ඤ*ි", "ඤි*");
        pp = pp.replace("ඤ*ී", "ඤී*");
        pp = pp.replace("ඤ*ො", "ඤො*");
        pp = pp.replace("ඤ*ෝ", "ඤෝ*");
        pp = pp.replace("ඤ*ෙ", "ඤෙ*");
        pp = pp.replace("ඤ*ේ", "ඤේ*");
        pp = pp.replace("ඤ*ෛ", "ඤෛ*");
        pp = pp.replace("ඤ*ු", "ඤු*");
        pp = pp.replace("ඤ*ූ", "ඤූ*");
        pp = pp.replace("ඤ*ැ", "ඤැ*");
        pp = pp.replace("ඤ*ෑ", "ඤෑ*");



        pp = pp.replace("ඥ", "ඥ*");
        pp = pp.replace("ඥ*්", "ඟ්*");
        pp = pp.replace("ඥ*ා", "ඥා*");
        pp = pp.replace("ඥ*ි", "ඥි*");
        pp = pp.replace("ඥ*ී", "ඥී*");
        pp = pp.replace("ඥ*ො", "ඥො*");
        pp = pp.replace("ඥ*ෝ", "ඥෝ*");
        pp = pp.replace("ඥ*ෙ", "ඥෙ*");
        pp = pp.replace("ඥ*ේ", "ඥේ*");
        pp = pp.replace("ඥ*ෛ", "ඥෛ*");
        pp = pp.replace("ඥ*ු", "ඥු*");
        pp = pp.replace("ඥ*ූ", "ඥූ*");
        pp = pp.replace("ඥ*ැ", "ඥැ*");
        pp = pp.replace("ඥ*ෑ", "ඥෑ*");;

        pp = pp.replace("ඦ", "ඦ*");
        pp = pp.replace("ඦ*්", "ඟ්*");
        pp = pp.replace("ඦ*ා", "ඦා*");
        pp = pp.replace("ඦ*ි", "ඦි*");
        pp = pp.replace("ඦ*ී", "ඦී*");
        pp = pp.replace("ඦ*ො", "ඦො*");
        pp = pp.replace("ඦ*ෝ", "ඦෝ*");
        pp = pp.replace("ඦ*ෙ", "ඦෙ*");
        pp = pp.replace("ඦ*ේ", "ඦේ*");
        pp = pp.replace("ඦ*ෛ", "ඦෛ*");
        pp = pp.replace("ඦ*ු", "ඦු*");
        pp = pp.replace("ඦ*ූ", "ඦූ*");
        pp = pp.replace("ඦ*ැ", "ඦැ*");
        pp = pp.replace("ඦ*ෑ", "ඦෑ*");


        pp = pp.replace("ඳ", "ඳ*");
        pp = pp.replace("ඳ*්", "ඳ්*");
        pp = pp.replace("ඳ*ා", "ඳා*");
        pp = pp.replace("ඳ*ි", "ඳි*");
        pp = pp.replace("ඳ*ී", "ඳී*");
        pp = pp.replace("ඳ*ො", "ඳො*");
        pp = pp.replace("ඳ*ෝ", "දෝ*");
        pp = pp.replace("ඳ*ෙ", "ඳෙ*");
        pp = pp.replace("ඳ*ේ", "ඳේ*");
        pp = pp.replace("ඳ*ෛ", "ඳෛ*");
        pp = pp.replace("ඳ*ු", "ඳු*");
        pp = pp.replace("ඳ*ූ", "ඳූ*");
        pp = pp.replace("ඳ*ැ", "ඳැ*");
        pp = pp.replace("ඳ*ෑ", "ඳෑ*");
        pp = pp.replace("ඳ*්‍ර", "ඳ්‍ර*");



        pp = pp.replace("ඹ", "ඹ*");
        pp = pp.replace("ඹ*්", "ඹ්*");
        pp = pp.replace("ඹ*ා", "ඹා*");
        pp = pp.replace("ඹ*ි", "ඹි*");
        pp = pp.replace("ඹ*ො", "ඹො*");
        pp = pp.replace("ඹ*ෝ", "ඹෝ*");
        pp = pp.replace("ඹ*ෙ", "ඹෙ*");
        pp = pp.replace("ඹ*ේ", "ඹේ*");
        pp = pp.replace("ඹ*ෛ", "ඹෛ*");
        pp = pp.replace("ඹ*ු", "ඹු*");
        pp = pp.replace("ඹ*ූ", "ඹූ*");
        pp = pp.replace("ඹ*ැ", "ඹැ*");
        pp = pp.replace("ඹ*ෑ", "ඹෑ*");



        pp = pp.replace("ඣ", "ඣ*");
        pp = pp.replace("ඣ*්", "ඣ්*");
        pp = pp.replace("ඣ*ා", "ඣා*");
        pp = pp.replace("ඣ*ි", "ඣි*");
        pp = pp.replace("ඣ*ී", "ඣී*");
        pp = pp.replace("ඣ*ො", "ඣො*");
        pp = pp.replace("ඣ*ෝ", "ඣෝ*");
        pp = pp.replace("ඣ*ෙ", "ඣෙ*");
        pp = pp.replace("ඣ*ේ", "ඣේ*");
        pp = pp.replace("ඣ*ෛ", "ඣෛ*");
        pp = pp.replace("ඣ*ු", "ඣු*");
        pp = pp.replace("ඣ*ූ", "ඣූ*");
        pp = pp.replace("ඣ*ැ", "ඣැ*");
        pp = pp.replace("ඣ*ෑ", "ඣෑ*");


        pp = pp.replace("ඨ", "ඨ*");
        pp = pp.replace("ඨ*්", "ඨ්*");
        pp = pp.replace("ඨ*ා", "ඨා*");
        pp = pp.replace("ඨ*ි", "ඨි*");
        pp = pp.replace("ඨ*ී", "ඨී*");
        pp = pp.replace("ඨ*ො", "ඨො*");
        pp = pp.replace("ඨ*ෝ", "ඨෝ*");
        pp = pp.replace("ඨ*ෙ", "ඨෙ*");
        pp = pp.replace("ඨ*ේ", "ඨේ*");
        pp = pp.replace("ඨ*ෛ", "ඨෛ*");
        pp = pp.replace("ඨ*ු", "ඨු*");
        pp = pp.replace("ඨ*ූ", "ඨූ*");
        pp = pp.replace("ඨ*ැ", "ඨැ*");
        pp = pp.replace("ඨ*ෑ", "ඨෑ*");


        //pp = pp.replace("ඩ්*හ්*", "ඪ්*");
        //pp = pp.replace("ඪ්*අ*", "ඪ්*");
        //pp = pp.replace("ඪ*අ*", "ඪා*");
        //pp = pp.replace("ඪ්*ඉ*", "ඪි*");
        //pp = pp.replace("ඪි*ඉ*", "ඪී*");
        //pp = pp.replace("ඪ්*ඔ*", "ඪො*");
        //pp = pp.replace("ඪො*ඔ*", "ඪෝ*");
        //pp = pp.replace("ඪ්*එ*", "ඪෙ*");
        //pp = pp.replace("ඪෙ*එ*", "ඪේ*");
        //pp = pp.replace("ඪ්*ඉ*", "ඪෛ*");
        //pp = pp.replace("ඪ*උ*", "ඪු*");
        //pp = pp.replace("ඪු*උ*", "ඪූ*");
        //pp = pp.replace("ඪ්*A", "ඪැ*");
        //pp = pp.replace("ඪැ*අ*", "ඪෑ*");


        pp = pp.replace("ථ", "ථ*");
        pp = pp.replace("ථ*්", "ථ්*");
        pp = pp.replace("ථ*ා", "ථා*");
        pp = pp.replace("ථ*ි", "ථි*");
        pp = pp.replace("ථ*ී", "ථී*");
        pp = pp.replace("ථ*ො", "ථො*");
        pp = pp.replace("ථ*ෝ", "ථෝ*");
        pp = pp.replace("ථ*ෙ", "ථෙ*");
        pp = pp.replace("ථ*ේ", "ථේ*");
        pp = pp.replace("ථ*ෛ", "ථෛ*");
        pp = pp.replace("ථ*ු", "ථු*");
        pp = pp.replace("ථ*ූ", "ථූ*");
        pp = pp.replace("ථ*ැ", "ථැ*");
        pp = pp.replace("ථ*ෑ", "ථෑ*");


        pp = pp.replace("ධ්", "ධ්*");
        //pp= pp.replace("ථ්අ", "ථ");
        //pp= pp.replace("ථඅ", "ථා");
        //pp= pp.replace("ථ්ඉ", "ථි");
        //pp= pp.replace("ථිඉ", "ථී");
        //pp= pp.replace("ථ්ඔ", "ථො");
        //pp= pp.replace("ථොඔ", "ථෝ");
        //pp= pp.replace("ථ්එ", "ථෙ");
        //pp= pp.replace("ථෙඑ", "ථේ");
        //pp= pp.replace("ථේඉ", "ථෛ");
        //pp= pp.replace("ථඋ", "ථු");
        //pp= pp.replace("ථුඋ", "ථූ");
        //pp= pp.replace("ථ්A", "ථැ");
        //pp= pp.replace("ථැඅ", "ථෑ");

        pp = pp.replace("ඵ", "ඵ*");
        pp = pp.replace("ඵ*්", "ඵ්*");
        pp = pp.replace("ඵ*ා", "ඵා*");
        pp = pp.replace("ඵ*ි", "ඵි*");
        pp = pp.replace("ඵ*ී", "ඵී*");
        pp = pp.replace("ඵ*ො", "ඵො*");
        pp = pp.replace("ඵ*ෝ", "ඵෝ*");
        pp = pp.replace("ඵ*ෙ", "ඵෙ*");
        pp = pp.replace("ඵ*ේ", "ථේ*");
        pp = pp.replace("ඵ*ෛ", "ඵෛ*");
        pp = pp.replace("ඵ*ු", "ඵු*");
        pp = pp.replace("ඵ*ූ", "ඵූ*");
        pp = pp.replace("ඵ*ඵැ", "ඵැ*");
        pp = pp.replace("ඵ*ෑ", "ඵෑ*");



        pp = pp.replace("භ", "භ*");
        pp = pp.replace("භ*්", "භ්*");
        pp = pp.replace("භ*ා", "භා*");
        pp = pp.replace("භ*ි", "භි*");
        pp = pp.replace("භ*ී", "භී*");
        pp = pp.replace("භ*ො", "භො*");
        pp = pp.replace("භ*ෝ", "භෝ*");
        pp = pp.replace("භ*ෙ", "භෙ*");
        pp = pp.replace("භ*ේ", "භේ*");
        pp = pp.replace("භ*ෛ", "භෛ*");
        pp = pp.replace("භ*ු", "භු*");
        pp = pp.replace("භ*ූ", "භූ*");
        pp = pp.replace("භ*ැ", "භැ*");
        pp = pp.replace("භ*ෑ", "භෑ*");
        pp = pp.replace("භ*්‍ර", "භ්‍ර*");


        pp = pp.replace("ඐ", "ඐ*");
        //pp= pp.replace("ඐ්අ", "භ");
        //pp= pp.replace("භඅ", "භා");
        //pp= pp.replace("භ්ඉ", "භි");
        //pp= pp.replace("භිඉ", "භී");
        //pp= pp.replace("භ්ඔ", "භො");
        //pp= pp.replace("භොඔ", "භෝ");
        //pp= pp.replace("භ්එ", "භෙ");
        //pp= pp.replace("භෙඑ", "භේ");
        //pp= pp.replace("භේඉ", "භෛ");
        //pp= pp.replace("භඋ", "භු");
        //pp= pp.replace("භුඋ", "භූ");
        //pp= pp.replace("භ්A", "භැ");
        //pp= pp.replace("භැඅ", "භෑ");
        //myacess.Text = pp;
        //  pp = pp.replaceFirst("\\s+", "");
         words = pp.split("\\*");
    }
    public static void playSound()
    {
        for (int i = 0; i < words.length; i++)
        {            
             String audio = words[i];
             SinhalaSound(audio);            
        }
    }
    public static void prepareTamilSounds(String pp)
    {
            pp = pp.replace(" ", " *");
            pp = pp.replace("அ", "அ*");
            pp = pp.replace("ஆ", "ஆ*");
            //pp = pp.replace("A", "ஆ");

            pp = pp.replace("இ", "இ*");
            pp = pp.replace("ஈ", "ஈ*");
            //pp = pp.replace("I", "ஈ");

            pp = pp.replace("உ", "உ*");
            pp = pp.replace("ஊ", "ஊ*");
            // pp = pp.replace("U", "ஊ");

            pp = pp.replace("எ", "எ*");
            pp = pp.replace("ஏ", "ஏ*");
            // pp = pp.replace("E", "ஏ");

            pp = pp.replace("ஒ", "ஒ*");
            pp = pp.replace("ஓ", "ஓ");
            //pp = pp.replace("O", "ஓ");

            pp = pp.replace("ஔ", "ஔ*");
            pp = pp.replace("ஐ", "ஐ*");

            pp = pp.replace("ஃ", "ஃ*");

            //pp = pp.replace("x", "௯");

            pp = pp.replace("க", "க*");
            pp = pp.replace("க*்", "க்*");
            pp = pp.replace("க*ா", "கா*");
            pp = pp.replace("க*ி", "கி*");
            pp = pp.replace("க*ீ", "கீ*");
            pp = pp.replace("க*ு", "கு*");
            pp = pp.replace("க*ூ", "கூ*");
            pp = pp.replace("க*ெ", "கெ*");
            pp = pp.replace("க*ே", "கே*");
            pp = pp.replace("க*ொ", "கொ*");
            pp = pp.replace("க*ோ", "கோ*");
            pp = pp.replace("க*ௌ", "கௌ*");
            pp = pp.replace("க*ை", "கை*");

            pp = pp.replace("ங", "ங*");
            pp = pp.replace("ங*்", "ங்*");
            pp = pp.replace("ங*ா", "ஙா*");
            pp = pp.replace("ங*ி", "ஙி*");
            pp = pp.replace("ங*ீ", "ஙீ*");
            pp = pp.replace("ங*ு", "ஙு*");
            pp = pp.replace("ங*ூ", "ஙூ*");
            pp = pp.replace("ங*ெ", "ஙெ*");
            pp = pp.replace("ங*ே", "ஙே*");
            pp = pp.replace("ங*ொ", "ஙொ*");
            pp = pp.replace("ங*ோ", "ஙோ*");
            pp = pp.replace("ங*ௌ", "ஙௌ*");
            pp = pp.replace("ங*ை", "ஙை*");


            pp = pp.replace("ச", "ச*");
            pp = pp.replace("ச*்", "ச்*");
            pp = pp.replace("ச*ா", "சா*");
            pp = pp.replace("ச*ி", "சி*");
            pp = pp.replace("ச*ீ", "சீ*");
            pp = pp.replace("ச*ு", "சு*");
            pp = pp.replace("ச*ூ", "சூ*");
            pp = pp.replace("ச*ெ", "சூ*");
            pp = pp.replace("ச*ே", "சே*");
            pp = pp.replace("ச*ொ", "செ*");
            pp = pp.replace("ச*ோ", "சே*");
            pp = pp.replace("ச*ௌ", "சௌ*");
            pp = pp.replace("ச*ை", "சை*");

            
            pp = pp.replace("ஞ", "ஞ*");
            pp = pp.replace("ஞ*்", "ஞ்*");
            pp = pp.replace("ஞ*ா", "ஞா*");
            pp = pp.replace("ஞ*ி", "ஞி*");
            pp = pp.replace("ஞ*ீ", "ஞீ*");
            pp = pp.replace("ஞ*ு", "ஞு*");
            pp = pp.replace("ஞ*ூ", "ஞூ*");
            pp = pp.replace("ஞ*ெ", "ஞெ*");
            pp = pp.replace("ஞ*ே", "ஞே*");
            pp = pp.replace("ஞ*ொ", "ஞொ*");
            pp = pp.replace("ஞ*ோ", "ஞோ*");
            pp = pp.replace("ஞ*ௌ", "ஞௌ*");
            pp = pp.replace("ஞ*ை", "ஞை*");

            pp = pp.replace("ட", "ட*");
            pp = pp.replace("ட*்", "ட்*");
            pp = pp.replace("ட*ா", "டா*");
            pp = pp.replace("ட*ி", "டி*");
            pp = pp.replace("ட*ீ", "டீ*");
            pp = pp.replace("ட*ு", "டு*");
            pp = pp.replace("ட*ூ", "டூ*");
            pp = pp.replace("ட*ெ", "டெ*");
            pp = pp.replace("ட*ே", "டே*");
            pp = pp.replace("ட*ொ", "டொ*");
            pp = pp.replace("ட*ோ", "டோ*");
            pp = pp.replace("ட*ௌ", "டௌ*");
            pp = pp.replace("ட*ை", "டை*");

            
            pp = pp.replace("ண", "ண*");
            pp = pp.replace("ண*்", "ண்*");
            pp = pp.replace("ண*ா", "ணா*");
            pp = pp.replace("ண*ி", "ணி*");
            pp = pp.replace("ண*ீ", "ணீ*");
            pp = pp.replace("ண*ு", "ணு*");
            pp = pp.replace("ண*ூ", "ணூ*");
            pp = pp.replace("ண*ெ", "ணெ*");
            pp = pp.replace("ண*ே", "ணே*");
            pp = pp.replace("ண*ொ", "ணொ*");
            pp = pp.replace("ண*ோ", "ணோ*");
            pp = pp.replace("ண*ௌ", "ணௌ*");
            pp = pp.replace("ண*ை", "ணை*");
            pp = pp.replace("த", "த*");
            pp = pp.replace("த*்", "த்*");
            pp = pp.replace("த*ா", "தா*");
            pp = pp.replace("த*ி", "தி*");
            pp = pp.replace("த*ீ", "தீ*");
            pp = pp.replace("த*ு", "து*");
            pp = pp.replace("த*ூ", "தூ*");
            pp = pp.replace("த*ெ", "தெ*");
            pp = pp.replace("த*ே", "தே*");
            pp = pp.replace("த*ொ", "தொ*");
            pp = pp.replace("த*ோ", "தோ*");
            pp = pp.replace("த*ௌ", "தௌ*");
            pp = pp.replace("த*ை", "தை*");

            
            pp = pp.replace("ந", "ந*");
            pp = pp.replace("ந*்", "ந்*");
            pp = pp.replace("ந*ா", "நா*");
            pp = pp.replace("ந*ி", "நி*");
            pp = pp.replace("ந*ீ", "நீ*");
            pp = pp.replace("ந*ு", "நு*");
            pp = pp.replace("ந*ூ", "நூ*");
            pp = pp.replace("ந*ெ", "நெ*");
            pp = pp.replace("ந*ே", "நே*");
            pp = pp.replace("ந*ொ", "நொ*");
            pp = pp.replace("ந*ோ", "நோ*");
            pp = pp.replace("ந*ௌ", "நௌ*");
            pp = pp.replace("ந*ை", "நை*");

            
            pp = pp.replace("ப", "ப*");
            pp = pp.replace("ப*்", "ப்*");
            pp = pp.replace("ப*ா", "பா*");
            pp = pp.replace("ப*ி", "பி*");
            pp = pp.replace("ப*ீ", "பீ*");
            pp = pp.replace("ப*ு", "பு*");
            pp = pp.replace("ப*ூ", "பூ*");
            pp = pp.replace("ப*ெ", "பெ*");
            pp = pp.replace("ப*ே", "பே*");
            pp = pp.replace("ப*ொ", "பொ*");
            pp = pp.replace("ப*ோ", "போ*");
            pp = pp.replace("ப*ௌ", "பௌ*");
            pp = pp.replace("ப*ை", "பை*");

            
            pp = pp.replace("ம", "ம*");
            pp = pp.replace("ம*்", "ம்*");
            pp = pp.replace("ம*ா", "மா*");
            pp = pp.replace("ம*ி", "மி*");
            pp = pp.replace("ம*ீ", "மீ*");
            pp = pp.replace("ம*ு", "மு*");
            pp = pp.replace("ம*ூ", "மூ*");
            pp = pp.replace("ம*ெ", "மெ*");
            pp = pp.replace("ம*ே", "மே*");
            pp = pp.replace("ம*ொ", "மொ*");
            pp = pp.replace("ம*ோ", "மோ*");
            pp = pp.replace("ம*ௌ", "மௌ*");
            pp = pp.replace("ம*ை", "மை*");


           
            pp = pp.replace("ய", "ய*");
            pp = pp.replace("ய*்", "ய்*");
            pp = pp.replace("ய*ா", "யா*");
            pp = pp.replace("ய*ி", "யி*");
            pp = pp.replace("ய*ீ", "யீ*");
            pp = pp.replace("ய*ு", "யு*");
            pp = pp.replace("ய*ூ", "யூ*");
            pp = pp.replace("ய*ெ", "யெ*");
            pp = pp.replace("ய*ே", "யே*");
            pp = pp.replace("ய*ொ", "யொ*");
            pp = pp.replace("ய*ோ", "யோ*");
            pp = pp.replace("ய*ௌ", "யௌ*");
            pp = pp.replace("ய*ை", "யை*");

            pp = pp.replace("ர", "ர*");
            pp = pp.replace("ர*்", "ர்*");
            pp = pp.replace("ர*ா", "ரா*");
            pp = pp.replace("ர*ி", "ரி*");
            pp = pp.replace("ர*ீ", "ரீ*");
            pp = pp.replace("ர*ு", "ரு*");
            pp = pp.replace("ர*ூ", "ரூ*");
            pp = pp.replace("ர*ெ", "ரெ*");
            pp = pp.replace("ர*ே", "ரே*");
            pp = pp.replace("ர*ொ", "ரொ*");
            pp = pp.replace("ர*ோ", "ரோ*");
            pp = pp.replace("ர*ௌ", "ரௌ*");
            pp = pp.replace("ர*ை", "ரை*");

           
            pp = pp.replace("ல", "ல*");
            pp = pp.replace("ல*்", "ல்*");
            pp = pp.replace("ல*ா", "லா*");
            pp = pp.replace("ல*ி", "லி*");
            pp = pp.replace("ல*ீ", "லீ*");
            pp = pp.replace("ல*ு", "லு*");
            pp = pp.replace("ல*ூ", "லூ*");
            pp = pp.replace("ல*ெ", "லெ*");
            pp = pp.replace("ல*ே", "லே*");
            pp = pp.replace("ல*ொ", "லொ*");
            pp = pp.replace("ல*ோ", "லோ*");
            pp = pp.replace("ல*ௌ", "லௌ*");
            pp = pp.replace("ல*ை", "லை*");

           
            pp = pp.replace("வ", "வ*");
            pp = pp.replace("வ*்", "வ்*");
            pp = pp.replace("வ*ா", "வா*");
            pp = pp.replace("வ*ி", "வி*");
            pp = pp.replace("வ*ீ", "வீ*");
            pp = pp.replace("வ*ு", "வு*");
            pp = pp.replace("வ*ூ", "வூ*");
            pp = pp.replace("வ*ெ", "வெ*");
            pp = pp.replace("வ*ே", "வே*");
            pp = pp.replace("வ*ொ", "வொ*");
            pp = pp.replace("வ*ோ", "வோ*");
            pp = pp.replace("வ*ௌ", "வௌ*");
            pp = pp.replace("வ*ை", "வை*");

            pp = pp.replace("ள", "ள*");
            pp = pp.replace("ள*்", "ள்*");
            pp = pp.replace("ள*ா", "ளா*");
            pp = pp.replace("ள*ி", "ளி*");
            pp = pp.replace("ள*ீ", "ளீ*");
            pp = pp.replace("ள*ு", "ளு*");
            pp = pp.replace("ள*ூ", "ளூ*");
            pp = pp.replace("ள*ெ", "ளே*");
            pp = pp.replace("ள*ே", "ளே*");
            pp = pp.replace("ள*ொ", "ளொ*");
            pp = pp.replace("ள*ோ", "ளோ*");
            pp = pp.replace("ள*ௌ", "ளௌ*");
            pp = pp.replace("ள*ை", "ளை*");

           
            pp = pp.replace("ழ", "ழ*");
            pp = pp.replace("ழ*்", "ழ்*");
            pp = pp.replace("ழ*ா", "ழா*");
            pp = pp.replace("ழ*ி", "ழி*");
            pp = pp.replace("ழ*ீ", "ழீ*");
            pp = pp.replace("ழ*ு", "ழு*");
            pp = pp.replace("ழ*ூ", "ழூ*");
            pp = pp.replace("ழ*ெ", "ழெ*");
            pp = pp.replace("ழ*ே", "ழே*");
            pp = pp.replace("ழ*ொ", "ழொ*");
            pp = pp.replace("ழ*ோ", "ழௌ*");
            pp = pp.replace("ழ*ௌ", "கௌ*");
            pp = pp.replace("ழ*ை", "ழை*");

           
            pp = pp.replace("ற", "ற*");
            pp = pp.replace("ற*்", "ற்*");
            pp = pp.replace("ற*ா", "றா*");
            pp = pp.replace("ற*ி", "றி*");
            pp = pp.replace("ற*ீ", "றீ*");
            pp = pp.replace("ற*ு", "று*");
            pp = pp.replace("ற*ூ", "றூ*");
            pp = pp.replace("ற*ெ", "றெ*");
            pp = pp.replace("ற*ே", "றே*");
            pp = pp.replace("ற*ொ", "றொ*");
            pp = pp.replace("ற*ோ", "றோ*");
            pp = pp.replace("ற*ௌ", "றௌ*");
            pp = pp.replace("ற*ை", "றை*");

            pp = pp.replace("ன", "ன*");
            pp = pp.replace("ன*்", "ன்*");
            pp = pp.replace("ன*ா", "னா*");
            pp = pp.replace("ன*ி", "னி*");
            pp = pp.replace("ன*ீ", "னீ*");
            pp = pp.replace("ன*ு", "னு*");
            pp = pp.replace("ன*ூ", "னூ*");
            pp = pp.replace("ன*ெ", "னெ*");
            pp = pp.replace("ன*ே", "னே*");
            pp = pp.replace("ன*ொ", "னொ*");
            pp = pp.replace("ன*ோ", "னோ*");
            pp = pp.replace("ன*ௌ", "னௌ*");
            pp = pp.replace("ன*ை", "னை*");

            
            pp = pp.replace("ஸ", "ஸ*");
            pp = pp.replace("ஸ*்", "ஸ்*");
            pp = pp.replace("ஸ*ா", "ஸா*");
            pp = pp.replace("ஸ*ி", "ஸி*");
            pp = pp.replace("ஸ*ீ", "ஸீ*");
            pp = pp.replace("ஸ*ு", "ஸு*");
            pp = pp.replace("ஸ*ூ", "ஸூ*");
            pp = pp.replace("ஸ*ெ", "ஸெ*");
            pp = pp.replace("ஸ*ே", "ஸே*");
            pp = pp.replace("ஸ*ொ", "ஸொ*");
            pp = pp.replace("ஸ*ோ", "ஸோ*");
            pp = pp.replace("ஸ*ௌ", "ஸௌ*");
            pp = pp.replace("ஸ*ை", "ஸை*");

           
            pp = pp.replace("ஹ", "ஹ*");
            pp = pp.replace("ஹ*்", "ஹ்*");
            pp = pp.replace("ஹ*ா", "ஹா*");
            pp = pp.replace("ஹ*ி", "ஹி*");
            pp = pp.replace("ஹ*ீ", "ஹீ*");
            pp = pp.replace("ஹ*ு", "ஹு*");
            pp = pp.replace("ஹ*ூ", "ஹூ*");
            pp = pp.replace("ஹ*ெ", "ஹெ*");
            pp = pp.replace("ஹ*ே", "ஹே*");
            pp = pp.replace("ஹ*ொ", "ஹொ*");
            pp = pp.replace("ஹ*ோ", "ஹோ*");
            pp = pp.replace("ஹ*ௌ", "ஹௌ*");
            pp = pp.replace("ஹ*ை", "ஹை*");

            
            pp = pp.replace("ஷ", "ஷ*");
            pp = pp.replace("ஷ*்", "ஷ்*");
            pp = pp.replace("ஷ*ா", "ஷா*");
            pp = pp.replace("ஷ*ி", "ஷி*");
            pp = pp.replace("ஷ*ீ", "ஷீ*");
            pp = pp.replace("ஷ*ு", "ஷு*");
            pp = pp.replace("ஷ*ூ", "ஷூ*");
            pp = pp.replace("ஷ*ெ", "ஷெ*");
            pp = pp.replace("ஷ*ே", "ஷே*");
            pp = pp.replace("ஷ*ொ", "ஷொ*");
            pp = pp.replace("ஷ*ோ", "ஷோ*");
            pp = pp.replace("ஷ*ௌ", "ஷௌ*");
            pp = pp.replace("ஷ*ை", "ஷை*");

            
            pp = pp.replace("ஜ", "ஜ*");
            pp = pp.replace("ஜ*்", "ஜ்*");
            pp = pp.replace("ஜ*ா", "ஜா*");
            pp = pp.replace("ஜ*ி", "ஜி*");
            pp = pp.replace("ஜ*ீ", "ஜீ*");
            pp = pp.replace("ஜ*ு", "ஜு*");
            pp = pp.replace("ஜ*ூ", "ஜூ*");
            pp = pp.replace("ஜ*ெ", "ஜெ*");
            pp = pp.replace("ஜ*ே", "ஜே*");
            
            pp = pp.replace("ஜ*ொ", "ஜொ*");
            pp = pp.replace("ஜ*ோ", "ஜோ*");
            pp = pp.replace("ஜ*ௌ", "ஜௌ*");
            pp = pp.replace("ஜ*ை", "ஜை*");
            tamilWords=pp.split("\\*");
            
    }
    public static void playTamilSound()
    {
        for (int i = 0; i < tamilWords.length; i++)
        {            
             String audio = tamilWords[i];
             tamilSounds(audio);            
        }
    }

    public static void ConvertingSound() {
        try {
            File fl = new File(".\\src\\Audios\\ConvertBraille.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void EnglishDocumentPreparingSounds(int keycode) {
        if (keycode == 65) {
            //A
            try {
                File fl = new File(".\\src\\Audios\\_A-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 66) {
            //B
            try {
                File fl = new File(".\\src\\Audios\\_B-Part 4.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else if (keycode == 67) {
            //c
            try {
                File fl = new File(".\\src\\Audios\\_C-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 68) {
            //d
            try {
                File fl = new File(".\\src\\Audios\\_D-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 69) {
            //e
            try {
                File fl = new File(".\\src\\Audios\\_E-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 70) {
            //f
            try {
                File fl = new File(".\\src\\Audios\\_F-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 71) {
            //g
            try {
                File fl = new File(".\\src\\Audios\\_G-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 72) {
            //h
            try {
                File fl = new File(".\\src\\Audios\\_H-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 73) {
            //i
            try {
                File fl = new File(".\\src\\Audios\\_I-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 74) {
            //j10
            try {
                File fl = new File(".\\src\\Audios\\_J-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 75) {
            //k11
            try {
                File fl = new File(".\\src\\Audios\\_K-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 76) {
            //l
            try {
                File fl = new File(".\\src\\Audios\\_L-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 77) {
            //m
            try {
                File fl = new File(".\\src\\Audios\\_M-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 78) {
            //n
            try {
                File fl = new File(".\\src\\Audios\\_N-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 79) {
            //o
            try {
                File fl = new File(".\\src\\Audios\\_O-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 80) {
            //p
            try {
                File fl = new File(".\\src\\Audios\\_P-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 81) {
            //q
            try {
                File fl = new File(".\\src\\Audios\\_Q-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 82) {
            //r
            try {
                File fl = new File(".\\src\\Audios\\_R-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 83) {
            //s
            try {
                File fl = new File(".\\src\\Audios\\_S-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 84) {
            //20
            try {
                File fl = new File(".\\src\\Audios\\_T-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 85) {
            //u
            try {
                File fl = new File(".\\src\\Audios\\_U-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 86) {
            //v
            try {
                File fl = new File(".\\src\\Audios\\_V-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 87) {
            //w
            try {
                File fl = new File(".\\src\\Audios\\_W-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 88) {
            //x
            try {
                File fl = new File(".\\src\\Audios\\_X-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 89) {
            //y
            try {
                File fl = new File(".\\src\\Audios\\_Y-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (keycode == 90) {
            //z
            try {
                File fl = new File(".\\src\\Audios\\_Z-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
    
     public static void tamilSounds(String text)
  {
        
//         if (text.endsWith("்")) {//1
//            try {
//                File fl = new File(".\\src\\Audios\\l-Part 2.mp3");
//                FileInputStream fs = new FileInputStream(fl);
//                BufferedInputStream bis = new BufferedInputStream(fs);
//                Player pp = new Player(bis);
//                pp.play();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
        if (text.endsWith("அ")) {//2a_Part_2
            try {
                File fl = new File(".\\src\\Audios\\a-Part 2_1.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ஆ")) {//aa-Part 2_1.mp3
            try {
                File fl = new File(".\\src\\Audios\\aa-Part 2_1.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        } else if (text.endsWith("இ")) {//aa-Part 2_1.mp3
            try {
                File fl = new File(".\\src\\Audios\\_I-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ஈ")) {//5
            try {
                File fl = new File(".\\src\\Audios\\ii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("உ")) {//6
            try {
                File fl = new File(".\\src\\Audios\\u-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ஊ")) {//7
            try {
                File fl = new File(".\\src\\Audios\\uu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("எ")) {//8
            try {
                File fl = new File(".\\src\\Audios\\e-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ஏ")) {//9
            try {
                File fl = new File(".\\src\\Audios\\ee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ஒ")) {//10
            try {
                File fl = new File(".\\src\\Audios\\0-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ஓ")) {//11
            try {
                File fl = new File(".\\src\\Audios\\00-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ஔ")) {//12
            try {
                File fl = new File(".\\src\\Audios\\au-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ஃ")) {//14
            try {
                File fl = new File(".\\src\\Audios\\k-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("க்")) {//15
            try {
                File fl = new File(".\\src\\Audios\\k-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("க")) {//16
            try {
                File fl = new File(".\\src\\Audios\\ka-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("கா")) {//17
            try {
                File fl = new File(".\\src\\Audios\\kaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("கி")) {//18
            try {
                File fl = new File(".\\src\\Audios\\ki-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("கீ")) {//19
            try {
                File fl = new File(".\\src\\Audios\\kii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("கு")) {//20
            try {
                File fl = new File(".\\src\\Audios\\ku-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("கூ")) {//21
            try {
                File fl = new File(".\\src\\Audios\\kuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else if (text.endsWith("கெ")) {//22
            try {
                File fl = new File(".\\src\\Audios\\ke-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("கே")) {//23
            try {
                File fl = new File(".\\src\\Audios\\kee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ொ")) {//24
            try {
                File fl = new File(".\\src\\Audios\\ko-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("கோ")) {//25
            try {
                File fl = new File(".\\src\\Audios\\koo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("கௌ")) {//26
            try {
                File fl = new File(".\\src\\Audios\\kau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ச்")) {//27
            try {
                File fl = new File(".\\src\\Audios\\s-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ச")) {//28
            try {
                File fl = new File(".\\src\\Audios\\sa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("சா")) {//29
            try {
                File fl = new File(".\\src\\Audios\\saa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("சி")) {//30
            try {
                File fl = new File(".\\src\\Audios\\si-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("சீ")) {//31
            try {
                File fl = new File(".\\src\\Audios\\sii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("சு")) {//32
            try {
                File fl = new File(".\\src\\Audios\\su-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("சூ")) {//33
            try {
                File fl = new File(".\\src\\Audios\\suu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("செ")) {//34
            try {
                File fl = new File(".\\src\\Audios\\se-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("சே")) {//35
            try {
                File fl = new File(".\\src\\Audios\\see-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("சொ")) {//36
            try {
                File fl = new File(".\\src\\Audios\\so-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("சோ")) {//37
            try {
                File fl = new File(".\\src\\Audios\\soo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("சௌ")) {//38
            try {
                File fl = new File(".\\src\\Audios\\sau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ட்")) {//39
            try {
                File fl = new File(".\\src\\Audios\\t-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ட")) {//40
            try {
                File fl = new File(".\\src\\Audios\\ta-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("டி")) {//41
            try {
                File fl = new File(".\\src\\Audios\\ti-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("டீ")) {//42
            try {
                File fl = new File(".\\src\\Audios\\tii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("டு")) {//43
            try {
                File fl = new File(".\\src\\Audios\\tu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("டூ")) {//44
            try {
                File fl = new File(".\\src\\Audios\\tuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("டெ")) {//45
            try {
                File fl = new File(".\\src\\Audios\\te-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("டே")) {//46
            try {
                File fl = new File(".\\src\\Audios\\tee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("டொ")) {//47
            try {
                File fl = new File(".\\src\\Audios\\to-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("டோ")) {//48
            try {
                File fl = new File(".\\src\\Audios\\too-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("டௌ")) {//49
            try {
                File fl = new File(".\\src\\Audios\\tau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ண்")) {//50
            try {
                File fl = new File(".\\src\\Audios\\n-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ண")) {//51
            try {
                File fl = new File(".\\src\\Audios\\na-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ணா")) {//52
            try {
                File fl = new File(".\\src\\Audios\\naa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ணி")) {//53
            try {
                File fl = new File(".\\src\\Audios\\ni-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ணீ")) {//54
            try {
                File fl = new File(".\\src\\Audios\\nii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("டே")) {//51
            try {
                File fl = new File(".\\src\\Audios\\tee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("டே")) {//51
            try {
                File fl = new File(".\\src\\Audios\\tee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ணு")) {//55
            try {
                File fl = new File(".\\src\\Audios\\nu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ணெ")) {//56
            try {
                File fl = new File(".\\src\\Audios\\ne-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ணே")) {//57
            try {
                File fl = new File(".\\src\\Audios\\nee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ணொ")) {//58
            try {
                File fl = new File(".\\src\\Audios\\no-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ணோ")) {//59
            try {
                File fl = new File(".\\src\\Audios\\noo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ணௌ")) {//60
            try {
                File fl = new File(".\\src\\Audios\\nau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("த்")) {//61
            try {
                File fl = new File(".\\src\\Audios\\th-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("த")) {//62
            try {
                File fl = new File(".\\src\\Audios\\tha-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("தா")) {//63
            try {
                File fl = new File(".\\src\\Audios\\thaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("தி")) {//64
            try {
                File fl = new File(".\\src\\Audios\\thi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("தீ")) {//65
            try {
                File fl = new File(".\\src\\Audios\\thii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("து")) {//66
            try {
                File fl = new File(".\\src\\Audios\\thu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("தூ")) {//67
            try {
                File fl = new File(".\\src\\Audios\\thuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("தெ")) {//68
            try {
                File fl = new File(".\\src\\Audios\\the-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("தே")) {//69
            try {
                File fl = new File(".\\src\\Audios\\thee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("தோ")) {//70
            try {
                File fl = new File(".\\src\\Audios\\thoo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("தௌ")) {//71
            try {
                File fl = new File(".\\src\\Audios\\thau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ந்")) {//72
            try {
                File fl = new File(".\\src\\Audios\\n-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ந")) {//73
            try {
                File fl = new File(".\\src\\Audios\\na-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("நா")) {//74
            try {
                File fl = new File(".\\src\\Audios\\naa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("நி")) {//75
            try {
                File fl = new File(".\\src\\Audios\\ni-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("நீ")) {//76
            try {
                File fl = new File(".\\src\\Audios\\nii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("நு")) {//77
            try {
                File fl = new File(".\\src\\Audios\\nu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("நூ")) {//78
            try {
                File fl = new File(".\\src\\Audios\\nuuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("நெ")) {//79
            try {
                File fl = new File(".\\src\\Audios\\ne-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("நே")) {//80
            try {
                File fl = new File("C:\\Users\\lalindu\\Desktop\\4thYrarResearchProject\\src\\Audios\\nee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("நொ")) {//81
            try {
                File fl = new File(".\\src\\Audios\\no-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("நோ")) {//82
            try {
                File fl = new File(".\\src\\Audios\\noo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("நௌ")) {//83
            try {
                File fl = new File(".\\src\\Audios\\nau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ப்")) {//84
            try {
                File fl = new File(".\\src\\Audios\\p-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ப")) {//85
            try {
                File fl = new File(".\\src\\Audios\\pa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("பா")) {//86
            try {
                File fl = new File(".\\src\\Audios\\paa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ப")) {//87
            try {
                File fl = new File(".\\src\\Audios\\pi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("ப")) {//88
            try {
                File fl = new File(".\\src\\Audios\\pii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("பு")) {//89
            try {
                File fl = new File(".\\src\\Audios\\pu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("பூ")) {//90
            try {
                File fl = new File(".\\src\\Audios\\puu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (text.endsWith("பெ")) {//91
            try {
                File fl = new File(".\\src\\Audios\\pe-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }
        else if (text.endsWith("பே")) {//92
            try {
                File fl = new File(".\\src\\Audios\\pee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        else if (text.endsWith("பொ")) {//93
            try {             
                File fl = new File(".\\src\\Audios\\po-Part 2.mp3");//create th file object 
                FileInputStream fs = new FileInputStream(fl);//reade file by byte by byte 
                BufferedInputStream bis = new BufferedInputStream(fs);//reade byet and create the line 
                Player pp = new Player(bis);//plye the read line //after create ply object 
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        /////////////Start it from here ///////////////
        else if (text.endsWith("போ")) {//92 poo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\poo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("பௌ")) {//92 pau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\pau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ம்")) {//92 m_Part_2
            try {
                File fl = new File(".\\src\\Audios\\m-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ம")) {//92 ma_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ma-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("மா")) {//92 maa_Part_2
            try {
                File fl = new File(".\\src\\Audios\\maa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("மி")) {//92 mi_Part_2
            try {
                File fl = new File(".\\src\\Audios\\mi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("மீ")) {//92 mii_Part_2
            try {
                File fl = new File(".\\src\\Audios\\mii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("மு")) {//92 mu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\mu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("மூ")) {//92 muu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\muu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("மெ")) {//92 me_Part_2
            try {
                File fl = new File(".\\src\\Audios\\me-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("மே")) {//92 mee_Part_2
            try {
                File fl = new File(".\\src\\Audios\\mee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("மை")) {// mai_Part_2 ///start another slot of code
            try {
                File fl = new File(".\\src\\Audios\\mai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("மொ")) {// mo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\mo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("மோ")) {// moo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\moo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("மௌ")) {// mau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\mau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        else if (text.endsWith("ய்")) {//y_Part_2 ///
            try {
                File fl = new File(".\\src\\Audios\\y-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ய")) {// ya_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ya-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("யா")) {// yaa_Part_2
            try {
                File fl = new File(".\\src\\Audios\\yaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("யி")) {// yi_Part_2
            try {
                File fl = new File(".\\src\\Audios\\yi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("யீ")) {// yii_Part_2 ///
            try {
                File fl = new File(".\\src\\Audios\\yii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("யு")) {// yu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\yu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("யூ")) {// yuu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\yuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("யெ")) {// ye_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ye-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("யே")) {// yee_Part_2 ///
            try {
                File fl = new File(".\\src\\Audios\\yee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("யை")) {// yai_Part_2
            try {
                File fl = new File(".\\src\\Audios\\yai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("யொ")) {// yo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\yo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("யோ")) {// yoo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\yoo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("யௌ")) {// yau_Part_2 ///
            try {
                File fl = new File(".\\src\\Audios\\yau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ர்")) {// r_Part_2
            try {
                File fl = new File(".\\src\\Audios\\r-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ர")) {// ra_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ra-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ரா")) {// raa_Part_2
            try {
                File fl = new File(".\\src\\Audios\\raa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ரி")) {// ri_Part_2 ///
            try {
                File fl = new File(".\\src\\Audios\\ri-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ரீ")) {// rii_Part_2
            try {
                File fl = new File(".\\src\\Audios\\rii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ரு")) {// ru_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ru-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ரூ")) {// ruu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ruu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ரெ")) {// re_Part_2 ///
            try {
                File fl = new File(".\\src\\Audios\\re-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ரே")) {// ree_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ree-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ரை")) {// rai_Part_2
            try {
                File fl = new File(".\\src\\Audios\\rai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ரொ")) {// ro_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ro-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ரோ")) {// roo_Part_2 ///
            try {
                File fl = new File(".\\src\\Audios\\roo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ரௌ")) {// rau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\rau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ல்")) {// l_Part_2
            try {
                File fl = new File(".\\src\\Audios\\l-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ல")) {// la_Part_2
            try {
                File fl = new File(".\\src\\Audios\\la-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("லா")) {// laa_Part_2 ///
            try {
                File fl = new File(".\\src\\Audios\\laa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("லி")) {// li_Part_2
            try {
                File fl = new File(".\\src\\Audios\\li-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("லீ")) {// lii_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("லு")) {// lu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("லூ")) {// luu_Part_2 ///
            try {
                File fl = new File(".\\src\\Audios\\luu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("லெ")) {// le_Part_2
            try {
                File fl = new File(".\\src\\Audios\\le-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("லே")) {// lee_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("லொ")) {// lo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        else if (text.endsWith("லோ")) {// loo_Part_2 ///
            try {
                File fl = new File(".\\src\\Audios\\loo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("லௌ")) {// lau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("வ்")) {// v_Part_2
            try {
                File fl = new File(".\\src\\Audios\\v-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("வ")) {// va_Part_2
            try {
                File fl = new File(".\\src\\Audios\\va-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        else if (text.endsWith("வா")) {// vaa_Part_2 ///
            try {
                File fl = new File(".\\src\\Audios\\vaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("வி")) {// vi_Part_2
            try {
                File fl = new File(".\\src\\Audios\\vi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("வீ")) {// vii_Part_2
            try {
                File fl = new File(".\\src\\Audios\\vii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("வு")) {// vu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\vu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        else if (text.endsWith("வூ")) {// vuu_Part_2 ///
            try {
                File fl = new File(".\\src\\Audios\\vuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("வெ")) {// ve_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ve-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("வே")) {// vee_Part_2
            try {
                File fl = new File(".\\src\\Audios\\vee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("வை")) {// vai_Part_2
            try {
                File fl = new File(".\\src\\Audios\\vai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        else if (text.endsWith("வொ")) {// vo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\vo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("வோ")) {// voo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\voo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("வௌ")) {// vau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\vau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ள்")) {// l_Part_2
            try {
                File fl = new File(".\\src\\Audios\\l-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ள")) {// la_Part_2
            try {
                File fl = new File(".\\src\\Audios\\la-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ளா")) {// laa_Part_2
            try {
                File fl = new File(".\\src\\Audios\\laa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ளி")) {// li_Part_2
            try {
                File fl = new File(".\\src\\Audios\\li-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ளீ")) {// lii_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ளு")) {// lu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ளூ")) {// luu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\luu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ளெ")) {// le_Part_2
            try {
                File fl = new File(".\\src\\Audios\\le-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ளே")) {// lee_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ளை")) {// lai_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ளொ")) {// lo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ளோ")) {// loo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\loo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ளௌ")) {// lau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ழ்")) {// l_Part_2
            try {
                File fl = new File(".\\src\\Audios\\l-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ழ")) {// la_Part_2
            try {
                File fl = new File(".\\src\\Audios\\la-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ழா")) {// laa_Part_2
            try {
                File fl = new File(".\\src\\Audios\\laa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ழி")) {// li_Part_2
            try {
                File fl = new File(".\\src\\Audios\\li-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ழீ")) {// lii_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ழு")) {// lu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ழூ")) {// luu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\luu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ழெ")) {// le_Part_2
            try {
                File fl = new File(".\\src\\Audios\\le-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ழே")) {// lee_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ழை")) {// lai_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ழொ")) {// lo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ழோ")) {// loo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\loo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ழௌ")) {// lau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\lau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ற்")) {// r_Part_2
            try {
                File fl = new File(".\\src\\Audios\\r-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ற")) {// ra_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ra-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("றா")) {// raa_Part_2
            try {
                File fl = new File(".\\src\\Audios\\raa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("றி")) {// ri_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ri-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("றீ")) {// rii_Part_2
            try {
                File fl = new File(".\\src\\Audios\\rii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("று")) {// ru_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ru-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("றூ")) {// ruu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ruu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("றெ")) {// re_Part_2
            try {
                File fl = new File(".\\src\\Audios\\re-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("றே")) {// ree_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ree-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("றை")) {// rai_Part_2
            try {
                File fl = new File(".\\src\\Audios\\rai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("றொ")) {// ro_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ro-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("றோ")) {// roo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\roo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("றௌ")) {// rau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\rau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ன்")) {// n_Part_2
            try {
                File fl = new File(".\\src\\Audios\\n-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ன")) {// na_Part_2
            try {
                File fl = new File(".\\src\\Audios\\na-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("னா")) {// naa_Part_2
            try {
                File fl = new File(".\\src\\Audios\\naa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("னி")) {// ni_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ni-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("னீ")) {// nii_Part_2
            try {
                File fl = new File(".\\src\\Audios\\nii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("னு")) {// nu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\nu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("னூ")) {// nuuu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\nuuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("னெ")) {// ne_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ne-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("னே")) {// nee_Part_2
            try {
                File fl = new File(".\\src\\Audios\\nee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("னை")) {// nai_Part_2
            try {
                File fl = new File(".\\src\\Audios\\nai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("னொ")) {// no_Part_2
            try {
                File fl = new File(".\\src\\Audios\\no-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("னோ")) {// noo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\noo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("னௌ")) {// nau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\nau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஸ்")) {// s_Part_2
            try {
                File fl = new File(".\\src\\Audios\\s-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஸ")) {// sa_Part_2
            try {
                File fl = new File(".\\src\\Audios\\sa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஸா")) {// saa_Part_2
            try {
                File fl = new File(".\\src\\Audios\\saa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஸி")) {// si_Part_2
            try {
                File fl = new File(".\\src\\Audios\\si-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஸீ")) {// sii_Part_2
            try {
                File fl = new File(".\\src\\Audios\\sii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ஸு")) {// su_Part_2
            try {
                File fl = new File(".\\src\\Audios\\su-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஸூ")) {// suu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\suu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஸெ")) {// se_Part_2
            try {
                File fl = new File(".\\src\\Audios\\se-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஸே")) {// see_Part_2
            try {
                File fl = new File(".\\src\\Audios\\see-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஸை")) {// sai_Part_2
            try {
                File fl = new File(".\\src\\Audios\\sai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஸொ")) {// so_Part_2
            try {
                File fl = new File(".\\src\\Audios\\so-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஸோ")) {// soo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\soo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஸௌ")) {// sau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\sau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஹ்")) {// h_Part_2
            try {
                File fl = new File(".\\src\\Audios\\h-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஹ")) {// ha_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ha-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஹா")) {// haa_Part_2
            try {
                File fl = new File(".\\src\\Audios\\haa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஹி")) {// hi_Part_2
            try {
                File fl = new File(".\\src\\Audios\\hi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        else if (text.endsWith("ஹீ")) {// hii_Part_2
            try {
                File fl = new File(".\\src\\Audios\\hii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஹு")) {// hu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\hu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஹூ")) {// huu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\huu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஹெ")) {// he_Part_2
            try {
                File fl = new File(".\\src\\Audios\\he-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஹே")) {// hee_Part_2
            try {
                File fl = new File(".\\src\\Audios\\hee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஹை")) {// hai_Part_2
            try {
                File fl = new File(".\\src\\Audios\\hai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஹொ")) {// ho_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ho-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஹோ")) {// hoo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\hoo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஹௌ")) {// hau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\hau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஷ்")) {// sh_Part_2
            try {
                File fl = new File(".\\src\\Audios\\sh-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஷ")) {// sha_Part_2
            try {
                File fl = new File(".\\src\\Audios\\sha-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஷா")) {// shaa_Part_2
            try {
                File fl = new File(".\\src\\Audios\\shaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ஷி")) {// shi_Part_2
            try {
                File fl = new File(".\\src\\Audios\\shi-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஷீ")) {// shii_Part_2
            try {
                File fl = new File(".\\src\\Audios\\shii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஷு")) {// shu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\shu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஷூ")) {// ahuu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\shuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஷெ")) {// she_Part_2
            try {
                File fl = new File(".\\src\\Audios\\she-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஷே")) {// shee_Part_2
            try {
                File fl = new File(".\\src\\Audios\\shee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஷை")) {// shai_Part_2
            try {
                File fl = new File(".\\src\\Audios\\shai-Part 2.mp3 b");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஷொ")) {// sho_Part_2
            try {
                File fl = new File(".\\src\\Audios\\sho-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஷோ")) {// shoo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\shoo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஷௌ")) {// shau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\shau-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஜ்")) {// j_Part_2
            try {
                File fl = new File(".\\src\\Audios\\j-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஜ")) {// ja_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ja-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (text.endsWith("ஜா")) {// jaa_Part_2
            try {
                File fl = new File(".\\src\\Audios\\jaa-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஜி")) {// ji_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ji-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஜீ")) {// jii_Part_2
            try {
                File fl = new File(".\\src\\Audios\\jii-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஜு")) {// ju_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ju-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஜூ")) {// vuu_Part_2
            try {
                File fl = new File(".\\src\\Audios\\vuu-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஜெ")) {// je_Part_2
            try {
                File fl = new File(".\\src\\Audios\\je-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஜே")) {// jee_Part_2
            try {
                File fl = new File(".\\src\\Audios\\jee-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஜை")) {// jai_Part_2
            try {
                File fl = new File(".\\src\\Audios\\jai-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஜொ")) {// jo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\jo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஜோ")) {// joo_Part_2
            try {
                File fl = new File(".\\src\\Audios\\joo-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         else if (text.endsWith("ஜௌ")) {// jau_Part_2
            try {
                File fl = new File(".\\src\\Audios\\ja-Part 2.mp3");
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                Player pp = new Player(bis);
                pp.play();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
         
//         
    }
     
     //*************************************************************************
    public static void englishDocumentPrepareHelpSound() {
        try {
            File fl = new File(".\\src\\Audios\\EnglishDocumentHelpSound.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     public static void englishBrailleDocumentPrepareHelpSound() {
        try {
            File fl = new File(".\\src\\Audios\\EnglishBraille navigator.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void englishLanvageConversionIntroduction() {
        try {
            File fl = new File(".\\src\\Audios\\EnglishLanvageConversionSupport.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void getIntroductionByEnglish()
    {
        try {
            File fl = new File(".\\src\\Audios\\English.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   // *************************************************************************************************
    public static void SinhalaDocumentPrepareHelpSound() {
        try {
            File fl = new File(".\\src\\Audios\\SinhalaDocumentHelp.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     public static void SinhalaBrailleDocumentPrepareHelpSound() {
        try {
            File fl = new File(".\\src\\Audios\\SinhalaBrailleHelp.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void sinhalaLanvageConversionIntroduction() {
        try {
            File fl = new File(".\\src\\Audios\\SinhalaLanguageConversion.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void getIntroductionBySinhala()
    {
        try {
            File fl = new File(".\\src\\Audios\\Sinhalaw.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    //****************************************************************************************************
     public static void TamilDocumentPrepareHelpSound() {
        try {
            File fl = new File(".\\src\\Audios\\tamil1.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     public static void TamilBrailleDocumentPrepareHelpSound() {
        try {
            File fl = new File(".\\src\\Audios\\tamil2.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void TamilLanvageConversionIntroduction() {
        try {
            File fl = new File(".\\src\\Audios\\tamil3.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     public static void getIntroductionByTamil() {
        try {
            File fl = new File(".\\src\\Audios\\tamil4.mp3");
            FileInputStream fs = new FileInputStream(fl);
            BufferedInputStream bis = new BufferedInputStream(fs);
            Player pp = new Player(bis);
            pp.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}



