package ControlersofBCLC;

import GuiOFBCLC.DictionaryService;
import GuiOFBCLC.DocumentLanguage;
import GuiOFBCLC.EnglishBrail;
import GuiOFBCLC.EnglishBrailbySinhala;
import GuiOFBCLC.EnglishBrailbyTamil;

import GuiOFBCLC.EnglishDocument1;
import GuiOFBCLC.EnglishLanguageConversion;
import GuiOFBCLC.SinhalaBrail;
import GuiOFBCLC.SinhalaBrailTBYEnglish;
import GuiOFBCLC.SinhalaBrailTBYTamil;
import GuiOFBCLC.SinhalaDocument;

import GuiOFBCLC.SinhalaLanguageConversion;
import GuiOFBCLC.StartPoint;
import GuiOFBCLC.TamilBrail;
import GuiOFBCLC.TamilBrailTranslateBYEnglish;
import GuiOFBCLC.TamilBrailTranslateBYSinhala;
import GuiOFBCLC.TamilDocument;
import GuiOFBCLC.TamilLanguageConversion;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MovingTitle {

    public static void movingTitle(final StartPoint startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }

    public static void movingTitle2(final DictionaryService startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }

    public static void movingTitle3(final DocumentLanguage startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }

    public static void movingTitle4(final SinhalaDocument startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }

    public static void movingTitle5(final SinhalaBrail startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }

    public static void movingTitle6(final TamilDocument startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }

    public static void movingTitle7(final TamilBrail startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }

    public static void movingTitle8(final EnglishDocument1 startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }

    public static void movingTitle9(final EnglishBrail startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }

    public static void movingTitle10(final SinhalaLanguageConversion startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }

    public static void movingTitle11(final TamilLanguageConversion startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }

    public static void movingTitle12(final EnglishLanguageConversion startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }
     public static void movingTitle13(final SinhalaBrailTBYEnglish startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }
     public static void movingTitle14(final TamilBrailTranslateBYEnglish startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }
     
       public static void movingTitle15(final SinhalaBrailTBYTamil startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }
       
         public static void movingTitle16(final EnglishBrailbyTamil startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }
         
     public static void movingTitle17(final TamilBrailTranslateBYSinhala startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }
     
      public static void movingTitle18(final EnglishBrailbySinhala startPoint, final String text) {
        new Thread() {
            String s = "";

            public void run() {
                while (true) {
                    String[] arr = text.split("");
                    for (int i = 0; i < arr.length; i++) {
                        s = s.concat(arr[i]);
                        startPoint.setTitle(s);
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    s = " ";

                }
            }
        }.start();
    }
     
    public static void gettade() {
        new Thread() {
            public void run() {
                while (true) {
                    Calendar calender = Calendar.getInstance();
                    String time = calender.getTime().toString();
                    StartPoint.SettingDate.setText(time);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MovingTitle.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();

    }

}
