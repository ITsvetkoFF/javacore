package com.javarush.test.level36.lesson04.home01;

import java.util.List;

/**
 * Created by CMI-USER on 1/21/2016.
 */
public class Controller
{
    private Model model = new Model();
    public List<String> onDataListShow() {
        return model.getStringDataList();
    }
}