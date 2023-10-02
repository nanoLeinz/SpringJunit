package id.aplikasi.karyawan.model;

public class KaryawanModel {
    public int id;
    public String nama;
    public String jabatan;

    public KaryawanModel(int id, String nama, String jabatan) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public int getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Jabatan: " + jabatan;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }
}
