package id.aplikasi.karyawan.view;

import id.aplikasi.karyawan.model.KaryawanModel;

import java.util.ArrayList;
import java.util.List;

public class LambdaTry {
    public static void main(String[] args) {
        List<KaryawanModel> listKaryawan = new ArrayList<>();
        listKaryawan.add(new KaryawanModel(1, "Jeff", "Staff"));
        listKaryawan.add(new KaryawanModel(2, "Bezos", "Staff"));
        listKaryawan.add(new KaryawanModel(3, "Elon", "CEO"));
        listKaryawan.add(new KaryawanModel(4, "Joko", "Director"));
        listKaryawan.add(new KaryawanModel(5, "Pusk", "Staff"));
        listKaryawan.add(new KaryawanModel(6, "Marjan", "PM"));
        listKaryawan.add(new KaryawanModel(7, "Yes", "Staff"));

        //Method Ref
        listKaryawan.stream().forEach(LambdaTry::printObject);
        System.out.println("==");
        // Filter
        List<KaryawanModel> filteredList = listKaryawan.stream().filter(kM -> kM.getJabatan().equals("Staff")).toList();
        filteredList.forEach(karyawanModel -> System.out.println("nama : " + karyawanModel.getNama() + ", Sebagai " + karyawanModel.getJabatan()));
        System.out.println("==");

        //Sorting
        List<KaryawanModel> descList = listKaryawan.stream().sorted((o1, o2) -> o2.getNama().compareTo(o1.getNama())).toList();
        descList.forEach(LambdaTry::printObject);
        //Remove
        listKaryawan.removeIf(kM ->kM.getId() % 2 == 1);
        listKaryawan.forEach(LambdaTry::printObject);

    }

    public static void printObject(KaryawanModel kM) {
        System.out.println("The name is : " + kM.getNama() + ", Sebagai " + kM.getJabatan() + " With ID : " + kM.getId());
    }
}
