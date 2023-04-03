package edu.utsa.andriod.fitme.model;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class User {
    private String name;

    public User(String name){
        this.name = name;

    }

    /*
    public static User loadFromFile(){
        User user = null;
        Scanner scnr = null;

        try{



            scnr.close();
            return user;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

    }
    * */



    //setter and getter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
