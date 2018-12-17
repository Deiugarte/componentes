/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.controller;

/**
 *
 * @author blaken
 */

public class SearchResultSchema {
    private String title;
    private String author;
    private byte[] content;
    private String _id;
    private String type;

    public SearchResultSchema(String title, String author, byte[] content, String _id, String type) {
        this.title = title;
        this.author = author;
        this.content = content;
        this._id = _id;
        this.type = type;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    @Override
    public String toString() {
        return "SearchResulSchema{" + "title=" + title + ", author=" + author  +  ", type=" + type + ", _id=" + _id + '}';
    }
    
    
}
