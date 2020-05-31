package com.example.materialdesignapp.ui.progressbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.materialdesignapp.R;

public class ProgressbarFragment extends Fragment {

        public static ProgressbarFragment newInstance(Bundle bundle) {
        ProgressbarFragment currentFragment = new ProgressbarFragment();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Инфлейтим фрагмент с прогресс-барами и инициализируем views
        View root = inflater.inflate(R.layout.fragment_progressbar, container, false);
        Button buttonShowProgress = root.findViewById(R.id.fragment_progressbar_button_show);
        Button buttonHideProgress = root.findViewById(R.id.fragment_progressbar_button_hide);
        final ProgressBar roundProgressBar = root.findViewById(R.id.fragment_progressbar_progress_round);
        final ProgressBar lineProgressBar = root.findViewById(R.id.fragment_progressbar_progress_line);

        //Устанавливаем дефолтно прогрессбары скрытыми
        roundProgressBar.setVisibility(View.INVISIBLE);
        lineProgressBar.setVisibility(View.INVISIBLE);

        //По клику на кнопку SHOW делаем прогрессбары видимыми
        buttonShowProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roundProgressBar.setVisibility(View.VISIBLE);
                lineProgressBar.setVisibility(View.VISIBLE);
            }
        });

        //По клику на кнопку HIDE делаем прогрессбары скрытыми
        buttonHideProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roundProgressBar.setVisibility(View.INVISIBLE);
                lineProgressBar.setVisibility(View.INVISIBLE);
            }
        });

        return root;
    }
}