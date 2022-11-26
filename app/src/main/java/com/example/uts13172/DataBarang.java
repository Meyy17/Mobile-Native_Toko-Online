package com.example.uts13172;

import java.util.ArrayList;

public class DataBarang
{


    private static String [] namabarang = {
            "Meja Komputer Kayu",
            "Kursi Bar",
            "Panel Led Outbow Lampu Downlight",
            "MINISO Tempat/ Tong Sampah Plastik",
            "SAMSUNG WA70H4000[ABU] MESIN CUCI TOP LOADING 7KG",
            "Mijia Kompor Listrik induction Q Cooker",
            "Sanken SG-363 Kompor Gas 2 Tungku Kaca Kompor Dua Tungku",
            "Bak Mandi Standing Terazo",
            "AC SHARP AH-A 09 SAY 1 PK + PASANG R32 STANDARD THAILAND 09SAY - UNIT ONLY",
            "Indokurnia Ember Casual 0.5 Galon Pastel - Light Blue"
    };

    private static String [] satuanbarang = {
            "Buah",
            "Buah",
            "Buah",
            "Buah",
            "Buah",
            "Buah",
            "Buah",
            "Buah",
            "Buah",
            "Buah"
    };

    private static String [] hargabarang = {
            "Rp.322.000",
            "Rp.279.000",
            "Rp.25.000",
            "Rp.25.000",
            "Rp.2.600.000",
            "Rp.470.000",
            "Rp.800.000",
            "Rp.550.000",
            "Rp.3.000.000",
            "Rp.10.000"
    };

    private static String [] desc = {
            "meja lipat\n" +
                    "[Ukuran produk] Ukuran desktop 60CM/70CM/80CM\n" +
                    "Tinggi meja 74CM\n" +
                    "[bahan produk] papan kepadatan tinggi menebal\n" +
                    "[Bantalan beban]: Setelah pengujian, dapat menanggung 200 kati\n" +
                    "[Kemasan produk] Kotak 1 buah/kotak\n" +
                    "[Deskripsi Produk] Sangat cocok untuk keluarga berukuran kecil, rumah sewa, asrama perguruan tinggi, asrama mahasiswa, warung, makan malam di luar ruangan, ruang konferensi kafe dan acara lainnya.\n" +
                    "\n" +
                    "Setiap keluarga harus memiliki meja makan lipat\n" +
                    "Lipat dalam hitungan detik, menghemat ruang, dan nyaman serta cepat untuk dibuka dan dilipat\n" +
                    "Perjamuan / makan malam keluarga\n" +
                    "\n" +
                    "Fitur：\n" +
                    "\n" +
                    "• Lembaran tebal - tahan lama\n" +
                    "\n" +
                    "• Papan desktop tahan gores dan tahan aus untuk waktu yang lama\n" +
                    "\n" +
                    "• Desain lipat - hemat ruang\n" +
                    "\n" +
                    "• Penyimpanan lipat cocok untuk berbagai skenario\n" +
                    "\n" +
                    "• Rangka baja terintegrasi\n" +
                    "\n" +
                    "• Stabil, menahan beban, indah dan tidak bergoyang\n" +
                    "\n" +
                    "• Perlindungan Kaki yang Ditingkatkan - Anti-Rollover\n" +
                    "\n" +
                    "• Tambahkan kaki anti-rollover, tidak ada kenaikan harga untuk produk yang ditingkatkan",


            "Fitur:\n" +
                    "- Padu padan produk sesuka hati\n" +
                    "- Rasa radian, sedentary tidak letih dan stylish\n" +
                    "- Tidak mudah pudar, tidak mudah berubah bentuk\n" +
                    "- Kaki kayu yang stabil, anti korosi dan tidak berbau\n" +
                    "- Design cantik & stylish yang bisa mempercantik tampilan rumah anda\n" +
                    "\n" +
                    "Spesifikasi\n" +
                    "Bahan: Solid wood + engineering polypropylene\n" +
                    "Ukuran: 48*49*83.5cm\n" +
                    "Warna : White/Grey/Black\n" +
                    "Berat: 4.6KG\n" +
                    "\n" +
                    "Note:\n" +
                    "*Produk sangat cocok untuk dijadikan kado untuk orang-orang kesayangan di hidup Anda :)\n" +
                    "*Kami akan packing pesanan Anda dengan rapi dan aman menggunakan bubble wrap\n" +
                    "*Sebelum dikirim, pesanan kamu sudah dicek quality controlnya sehingga pesanan dikirim dalam kondisi baik\n" +
                    "*Kerusakan yg terjadi dlm pengiriman bukan tanggung jawab kami ya Dokio, harap klaim ke ekspedisi\n" +
                    "*Kami sarankan Anda membeli asuransi pengiriman ya Dokio.\n" +
                    "\n" +
                    "Syarat komplain & Review Produk\n" +
                    "\n" +
                    "Jika ada keluhan setelah barang diterima, kami sangat berterima kasih jika anda langsung menghubungi kami dengan melampirkan foto saat paket datang dan video unboxing produk untuk kami tindak lanjuti sebelum anda menulis review atau ulasan . Mohon maaf, komplain melalui review atau ulasan tidak kami tindak lanjuti.",

            "Lampu Panel LED Outbow Lampu Donwlight Panel adalah jenis lampu yang sering digunakan untuk interior karena dengan cahaya yang terang disisi lain lampu Panel LED tidak membuat panas ruangan.\n" +
                    "\n" +
                    "> High Brightness\n" +
                    "> High CRI\n" +
                    "> Energy Saving\n" +
                    "> Elegant Appearance\n" +
                    "> Long Working Life\n" +
                    "\n" +
                    "Spesifikasi:\n" +
                    "\n" +
                    "Daya : 6W, 12W\n" +
                    "Model : Bulat\n" +
                    "Warna Cahaya : White dan Warm White\n" +
                    "Tegangan : 90 - 265V\n" +
                    "Shape : Round\n" +
                    "Bahan : Aluminium\n" +
                    "Size : 6W (120 mm * 120 mm)\n" +
                    "12W( 170 mm * 170 mm)",

            "1.Ukuran: 14x14x17cm\n" +
                    "2. Tempat sampah ini bisa anda gunakan di dalam kamar ataupun di mobil.\n" +
                    "3. Bisa anda pakai sendiri di rumah ataupun bisa untuk hadiah.\n" +
                    "4. Bahan premium yang bisa tahan lama.\n" +
                    "5. Multiwarna, desain simple dan praktis.\n",

            "Spesifikasi:\n" +
                    "- Mesin Cuci 1 Tabung\n" +
                    "- Top Loading\n" +
                    "- Kapasitas : 7 Kg\n" +
                    "- Eco Tub Clean\n" +
                    "- Mencuci dan Mengeringkan\n" +
                    "- Daya cuci 330 Watt\n" +
                    "- Daya peras 240 Watt\n" +
                    "- Weight : 26 kg\n" +
                    "\n" +
                    "Fitur :\n" +
                    "Diamond Drum\n" +
                    "Air Turbo Drying\n" +
                    "Eco Tub Clean\n" +
                    "Tempered Glass Door\n" +
                    "Child Lock\n" +
                    "Magic Filter\n" +
                    "Double storm pulsator\n" +
                    "Auto restart",
            "Kompor Listrik QCOOKER ini menggunakan tenaga 2000W dan dapat menghasilkan panas mencapai 280 derajat celcius. Kompor Q Cooker ini juga dapat diatur tingkat panasnya hingga 20 mode kecepatan . Dengan fitur ini, Anda dapat memasak makanan dengan akurat karena kendali suhu dan mode masak yang bervariasi.\n" +
                    "\n" +
                    "Fitur\n" +
                    "\n" +
                    "Semua Jenis Wadah\n" +
                    "\n" +
                    "Kompor Listrik Induksi ini tidak seperti kompor induksi lainnya yang hanya bisa memasak menggunakan peralatan masak besi. dengan kompor induksi ini, Anda bisa memasak menggunakan berbagai macam peralatan masak termasuk keramik, kaca, clay pots dan lainnya.\n" +
                    "\n" +
                    "Kompor listrik ini dapat dengan mudah memenuhi kebutuhan masak Anda, mulai dari merebus, menggoreng, mengukus, roasting, steaming hingga Anda puas dengan segala masakan Anda.\n" +
                    "\n" +
                    "Kompor induksi listrik ini menggunakan prinsip far-infrared untuk membuat panas. Far infrared tidak menghantarkan radiasi apa pun sehingga sangat aman digunakan oleh wanita hamil atau pun orang tua.\n" +
                    "\n" +
                    "Kompor Xiaomi memiliki 20 mode kecepatan masak yang dapat Anda atur suhunya mulai dari 80 derajat Celcius hingga 280 derajat Celcius. Hal itu memungkinkan Anda untuk mengatur suhu secara presisi sehingga Anda dapat menciptakan makanan yang sempurna.\n" +
                    "\n" +
                    "Kompor listrik ini menggunakan 2000W sehingga memasak bisa cepat, keluarga Anda pun tidak akan lama menunggu masakan yang segera matang.\n" +
                    "\n" +
                    "Kompor listrik ini menggunakan panel mikrokristalin yang membuatnya sangat mudah untuk dibersihkan selain itu, mikrokristalin anti pecah dan anti ledakan sehingga sangat aman.\n" +
                    "\n" +
                    "Kompor listrik ini sudah memiliki fungsi Timer.\n" +
                    "\n" +
                    "Voltase : 220V ~ 50Hz\n" +
                    "Daya / Power : 2000W\n" +
                    "Housing Material: Stainless Steel\n" +
                    "Dimensi : 350 x 305 x 70mm",
            "Sanken SG-363BX Kompor Gas [2 Tungku] merupakan kompor gas 2 tungku yang menggunakan tungku Whirl Jet (Api Putar) sehingga masakan menjadi lebih cepat matang dan hemat gas. Salah satu tungku dilengkapi dengan api lilin serta pan supporter yang dapat digunakan untuk memasak panci berukuran kecil. Di desain secara minimalis dengan menggunakan kaca berwarna hitam yang tahan panas sehingga memberikan kesan mewah nan elegan. Pada bagian bawah dilapisi oleh aluminium sehingga dapat mencegah panas berlebih.\n" +
                    "\n" +
                    "\n" +
                    "Series : 2 Tungku\n" +
                    "Surface : Tempered Glass\n" +
                    "Warna : Hitam\n" +
                    "Jenis Gas : LPG Tekanan Rendah\n" +
                    "Asupan Panas (Total) : 7 KW\n" +
                    "Berat Beban Maksimal : 35 Kg\n" +
                    "Dimensi Burner : 90 mm + 90 mm\n" +
                    "Tekanan Kerja : 280 mmH2O\n" +
                    "Berat Bersih : 7.3 Kg\n" +
                    "Berat Kotor : 8.6 Kg\n" +
                    "Dimensi Unit : 722 x 410 x 120 mm\n" +
                    "Dimensi Packaging : 773 x 430 x 104 mm",
            "✓ Bak mandi Bali berbahan serbuk Marmer Terrazzo glossy ivory natural batu terrazzo.Produk bahan ramah lingkungan.\n" +
                    "\n" +
                    "✓ Dimensi -\n" +
                    "✓ Tinggi 65cm\n" +
                    "✓ Diameter 45cm\n" +
                    "✓ Include Tatakan Bak\n" +
                    "\n" +
                    "✓ Untuk pengiriman luar daerah tersebut, mohon hubungi melalui DM.\n" +
                    "\n" +
                    "✓ Pengiriman dilakukan oleh kurir pabrik.\n" +
                    "\n" +
                    "✓ Pengiriman di Marketplace hanya untuk bukti/nota pembelian.\n" +
                    "\n" +
                    "✓ Barang Pre-Order akan dikirim dalam waktu maksimal -+7hari kerja, dan tidak termasuk akhir pekan dan/atau\n" +
                    "libur nasional.\n" +
                    "\n" +
                    "✓ Bila barang pesanan selesai dibuat dalam waktu kurang dari 7 hari, maka akan kami beri kabar lalu kami antarkan.\n" +
                    "\n" +
                    "✓ Dijamin barang selalu baru.\n",
            "FITUR :\n" +
                    "> control jetstream mendinginkan ruangan lebih cepat\n" +
                    "> control coanda gentle cool air hembusan udara lembut\n" +
                    "> auto swing louver swing otomatis naik turun\n" +
                    "> evaporator anti karat\n" +
                    "> self cleaning function\n" +
                    "> easy remot control winth 12 hour timer sleep\n" +
                    "\n" +
                    "SPESIFIKASI\n" +
                    "AC SPLIT\n" +
                    "BERSARAN PK : 1 PK\n" +
                    "DAYA MAXIMAL 800 WATTT\n" +
                    "POWER : 9.000 BTU/H\n" +
                    "REFRIGERANT : R32 BEBAS FC&HCFC\n" +
                    "DIMENSI IN : 877 X 292 X 222 CM\n" +
                    "BERAT : 9 KG\n" +
                    "DIMENSI OUT : 589 X 495 X 265 CM\n" +
                    "BERAT : 20 KG\n" +
                    "UKURAN PIPA : 1/4 3/8\n" +
                    "GARANSI 10 TAHUN KOMPRESSOR & 1 TAHUN SPAREPART",
            "Ember pastel berukuran 0.5 galon, menggunakan plastik PolyPropylene (PP) sehingga lebih kuat dan kokoh. Didesain khusus untuk mahasiswa atau kalangan muda yang butuh wadah sikat gigi, odol, sabun, dll.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Keunggulan:\n" +
                    "\n" +
                    "- Warna pastel\n" +
                    "\n" +
                    "- Ada gagang\n" +
                    "\n" +
                    "- Cocok untuk menaruh perlengkapan mandi\n" +
                    "\n" +
                    "- Harga ekonomis, langsung dari pabrik\n"
    };

    private static int [] getHargainteger = {
            322000,
            279000,
            25000,
            25000,
            2600000,
            470000,
            800000,
            550000,
            3000000,
            10000
    };


    private static int [] imagebarang = {
            R.drawable.meja,
            R.drawable.kursi,
            R.drawable.lamp,
            R.drawable.smph,
            R.drawable.mesincuci,
            R.drawable.kmporlstrk,
            R.drawable.kmpor,
            R.drawable.bakmandi,
            R.drawable.ac,
            R.drawable.ember
    };

    private static int [] kodebarang = {
           121367,
            266788,
            86752,
            23132,
            9123,
            9239,
            8989,
            83129,
            19389,
            21238
    };
    private static int [] jumlahbarang = {
            29,
            90,
            800,
            200,
            9,
            90,
            12,
            10,
            98,
            900
    };



    static ArrayList<BarangModel> getlistData()
    {
        ArrayList<BarangModel> list = new ArrayList<>();
        for (int position = 0; position <namabarang.length; position++){
            BarangModel barangModel = new BarangModel();
            barangModel.setNama(namabarang[position]);
            barangModel.setSatuan(satuanbarang[position]);
            barangModel.setHarga(hargabarang[position]);
            barangModel.setKode(kodebarang[position]);
            barangModel.setJumlah(jumlahbarang[position]);
            barangModel.setGambar(imagebarang[position]);
            barangModel.sethargainteger(getHargainteger[position]);
            barangModel.setDesc(desc[position]);

            list.add(barangModel);
        }
        return list;
    }
}
