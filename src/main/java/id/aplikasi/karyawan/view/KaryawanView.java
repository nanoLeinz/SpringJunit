package id.aplikasi.karyawan.view;

import id.aplikasi.karyawan.model.KaryawanModel;

import java.util.List;

public class KaryawanView {
    public void tampilkanDetailKaryawan(KaryawanModel karyawan) {
        System.out.println("Detail Karyawan: ");
        System.out.println(karyawan);
    }

    public void tampilkanSemuaKaryawan(List<KaryawanModel> daftarKaryawan) {
        System.out.println("Semua Karyawan: ");
        for (KaryawanModel karyawan : daftarKaryawan) {
            System.out.println(karyawan);
        }
    }

    public void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }

}
