package com.example.materialdesignapp.ui.edittext;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.materialdesignapp.R;

import static android.content.Context.INPUT_METHOD_SERVICE;

public class EditTextFragment extends Fragment {

    private EditTextViewModel homeViewModel;

    public static EditTextFragment newInstance(Bundle bundle) {
        EditTextFragment currentFragment = new EditTextFragment();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(EditTextViewModel.class);
        View root = inflater.inflate(R.layout.fragment_edit_text, container, false);
        final EditText textView = root.findViewById(R.id.edit_text);
        final EditText textView1 = root.findViewById(R.id.edit_text1);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        final LinearLayout linearlayout = root.findViewById(R.id.root_edit_text);
        linearlayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
                return false;
            }
        });

        return root;
    }
}
