package com.example.materialdesignapp.ui.tabsactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.materialdesignapp.R;
import com.example.materialdesignapp.ui.buttons.ButtonsFragment;
import com.example.materialdesignapp.ui.edittext.EditTextFragment;
import com.example.materialdesignapp.ui.progressbar.ProgressbarFragment;
import com.google.android.material.tabs.TabLayout;

public class TabsActivityFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_tabs_activity, container, false);

        Fragment fragment1 = EditTextFragment.newInstance(null);
        Fragment fragment2 = ButtonsFragment.newInstance(null);
        Fragment fragment3 = ProgressbarFragment.newInstance(null);

        TabsActivityAdapter tabsAdapter = new TabsActivityAdapter(getChildFragmentManager());
        tabsAdapter.addFragment(fragment1, getString(R.string.TabEditText));
        tabsAdapter.addFragment(fragment2, getString(R.string.TabButtons));
        tabsAdapter.addFragment(fragment3, getString(R.string.TabProgress));

        ViewPager viewPager = root.findViewById(R.id.view_pager);
        viewPager.setAdapter(tabsAdapter);
        TabLayout tabs = root.findViewById(R.id.fragment_tabs_tab);
        tabs.setupWithViewPager(viewPager);

        return root;
    }
}
