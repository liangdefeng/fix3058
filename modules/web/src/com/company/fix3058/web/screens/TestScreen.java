package com.company.fix3058.web.screens;

import com.company.fix3058.entity.CountryGrowthEntity;
import com.company.fix3058.service.CountryGrowthService;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.Install;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("fix3058_TestScreen")
@UiDescriptor("test-screen.xml")
public class TestScreen extends Screen {

    @Inject
    private CountryGrowthService countryGrowthService;

    @Inject
    private UiComponents uiComponents;

    @Install(to = "countryGrowthEntitiesTable.year2020", subject = "columnGenerator")
    private Component countryGrowthEntitiesTableYear2020ColumnGenerator(DataGrid.ColumnGeneratorEvent<CountryGrowthEntity> event) {
        Label<Double> label = uiComponents.create(Label.TYPE_DOUBLE);
        label.setValue(event.getItem().getYear2020());
        return label;
    }
}