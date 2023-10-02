package id.aplikasi.karyawan.controller;

import id.aplikasi.karyawan.model.KaryawanModel;

import java.util.ArrayList;
import java.util.List;

public class KaryawanController {
    public List<KaryawanModel> daftarKaryawan;

    public KaryawanController() {
        daftarKaryawan = new ArrayList<>();
    }

    public void tambahKaryawan(int id, String nama, String jabatan) {
        if (id < 0 || nama.isEmpty() || jabatan.isEmpty()) {
            throw new IllegalArgumentException("Data karyawan tidak valid");
        }
        KaryawanModel karyawan = new KaryawanModel(id, nama, jabatan);
        daftarKaryawan.add(karyawan);
    }

    public List<KaryawanModel> semuaKaryawan() {
        return daftarKaryawan;
    }

    public KaryawanModel karyawanById(int id) {
        if (id < 0 ) {
            throw new IllegalArgumentException("Data karyawan tidak valid");
        }
        for (KaryawanModel karyawan : daftarKaryawan) {
            if (karyawan.getId() == id) {
                return karyawan;
            }
        }
        return null;
    }

    public void perbaruiKaryawan(int id, String nama, String jabatan) {
        if (id < 0 || nama.isEmpty() || jabatan.isEmpty()) {
            throw new IllegalArgumentException("Data karyawan tidak valid");
        }
        for (KaryawanModel karyawan : daftarKaryawan) {
            if (karyawan.getId() == id) {
                karyawan.setNama(nama);
                karyawan.setJabatan(jabatan);
                break;
            }
        }
    }

    public void hapusKaryawan(int id) {
        if (id < 0 ) {
            throw new IllegalArgumentException("Data karyawan tidak valid");
        }
        daftarKaryawan.removeIf(karyawan -> karyawan.getId() == id);
    }

}
