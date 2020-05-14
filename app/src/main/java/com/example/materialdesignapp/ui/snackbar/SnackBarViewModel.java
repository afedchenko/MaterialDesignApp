package com.example.materialdesignapp.ui.snackbar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SnackBarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SnackBarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Нажмите на FAB");
    }

    public LiveData<String> getText() {
        return mText;
    }
}