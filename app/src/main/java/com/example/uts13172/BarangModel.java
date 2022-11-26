package com.example.uts13172;

import android.os.Parcel;
import android.os.Parcelable;

public class BarangModel implements Parcelable
{
    private String nama, satuan, harga, desc;
    private int kode, jumlah, gambar, hargainteger;

    public BarangModel (){

    }
    protected BarangModel(Parcel in) {
        nama = in.readString();
        satuan = in.readString();
        harga = in.readString();
        desc = in.readString();
        kode = in.readInt();
        jumlah = in.readInt();
        gambar = in.readInt();
        hargainteger = in.readInt();
    }

    public static final Creator<BarangModel> CREATOR = new Creator<BarangModel>() {
        @Override
        public BarangModel createFromParcel(Parcel in) {
            return new BarangModel(in);
        }

        @Override
        public BarangModel[] newArray(int size) {
            return new BarangModel[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public int gethargainteger() {
        return hargainteger;
    }

    public void sethargainteger(int hargaview) {
        this.hargainteger = hargaview;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(satuan);
        parcel.writeString(harga);
        parcel.writeString(desc);
        parcel.writeInt(kode);
        parcel.writeInt(jumlah);
        parcel.writeInt(gambar);
        parcel.writeInt(hargainteger);
    }
}
