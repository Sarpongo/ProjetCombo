package View;
import Controller.Controller;
import Model.Menu;
import com.sun.javafx.cursor.CursorFrame;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.scene.text.*;


public class ViewMenuPrincipal {
    private Controller controller;
    private Menu model;
    private Group root;
    private ImageView imgB;
    private Button submit;
    private ComboBox<String> comboBox;
    private ComboBox<String> comboBox2;

    private Label lNom;
    private Label lPrenom;
    private Label lAge;



    public ViewMenuPrincipal(Group root, ViewHandler vh){
        this.root = root;
        this.model = new Menu();
        this.controller = new Controller(this, vh, model);

        initBackground();
        initButtons();
        initComboBox();
        initLabel();
    }







    private void initBackground(){
        imgB= new ImageView("Asset/Images/background.jpg");
    }

    private void initButtons(){
        submit = new Button("Valider");
        submit.setLayoutX(50);
        submit.setLayoutY(50);
        submit.setPickOnBounds(false);

    }

    private void initComboBox(){
        comboBox= new ComboBox<>();
        comboBox.getItems().addAll("Mercedes", "Renault", "Alpha Romeo", "Volvo", "Volswagen");
        comboBox.setLayoutX(100);
        comboBox.setLayoutY(200);


        comboBox2= new ComboBox<>();
        comboBox.getItems().addAll("Suzuki", "XCR", "Honda", "KTM", "GSR", "YZ", "Piwi");
    }

    private void initLabel(){
         lNom= new Label("Nom: ");
          lPrenom= new Label("Prénom: ");
         lAge=new Label("Âge: ");

    }



    public void setVueMenu() {
        root.getChildren().clear();
        root.getChildren().add(imgB);
        root.getChildren().add(submit);
        root.getChildren().add(comboBox);
        root.getChildren().add(comboBox2);
        root.getChildren().add(lAge);
        root.getChildren().add(lPrenom);
        root.getChildren().add(lNom);


    }

}
