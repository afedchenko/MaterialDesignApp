package com.example.materialdesignapp.ui.bottommenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.ui.buttons.ButtonsFragment;
import com.example.materialdesignapp.ui.edittext.EditTextFragment;
import com.example.materialdesignapp.ui.progressbar.ProgressbarFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomMenuFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_bottom_menu, container, false);
        BottomNavigationView bottomNavigationView = root.findViewById(R.id.fragment_bottom_menu_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        replaceFragment(new ButtonsFragment());
        return root;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_buttons:
                    replaceFragment(new ButtonsFragment());
                    return true;
                case R.id.navigation_edit_text:
                    replaceFragment(new EditTextFragment());
                    return true;
                case R.id.navigation_progress:
                    replaceFragment(new ProgressbarFragment());
                    return true;
            }
            return false;
        }
    };

    private void replaceFragment(Fragment fragment) {
        getChildFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_bottom_menu_frame_layout, fragment)
                .commit();

    }
}
