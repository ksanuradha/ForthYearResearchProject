/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlersofBCLC;

import GuiOFBCLC.DocumentLanguage;
import GuiOFBCLC.EnglishBrail;
import GuiOFBCLC.EnglishBrailbySinhala;
import GuiOFBCLC.EnglishBrailbyTamil;
import GuiOFBCLC.EnglishDocument1;
import static GuiOFBCLC.EnglishDocument1.EnglishDocument;
import GuiOFBCLC.EnglishLanguageConversion;
import GuiOFBCLC.SinhalaBrail;
import GuiOFBCLC.SinhalaBrailTBYEnglish;
import GuiOFBCLC.SinhalaBrailTBYTamil;
import GuiOFBCLC.SinhalaDocument;
import static GuiOFBCLC.SinhalaDocument.SinhlaDocument;
import GuiOFBCLC.SinhalaLanguageConversion;
import GuiOFBCLC.TamilBrail;
import GuiOFBCLC.TamilBrailTranslateBYEnglish;
import GuiOFBCLC.TamilBrailTranslateBYSinhala;
import GuiOFBCLC.TamilDocument;
import static GuiOFBCLC.TamilDocument.TamilDocument;
import GuiOFBCLC.TamilLanguageConversion;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class NavigationHelpController
{
   
     int count = 0;
     int count1 = 0;
     int count2 = 0;
     int count3 = 0;

    public static void englishDocumentInterfaceNavigation(int keyCode, EnglishDocument1 englishDocument1) {
        if (keyCode == 112)//F1
        {
            TextToVoice.englishVoice(EnglishDocument.getText());
        } else if (keyCode == 116)//F5
        {
            Sound.englishDocumentPrepareHelpSound();
        } else if (keyCode == 113)//F2
        {
            String englishDocument = EnglishDocument.getText();
            EnglishBrail.s = englishDocument;
            EnglishDocument.setText("");
            EnglishBrail dictionaryService = new EnglishBrail();
            dictionaryService.setVisible(true);
            englishDocument1.dispose();
        } else if (keyCode == 115)//F4
        {
            DocumentLanguage documentLanguage = new DocumentLanguage();
            documentLanguage.setVisible(true);
            englishDocument1.dispose();
        } else if (keyCode == 114)//F3
        {
            String englishDocumen = EnglishDocument.getText();
            EnglishBrail.s = englishDocumen;
            String englishDocument = EnglishDocument.getText();
            EnglishLanguageConversion.s = englishDocument;
            EnglishLanguageConversion englishLanguageConversion = new EnglishLanguageConversion();
            englishLanguageConversion.setVisible(true);
            englishDocument1.dispose();
        }
    }

    public static void englishBraille(int keycode, EnglishBrail englishBrail) {
        if (keycode == 114)//F1
        {
            Sound.englishBrailleDocumentPrepareHelpSound();
        } else if (keycode == 113) {
            EnglishDocument1 dictionaryService = new EnglishDocument1();
            dictionaryService.setVisible(true);
            englishBrail.dispose();
        } else if (keycode == 112) {
            PrinterJob pj = PrinterJob.getPrinterJob();
            if (pj.printDialog()) {
                try {
                    pj.print();
                } catch (PrinterException exc) {
                    System.out.println(exc);
                }
            }
            PrinterJob pj1 = PrinterJob.getPrinterJob();
            PageFormat pf = pj.pageDialog(pj1.defaultPage());
        }
    }

    public static void englishBraillebySinhalaLanvageConversion(int keycode, SinhalaBrailTBYEnglish sinhalaBrailTBYEnglish) {
        if (keycode == 114)//F1
        {
            Sound.englishBrailleDocumentPrepareHelpSound();
        } else if (keycode == 113) {
            EnglishLanguageConversion englishLanguageConversion = new EnglishLanguageConversion();
            englishLanguageConversion.setVisible(true);
            sinhalaBrailTBYEnglish.dispose();
        } else if (keycode == 112) {
            PrinterJob pj = PrinterJob.getPrinterJob();
            if (pj.printDialog()) {
                try {
                    pj.print();
                } catch (PrinterException exc) {
                    System.out.println(exc);
                }
            }
            PrinterJob pj1 = PrinterJob.getPrinterJob();
            PageFormat pf = pj.pageDialog(pj1.defaultPage());
        }
    }

    public static void englishBrailleByTamilLanguageConversion(int keycode, TamilBrailTranslateBYEnglish tamilBrailTranslateBYEnglish) {
        if (keycode == 114)//F1
        {
            Sound.englishBrailleDocumentPrepareHelpSound();
        } else if (keycode == 113) {
            EnglishLanguageConversion englishLanguageConversion = new EnglishLanguageConversion();
            englishLanguageConversion.setVisible(true);
            tamilBrailTranslateBYEnglish.dispose();
        } else if (keycode == 112) {
            PrinterJob pj = PrinterJob.getPrinterJob();
            if (pj.printDialog()) {
                try {
                    pj.print();
                } catch (PrinterException exc) {
                    System.out.println(exc);
                }
            }
            PrinterJob pj1 = PrinterJob.getPrinterJob();
            PageFormat pf = pj.pageDialog(pj1.defaultPage());
        }
    }

    public static void TamilhDocumentInterfaceNavigation(int keyCode, TamilDocument tamilDocument) {
        if (keyCode == 112)//F1
        {
            Sound.playTamilSound();
        } else if (keyCode == 113)//F2
        {
            String ss = TamilDocument.getText();
            TamilBrail.s = ss;
            TamilBrail dictionaryService = new TamilBrail();
            dictionaryService.setVisible(true);
            tamilDocument.dispose();
        } else if (keyCode == 114)//F3
        {
            String ss = TamilDocument.getText();
            TamilLanguageConversion.s = ss;
            TamilLanguageConversion tamilLanguageConversion = new TamilLanguageConversion();
            tamilLanguageConversion.setVisible(true);
            tamilDocument.dispose();
        } else if (keyCode == 115)//F4
        {
            DocumentLanguage dictionaryService = new DocumentLanguage();
            dictionaryService.setVisible(true);
            tamilDocument.dispose();

        } else if (keyCode == 116)//F5
        {
            //Enter sound clip 1
            Sound.TamilDocumentPrepareHelpSound();
        }

    }
    public static void tamileBraillle(int keycode, TamilBrail tamilBrail)
    {
        if (keycode == 114)//F1
        {
            //sound clip 3
            Sound.TamilBrailleDocumentPrepareHelpSound();
        } 
        else if (keycode == 113)
        {
            TamilDocument dictionaryService = new TamilDocument();
            dictionaryService.setVisible(true);
            tamilBrail.dispose();
        } 
        else if (keycode == 112)
        {
            PrinterJob pj = PrinterJob.getPrinterJob();
            if (pj.printDialog()) {
                try {
                    pj.print();
                } catch (PrinterException exc) {
                    System.out.println(exc);
                }
            }
            PrinterJob pj1 = PrinterJob.getPrinterJob();
            PageFormat pf = pj.pageDialog(pj1.defaultPage());
        }
    }
    public static void tamilConversionSinhalaBraille(int keycode, SinhalaBrailTBYTamil sinhalaBrailTBYTamil) 
    {
        if (keycode == 114)//F1
        {
            //sound clip 3
            Sound.TamilBrailleDocumentPrepareHelpSound();
        } 
        else if (keycode == 113)
        {
            TamilLanguageConversion enConversion = new TamilLanguageConversion();
            enConversion.setVisible(true);
            sinhalaBrailTBYTamil.dispose();
        } 
        else if (keycode == 112)
        {
            PrinterJob pj = PrinterJob.getPrinterJob();
            if (pj.printDialog()) {
                try {
                    pj.print();
                } catch (PrinterException exc) {
                    System.out.println(exc);
                }
            }
            PrinterJob pj1 = PrinterJob.getPrinterJob();
            PageFormat pf = pj.pageDialog(pj1.defaultPage());
        }
    }
    public static void tamilConversionEnglishBraille(int keycode, EnglishBrailbyTamil englishBrailbyTamil)
    {
        if (keycode == 114)//F1
        {
            //sound clip 3
            Sound.TamilBrailleDocumentPrepareHelpSound();
        } 
        else if (keycode == 113)
        {
            TamilLanguageConversion enConversion = new TamilLanguageConversion();
            enConversion.setVisible(true);
            englishBrailbyTamil.dispose();
        } 
        else if (keycode == 112)
        {
            PrinterJob pj = PrinterJob.getPrinterJob();
            if (pj.printDialog()) {
                try {
                    pj.print();
                } catch (PrinterException exc) {
                    System.out.println(exc);
                }
            }
            PrinterJob pj1 = PrinterJob.getPrinterJob();
            PageFormat pf = pj.pageDialog(pj1.defaultPage());
        }
    
    }
    
    public static void SinhalaDocumentInterfaceNavigation(int keyCode, SinhalaDocument sinhalaDocument) {
        if (keyCode == 112)//F1
        {
            Sound.playSound();
        } else if (keyCode == 116)//F5
        {
            //soundclip
            Sound.SinhalaDocumentPrepareHelpSound();
        } 
        else if (keyCode == 113)//F2
        {
             String hhh = SinhlaDocument.getText();
             SinhalaBrail.s = hhh;
             SinhalaBrail dictionaryService = new SinhalaBrail();
             dictionaryService.setVisible(true);
             sinhalaDocument.dispose();
        }
        else if (keyCode == 115)//F4
        {
            DocumentLanguage documentLanguage = new DocumentLanguage();
            documentLanguage.setVisible(true);
            sinhalaDocument.dispose();
        } 
        else if (keyCode == 114)//F3
        {
             String hhh = SinhlaDocument.getText();
             SinhalaLanguageConversion.s = hhh;
             SinhalaLanguageConversion sinhalaLanguageConversion = new SinhalaLanguageConversion();
             sinhalaLanguageConversion.setVisible(true);
             sinhalaDocument.dispose();
        }
    }
    public static void SinhalaBraillle(int keycode, SinhalaBrail sinhalaBrail)
    {
        if (keycode == 114)//F1
        {
            //sound clip 3
            Sound.SinhalaBrailleDocumentPrepareHelpSound();
        } 
        else if (keycode == 113)
        {
                SinhalaDocument dictionaryService = new SinhalaDocument();
                dictionaryService.setVisible(true);
                sinhalaBrail.dispose();
        } 
        else if (keycode == 112)
        {
            PrinterJob pj = PrinterJob.getPrinterJob();
            if (pj.printDialog()) {
                try {
                    pj.print();
                } catch (PrinterException exc) {
                    System.out.println(exc);
                }
            }
            PrinterJob pj1 = PrinterJob.getPrinterJob();
            PageFormat pf = pj.pageDialog(pj1.defaultPage());
        }
    }
    
     public static void SinhalaConversionEnglishBraille(int keycode, EnglishBrailbySinhala englishBrailbySinhala)
    {
        if (keycode == 114)//F1
        {
            //sound clip 3
            Sound.SinhalaBrailleDocumentPrepareHelpSound();
        } 
        else if (keycode == 113)
        {
            SinhalaLanguageConversion sinhalaLanguageConversion = new SinhalaLanguageConversion();
            sinhalaLanguageConversion.setVisible(true);
            englishBrailbySinhala.dispose();
        } 
        else if (keycode == 112)
        {
            PrinterJob pj = PrinterJob.getPrinterJob();
            if (pj.printDialog()) {
                try {
                    pj.print();
                } catch (PrinterException exc) {
                    System.out.println(exc);
                }
            }
            PrinterJob pj1 = PrinterJob.getPrinterJob();
            PageFormat pf = pj.pageDialog(pj1.defaultPage());
        }
         
    }
      public static void SinhalaConversionTamilBraille(int keycode, TamilBrailTranslateBYSinhala tamilBrailTranslateBYSinhala)
    {
        if (keycode == 114)//F1
        {
            //sound clip 3
            Sound.SinhalaBrailleDocumentPrepareHelpSound();
        } 
        else if (keycode == 113)
        {
            SinhalaLanguageConversion sinhalaLanguageConversion = new SinhalaLanguageConversion();
            sinhalaLanguageConversion.setVisible(true);
            tamilBrailTranslateBYSinhala.dispose();
        } 
        else if (keycode == 112)
        {
            PrinterJob pj = PrinterJob.getPrinterJob();
            if (pj.printDialog()) {
                try {
                    pj.print();
                } catch (PrinterException exc) {
                    System.out.println(exc);
                }
            }
            PrinterJob pj1 = PrinterJob.getPrinterJob();
            PageFormat pf = pj.pageDialog(pj1.defaultPage());
        }
         
    }

}
