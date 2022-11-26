package com.example.uts13172;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResiScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resi_screen);
        getSupportActionBar().setTitle("Hasil Transaksi");


        String totalharga = getIntent().getExtras().getString("totalharga");
        String namabarang = getIntent().getExtras().getString("namabarang");
        String hargabarang = getIntent().getExtras().getString("hargabarang");
        String jumlahbarang = getIntent().getExtras().getString("jumlahbarang");
        String ppn = getIntent().getExtras().getString("ppn");
        String satuan = getIntent().getExtras().getString("satuan");

        TextView namabarangtv = findViewById(R.id.tv_namabarangresi);
        namabarangtv.setText(namabarang);

        TextView harga = findViewById(R.id.tv_hargaresi);
        harga.setText(hargabarang + "/" + satuan);

        TextView jmlh = findViewById(R.id.tv_jmlhresi);
        jmlh.setText(jumlahbarang + " " + satuan);

        TextView total = findViewById(R.id.tv_ttalresi);
        total.setText(totalharga);

        TextView ppntxt = findViewById(R.id.tv_ppnresi);
        ppntxt.setText(ppn);


    }

    public void Backtohome(View view) {
        Intent intent = new Intent(ResiScreen.this, ListBarangScreen.class);
        startActivity(intent);
    }
}