package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;

public class TodoListController {

    @FXML
    private DatePicker addDate;

    @FXML
    private Button addTask;

    @FXML
    private Button deleteTask;

    @FXML
    private Button editDate;

    @FXML
    private Button editTask;

    @FXML
    private TextField itemDescriptionTextField;

    @FXML
    private TextField itemNameTextField;

    @FXML
    private Button loadAllTasks;

    @FXML
    private Button newTask;

    @FXML
    private MenuBar openFileSaver;

    @FXML
    private Button saveTask;

    @FXML
    private Button showAllTasks;

    @FXML
    private ListView<?> showComplete;

    @FXML
    private Button showCompleteTasks;

    @FXML
    private Button showIncompleteTasks;

    @FXML
    private ProgressIndicator showProgressMarker;

    @FXML
    private ListView<?> showIncomplete;

    @FXML
    void editDateClicked(ActionEvent event) {
        // Adjust items when clicked
        // Edit input for date shown

    }

    @FXML
    void editTasksClicked(ActionEvent event) {
        // Show current tasks selected
        // Edit field from list

    }

    @FXML
    void inputItemDescription(ActionEvent event) {
        // Input string for item description
        // Store in array List with item title
    }

    @FXML
    void inputItemString(ActionEvent event) {
        // Input item description
        // Store in array list
        // expected input

    }

    @FXML
    void loadTasksClicked(ActionEvent event) {
        // Load lists from previous memory
        // add to  list
        // display in listview
        //  proper output

    }

    @FXML
    void newTasksCreate(ActionEvent event) {
        // create a new list to input in testList
        // add to incomplete tasks
        // true proper input

    }

    @FXML
    void removeTaskClicked(ActionEvent event) {
        // remove current tasks from display
        // add to test
        // delete from list
        // expected contains null tasks

    }

    @FXML
    void saveCurrentTask(ActionEvent event) {
        // save current task to memory
        // create new  list
        // add to list
        // set up file path to user designated path


    }

    @FXML
    void showAllTasksClicked(ActionEvent event) {
        // show all tasks displayed
        // create list
        // populate lists
        // will show all tasks in right list view
    }

    @FXML
    void showCompleteTskClicked(ActionEvent event) {
        // show completed tasks
        // populate lists
        // will all show in left list view
        // show previously completed tasks

    }

    @FXML
    void showDateClicked(ActionEvent event) {
        // create new datePicker
        // show current date in YYYY-MM-DD formats
        // will prompt in another window


    }

    @FXML
    void showIncompleteTasks(ActionEvent event) {
        // show incomplete tasks
        // will reflect all tasks not done yet
        // will show in right list view

    }

    public DatePicker getAddDate() {
        return addDate;
    }

    public void setAddDate(DatePicker addDate) {
        this.addDate = addDate;
    }

    public Button getAddTask() {
        return addTask;
    }

    public void setAddTask(Button addTask) {
        this.addTask = addTask;
    }
}

