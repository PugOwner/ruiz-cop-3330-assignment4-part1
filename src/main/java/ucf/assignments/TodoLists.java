/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ucf.assignments;

import java.util.ArrayList;

public class TodoLists {
    /*
    *   This class will generate an array every time a new list is created.
    * In the Homepage GUI the user enters the title of the to-do list, which
    * becomes and item array.
    */
    ArrayList<Items> lists = new ArrayList<Items>();

    public ArrayList<Items> addLists(){
        /*
        *   User will be able to create 100 to-do list. And everytime
        * one is created, this method will be used.
        */
        return lists;
    }
}