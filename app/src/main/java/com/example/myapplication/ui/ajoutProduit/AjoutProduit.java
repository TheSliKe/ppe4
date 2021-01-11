package com.example.myapplication.ui.ajoutProduit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

public class AjoutProduit extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_ajout_produit, container, false);
        final TextView textView = root.findViewById(R.id.text);
        textView.setText("ajout produit");

        return root;
    }
}