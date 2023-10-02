package id.aplikasi.karyawan;

import id.aplikasi.karyawan.controller.KaryawanController;
import id.aplikasi.karyawan.model.KaryawanModel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
class KaryawanControllerTest {
    private KaryawanController controller;
    @BeforeEach
    public void setUp() {
        controller = new KaryawanController();
    }

    @Test
    @DisplayName("Test Tambah Karyawan")
    public void testTambahKaryawan() {
        controller.tambahKaryawan(1, "John Doe", "Manager");
        assertEquals(1, controller.semuaKaryawan().size());
        System.out.println("Test Passed");
    }

    @Test
    @DisplayName("Test Get Karyawan by Id")
    public void testKaryawanById() {
        controller.tambahKaryawan(1, "Jane Doe", "Developer");
        KaryawanModel karyawan = controller.karyawanById(1);
        assertNotNull(karyawan);
        assertEquals("Jane Doe", karyawan.getNama());
        assertEquals("Developer", karyawan.getJabatan());
        System.out.println("Test Passed");
    }

    @Test
    @DisplayName("Test Perbarui Karyawan")
    public void testPerbaruiKaryawan() {
        controller.tambahKaryawan(1, "John Doe", "Manager");
        controller.perbaruiKaryawan(1, "John Smith", "Director");
        KaryawanModel karyawan = controller.karyawanById(1);
        assertEquals("John Smith", karyawan.getNama());
        assertEquals("Director", karyawan.getJabatan());
        System.out.println("Test Passed");
    }

    @Test
    @DisplayName("Test Hapus Karyawan")
    public void testHapusKaryawan() {
        controller.tambahKaryawan(1, "John Doe", "Manager");
        controller.hapusKaryawan(1);
        assertEquals(0, controller.semuaKaryawan().size());
        System.out.println("Test Passed");
    }
    @AfterEach
    public void tearDown() {
        controller = null;
    }



}
