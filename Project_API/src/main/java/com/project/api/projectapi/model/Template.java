///////////////////////////////////////////////////////////////////////////////////////////////////////    
package com.project.api.projectapi.model;
public class Template {
    private int temid;
    private String tname;
    private String tmess;
    private Boolean tbool;

    public Template(int temid, String tname, String tmess, Boolean tbool){
        this.temid = temid;
        this.tname = tname;
        this.tmess = tmess;
        this.tbool = tbool;
    }

    public int getTemid(){
        return this.temid;
    }
    public String getTname(){
        return this.tname;
    }
    public String getTmess(){
        return this.tmess;
    }
    public Boolean getTbool(){
        return this.tbool;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////