package id.aplikasi.karyawan.model;

import java.util.Optional;


public class DtoKaryawan {
    private Integer id;
    private String name;

     public DtoKaryawan(Integer id, Optional<String> nama) {
        this.id = id;
        this.name = String.valueOf(nama);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
