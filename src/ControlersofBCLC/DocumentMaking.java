package ControlersofBCLC;

import GuiOFBCLC.DictionaryService;
import GuiOFBCLC.SinhalaDocument;
import GuiOFBCLC.TamilDocument;
import javax.swing.JTextArea;

public class DocumentMaking {

    public static void sinhalaUnicode(String text,int a) {

        text = text.replace("'a", "අආ");
        text = text.replace(";a", "අඅ");
        text = text.replace("a", "අ");
        text = text.replace("අඅ", "ආ");
        text = text.replace("i", "ඉ");
        text = text.replace("ඉඉ", "ඊ");
        text = text.replace("u", "උ");
        text = text.replace("උඋ", "ඌ");
        text = text.replace("e", "එ");
        text = text.replace("එඑ", "ඒ");
        text = text.replace("o", "ඔ");
        text = text.replace("ඔඔ", "ඕ");
        text = text.replace("A", "ඇ");
        text = text.replace("ඇඅ", "ඈ");
        text = text.replace("අඉ", "ඓ");
        text = text.replace("අඋ", "ඖ");

        text = text.replace(";r", "රරා");
        text = text.replace("r", "ර්");
        text = text.replace("ර්අ", "ර");
        //text = text.replace("ර්අඉ", "රෛ");
        text = text.replace("රඅ", "රා");
        text = text.replace("ර්ඉ", "රි");
        text = text.replace("රිඉ", "රී");
        text = text.replace("රොඔ", "රෝ");
        text = text.replace("ර්ඔ", "රො");
        text = text.replace("ර්එ", "රෙ");

        text = text.replace("රෙඑ", "රේ");

        text = text.replace("ර්අ", "ර");
        text = text.replace("රඉ", "රෛ");
        text = text.replace("ර්උ", "රු");
        text = text.replace("රුඋ", "රූ");
        text = text.replace("ර්ඇ", "රැ");
        text = text.replace("රැඅ", "රෑ");
        text = text.replace("රඋ", "රෟ");
        //cons
        text = text.replace(";n", "නනා");
        text = text.replace("n", "න්");
        text = text.replace("න්අ", "න");
        text = text.replace("නඅ", "නා");
        text = text.replace("න්ඉ", "නි");
        //  text = text.replace("න්ර", "න්‍ර");
        text = text.replace("නිඉ", "නී");
        text = text.replace("නොඔ", "නෝ");
        text = text.replace("න්ඔ", "නො");
        text = text.replace("න්එ", "නෙ");
        text = text.replace("නෙඑ", "නේ");
        text = text.replace("නඉ", "නෛ");
        text = text.replace("න්උ", "නු");
        text = text.replace("නුඋ", "නූ");
        text = text.replace("න්ඇ", "නැ");
        text = text.replace("නැඅ", "නෑ");
        text = text.replace("නඋ", "නෟ");

        text = text.replace("න්'", "ං");

        text = text.replace(";h", "හහා");
        text = text.replace("h", "හ්");
        text = text.replace("හ්අ", "හ");
        text = text.replace("හඅ", "හා");
        text = text.replace("හ්ඉ", "හි");
        text = text.replace("හිඉ", "හී");
        text = text.replace("හ්ඔ", "හො");
        text = text.replace("හොඔ", "හෝ");
        text = text.replace("හ්එ", "හෙ");
        text = text.replace("හෙඑ", "හේ");
        text = text.replace("හඉ", "හෛ");
        text = text.replace("හ්උ", "හු");
        text = text.replace("හුඋ", "හූ");
        text = text.replace("හ්ඇ", "හැ");
        text = text.replace("හැඅ", "හෑ");
        text = text.replace("හඋ", "හෟ");

        text = text.replace("අහ්", "අං");
        text = text.replace("අන්;", "අඃ");

        text = text.replace(";k", "කකා");
        text = text.replace("k", "ක්");
        text = text.replace("ක්අ", "ක");
        text = text.replace("කඅ", "කා");
        text = text.replace("ක්ඉ", "කි");
        text = text.replace("කිඉ", "කී");
        text = text.replace("ක්ඔ", "කො");
        text = text.replace("කොඔ", "කෝ");
        text = text.replace("ක්එ", "කෙ");
        text = text.replace("කෙඑ", "කේ");
        text = text.replace("කඉ", "කෛ");
        text = text.replace("ක්උ", "කු");
        text = text.replace("කුඋ", "කූ");
        text = text.replace("ක්ඇ", "කැ");
        text = text.replace("කැඅ", "කෑ");
        text = text.replace("කඋ", "කෟ");
        text = text.replace("ක්ර", "ක්‍ර");
        text = text.replace("කෙඋ", "කෞ");

        text = text.replace(";g", "ගගා");
        text = text.replace("g", "ග්");
        text = text.replace("ග්අ", "ග");
        text = text.replace("ගඅ", "ගා");
        text = text.replace("ග්ඉ", "ගි");
        text = text.replace("ගිඉ", "ගී");
        text = text.replace("ග්ඔ", "ගො");
        text = text.replace("ගොඔ", "ගෝ");
        text = text.replace("ග්එ", "ගෙ");
        text = text.replace("ගෙඑ", "ගේ");
        text = text.replace("ගඉ", "ගෛ");
        text = text.replace("ග්උ", "ගු");
        text = text.replace("ගුඋ", "ගූ");
        text = text.replace("ග්ඇ", "ගැ");
        text = text.replace("ගැඅ", "ගෑ");
        text = text.replace("ගඋ", "ගෟ");
        text = text.replace("ග්ර", "ග්‍ර");
        text = text.replace("ගෙඋ", "ගෞ");

        text = text.replace("cහ්", "ච්");
        text = text.replace("ච්අ", "ච");
        text = text.replace("චඅ", "චා");
        text = text.replace("ච්ඉ", "චි");
        text = text.replace("චිඉ", "චී");
        text = text.replace("ච්ඔ", "චො");
        text = text.replace("චොඔ", "චෝ");
        text = text.replace("ච්එ", "චෙ");
        text = text.replace("චෙඑ", "චේ");
        text = text.replace("චඉ", "චෛ");
        text = text.replace("ච්උ", "චු");
        text = text.replace("චුඋ", "චූ");
        text = text.replace("ච්ඇ", "චැ");
        text = text.replace("චැඅ", "චෑ");
        text = text.replace("චඋ", "චෟ");
        text = text.replace("ච්ර", "ච්‍ර");
        text = text.replace("චෙඋ", "චෞ");


        text = text.replace("j", "ජ්");
        text = text.replace("ජ්අ", "ජ");
        text = text.replace("ජඅ", "ජා");
        text = text.replace("ජ්ඉ", "ජි");
        text = text.replace("ජිඉ", "ජී");
        text = text.replace("ජ්ඔ", "ජො");
        text = text.replace("ජොඔ", "ජෝ");
        text = text.replace("ජ්එ", "ජෙ");
        text = text.replace("ජෙඑ", "ජේ");
        text = text.replace("ජඉ", "ජෛ");
        text = text.replace("ජ්උ", "ජු");
        text = text.replace("ජුඋ", "ජූ");
        text = text.replace("ජ්ඇ", "ජැ");
        text = text.replace("ජැඅ", "ජෑ");
        text = text.replace("ජඋ", "ජෟ");
        text = text.replace("ජ්ර", "ජ්‍ර");
        text = text.replace("ජෙඋ", "ජෞ");

        text = text.replace("Y", "්‍ය්");
        text = text.replace("්‍ය්අ", "්‍ය");
        text = text.replace("්‍යඅ", "්‍යා");

        text = text.replace("්‍යාඔ", "්‍යො");
        text = text.replace("්‍යොඔ", "්‍යෝ");
        text = text.replace("්‍යඑ", "්‍යෙ");
        text = text.replace("්‍යෙඑ", "්‍යේ");
        text = text.replace("ටඉ", "ටෛ");
        text = text.replace("්‍ය්උ", "්‍යු");
        text = text.replace("්‍යුඋ", "්‍යූ");

        text = text.replace("t", "ට්");
        text = text.replace("ට්අ", "ට");
        text = text.replace("ටඅ", "ටා");
        text = text.replace("ට්ඉ", "ටි");
        text = text.replace("ටිඉ", "ටී");
        text = text.replace("ට්ඔ", "ටො");
        text = text.replace("ටොඔ", "ටෝ");
        text = text.replace("ට්එ", "ටෙ");
        text = text.replace("ටෙඑ", "ටේ");
        text = text.replace("ටඉ", "ටෛ");
        text = text.replace("ට්උ", "ටු");
        text = text.replace("ටුඋ", "ටූ");
        text = text.replace("ට්ඇ", "ටැ");
        text = text.replace("ටැඅ", "ටෑ");
        text = text.replace("ටඋ", "ටෟ");
        text = text.replace("ට්ර", "ට්‍ර");
        text = text.replace("ටෙඋ", "ටෞ");

        text = text.replace("d", "ඩ්");
        text = text.replace("ඩ්අ", "ඩ");
        text = text.replace("ඩඅ", "ඩා");
        text = text.replace("ඩ්ඉ", "ඩි");
        text = text.replace("ඩිඉ", "ඩී");
        text = text.replace("ඩ්ඔ", "ඩො");
        text = text.replace("ඩොඔ", "ඩෝ");
        text = text.replace("ඩ්එ", "ඩෙ");
        text = text.replace("ඩෙඑ", "ඩේ");
        text = text.replace("ඩඉ", "ඩෛ");
        text = text.replace("ඩ්උ", "ඩු");
        text = text.replace("ඩුඋ", "ඩූ");
        text = text.replace("ඩ්ඇ", "ඩැ");
        text = text.replace("ඩැඅ", "ඩෑ");
        text = text.replace("ඩඋ", "ඩෟ");
        text = text.replace("ඩ්ර", "ඩ්‍ර");
        text = text.replace("ඩෙඋ", "ඩෞ");

        text = text.replace("N", "ණ්");
        text = text.replace("ණ්අ", "ණ");
        text = text.replace("ණඅ", "ණා");
        text = text.replace("ණ්ඉ", "ණි");
        text = text.replace("ණිඉ", "ණී");
        text = text.replace("ණ්ඔ", "ණො");
        text = text.replace("ණොඔ", "ණෝ");
        text = text.replace("ණ්එ", "ණෙ");
        text = text.replace("ණෙඑ", "ණේ");
        text = text.replace("ණඉ", "ණෛ");
        text = text.replace("ණ්උ", "ණු");
        text = text.replace("ණ්ඌ", "ණූ");
        text = text.replace("ණ්ඇ", "ණැ");
        text = text.replace("ණැඅ", "ණෑ");
        text = text.replace("ණ්අඋ", "ණෟ");
        text = text.replace("ණෙඋ", "ණෞ");

        text = text.replace("ට්හ්", "ත්");
        text = text.replace("ත්අ", "ත");
        text = text.replace("තඅ", "තා");
        text = text.replace("ත්ඉ", "ති");
        text = text.replace("තිඉ", "තී");
        text = text.replace("ත්ඔ", "තො");
        text = text.replace("තොඔ", "තෝ");
        text = text.replace("ත්එ", "තෙ");
        text = text.replace("තෙඑ", "තේ");
        text = text.replace("තඉ", "තෛ");
        text = text.replace("ත්උ", "තු");
        text = text.replace("තුඋ", "තූ");
        text = text.replace("ත්ඇ", "තැ");
        text = text.replace("තැඅ", "තෑ");
        text = text.replace("තඋ", "තෟ");
        text = text.replace("ත්ර", "ත්‍ර");
        text = text.replace("තෙඋ", "තෞ");

        text = text.replace("ඩ්හ්", "ද්");
        text = text.replace("ද්අ", "ද");
        text = text.replace("දඅ", "දා");
        text = text.replace("ද්ඉ", "දි");
        text = text.replace("දිඉ", "දී");
        text = text.replace("ද්ඔ", "දො");
        text = text.replace("දොඔ", "දෝ");
        text = text.replace("ද්එ", "දෙ");
        text = text.replace("දෙඑ", "දේ");
        text = text.replace("දඉ", "දෛ");
        text = text.replace("ද්උ", "දු");
        text = text.replace("දුඋ", "දූ");
        text = text.replace("ද්ඇ", "දැ");
        text = text.replace("දැඅ", "දෑ");
        text = text.replace("දඋ", "දෟ");
        text = text.replace("ද්ර", "ද්‍ර");

        text = text.replace("p", "ප්");
        text = text.replace("ප්අ", "ප");
        text = text.replace("පඅ", "පා");
        text = text.replace("ප්ඉ", "පි");
        text = text.replace("පිඉ", "පී");
        text = text.replace("ප්ඔ", "පො");
        text = text.replace("පොඔ", "පෝ");
        text = text.replace("ප්එ", "පෙ");
        text = text.replace("පෙඑ", "පේ");
        text = text.replace("පඉ", "පෛ");
        text = text.replace("ප්උ", "පු");
        text = text.replace("පුඋ", "පූ");
        text = text.replace("ප්ඇ", "පැ");
        text = text.replace("පැඅ", "පෑ");
        text = text.replace("පඋ", "පෟ");
        text = text.replace("ප්ර", "ප්‍ර");
        text = text.replace("පෙඋ", "පෞ");

        text = text.replace("b", "බ්");
        text = text.replace("බ්අ", "බ");
        text = text.replace("බඅ", "බා");
        text = text.replace("බ්ඉ", "බි");
        text = text.replace("බිඉ", "බී");
        text = text.replace("බ්ඔ", "බො");
        text = text.replace("බොඔ", "බෝ");
        text = text.replace("බ්එ", "බෙ");
        text = text.replace("බෙඑ", "බේ");
        text = text.replace("බඉ", "බෛ");
        text = text.replace("බ්උ", "බු");
        text = text.replace("බුඋ", "බූ");
        text = text.replace("බ්ඇ", "බැ");
        text = text.replace("බැඅ", "බෑ");
        text = text.replace("බඋ", "බෟ");
        text = text.replace("බ්ර", "බ්‍ර");
        text = text.replace("බෙඋ", "බෞ");

        text = text.replace("m", "ම්");
        text = text.replace("ම්අ", "ම");
        text = text.replace("මඅ", "මා");
        text = text.replace("ම්ඉ", "මි");
        text = text.replace("මිඉ", "මී");
        text = text.replace("ම්ඔ", "මො");
        text = text.replace("මොඔ", "මෝ");
        text = text.replace("ම්එ", "මෙ");
        text = text.replace("මෙඑ", "මේ");
        text = text.replace("මඉ", "මෛ");
        text = text.replace("ම්උ", "මු");
        text = text.replace("මුඋ", "මූ");
        text = text.replace("ම්ඇ", "මැ");
        text = text.replace("මැඅ", "මෑ");
        text = text.replace("මඋ", "මෟ");
        text = text.replace("ම්ර", "ම්‍ර");
        text = text.replace("මෙඋ", "මෞ");

        text = text.replace("f", "ෆ්");
        text = text.replace("ෆ්අ", "ෆ");
        text = text.replace("ෆඅ", "ෆා");
        text = text.replace("ෆ්ඉ", "ෆි");
        text = text.replace("ෆිඉ", "ෆී");
        text = text.replace("ෆ්ඔ", "ෆො");
        text = text.replace("ෆොඔ", "ෆෝ");
        text = text.replace("ෆ්එ", "ෆෙ");
        text = text.replace("ෆෙඑ", "ෆේ");
        text = text.replace("ෆඉ", "ෆෛ");
        text = text.replace("ෆ්උ", "ෆු");
        text = text.replace("ෆුඋ", "ෆූ");
        text = text.replace("ෆ්ඇ", "ෆැ");
        text = text.replace("ෆැඅ", "ෆෑ");
        text = text.replace("ෆඋ", "ෆෟ");
        text = text.replace("ෆ්ර", "ෆ්‍ර");

        text = text.replace("y", "ය්");
        text = text.replace("ය්අ", "ය");
        text = text.replace("යඅ", "යා");
        text = text.replace("ය්ඉ", "යි");
        text = text.replace("යිඉ", "යී");
        text = text.replace("ය්ඔ", "යො");
        text = text.replace("යොඔ", "යෝ");
        text = text.replace("ය්එ", "යෙ");
        text = text.replace("යෙඑ", "යේ");
        text = text.replace("යඉ", "යෛ");
        text = text.replace("ය්උ", "යු");
        text = text.replace("යුඋ", "යූ");
        text = text.replace("ය්ඇ", "යැ");
        text = text.replace("යූඅ", "යෑ");
        text = text.replace("යඋ", "යෟ");
        text = text.replace("ය්ර", "ය්‍ර");

        text = text.replace("l", "ල්");
        text = text.replace("ල්අ", "ල");
        text = text.replace("ලඅ", "ලා");
        text = text.replace("ල්ඉ", "ලි");
        text = text.replace("ලිඉ", "ලී");
        text = text.replace("ල්ඔ", "ලො");
        text = text.replace("ලොඔ", "ලෝ");
        text = text.replace("ල්එ", "ලෙ");
        text = text.replace("ලෙඑ", "ලේ");
        text = text.replace("ලඉ", "ලෛ");
        text = text.replace("ල්උ", "ලු");
        text = text.replace("ලුඋ", "ලූ");
        text = text.replace("ල්ඇ", "ලැ");
        text = text.replace("ලැඅ", "ලෑ");
        text = text.replace("ලඋ", "ලෟ");
        text = text.replace("ලෙඋ", "ලෞ");

        text = text.replace("L", "ළ්");
        text = text.replace("ළ්අ", "ළ");
        text = text.replace("ළඅ", "ළා");
        text = text.replace("ළ්ඉ", "ළි");
        text = text.replace("ළිඉ", "ළී");
        text = text.replace("ළ්ඔ", "ළො");
        text = text.replace("ළොඔ", "ළෝ");
        text = text.replace("ළ්එ", "ළෙ");
        text = text.replace("ළෙඑ", "ළේ");
        text = text.replace("ළඉ", "ළෛ");
        text = text.replace("ළ්ඇ", "ළැ");
        text = text.replace("ළැඅ", "ළෑ");
        text = text.replace("ළඋ", "ළෟ");

        text = text.replace("v", "ව්");
        text = text.replace("ව්අ", "ව");
        text = text.replace("වඅ", "වා");
        text = text.replace("ව්ඉ", "වි");
        text = text.replace("විඉ", "වී");
        text = text.replace("ව්ඔ", "වො");
        text = text.replace("වොඔ", "වෝ");
        text = text.replace("ව්එ", "වෙ");
        text = text.replace("වෙඑ", "වේ");
        text = text.replace("වඉ", "වෛ");
        text = text.replace("ව්උ", "වු");
        text = text.replace("වුඋ", "වූ");
        text = text.replace("ව්ඇ", "වැ");
        text = text.replace("වැඅ", "වෑ");
        text = text.replace("වඋ", "වෟ");
        text = text.replace("ව්ර", "ව්‍ර");
        text = text.replace("වෙඋ", "වෞ");

        text = text.replace("w", "ව්");
        text = text.replace("ව්අ", "ව");
        text = text.replace("වඅ", "වා");
        text = text.replace("ව්ඉ", "වි");
        text = text.replace("විඉ", "වී");
        text = text.replace("ව්ඔ", "වො");
        text = text.replace("වොඔ", "වෝ");
        text = text.replace("ව්එ", "වෙ");
        text = text.replace("වෙඑ", "වේ");
        text = text.replace("වඉ", "වෛ");
        text = text.replace("ව්උ", "වු");
        text = text.replace("වුඋ", "වූ");
        text = text.replace("ව්ඇ", "වැ");
        text = text.replace("වැඅ", "වෑ");
        text = text.replace("වඋ", "වෟ");
        text = text.replace("ව්ර", "ව්‍ර");
        text = text.replace("වෙඋ", "වෞ");

        text = text.replace("S", "ෂ්");
        text = text.replace("ෂ්අ", "ෂ");
        text = text.replace("ෂඅ", "ෂා");
        text = text.replace("ෂ්ඉ", "ෂි");
        text = text.replace("ෂිඉ", "ෂී");
        text = text.replace("ෂ්ඔ", "ෂො");
        text = text.replace("ෂොඔ", "ෂෝ");
        text = text.replace("ෂ්එ", "ෂෙ");
        text = text.replace("ෂෙඑ", "ෂේ");
        text = text.replace("ෂඉ", "ෂෛ");
        text = text.replace("ෂ්උ", "ෂු");
        text = text.replace("ෂුඋ", "ෂූ");
        text = text.replace("ෂ්ඇ", "ෂැ");
        text = text.replace("ෂැඅ", "ෂෑ");
        text = text.replace("ෂඋ", "ෂෟ");
        text = text.replace("ෂ්ර", "ෂ්‍ර");
        text = text.replace("ෂෙඋ", "ෂෞ");

        text = text.replace("s", "ස්");
        text = text.replace("ස්අ", "ස");
        text = text.replace("සඅ", "සා");
        text = text.replace("ස්ඉ", "සි");
        text = text.replace("සිඉ", "සී");
        text = text.replace("ස්ඔ", "සො");
        text = text.replace("සොඔ", "සෝ");
        text = text.replace("ස්එ", "සෙ");
        text = text.replace("සෙඑ", "සේ");
        text = text.replace("සඉ", "සෛ");
        text = text.replace("ස්උ", "සු");
        text = text.replace("සුඋ", "සූ");
        text = text.replace("ස්ඇ", "සැ");
        text = text.replace("සැඅ", "සෑ");
        text = text.replace("සඋ", "සෟ");
        text = text.replace("ස්ර", "ස්‍ර");
        text = text.replace("සෙඋ", "සෞ");

        text = text.replace("ස්හ්", "ශ්");
        text = text.replace("ශ්අ", "ශ");
        text = text.replace("ශඅ", "ශා");
        text = text.replace("ශ්ඉ", "ශි");
        text = text.replace("ශිඉ", "ශී");
        text = text.replace("ශ්ර්", "ශ්‍රි");
        text = text.replace("ශ්‍රිර්", "ශ්‍රී");
        text = text.replace("ශ්ඔ", "ශො");
        text = text.replace("ශොඔ", "ශෝ");
        text = text.replace("ශ්එ", "ශෙ");
        text = text.replace("ශෙඑ", "ශේ");
        text = text.replace("ශඉ", "ශෛ");
        text = text.replace("ශ්උ", "ශු");
        text = text.replace("ශුඋ", "ශූ");
        text = text.replace("ශ්ඇ", "ශැ");
        text = text.replace("ශැඅ", "ශෑ");
        text = text.replace("ශඋ", "ශෟ");
        text = text.replace("ශෙඋ", "ශෞ");
        text = text.replace("ශ්ර", "ශ්‍ර");

        text = text.replace("න්ග්", "ඞ්");
        text = text.replace("ඞ්අ", "ඞ");
        text = text.replace("ඞඅ", "ඞා");
        text = text.replace("ඞ්ඉ", "ඞි");
        text = text.replace("ඞිඉ", "ඞී");
        text = text.replace("ඞ්ඔ", "ඞො");
        text = text.replace("ඞොඔ", "ඞෝ");
        text = text.replace("ඞ්එ", "ඞෙ");
        text = text.replace("ඞෙඑ", "ඞේ");
        text = text.replace("ඞඉ", "ඞෛ");
        text = text.replace("ඞ්උ", "ඞු");
        text = text.replace("ඞුඋ", "ඞූ");
        text = text.replace("ඞ්ඇ", "ඞැ");
        text = text.replace("ඞැඅ", "ඞෑ");
        text = text.replace("ඞඋ", "ඞෟ");
        text = text.replace("ඞ්ර", "ඞ්‍ර");
        text = text.replace("ඞෙඋ", "ඞෞ");

        text = text.replace("න්ඟ්", "ඟ්");
        text = text.replace("ඟ්අ", "ඟ");
        text = text.replace("ඟඅ", "ඟා");
        text = text.replace("ඟ්ඉ", "ඟි");
        text = text.replace("ඟිඉ", "ඟී");
        text = text.replace("ඟ්ඔ", "ඟො");
        text = text.replace("ඟොඔ", "ඟෝ");
        text = text.replace("ඟඑ", "ඟෙ");
        text = text.replace("ඟෙඑ", "ඟේ");
        text = text.replace("ඟේඉ", "ඟෛ");
        text = text.replace("ඟ්උ", "ඟු");
        text = text.replace("ඟුඋ", "ඟූ");
        text = text.replace("ඟ්ඇ", "ඟැ");
        text = text.replace("ඟැඅ", "ඟෑ");
        text = text.replace("ඟඋ", "ඟෟ");
        text = text.replace("ඟ්ර", "ඟ්‍ර");
        text = text.replace("ඟෙඋ", "ඟෞ");

        text = text.replace("Kණ්", "ඤ්");
        text = text.replace("ඤ්අ", "ඤ");
        text = text.replace("ඤඅ", "ඤා");
        text = text.replace("ඤ්ඉ", "ඤි");
        text = text.replace("ඤිඉ", "ඤී");
        text = text.replace("ඤ්ඔ", "ඤො");
        text = text.replace("ඤොඔ", "ඤෝ");
        text = text.replace("ඤඑ", "ඤෙ");
        text = text.replace("ඤෙඑ", "ඤේ");
        text = text.replace("ඤේඉ", "ඤෛ");
        text = text.replace("ඤ්උ", "ඤු");
        text = text.replace("ඤුඋ", "ඤූ");
        text = text.replace("ඤ්ඇ", "ඤැ");
        text = text.replace("ඤැඅ", "ඤෑ");
        text = text.replace("ඤඋ", "ඤෟ");
        text = text.replace("ඤෙඋ", "ඤෞ");

        text = text.replace("Gණ්", "ඥ්");
        text = text.replace("ඥ්අ", "ඥ");
        text = text.replace("ඥඅ", "ඥා");
        text = text.replace("ඥඉ", "ඥි");
        text = text.replace("ඥඉ", "ඥී");
        text = text.replace("ඥඔ", "ඥො");
        text = text.replace("ඥොඔ", "ඥෝ");
        text = text.replace("ඥඑ", "ඥෙ");
        text = text.replace("ඥෙඑ", "ඥේ");
        text = text.replace("ඥේඉ", "ඥෛ");
        text = text.replace("ඥඋ", "ඥු");
        text = text.replace("ඥඋ", "ඥූ");
        text = text.replace("ඥඇ", "ඥැ");
        text = text.replace("ඥැඅ", "ඥෑ");
        text = text.replace("ඥඋ", "ඥෟ");
        text = text.replace("ඥෙඋ", "ඥෞ");

        // text = text.replace("ඤ්ජ්", "ඦ්");

        text = text.replace("ණ්ඩ්", "ඬ්");
        text = text.replace("ඬ්අ", "ඬ");
        text = text.replace("ඬඅ", "ඬා");
        text = text.replace("ඬඉ", "ඬි");
        text = text.replace("ඬඉ", "ඬී");
        text = text.replace("ඬඔ", "ඬො");
        text = text.replace("ඬොඔ", "ඬෝ");
        text = text.replace("ඬඑ", "ඬෙ");
        text = text.replace("ඬෙඑ", "ඬේ");
        text = text.replace("ඬේඉ", "ඬෛ");
        text = text.replace("ඬඋ", "ඬු");
        text = text.replace("ඬඋ", "ඬූ");
        text = text.replace("ඬඇ", "ඬැ");
        text = text.replace("ඬැඅ", "ඬෑ");
        text = text.replace("ඬඋ", "ඬෟ");
        text = text.replace("ඬෙඋ", "ඬෞ");

        text = text.replace("න්ද්", "ඳ්");
        text = text.replace("ඳ්අ", "ඳ");
        text = text.replace("ඳඅ", "ඳා");
        text = text.replace("ඳ්ඉ", "ඳි");
        text = text.replace("ඳිඉ", "ඳී");
        text = text.replace("ද්ඔ", "ඳො");
        text = text.replace("ඳොඔ", "දෝ");
        text = text.replace("ද්එ", "ඳෙ");
        text = text.replace("ඳෙඑ", "ඳේ");
        text = text.replace("ඳඉ", "ඳෛ");
        text = text.replace("ද්උ", "ඳු");
        text = text.replace("දුඋ", "ඳූ");
        text = text.replace("ඳ්ඇ", "ඳැ");
        text = text.replace("ඳැඅ", "ඳ්ෑ");
        text = text.replace("ඳ්ර", "ඳ්‍ර");

        text = text.replace("ම්බ්", "ඹ්");
        text = text.replace("ඹ්අ", "ඹ");
        text = text.replace("ඹඅ", "ඹා");
        text = text.replace("ඹ්ඉ", "ඹි");
        text = text.replace("ඳිඉ", "ඳී");
        text = text.replace("ඹ්ඔ", "ඹො");
        text = text.replace("ඳොඔ", "ඹෝ");
        text = text.replace("ඹ්එ", "ඹෙ");
        text = text.replace("ඹෙඑ", "ඹේ");
        text = text.replace("ඹඉ", "ඹෛ");
        text = text.replace("ඹ්උ", "ඹු");
        text = text.replace("ඹුඋ", "ඹූ");
        text = text.replace("ඹ්ඇ", "ඹැ");
        text = text.replace("ඹැඅ", "ඹෑ");

        text = text.replace("ජ්හ්", "ඣ්");
        text = text.replace("ඣ්අ", "ඣ");
        text = text.replace("ඣඅ", "ඣා");
        text = text.replace("ඣ්ඉ", "ඣි");
        text = text.replace("ඣිඉ", "ඣී");
        text = text.replace("ඣ්ඔ", "ඣො");
        text = text.replace("ඣොඔ", "ඣෝ");
        text = text.replace("ඣ්එ", "ඣෙ");
        text = text.replace("ඣෙඑ", "ඣේ");
        text = text.replace("ඣඉ", "ඣෛ");
        text = text.replace("ඣඋ", "ඣු");
        text = text.replace("ඣුඋ", "ඣූ");
        text = text.replace("ඣ්ඇ", "ඣැ");
        text = text.replace("ඣැඅ", "ඣෑ");

        text = text.replace("ට්හ්", "ඨ්");
        text = text.replace("ඨ්අ", "ඨ");
        text = text.replace("ඨඅ", "ඨා");
        text = text.replace("ඨ්ඉ", "ඨි");
        text = text.replace("ඨිඉ", "ඨී");
        text = text.replace("ඨ්ඔ", "ඨො");
        text = text.replace("ඨොඔ", "ඨෝ");
        text = text.replace("ඨ්එ", "ඨෙ");
        text = text.replace("ඨෙඑ", "ඨේ");
        text = text.replace("ඨඉ", "ඨෛ");
        text = text.replace("ඨඋ", "ඨු");
        text = text.replace("ඨුඋ", "ඨූ");
        text = text.replace("ඨ්ඇ", "ඨැ");
        text = text.replace("ඨැඅ", "ඨෑ");

        text = text.replace("ඩ්හ්", "ඪ්");
        text = text.replace("ඪ්අ", "ඪ්");
        text = text.replace("ඪඅ", "ඪා");
        text = text.replace("ඪ්ඉ", "ඪි");
        text = text.replace("ඪිඉ", "ඪී");
        text = text.replace("ඪ්ඔ", "ඪො");
        text = text.replace("ඪොඔ", "ඪෝ");
        text = text.replace("ඪ්එ", "ඪෙ");
        text = text.replace("ඪෙඑ", "ඪේ");
        text = text.replace("ඪ්ඉ", "ඪෛ");
        text = text.replace("ඪඋ", "ඪු");
        text = text.replace("ඪුඋ", "ඪූ");
        text = text.replace("ඪ්ඇ", "ඪැ");
        text = text.replace("ඪැඅ", "ඪෑ");

        text = text.replace("ත්හ්", "ථ්");
        text = text.replace("ථ්අ", "ථ");
        text = text.replace("ථඅ", "ථා");
        text = text.replace("ථ්ඉ", "ථි");
        text = text.replace("ථිඉ", "ථී");
        text = text.replace("ථ්ඔ", "ථො");
        text = text.replace("ථොඔ", "ථෝ");
        text = text.replace("ථ්එ", "ථෙ");
        text = text.replace("ථෙඑ", "ථේ");
        text = text.replace("ථඉ", "ථෛ");
        text = text.replace("ථඋ", "ථු");
        text = text.replace("ථුඋ", "ථූ");
        text = text.replace("ථ්ඇ", "ථැ");
        text = text.replace("ථැඅ", "ථෑ");

        text = text.replace("Dහ්", "ධ්");
        text = text.replace("ධ්අ", "ධ");
        text = text.replace("ධඅ", "ධා");
        text = text.replace("ධ්ඉ", "ධි");
        text = text.replace("ධිඉ", "ධී");
        text = text.replace("ධ්ඔ", "ධො");
        text = text.replace("ධොඔ", "ධෝ");
        text = text.replace("ධ්එ", "ධෙ");
        text = text.replace("ධෙඑ", "ධේ");
        text = text.replace("ධේඉ", "ධෛ");
        text = text.replace("ධඋ", "ධු");
        text = text.replace("ධුඋ", "ධූ");
        text = text.replace("ධ්ඇ", "ධැ");
        text = text.replace("ධැඅ", "ධෑ");

        text = text.replace("ප්හ්", "ඵ්");
        text = text.replace("ඵ්අ", "ඵ");
        text = text.replace("ඵඅ", "ඵා");
        text = text.replace("ඵ්ඉ", "ඵි");
        text = text.replace("ඵිඉ", "ඵී");
        text = text.replace("ඵ්ඔ", "ඵො");
        text = text.replace("ඵොඔ", "ඵෝ");
        text = text.replace("ඵ්එ", "ඵෙ");
        text = text.replace("ඵෙඑ", "ථේ");
        text = text.replace("ඵඉ", "ඵෛ");
        text = text.replace("ඵඋ", "ඵු");
        text = text.replace("ඵුඋ", "ඵූ");
        text = text.replace("ඵ්ඇ", "ඵැ");
        text = text.replace("ඵැඅ", "ඵෑ");

        text = text.replace("බ්හ්", "භ්");
        text = text.replace("භ්අ", "භ");
        text = text.replace("භඅ", "භා");
        text = text.replace("භ්ඉ", "භි");
        text = text.replace("භිඉ", "භී");
        text = text.replace("භ්ඔ", "භො");
        text = text.replace("භොඔ", "භෝ");
        text = text.replace("භ්එ", "භෙ");
        text = text.replace("භෙඑ", "භේ");
        text = text.replace("භේඉ", "භෛ");
        text = text.replace("භඋ", "භු");
        text = text.replace("භුඋ", "භූ");
        text = text.replace("භ්ඇ", "භැ");
        text = text.replace("භැඅ", "භෑ");
        text = text.replace("භ්ර", "භ්‍ර");
        text = text.replace("ඏඉ", "ඐ");
        String pp = text.toString();
        if(a==1)
        {
             printSinhalaLetters(pp);
        }
        else
        {
            printSinhalaLettersinDictionary(pp);
        }
       
      //  SinhalaDocument.SinhlaDocument.setText(text);
       // DictionaryService.Sinhala.setText(pp);
       // Sound.SinhalaSound(pp);        
    }
    public static void printSinhalaLetters(String pp)
    {
        SinhalaDocument.SinhlaDocument.setText(pp);
        Sound.SinhalaSound(pp);
    }
    public static void printSinhalaLettersinDictionary(String pp)
    {
        DictionaryService.Sinhala.setText(pp);
        Sound.SinhalaSound(pp);
    }

    public static void TamilUnicode(String text1,int aa) {
        String text = text1;
        text = text.replace("D0", "");
        text = text.replace("D1", "");
        text = text.replace("D9", "");

        text = text.replace("a", "அ");
        text = text.replace("அஅ", "ஆ");
        //text = text.replace("A", "ஆ");

        text = text.replace("i", "இ");
        text = text.replace("இஇ", "ஈ");
        //text = text.replace("I", "ஈ");

        text = text.replace("u", "உ");
        text = text.replace("உஉ", "ஊ");
        // text = text.replace("U", "ஊ");

        text = text.replace("e", "எ");
        text = text.replace("எஎ", "ஏ");
        // text = text.replace("E", "ஏ");

        text = text.replace("o", "ஒ");
        text = text.replace("ஒஒ", "ஓ");
        //text = text.replace("O", "ஓ");

        text = text.replace("அஉ", "ஔ");
        text = text.replace("அஇ", "ஐ");

        text = text.replace("x", "ஃ");

        //text = text.replace("x", "௯");


        text = text.replace("k", "க்");
        text = text.replace("க்அ", "க");
        text = text.replace("கஅ", "கா");
        text = text.replace("க்இ", "கி");
        text = text.replace("கிஇ", "கீ");
        text = text.replace("க்உ", "கு");
        text = text.replace("குஉ", "கூ");
        text = text.replace("க்எ", "கெ");
        text = text.replace("கெஎ", "கே");
        text = text.replace("க்ஒ", "கொ");
        text = text.replace("கொஒ", "கோ");
        text = text.replace("கஉ", "கௌ");
        text = text.replace("கஇ", "கை");


        text = text.replace("g", "க்");
        text = text.replace("க்அ", "க");
        text = text.replace("கஅ", "கா");
        text = text.replace("க்இ", "கி");
        text = text.replace("கிஇ", "கீ");
        text = text.replace("க்உ", "கு");
        text = text.replace("குஉ", "கூ");
        text = text.replace("க்எ", "கெ");
        text = text.replace("கெஎ", "கே");
        text = text.replace("க்ஒ", "கொ");
        text = text.replace("கொஒ", "கோ");
        text = text.replace("கஉ", "கௌ");
        text = text.replace("கஇ", "கை");


        text = text.replace("க்n", "ங்");
        text = text.replace("ங்அ", "ங");
        text = text.replace("ஙஅ", "ஙா");
        text = text.replace("ங்இ", "ஙி");
        text = text.replace("ஙிஇ", "ஙீ");
        text = text.replace("ங்உ", "ஙு");
        text = text.replace("ஙுஉ", "ஙூ");
        text = text.replace("ங்எ", "ஙெ");
        text = text.replace("ஙெஎ", "ஙே");
        text = text.replace("ங்ஒ", "ஙொ");
        text = text.replace("ஙொஒ", "ஙோ");
        text = text.replace("ஙஉ", "ஙௌ");
        text = text.replace("ஙஇ", "ஙை");


        text = text.replace("s", "ச்");
        text = text.replace("ச்அ", "ச");
        text = text.replace("சஅ", "சா");
        //text = text.replace("sA", "சா");
        text = text.replace("ச்இ", "சி");
        text = text.replace("சிஇ", "சீ");
        //text = text.replace("sI", "சீ");
        text = text.replace("ச்உ", "சு");
        text = text.replace("சுஉ", "சூ");
        //text = text.replace("sU", "சூ");
        text = text.replace("ச்எ", "செ");
        text = text.replace("செஎ", "சே");
        //text = text.replace("sE", "சே");
        text = text.replace("சஇ", "சை");
        text = text.replace("ச்ஒ", "சொ");
        text = text.replace("சொஒ", "சோ");
        //text = text.replace("sO", "சோ");
        text = text.replace("சஉ", "சௌ");

        text = text.replace("ch", "ச்");
        text = text.replace("ச்அ", "ச");
        text = text.replace("சஅ", "சா");
        //text = text.replace("chA", "சா");
        text = text.replace("ச்இ", "சி");
        text = text.replace("சிஇ", "சீ");
        //text = text.replace("chI", "சீ");
        text = text.replace("ச்உ", "சு");
        text = text.replace("சுஉ", "சூ");
        //text = text.replace("chU", "சூ");
        text = text.replace("ச்எ", "செ");
        text = text.replace("செஎ", "சே");
        //text = text.replace("chE", "சே");
        text = text.replace("சஇ", "சை");
        text = text.replace("ச்ஒ", "சொ");
        text = text.replace("சொஒ", "சோ");
        //text = text.replace("chO", "சோ");
        text = text.replace("சஉ", "சௌ");

        text = text.replace("க்n", "ஞ்");
        text = text.replace("ஞ்அ", "ஞ");
        text = text.replace("ஞஅ", "ஞா");
        //text = text.replace("knA", "ஞா");
        text = text.replace("ஞ்இ", "ஞி");
        text = text.replace("ஞிஇ", "ஞீ");
        //text = text.replace("knI", "ஞீ");
        text = text.replace("ஞ்உ", "ஞு");
        text = text.replace("ஞுஉ", "ஞூ");
        //text = text.replace("knU", "ஞூ");
        text = text.replace("ஞ்எ", "ஞெ");
        text = text.replace("ஞெஎ", "ஞே");
        //text = text.replace("knE", "ஞே");
        text = text.replace("ஞஇ", "ஞை");
        text = text.replace("ஞ்ஒ", "ஞொ");
        text = text.replace("ஞொஒ", "ஞோ");
        //text = text.replace("knO", "ஞோ");
        text = text.replace("ஞஉ", "ஞௌ");

        text = text.replace("t", "ட்");
        text = text.replace("ட்அ", "ட");
        text = text.replace("டஅ", "டா");
        //text = text.replace("tA", "டா");
        text = text.replace("ட்இ", "டி");
        text = text.replace("டிஇ", "டீ");
        //text = text.replace("tI", "டீ");
        text = text.replace("ட்உ", "டு");
        text = text.replace("டுஉ", "டூ");
        //text = text.replace("tU", "டூ");
        text = text.replace("ட்எ", "டெ");
        text = text.replace("டெஎ", "டே");
        //text = text.replace("tE", "டே");
        text = text.replace("டஇ", "டை");
        text = text.replace("ட்ஒ", "டொ");
        text = text.replace("டொஒ", "டோ");
        //text = text.replace("tO", "டோ");
        text = text.replace("டஉ", "டௌ");

        text = text.replace("d", "ட்");
        text = text.replace("ட்அ", "ட");
        text = text.replace("டஅ", "டா");
        //text = text.replace("dA", "டா");
        text = text.replace("ட்இ", "டி");
        text = text.replace("டிஇ", "டீ");
        //text = text.replace("dI", "டீ");
        text = text.replace("ட்உ", "டு");
        text = text.replace("டுஉ", "டூ");
        //text = text.replace("dU", "டூ");
        text = text.replace("ட்எ", "டெ");
        text = text.replace("டெஎ", "டே");
        //text = text.replace("dE", "டே");
        text = text.replace("டஇ", "டை");
        text = text.replace("ட்ஒ", "டொ");
        text = text.replace("டொஒ", "டோ");
        //text = text.replace("dO", "டோ");
        text = text.replace("டஉ", "டௌ");

        text = text.replace("N", "ண்");
        text = text.replace("ண்அ", "ண");
        text = text.replace("ணஅ", "ணா");
        //text = text.replace("NA", "ணா");
        text = text.replace("ண்இ", "ணி");
        text = text.replace("ணிஇ", "ணீ");
        //text = text.replace("NI", "ணீ");
        text = text.replace("ண்உ", "ணு");
        text = text.replace("ணுஉ", "ணூ");
        //text = text.replace("NU", "ணூ");
        text = text.replace("ண்எ", "ணெ");
        text = text.replace("ணெஎ", "ணே");
        //text = text.replace("NE", "ணே");
        text = text.replace("ணஇ", "ணை");
        text = text.replace("ண்ஒ", "ணொ");
        text = text.replace("ணொஒ", "ணோ");
        //text = text.replace("NO", "ணோ");
        text = text.replace("ணஉ", "ணௌ");

        text = text.replace("ட்h", "த்");
        text = text.replace("த்அ", "த");
        text = text.replace("தஅ", "தா");
        //text = text.replace("thA", "தா");
        text = text.replace("த்இ", "தி");
        text = text.replace("திஇ", "தீ");
        //text = text.replace("thI", "தீ");
        text = text.replace("த்உ", "து");
        text = text.replace("துஉ", "தூ");
        //text = text.replace("thU", "தூ");
        text = text.replace("த்எ", "தெ");
        text = text.replace("தெஎ", "தே");
        //text = text.replace("thE", "தே");
        text = text.replace("தஇ", "தை");
        text = text.replace("த்ஒ", "தொ");
        text = text.replace("தொஒ", "தோ");
        //text = text.replace("thO", "தோ");
        text = text.replace("தஉ", "தௌ");

        text = text.replace("ட்h", "த்");
        text = text.replace("த்அ", "த");
        text = text.replace("தஅ", "தா");
        //text = text.replace("dhA", "தா");
        text = text.replace("த்இ", "தி");
        text = text.replace("திஇ", "தீ");
        //text = text.replace("dhI", "தீ");
        text = text.replace("த்உ", "து");
        text = text.replace("துஉ", "தூ");
        //text = text.replace("dhU", "தூ");
        text = text.replace("த்எ", "தெ");
        text = text.replace("தெஎ", "தே");
        //text = text.replace("dhE", "தே");
        text = text.replace("தஇ", "தை");
        text = text.replace("த்ஒ", "தொ");
        text = text.replace("தொஒ", "தோ");
        //text = text.replace("dhO", "தோ");
        text = text.replace("தஉ", "தௌ");

        text = text.replace("n", "ந்");
        text = text.replace("ந்அ", "ந");
        text = text.replace("நஅ", "நா");
        //text = text.replace("nA", "நா");
        text = text.replace("ந்இ", "நி");
        text = text.replace("நிஇ", "நீ");
        //text = text.replace("nI", "நீ");
        text = text.replace("ந்உ", "நு");
        text = text.replace("நுஉ", "நூ");
        //text = text.replace("nU", "நூ");
        text = text.replace("ந்எ", "நெ");
        text = text.replace("நெஎ", "நே");
        //text = text.replace("nE", "நே");
        text = text.replace("நஇ", "நை");
        text = text.replace("ந்ஒ", "நொ");
        text = text.replace("நொஒ", "நோ");
        //text = text.replace("nO", "நோ");
        text = text.replace("நஉ", "நௌ");

        text = text.replace("p", "ப்");
        text = text.replace("ப்அ", "ப");
        text = text.replace("பஅ", "பா");
        //text = text.replace("pA", "பா");
        text = text.replace("ப்இ", "பி");
        text = text.replace("பிஇ", "பீ");
        //text = text.replace("pI", "பீ");
        text = text.replace("ப்உ", "பு");
        text = text.replace("புஉ", "பூ");
        //text = text.replace("pU", "பூ");
        text = text.replace("ப்எ", "பெ");
        text = text.replace("பெஎ", "பே");
        //text = text.replace("pE", "பே");
        text = text.replace("பஇ", "பை");
        text = text.replace("ப்ஒ", "பொ");
        text = text.replace("பொஒ", "போ");
        //text = text.replace("pO", "போ");
        text = text.replace("பஉ", "பௌ");

        text = text.replace("b", "ப்");
        text = text.replace("ப்அ", "ப");
        text = text.replace("பஅ", "பா");
        //text = text.replace("bA", "பா");
        text = text.replace("ப்இ", "பி");
        text = text.replace("பிஇ", "பீ");
        //text = text.replace("bI", "பீ");
        text = text.replace("ப்உ", "பு");
        text = text.replace("புஉ", "பூ");
        //text = text.replace("bU", "பூ");
        text = text.replace("ப்எ", "பெ");
        text = text.replace("பெஎ", "பே");
        //text = text.replace("bE", "பே");
        text = text.replace("பஇ", "பை");
        text = text.replace("ப்ஒ", "பொ");
        text = text.replace("பொஒ", "போ");
        //text = text.replace("bO", "போ");
        text = text.replace("பஉ", "பௌ");

        text = text.replace("m", "ம்");
        text = text.replace("ம்அ", "ம");
        text = text.replace("மஅ", "மா");
        //text = text.replace("mA", "மா");
        text = text.replace("ம்இ", "மி");
        text = text.replace("மிஇ", "மீ");
        //text = text.replace("mI", "மீ");
        text = text.replace("ம்உ", "மு");
        text = text.replace("முஉ", "மூ");
        //text = text.replace("mU", "மூ");
        text = text.replace("ம்எ", "மெ");
        text = text.replace("மெஎ", "மே");
        //text = text.replace("mE", "மே");
        text = text.replace("மஇ", "மை");
        text = text.replace("ம்ஒ", "மொ");
        text = text.replace("மொஒ", "மோ");
        //text = text.replace("mO", "மோ");
        text = text.replace("மஉ", "மௌ");

        text = text.replace("y", "ய்");
        text = text.replace("ய்அ", "ய");
        text = text.replace("யஅ", "யா");
        //text = text.replace("yA", "யா");
        text = text.replace("ய்இ", "யி");
        text = text.replace("யிஇ", "யீ");
        //text = text.replace("yI", "யீ");
        text = text.replace("ய்உ", "யு");
        text = text.replace("யுஉ", "யூ");
        //text = text.replace("yU", "யூ");
        text = text.replace("ய்எ", "யெ");
        text = text.replace("யெஎ", "யே");
        //text = text.replace("yE", "யே");
        text = text.replace("யஇ", "யை");
        text = text.replace("ய்ஒ", "யொ");
        text = text.replace("யொஒ", "யோ");
        //text = text.replace("yO", "யோ");
        text = text.replace("யஉ", "யௌ");

        text = text.replace("r", "ர்");
        text = text.replace("ர்அ", "ர");
        text = text.replace("ரஅ", "ரா");
        //text = text.replace("rA", "ரா");
        text = text.replace("ர்இ", "ரி");
        text = text.replace("ரிஇ", "ரீ");
        //text = text.replace("rI", "ரீ");
        text = text.replace("ர்உ", "ரு");
        text = text.replace("ருஉ", "ரூ");
        //text = text.replace("rU", "ரூ");
        text = text.replace("ர்எ", "ரெ");
        text = text.replace("ரெஎ", "ரே");
        //text = text.replace("rE", "ரே");
        text = text.replace("ரஇ", "ரை");
        text = text.replace("ர்ஒ", "ரொ");
        text = text.replace("ரொஒ", "ரோ");
        //text = text.replace("rO", "ரோ");
        text = text.replace("ரஉ", "ரௌ");

        text = text.replace("l", "ல்");
        text = text.replace("ல்அ", "ல");
        text = text.replace("லஅ", "லா");
        //text = text.replace("lA", "லா");
        text = text.replace("ல்இ", "லி");
        text = text.replace("லிஇ", "லீ");
        //text = text.replace("lI", "லீ");
        text = text.replace("ல்உ", "லு");
        text = text.replace("லுஉ", "லூ");
        //text = text.replace("lU", "லூ");
        text = text.replace("ல்எ", "லெ");
        text = text.replace("லெஎ", "லே");
        //text = text.replace("lE", "லே");
        text = text.replace("லஇ", "லை");
        text = text.replace("ல்ஒ", "லொ");
        text = text.replace("லொஒ", "லோ");
        //text = text.replace("lO", "லோ");
        text = text.replace("லஉ", "லௌ");

        text = text.replace("v", "வ்");
        text = text.replace("வ்அ", "வ");
        text = text.replace("வஅ", "வா");
        //text = text.replace("vA", "வா");
        text = text.replace("வ்இ", "வி");
        text = text.replace("விஇ", "வீ");
        //text = text.replace("vI", "வீ");
        text = text.replace("வ்உ", "வு");
        text = text.replace("வுஉ", "வூ");
        //text = text.replace("vU", "வூ");
        text = text.replace("வ்எ", "வெ");
        text = text.replace("வெஎ", "வே");
        //text = text.replace("vE", "வே");
        text = text.replace("வஇ", "வை");
        text = text.replace("வ்ஒ", "வொ");
        text = text.replace("வொஒ", "வோ");
        //text = text.replace("vO", "வோ");
        text = text.replace("வஉ", "வௌ");

        text = text.replace("w", "வ்");
        text = text.replace("வ்அ", "வ");
        text = text.replace("வஅ", "வா");
        //text = text.replace("wA", "வா");
        text = text.replace("வ்இ", "வி");
        text = text.replace("விஇ", "வீ");
        //text = text.replace("wI", "வீ");
        text = text.replace("வ்உ", "வு");
        text = text.replace("வுஉ", "வூ");
        //text = text.replace("wU", "வூ");
        text = text.replace("வ்எ", "வெ");
        text = text.replace("வெஎ", "வே");
        //text = text.replace("wE", "வே");
        text = text.replace("வஇ", "வை");
        text = text.replace("வ்ஒ", "வொ");
        text = text.replace("வொஒ", "வோ");
        //text = text.replace("wO", "வோ");
        text = text.replace("வஉ", "வௌ");



        text = text.replace("L", "ள்");
        text = text.replace("ள்அ", "ள");
        text = text.replace("ளஅ", "ளா");
        //text = text.replace("LA", "ளா");
        text = text.replace("ள்இ", "ளி");
        text = text.replace("ளிஇ", "ளீ");
        //text = text.replace("LI", "ளீ");
        text = text.replace("ள்உ", "ளு");
        text = text.replace("ளுஉ", "ளூ");
        //text = text.replace("LU", "ளூ");
        text = text.replace("ள்எ", "ளெ");
        text = text.replace("ளெஎ", "ளே");
        //text = text.replace("LE", "ளே");
        text = text.replace("ளஇ", "ளை");
        text = text.replace("ள்ஒ", "ளொ");
        text = text.replace("ளொஒ", "ளோ");
        //text = text.replace("LO", "ளோ");
        text = text.replace("ளஉ", "ளௌ");

        text = text.replace("-ள்", "ழ்");
        text = text.replace("ழ்அ", "ழ");
        text = text.replace("ழஅ", "ழா");
        text = text.replace("ழ்இ", "ழி");
        text = text.replace("ழிஇ", "ழீ");
        text = text.replace("ழ்உ", "ழு");
        text = text.replace("ழுஉ", "ழூ");
        text = text.replace("ழ்எ", "ழெ");
        text = text.replace("ழெஎ", "ழே");
        text = text.replace("ழஇ", "ழை");
        text = text.replace("ழ்ஒ", "ழொ");
        text = text.replace("ழொஒ", "ழோ");
        text = text.replace("ழஉ", "ழௌ");

        text = text.replace("R", "ற்");
        text = text.replace("ற்அ", "ற");
        text = text.replace("றஅ", "றா");
        //text = text.replace("RA", "றா");
        text = text.replace("ற்இ", "றி");
        text = text.replace("றிஇ", "றீ");
        //text = text.replace("RI", "றீ");
        text = text.replace("ற்உ", "று");
        text = text.replace("றுஉ", "றூ");
        //text = text.replace("RU", "றூ");
        text = text.replace("ற்எ", "றெ");
        text = text.replace("றெஎ", "றே");
        //text = text.replace("RE", "றே");
        text = text.replace("றஇ", "றை");
        text = text.replace("ற்ஒ", "றொ");
        text = text.replace("றொஒ", "றோ");
        //text = text.replace("RO", "றோ");
        text = text.replace("றஉ", "றௌ");

        text = text.replace("-ண்", "ன்");
        text = text.replace("ன்அ", "ன");
        text = text.replace("னஅ", "னா");
        //text = text.replace("-NA", "னா");
        text = text.replace("ன்இ", "னி");
        text = text.replace("னிஇ", "னீ");
        //text = text.replace("-NI", "னீ");
        text = text.replace("ன்உ", "னு");
        text = text.replace("னுஉ", "னூ");
        //text = text.replace("-NU", "னூ");
        text = text.replace("ன்எ", "னெ");
        text = text.replace("னெஎ", "னே");
        //text = text.replace("-NE", "னே");
        text = text.replace("னஇ", "னை");
        text = text.replace("ன்ஒ", "னொ");
        text = text.replace("னொஒ", "னோ");
        //text = text.replace("-NO", "னோ");
        text = text.replace("னஉ", "னௌ");

        text = text.replace("S", "ஸ்");
        text = text.replace("ஸ்அ", "ஸ");
        text = text.replace("ஸஅ", "ஸா");
        //text = text.replace("SA", "ஸா");
        text = text.replace("ஸ்இ", "ஸி");
        text = text.replace("ஸிஇ", "ஸீ");
        //text = text.replace("SI", "ஸீ");
        text = text.replace("ஸ்உ", "ஸு");
        text = text.replace("ஸுஉ", "ஸூ");
        //text = text.replace("SU", "ஸூ");
        text = text.replace("ஸ்எ", "ஸெ");
        text = text.replace("ஸெஎ", "ஸே");
        //text = text.replace("SE", "ஸே");
        text = text.replace("ஸஇ", "ஸை");
        text = text.replace("ஸ்ஒ", "ஸொ");
        text = text.replace("ஸொஒ", "ஸோ");
        //text = text.replace("SO", "ஸோ");
        text = text.replace("ஸஉ", "ஸௌ");

        text = text.replace("h", "ஹ்");
        text = text.replace("ஹ்அ", "ஹ");
        text = text.replace("ஹஅ", "ஹா");
        //text = text.replace("hA", "ஹா");
        text = text.replace("ஹ்இ", "ஹி");
        text = text.replace("ஹிஇ", "ஹீ");
        //text = text.replace("hI", "ஹீ");
        text = text.replace("ஹ்உ", "ஹு");
        text = text.replace("ஹுஉ", "ஹூ");
        //text = text.replace("hU", "ஹூ");
        text = text.replace("ஹ்எ", "ஹெ");
        text = text.replace("ஹெஎ", "ஹே");
        //text = text.replace("hE", "ஹே");
        text = text.replace("ஹஇ", "ஹை");
        text = text.replace("ஹ்ஒ", "ஹொ");
        text = text.replace("ஹொஒ", "ஹோ");
        //text = text.replace("hO", "ஹோ");
        text = text.replace("ஹஉ", "ஹௌ");

        text = text.replace("ச்ஹ்", "ஷ்");
        text = text.replace("ஷ்அ", "ஷ");
        text = text.replace("ஷஅ", "ஷா");
        //text = text.replace("shA", "ஷா");
        text = text.replace("ஷ்இ", "ஷி");
        text = text.replace("ஷிஇ", "ஷீ");
        //text = text.replace("shI", "ஷீ");
        text = text.replace("ஷ்உ", "ஷு");
        text = text.replace("ஷுஉ", "ஷூ");
        //text = text.replace("shU", "ஷூ");
        text = text.replace("ஷ்எ", "ஷெ");
        text = text.replace("ஷெஎ", "ஷே");
        //text = text.replace("shE", "ஷே");
        text = text.replace("ஷஇ", "ஷை");
        text = text.replace("ஷ்ஒ", "ஷொ");
        text = text.replace("ஷொஒ", "ஷோ");
        //text = text.replace("shO", "ஷோ");
        text = text.replace("ஷஉ", "ஷௌ");

        text = text.replace("j", "ஜ்");
        text = text.replace("ஜ்அ", "ஜ");
        text = text.replace("ஜஅ", "ஜா");
        //text = text.replace("jA", "ஜா");
        text = text.replace("ஜ்இ", "ஜி");
        text = text.replace("ஜிஇ", "ஜீ");
        //text = text.replace("jI", "ஜீ");
        text = text.replace("ஜ்உ", "ஜு");
        text = text.replace("ஜுஉ", "ஜூ");
        //text = text.replace("jU", "ஜூ");
        text = text.replace("ஜ்எ", "ஜெ");
        text = text.replace("ஜெஎ", "ஜே");
        //text = text.replace("jE", "ஜே");
        text = text.replace("ஜஇ", "ஜை");
        text = text.replace("ஜ்ஒ", "ஜொ");
        text = text.replace("ஜொஒ", "ஜோ");
        //text = text.replace("jO", "ஜோ");
        text = text.replace("ஜஉ", "ஜௌ");
        if(aa==1)
        {
             printTamilLetters(text);
        }
        else
        {
            printTamilLettersinDictionary(text);
        }
        

    }
    
    public static void printTamilLetters(String pp)
    {
       TamilDocument.TamilDocument.setText(pp);
       Sound.tamilSounds(pp);
       
        
    }
    public static void printTamilLettersinDictionary(String pp)
    {
        DictionaryService.Tamil.setText(pp);
       
    }
    
    
}
