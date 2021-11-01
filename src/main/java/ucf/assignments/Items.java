package ucf.assignments;

import java.util.ArrayList;
import java.util.Date;

public class Items {
    String itemDescription;
    Date dueDate = new Date();
    Boolean itemComplete = false;
    ArrayList<Items> items = new ArrayList<Items>();

    public String getItemDescription(String todoDescription){
        return todoDescription;
    }

    public void setItemDescription(){
        // Will set the description of item
    }

    public ArrayList<Items> getItems(){
        /*
        *   Will be used to display items of a
        * list to the user.
        * */
        return items;
    }

    public void setItems(Items items){
        // Adds items to array list
    }

    public void setDueDate(Date dueDate){
        /*
        *   User will be able to pick the due date for an
        * item.
        */
    }

    public Date getDueDate(){
        /*
        *   The user will be able to get the set date
        * and assign it to and item.
        */
        return dueDate;
    }

    public void setItemComplete(){
        /*
        *   User will be able to mark an item as complete or incomplete.
        */
    }
}
