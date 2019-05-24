
package Models;

public class DictionaryModel
{
    private String sinhalaWord;
    private String TamilWord;
    private String EnglishWord;

    public DictionaryModel() 
    {
        
    }

    public DictionaryModel(String sinhalaWord, String TamilWord, String EnglishWord) 
    {
        this.sinhalaWord = sinhalaWord;
        this.TamilWord = TamilWord;
        this.EnglishWord = EnglishWord;
    }

    public String getSinhalaWord() 
    {
        return sinhalaWord;
    }

    public void setSinhalaWord(String sinhalaWord)
    {
        this.sinhalaWord = sinhalaWord;
    }

    public String getTamilWord() 
    {
        return TamilWord;
    }

    public void setTamilWord(String TamilWord) 
    {
        this.TamilWord = TamilWord;
    }

    public String getEnglishWord()
    {
        return EnglishWord;
    }

    public void setEnglishWord(String EnglishWord) 
    {
        this.EnglishWord = EnglishWord;
    }

}
