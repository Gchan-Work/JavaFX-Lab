/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxscenebuilder;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Gaz
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void goToPage2(ActionEvent event) throws IOException {
        System.out.println("Going to Page2");
        //label.setText("Hello World!");
        Parent root = FXMLLoader.load(getClass().getResource("HourlyEmployee.fxml"));
        Scene scene = new Scene(root);
        Stage stage = JavaFXSceneBuilder.getStage();
        stage.setScene(scene);
        
    }
    
//    @FXML
//    Text text = new Text();
//    text.setText("hi");
    
    @FXML
    private void goToPageSalariedEmployee(ActionEvent event) throws IOException {
        System.out.println("You clicked Button 2");
        Parent root = FXMLLoader.load(getClass().getResource("SalariedEmployee.fxml"));
        Scene scene = new Scene(root);
        Stage stage = JavaFXSceneBuilder.getStage();
        stage.setScene(scene);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
