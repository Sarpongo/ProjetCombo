package Controller;

import View.ViewMenuPrincipal;
import javafx.event.EventHandler;
import  Model.Menu;
import javafx.scene.input.MouseEvent;
import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import java.awt.event.MouseListener;



public class Controller implements EventHandler<MouseEvent> {
    private ViewMenuPrincipal vm;
    private ViewHandler vh;
    private Menu model;

    public Controller(ViewMenuPrincipal vm, ViewHandler vh, Menu model){
        this.vm= vm;
        this.vh=vh;
        this.model=model;
    }




    @Override
    public void handle(MouseEvent event) {

    }
}
