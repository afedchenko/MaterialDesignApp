package com.example.materialdesignapp.ui.bottomsheet;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BottomSheetViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BottomSheetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}