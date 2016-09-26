package cuma.belajar.fajarf.sisaku6.fragment;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import cuma.belajar.fajarf.sisaku6.R;
import cuma.belajar.fajarf.sisaku6.activity.halaman_penjemputan;


public class TwoFragment extends Fragment  implements View.OnClickListener {

    Button btn_jemput;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootview = inflater.inflate(R.layout.fragment_two, container, false);

        btn_jemput = (Button) rootview.findViewById(R.id.tombol_jemput_sampah);
        btn_jemput.setOnClickListener(this);
        return rootview;
    }
    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.tombol_jemput_sampah:
                Intent intent = new Intent(getActivity().getApplication(), halaman_penjemputan.class);

                startActivity(intent);
                break;
        }
    }


    }
