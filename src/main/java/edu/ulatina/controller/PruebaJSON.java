/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Luis
 */
public class PruebaJSON {
    
private static String readAll(Reader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
      sb.append((char) cp);
    }
    return sb.toString();
  }

  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
    InputStream is = new URL(url).openStream();
    try {
      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      String jsonText = readAll(rd);
      JSONObject json = new JSONObject(jsonText);
      return json;
    } finally {
      is.close();
    }
  }
  
  public static void  validarToken(String Token) throws IOException{
        JSONObject json = readJsonFromUrl(Token);
        
    boolean True = true;
    
      if (json.get("ok").equals(True) ) {
          
          System.out.println("Bot Existe");
          
      } else {
          
          System.out.println("Bot NO Existe");
      }
  }
  

  public static void main(String[] args) throws IOException, JSONException {
    //JSONObject json = readJsonFromUrl("https://api.telegram.org/bot605797436:AAH2Z1R_DVxiPGYAMkeVk_j9aPlh8Wio51M/getMe");
    //System.out.println(json.toString());
    //System.out.println(((JSONObject)json.get("ok")).getString("username"));
    
    PruebaJSON pj = new PruebaJSON();
    pj.validarToken("https://api.telegram.org/bot605797436:AAH2Z1R_DVxiPGYAMkeVk_j9aPlh8Wio51M/getMe");
    
    
    
    
    
  }
}

