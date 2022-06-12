package com.example.demo1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationTreygol extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TableView<Treygol> table = new TableView<Treygol>();

        TableColumn<Treygol, String> stro1Col
                = new TableColumn<Treygol, String>("stro1");
        TableColumn<Treygol, String> stro2Col
                = new TableColumn<Treygol, String>("stro2");
        TableColumn<Treygol, String> stro3Col
                = new TableColumn<Treygol, String>("stro3");

        TableColumn<Treygol, String> yglACol
                = new TableColumn<Treygol, String>("yglA");

        TableColumn<Treygol, String> yglBCol
                = new TableColumn<Treygol, String>("yglB");

        TableColumn<Treygol, String> yglYCol
                = new TableColumn<Treygol, String>("yglY");

        TableColumn<Treygol, String> PCol
                = new TableColumn<Treygol, String>("P");

        TableColumn<Treygol, String> SCol
                = new TableColumn<Treygol, String>("S");

        TableColumn<Treygol, String> stro12Col
                = new TableColumn<Treygol, String>("stro12");
        TableColumn<Treygol, String> stro22Col
                = new TableColumn<Treygol, String>("stro2");
        TableColumn<Treygol, String> stro32Col
                = new TableColumn<Treygol, String>("stro32");

        TableColumn<Treygol, String> yglA2Col
                = new TableColumn<Treygol, String>("yglA2");

        TableColumn<Treygol, String> yglB2Col
                = new TableColumn<Treygol, String>("yglB2");

        TableColumn<Treygol, String> yglY2Col
                = new TableColumn<Treygol, String>("yglY2");

        TableColumn<Treygol, String> P2Col
                = new TableColumn<Treygol, String>("P2");

        TableColumn<Treygol, String> S2Col
                = new TableColumn<Treygol, String>("S2");

        TableColumn<Treygol, String> stro13Col
                = new TableColumn<Treygol, String>("stro13");
        TableColumn<Treygol, String> stro23Col
                = new TableColumn<Treygol, String>("stro23");
        TableColumn<Treygol, String> stro33Col
                = new TableColumn<Treygol, String>("stro33");

        TableColumn<Treygol, String> yglA3Col
                = new TableColumn<Treygol, String>("yglA3");

        TableColumn<Treygol, String> yglB3Col
                = new TableColumn<Treygol, String>("yglB3");

        TableColumn<Treygol, String> yglY3Col
                = new TableColumn<Treygol, String>("yglY3");

        TableColumn<Treygol, String> P3Col
                = new TableColumn<Treygol, String>("P3");

        TableColumn<Treygol, String> S3Col
                = new TableColumn<Treygol, String>("S3");

        stro1Col.setCellValueFactory(new PropertyValueFactory<>("stro1"));
        stro2Col.setCellValueFactory(new PropertyValueFactory<>("stro2"));
        stro3Col.setCellValueFactory(new PropertyValueFactory<>("stro3"));
        yglACol.setCellValueFactory(new PropertyValueFactory<>("yglA"));
        yglBCol.setCellValueFactory(new PropertyValueFactory<>("yglB"));
        yglYCol.setCellValueFactory(new PropertyValueFactory<>("yglY"));
        SCol.setCellValueFactory(new PropertyValueFactory<>("S"));
        PCol.setCellValueFactory(new PropertyValueFactory<>("P"));
        stro12Col.setCellValueFactory(new PropertyValueFactory<>("stro12"));
        stro22Col.setCellValueFactory(new PropertyValueFactory<>("stro22"));
        stro32Col.setCellValueFactory(new PropertyValueFactory<>("stro32"));
        yglA2Col.setCellValueFactory(new PropertyValueFactory<>("yglA2"));
        yglB2Col.setCellValueFactory(new PropertyValueFactory<>("yglB2"));
        yglY2Col.setCellValueFactory(new PropertyValueFactory<>("yglY2"));
        S2Col.setCellValueFactory(new PropertyValueFactory<>("S2"));
        P2Col.setCellValueFactory(new PropertyValueFactory<>("P2"));
        stro13Col.setCellValueFactory(new PropertyValueFactory<>("stro13"));
        stro23Col.setCellValueFactory(new PropertyValueFactory<>("stro23"));
        stro33Col.setCellValueFactory(new PropertyValueFactory<>("stro33"));
        yglA3Col.setCellValueFactory(new PropertyValueFactory<>("yglA3"));
        yglB3Col.setCellValueFactory(new PropertyValueFactory<>("yglB3"));
        yglY3Col.setCellValueFactory(new PropertyValueFactory<>("yglY3"));
        S3Col.setCellValueFactory(new PropertyValueFactory<>("S3"));
        P3Col.setCellValueFactory(new PropertyValueFactory<>("P3"));

        ObservableList<Treygol> list = getTreygol();
        table.setItems(list);
        table.getColumns().addAll(stro1Col,stro2Col,stro3Col,yglACol,yglBCol,yglYCol,SCol,PCol);

        StackPane root = new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(table);

        stage.setTitle("Treygol");

        Scene scene = new Scene(root, 600, 300);
        stage.setScene(scene);
        stage.show();



    }
    private ObservableList<Treygol> getTreygol() {

        Treygol treygol1 = new Treygol();
        Treygol treygol2 = new Treygol();
        Treygol treygol3 = new Treygol();
        treygol1.setStro1(5);
        treygol1.setStro2(3);
        treygol1.setStro3(8);
        treygol1.setYglA(60);
        treygol1.setYglB(30);
        treygol1.setYglY(15);
        treygol1.setS(55);
        treygol1.setP(34);
        treygol2.setStro1(6);
        treygol2.setStro2(9);
        treygol2.setStro3(13);
        treygol2.setYglA(88);
        treygol2.setYglB(30);
        treygol2.setYglY(18);
        treygol2.setS(60);
        treygol2.setP(40);
        treygol3.setStro1(9);
        treygol3.setStro2(10);
        treygol3.setStro3(13);
        treygol3.setYglA(60);
        treygol3.setYglB(14);
        treygol3.setYglY(45);
        treygol3.setS(58);
        treygol3.setP(37);

        ObservableList<Treygol> list = FXCollections.observableArrayList(treygol1,treygol2,treygol3);
        return list;
    }

    public static void main(String[] args) {
        launch();
    }
}