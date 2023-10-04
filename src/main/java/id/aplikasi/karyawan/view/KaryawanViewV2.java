package id.aplikasi.karyawan.view;

import id.aplikasi.karyawan.model.DtoKaryawan;
import id.aplikasi.karyawan.model.KaryawanModelV2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class KaryawanViewV2 {
    public static void main(String[] args) {
        KaryawanModelV2 orangPertama = new KaryawanModelV2(1, "Jacky Chan", "Director");
        KaryawanModelV2 orangKedua = new KaryawanModelV2(2, null, null);

        System.out.println(orangPertama.toString());
        System.out.println(orangKedua.toString());

        System.out.println("Karyawan 2 Details:");
        System.out.println("ID: " + orangKedua.getId());
        System.out.println("Nama: " + orangKedua.getNama().orElse("Entah"));
        System.out.println("Jabatan: " + orangKedua.getJabatan().orElse("Ga Tau"));

        Optional<String> namaOrangKedua = orangKedua.getNama().isPresent() ? orangKedua.getNama() : "No Name".describeConstable();
        System.out.println(namaOrangKedua);

        List<KaryawanModelV2> arrayOfKaryawan = new ArrayList<>();
        arrayOfKaryawan.add(new KaryawanModelV2(1 ,"niko", "staff"));
        arrayOfKaryawan.add(new KaryawanModelV2(2 ,"jeff", "ceo"));
        arrayOfKaryawan.add(new KaryawanModelV2(3 ,"elon", "direktor"));
        arrayOfKaryawan.add(new KaryawanModelV2(4 ,"musk", "manager"));
        arrayOfKaryawan.add(new KaryawanModelV2(5 ,"bill", "qa"));


        System.out.println(arrayOfKaryawan.get(1).getNama());
        arrayOfKaryawan.forEach(karyawan -> {
            System.out.println("ID: " + karyawan.getId() +
                    ", Nama: " + karyawan.getNama() +
                    ", Jabatan: " + karyawan.getJabatan());
        });

        List<DtoKaryawan> dtoList = arrayOfKaryawan.stream()
                .map(employee -> new DtoKaryawan(employee.getId(), employee.getNama()))
                .toList();


        dtoList.forEach(dtoEmployee -> System.out.println("ID Karyawan: " + dtoEmployee.getId() + ", Nama: " + dtoEmployee.getName()));
    }
}
