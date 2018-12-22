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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luis
 */
public class Bot {

    private String idBot;
    private String nombreBot;
    private String descripcionBot;
    private Persona idPersona;

    public Bot() {

    }

    public Bot(String idBot, String nombreBot, String descripcionBot, Persona idPersona) {
        this.idBot = idBot;
        this.nombreBot = nombreBot;
        this.descripcionBot = descripcionBot;
        this.idPersona = idPersona;
    }
    
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
  
  public static boolean  validarToken(String Token) throws IOException{
        JSONObject json = readJsonFromUrl(Token);
        
    boolean True = true;
    boolean Check = true;
    
      if (json.get("ok").equals(True) ) {
          
          
          System.out.println("Bot Existe");
          
          Check = true;
          
      } else {
          
          System.out.println("Bot NO Existe");
          
          Check = false;
      }
        return Check;
  }

    public String getIdBot() {
        return idBot;
    }

    public void setIdBot(String idBot) {
        this.idBot = idBot;
    }

    public String getNombreBot() {
        return nombreBot;
    }

    public void setNombreBot(String nombreBot) {
        this.nombreBot = nombreBot;
    }

    public String getDescripcionBot() {
        return descripcionBot;
    }

    public void setDescripcionBot(String descripcionBot) {
        this.descripcionBot = descripcionBot;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }
}
