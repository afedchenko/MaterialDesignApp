package com.example.materialdesignapp.ui.recyclerview;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewModel extends ViewModel {

    List<String> list;

    public RecyclerViewModel() {
        list = new ArrayList<>();
        list.add("Глазастый");
        list.add("Рогатый");
        list.add("Мутный");
        list.add("Обжора");
        list.add("Убийца");
        list.add("Тухлый");
    }

    public List<String> getList() {
        return list;
    }
}