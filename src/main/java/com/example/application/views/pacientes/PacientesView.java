package com.example.application.views.pacientes;

import java.util.ArrayList;

import com.example.application.views.MainLayout;
import com.modelos.Paciente;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Pacientes")
@Route(value = "pacientes", layout = MainLayout.class)
public class PacientesView extends VerticalLayout {
    private ArrayList<Paciente> pacientes = new ArrayList<>();
    private Grid<Paciente> gridPacientes = new Grid<>();

    private TextField cNombre = new TextField("Nombre");
    private TextField cGenero = new TextField("Genero");
    private TextField cCorreo = new TextField("Correo");
    private TextField cCel = new TextField("Cel");
    private TextField cDireccion = new TextField("Direccion");
    private Button bAgregar = new Button("Guardar");   

    public PacientesView() {
        add(gridPacientes);
        gridPacientes.addColumn(Paciente::getNombre);
        gridPacientes.addColumn(Paciente::getGenero);
        gridPacientes.addColumn(Paciente::getCorreo);
        gridPacientes.addColumn(Paciente::getCel);
        gridPacientes.addColumn(Paciente::getDireccion);
        actualizar();
        HorizontalLayout layoutCampos = new HorizontalLayout();
        add(layoutCampos);
        layoutCampos.add(cNombre, cGenero, cCorreo, cCel, cDireccion, bAgregar);
        bAgregar.addClickListener(event -> agregarPaciente(cNombre.getValue(), cGenero.getValue(), cCorreo.getValue(), cCel.getValue(), cDireccion.getValue()));
    }

    private void agregarPaciente(String nombre, String genero, String correo, String cel, String direccion) {
        pacientes.add(new Paciente(nombre, genero, correo, cel, direccion));
        actualizar();
        cNombre.setValue("");
        cGenero.setValue("");
        cCorreo.setValue("");
        cCel.setValue("");
        cDireccion.setValue("");
    }

    private void actualizar() {
        gridPacientes.setItems(pacientes);
    }

}
