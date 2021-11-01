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

public class HomepageController {

    @FXML
    public void getListName(ActionEvent actionEvent) {
        /*
        *   Gets new toDoListNames from text field in ToDoList GUI
        * */
    }

    @FXML
    public void addNewList(ActionEvent actionEvent){
        /*
        *   Uses the information form getListName()
        *and adds a new list using the 'this.' operation
        * and the 'List' class.
        * */
    }

    public TodoLists newList(){
        /*
        *   Takes in list title from in Homepage GUI
        * and creates a new list.
        * */
        TodoLists todoLists = new TodoLists();
        return todoLists;
    }

    @FXML
    public void manageList(ActionEvent actionEvent) throws IOException {
        /*
        *   The user will be able to select a list from the 'list-view' in the GUI
        * and press the 'Manage List' button. This will allow the user to open the List Manager GUI.
        */
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListManager.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("List Manager");
        stage.setScene(new Scene(root1));
        stage.show();
    }
    @FXML
    public void viewList(ActionEvent actionEvent){
        /*
        *   After creating the user will be able to press the
        * 'View List' button to display the latest lists. From the
        * GUI the user will also be able to select on one of the list
        * and the press the 'Manage List' in order to
        * */
    }

    @FXML
    public void saveAllList(ActionEvent actionEvent){
        /*
        *   User will be able to save all list to an
        * external storage.
        * */
    }

    @FXML
    public void saveAllItems(ActionEvent actionEvent){
        /*
         *  User will be able to save all items to an
         * external storage.
         * */
    }

    @FXML
    public void loadList(ActionEvent actionEvent){
        /*
        *   User will be able to load a list
        * that were previously saved to an external storage.
        * The user will also be able to load a single or multiple
        * list from and external storage.
        */
    }
}