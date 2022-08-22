package com.example.application.views.medicos;

import java.util.ArrayList;

import com.example.application.views.MainLayout;
import com.modelos.Medico;
import com.modelos.Persona;
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

@PageTitle("Medicos")
@Route(value = "medicos", layout = MainLayout.class)
public class MedicosView extends VerticalLayout {
    private ArrayList<Medico> medicos= new ArrayList<>();
    private Grid<Medico> gridMedicos = new Grid<>();

    private TextField cNombre = new TextField("Nombre");
    private TextField cGenero = new TextField("Genero");
    private TextField cCorreo = new TextField("Correo");
    private TextField cCel = new TextField("Cel");
    private TextField cEspecialidad = new TextField("Especialidad");
    private Button bAgregar = new Button("Guardar");                                                       

    public MedicosView() {
        add(gridMedicos );

        gridMedicos.addColumn(Medico::getNombre);
        gridMedicos.addColumn(Medico::getGenero);
        gridMedicos.addColumn(Medico::getCorreo);
        gridMedicos.addColumn(Medico::getCel);
        gridMedicos.addColumn(Medico::getEspecialidad);

        actualizar();
        HorizontalLayout layoutCampos = new HorizontalLayout();
        add(layoutCampos);
        layoutCampos.add(cNombre, cGenero, cCorreo, cCel, cEspecialidad, bAgregar);
        bAgregar.addClickListener(event -> agregarMedico(cNombre.getValue(), cGenero.getValue(), cCorreo.getValue(), cCel.getValue(), cEspecialidad.getValue()));
    }

    private void agregarMedico(String nombre, String genero, String correo, String cel, String especialidad) {
        medicos.add(new Medico(nombre, genero, correo, cel, especialidad));
        actualizar();
        cNombre.setValue("");
        cGenero.setValue("");
        cCorreo.setValue("");
        cCel.setValue("");
        cEspecialidad.setValue("");
    }

    private void actualizar() {
        gridMedicos.setItems(medicos);
    }

}
