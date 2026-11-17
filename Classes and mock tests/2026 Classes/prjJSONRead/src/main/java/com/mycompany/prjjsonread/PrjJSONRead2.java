/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjjsonread;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Stephen D
 */
public class PrjJSONRead2 {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();//(GeeksForGeeks,2026)

        ObjectNode firstUser = objectMapper.createObjectNode();//(GeeksForGeeks,2026)

        firstUser.put("name", "Simon Swart)";
        firstUser.put("age", 22);
        firstUser.put("city", "Port Elizabeth");
        firstUser.put("province", "EasternCape");
        firstUser.put("country", "South Africa");

        ObjectNode secondUser = objectMapper.createObjectNode();
        secondUser.put("name", "Tiaan Swanepoel");
        secondUser.put("age", 42);
        secondUser.put("city", "Cape Town");
        secondUser.put("province", "Western Cape");
        secondUser.put("country", "South Africa");

        ArrayNode userList = objectMapper.createArrayNode();//(Medium, 2024) (Javadoc,2026)
        userList.add(firstUser);//(DigitalOcean,2
        
        userList.add(secondUser);//(DigitalOcean,2022)
        objectMapper.writeValue(new File("mydata.json"), userList);

        JsonNode json = objectMapper.readTree(new File("mydata.json"));//(Meduim,2023)
        String prettyJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(json); // (GeeksForGeeks, 2026) 
        System.out.println(prettyJson);

    }

}
