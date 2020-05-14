package com.example.materialdesignapp.ui.edittext;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EditTextViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EditTextViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("This is edit_text fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}