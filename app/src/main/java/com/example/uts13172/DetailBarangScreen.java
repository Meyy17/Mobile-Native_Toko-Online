package com.example.uts13172;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class DetailBarangScreen extends AppCompatActivity {
    public static final  String ITEM = "item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_barang_screen);

        ImageView imgbarang = findViewById(R.id.imgBarangdetail);
        TextView hargabarang = findViewById(R.id.tv_hargabarangdetail);
        TextView satuan = findViewById(R.id.stuanbarang_detail);
        TextView namabarang = findViewById(R.id.tv_namabarangdetail);
        TextView stokbarang = findViewById(R.id.tv_stokbrg);
        TextView kodebarang = findViewById(R.id.tv_kodebrg);
        TextView deskripsi = findViewById(R.id.tv_desc);
        Button cobtn = findViewById(R.id.btnco);


        BarangModel barangModel = getIntent().getParcelableExtra(ITEM);
        if (barangModel != null){

            String jumlah = Integer.toString(barangModel.getJumlah());
            String kode = Integer.toString(barangModel.getKode());


            Glide.with(this).load(barangModel.getGambar()).into(imgbarang);
            hargabarang.setText(barangModel.getHarga().toString());
            satuan.setText(barangModel.getSatuan().toString());
            namabarang.setText(barangModel.getNama().toString());
            stokbarang.setText(jumlah);
            kodebarang.setText(kode);
            deskripsi.setText(barangModel.getDesc().toString());

            cobtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText inputjumlah = findViewById(R.id.et_co);
                    String jmlh = inputjumlah.getText().toString();
                    int jmlhtint = Integer.parseInt(jmlh);
                    if (jmlhtint != 0){
                        AlertDialog.Builder builder = new AlertDialog.Builder(DetailBarangScreen.this);
                        builder.setMessage("Apakah Kamu Yakin Untuk Chekout " + barangModel.getNama());
                        builder.setTitle("Peringatan");
                        builder.setCancelable(false);
                        builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                            dialog.cancel();
                        });
                        builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                            int ppn = 2000;
                            int total = jmlhtint * barangModel.gethargainteger();
                            int totalppn = total + ppn;
                            String jumlahnya = Integer.toString(jmlhtint);
                            String ppnstr = Integer.toString(ppn);
                            String totalnya = Integer.toString(totalppn);

                            Intent toresi = new Intent(DetailBarangScreen.this, ResiScreen.class);

                            toresi.putExtra("totalharga",totalnya);
                            toresi.putExtra("namabarang",barangModel.getNama());
                            toresi.putExtra("hargabarang",barangModel.getHarga());
                            toresi.putExtra("jumlahbarang",jumlahnya);
                            toresi.putExtra("ppn",ppnstr);
                            toresi.putExtra("satuan",barangModel.getSatuan());

                            startActivity(toresi);
                        });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }

                }
            });
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Barang");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}