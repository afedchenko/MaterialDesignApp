package com.example.materialdesignapp.ui.recyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesignapp.R;

public class RecyclerViewFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        initRecyclerView(root);
        return root;
    }

    private void initRecyclerView(View root) {
        RecyclerView recyclerView = root.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(root.getContext(), LinearLayoutManager.VERTICAL, false);
//        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewModel data = new RecyclerViewModel();
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(data.getList());
        recyclerView.setAdapter(recyclerViewAdapter);
        //recyclerView.addItemDecoration(new ItemDivider(root.getContext()));
    }
}
