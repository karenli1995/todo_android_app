package com.codepath.simpletodo;

import android.os.Parcelable;

import java.util.Date;

/**
 * Created by karenli on 7/11/17.
 */
public class Item {
    private String myName;
    private String myCategory;
    private String myDescription;
    private Date myDate;

    Item(String name){
        myName = name;
    }

    Item(String name, String category, String description, Date date){
        myName = name;
        myCategory = category;
        myDescription = description;
        myDate = date;
    }

    public String getName(){
        return myName;
    }

    public void setName(String name){
        myName = name;
    }

    public String getCategory(){
        return myCategory;
    }

    public void setCategory(String category){
        myCategory = category;
    }

    public String getMyDescription(){
        return myDescription;
    }

    public void setMyDescription(String des){
        myDescription = des;
    }

    public Date getDate() {
        return myDate;
    }

    public void setDate(Date date){
        myDate = date;
    }
}
