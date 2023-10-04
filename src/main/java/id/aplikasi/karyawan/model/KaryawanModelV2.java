package id.aplikasi.karyawan.model;

import java.util.Optional;

public class KaryawanModelV2 {
    public int id;
    public Optional<String> nama;
    public Optional<String> jabatan;

    public KaryawanModelV2(int id, String nama, String jabatan) {
        this.id = id;
        this.nama = Optional.ofNullable(nama);
        this.jabatan = Optional.ofNullable(jabatan);
    }

    public int getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = Optional.ofNullable(nama);
    }

    public void setJabatan(String jabatan) {
        this.jabatan = Optional.ofNullable(jabatan);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama.orElse("Tidak Diketahui") + ", Jabatan: " + jabatan.orElse("Tidak Ada");
    }

    public Optional<String> getNama() {
        return nama;
    }

    public Optional<String> getJabatan() {
        return jabatan;
    }
}
