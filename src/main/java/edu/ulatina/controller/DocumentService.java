/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.controller;

import edu.ulatina.controller.SearchResultSchema;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.json.simple.parser.ParseException;

/**
 *
 * @author blaken
 */
@ManagedBean(name = "documentService")
@ApplicationScoped
public class DocumentService {
    private static String HOST = "https://7194ec6edb754dd598f032c609d1291a.us-east-1.aws.found.io:9243";
    private static String USERNAME = "elastic";
    private static String PASSWORD = "L0zHI1afvgHoL5JWiAlrfY2D";
    
    public List<SearchResultSchema> getDoc(String dato) throws ParseException{
        Documentos doc = new Documentos(HOST, USERNAME, PASSWORD);
        return doc.busqueda(dato);
    }
}
