package View;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewHandler extends Application {

    private ViewMenuPrincipal mp;
    private ViewAfficher va;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root);
        mp = new ViewMenuPrincipal(root, this);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Location de véhicule");
        primaryStage.show();



        affichagePrincipal();
    }


    public void affichagePrincipal(){
        mp.setVueMenu();

    }
}
