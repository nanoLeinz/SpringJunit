package id.aplikasi.karyawan;

import id.aplikasi.karyawan.controller.KaryawanController;
import id.aplikasi.karyawan.model.KaryawanModel;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
class KaryawanControllerTest {
    private KaryawanController controller = new KaryawanController();
    @Before
    public void setUp() {
        controller = new KaryawanController();
    }

    @Test
    public void testTambahKaryawan() {
        controller.tambahKaryawan(1, "John Doe", "Manager");
        assertEquals(3, controller.semuaKaryawan().size());
    }

    @Test
    public void testKaryawanById() {
        controller.tambahKaryawan(1, "Jane Doe", "Developer");
        KaryawanModel karyawan = controller.karyawanById(1);
        assertNotNull(karyawan);
        assertEquals("Jane Doe", karyawan.getNama());
        assertEquals("Developer", karyawan.getJabatan());
    }

    @Test
    public void testPerbaruiKaryawan() {
        controller.tambahKaryawan(1, "John Doe", "Manager");
        controller.perbaruiKaryawan(1, "John Smith", "Director");
        KaryawanModel karyawan = controller.karyawanById(1);
        assertEquals("John Smith", karyawan.getNama());
        assertEquals("Director", karyawan.getJabatan());
    }

    @Test
    public void testHapusKaryawan() {
        controller.tambahKaryawan(1, "John Doe", "Manager");
        controller.hapusKaryawan(1);
        assertEquals(0, controller.semuaKaryawan().size());
    }
    @After
    public void tearDown() {
        controller = null;
    }



}
