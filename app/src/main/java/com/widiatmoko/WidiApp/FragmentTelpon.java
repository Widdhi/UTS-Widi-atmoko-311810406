package com.widiatmoko.WidiApp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;


public class FragmentTelpon extends Fragment {
    ImageView imageCall;
    EditText edit_text_number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_telpon, container, false);

        edit_text_number = view.findViewById(R.id.edit_text_number);
        imageCall = view.findViewById(R.id.image_call);



        imageCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edit_text_number.getText().toString();
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + s));
                startActivity(i);
            }
        });

        return view;
    }
}