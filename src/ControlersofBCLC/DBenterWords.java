package ControlersofBCLC;

import DBConnection.DBConnection;
import Models.DictionaryModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBenterWords {

    public static DictionaryModel serchSinhalaWords(String word) throws SQLException, ClassNotFoundException 
    {
        String query="select * from Dictionary where Sinhala_Word='"+word+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) 
        {
            DictionaryModel dictionaryModel = new DictionaryModel(rst.getString("Sinhala_Word"),rst.getString("Tamil_Word"),rst.getString("English_Word"));
            return dictionaryModel;
        } 
        else 
        {
            return null;
        }
    }
    public static DictionaryModel serchTamilWords(String word) throws SQLException, ClassNotFoundException 
    {
        String query="select * from Dictionary where Tamil_Word='"+word+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) 
        {
            DictionaryModel dictionaryModel = new DictionaryModel(rst.getString("Sinhala_Word"),rst.getString("Tamil_Word"),rst.getString("English_Word"));
            return dictionaryModel;
        } 
        else 
        {
            return null;
        }
    }
    public static DictionaryModel serchEnglishWords(String word) throws SQLException, ClassNotFoundException
    {
        String query="select * from Dictionary where English_Word='"+word+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) 
        {
            DictionaryModel dictionaryModel = new DictionaryModel(rst.getString("Sinhala_Word"),rst.getString("Tamil_Word"),rst.getString("English_Word"));
            return dictionaryModel;
        } 
        else 
        {
            return null;
        }
    }
}
