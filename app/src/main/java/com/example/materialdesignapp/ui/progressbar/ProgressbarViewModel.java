package com.example.materialdesignapp.ui.progressbar.progressbar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProgressbarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProgressbarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is buttons fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
