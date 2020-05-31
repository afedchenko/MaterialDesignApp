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

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.ToolbarBackActivity;

public class ButtonsFragment extends Fragment {

    public static ButtonsFragment newInstance(Bundle bundle) {
        ButtonsFragment currentFragment = new ButtonsFragment();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_buttons, container, false);
        Button buttonForToolbarActivity = root.findViewById(R.id.fragment_buttons_button_1);
        buttonForToolbarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonsFragment.this.startActivity(new Intent(ButtonsFragment.this.getContext(), ToolbarBackActivity.class));
            }
        });

        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}