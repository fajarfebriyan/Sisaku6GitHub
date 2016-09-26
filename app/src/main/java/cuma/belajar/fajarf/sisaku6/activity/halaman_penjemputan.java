package cuma.belajar.fajarf.sisaku6.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cuma.belajar.fajarf.sisaku6.R;

public class halaman_penjemputan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_penjemputan);

        final Button maps = (Button) findViewById(R.id.tombol_peta);

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagemaps = new Intent(getBaseContext(), maps.class);

                startActivity(pagemaps);
            }
        });
    }
}
