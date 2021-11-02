/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ListManagerController {
   @FXML
   public void displayCurrentTitle(ActionEvent actionEvent){
       /*
       *    Displays current title if list to the user.
       */
   }
    @FXML
    public void statusOptions(ActionEvent actionEvent){
        /*
         *   This method changes the status of the list to
         * complete or incomplete.
         */
    }
    @FXML
    public void editListTitle(ActionEvent actionEvent){
        /*
        *  This method changes the title of the list after
        * the user presses the 'Edit Title button'.
        */
    }
    @FXML
    public void addItemDescription(ActionEvent actionEvent){
        /*
        *   Adds description to new item.
        */
    }
    @FXML
    public void addItemDueDate(ActionEvent actionEvent){
        /*
         *   Adds due date to new item.
         */
    }
    @FXML
    public void addItemToList(ActionEvent actionEvent){
        /*
         *   Takes the information from addItemDescription()
         * and addItemsDueDate and stores it into the
         * to-do list.
         */
    }
    @FXML
    public void displayItems(ActionEvent actionEvent){
        /*
        *   The current items of the list will be displayed here.
        */
    }
    @FXML
    public void deleteItem(ActionEvent actionEvent){
        /*
        *   User selects which item to delete from displayItems()
        */
    }
    @FXML
    public void markItemAsCompleted(ActionEvent actionEvent){
        /*
        *   User can mark an item as completed.
        */
    }
    @FXML
    public void editItem(ActionEvent actionEvent) throws IOException {
        /*
        *   When the user select a the 'Edit' button a new GUI page will open
        */
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ItemsEditor.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Item Editor");
        stage.setScene(new Scene(root1));
        stage.show();
    }
    @FXML
    public void displayCompletedItems(ActionEvent actionEvent) throws IOException{
        /*
         *   When the user select a the 'Display Completed Items' button a new GUI page will open
         */
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DisplayCompletedItems.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Completed Items");
        stage.setScene(new Scene(root1));
        stage.show();
    }
    @FXML
    public void displayIncompleteItems(ActionEvent actionEvent) throws IOException{
        /*
         *   When the user select a the 'Display Incomplete Items' button a new GUI page will open
         */
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("displayIncompleteItems.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Incomplete Items");
        stage.setScene(new Scene(root1));
        stage.show();
    }
    public void displayAllItems(ActionEvent actionEvent) throws IOException{
        /*
         *   When the user select a the 'Display All Items' button a new GUI page will open
         */
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DisplayAll_Items.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("All Items");
        stage.setScene(new Scene(root1));
        stage.show();
    }
    @FXML
    public void deleteEntireToDoList(ActionEvent actionEvent){
        /*
        *   Deletes the entire list that the user is currently
        * working on.
        */
    }
    @FXML
    public void saveList(ActionEvent actionEvent){
        /*
        *   Saves the work the user has done on the current
        * list.
        * */
    }
}