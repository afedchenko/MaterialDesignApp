package com.example.materialdesignapp.ui.buttons;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.ToolbarBackActivity;
import com.example.materialdesignapp.ui.edittext.EditTextViewModel;

public class ButtonsFragment extends Fragment {

    private EditTextViewModel buttonsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        buttonsViewModel =
                ViewModelProviders.of(this).get(EditTextViewModel.class);
        View root = inflater.inflate(R.layout.fragment_buttons, container, false);
        Button buttonForToolbarActivity = root.findViewById(R.id.fragment_buttons_button_1);
        buttonForToolbarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonsFragment.this.startActivity(new Intent(ButtonsFragment.this.getContext(), ToolbarBackActivity.class));
            }
        });


/*        final TextView textView = root.findViewById(R.id.edit_text);
        buttonsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}