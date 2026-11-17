/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjjsonfile;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

/**
 *
 * @author Stephen D
 */
public class PrjJSONFile {

    public static void main(String[] args) {
        
        JSONObject Detail = new JSONObject();
        
        Detail.put("name", "Stephen");
        Detail.put("age", 20);
        Detail.put("City", "PE");
        Detail.put("isStudent", true);
        
        System.out.println("JSON Object Created : \n" + Detail.toString(4));

        String fileName = "Person.json";
        
        //will have a try and catch in project
        try (FileWriter file = new FileWriter(fileName, true))
        {
            file.write(Detail.toString(4)); //write object into the file
            file.flush(); // was temp in memory, take everything waiting in mem to write in file (flush).
            
            System.out.println("\n Successfully wrote JSON object to " + fileName);
            
        }
        
        catch (IOException ex) // runs only if an error happens (input/output)
        {
            // common file related errors
            System.err.println("AN error occured while writing into the JSON file: "
                    + ex.getMessage());
        }
        
        
    }
}
