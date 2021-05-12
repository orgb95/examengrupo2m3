module ni.edu.uni.fcys.programacion2.examen {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ni.edu.uni.fcys.programacion2.examen to javafx.fxml;
    exports ni.edu.uni.fcys.programacion2.examen;
    exports ni.edu.uni.fcys.programacion2.examen.controller;
    exports ni.edu.uni.fcys.programacion2.examen.pojo;
}
