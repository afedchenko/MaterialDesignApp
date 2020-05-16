package com.example.materialdesignapp.ui.buttons;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ButtonsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ButtonsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is buttons fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
