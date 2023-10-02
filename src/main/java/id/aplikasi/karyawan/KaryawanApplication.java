package id.aplikasi.karyawan;

import id.aplikasi.karyawan.controller.KaryawanController;
import id.aplikasi.karyawan.model.KaryawanModel;
import id.aplikasi.karyawan.view.KaryawanView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class KaryawanApplication {

	public static void main(String[] args) {
		KaryawanController controller = new KaryawanController();
		KaryawanView view = new KaryawanView();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("1. Tambah Karyawan");
				System.out.println("2. Tampilkan Semua Karyawan");
				System.out.println("3. Tampilkan Karyawan by ID");
				System.out.println("4. Perbarui Karyawan");
				System.out.println("5. Hapus Karyawan");
				System.out.println("6. Keluar");
				System.out.print("Masukkan pilihan Anda: ");

				int pilihan = scanner.nextInt();
				scanner.nextLine();

				switch (pilihan) {
					case 1:
						System.out.print("Masukkan ID Karyawan: ");
						int id = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Masukkan Nama Karyawan: ");
						String nama = scanner.nextLine();
						System.out.print("Masukkan Jabatan Karyawan: ");
						String jabatan = scanner.nextLine();
						controller.tambahKaryawan(id, nama, jabatan);
						view.tampilkanPesan("Karyawan berhasil ditambahkan!");
						break;
					case 2:
						List<KaryawanModel> daftarKaryawan = controller.semuaKaryawan();
						view.tampilkanSemuaKaryawan(daftarKaryawan);
						break;
					case 3:
						System.out.print("Masukkan ID Karyawan: ");
						int cariId = scanner.nextInt();
						KaryawanModel karyawan = controller.karyawanById(cariId);
						if (karyawan != null) {
							view.tampilkanDetailKaryawan(karyawan);
						} else {
							view.tampilkanPesan("Karyawan tidak ditemukan!");
						}
						break;
					case 4:
						System.out.print("Masukkan ID Karyawan yang akan diperbarui: ");
						int updateId = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Masukkan Nama Baru: ");
						String namaBaru = scanner.nextLine();
						System.out.print("Masukkan Jabatan Baru: ");
						String jabatanBaru = scanner.nextLine();
						controller.perbaruiKaryawan(updateId, namaBaru, jabatanBaru);
						view.tampilkanPesan("Data Karyawan berhasil diperbarui!");
						break;
					case 5:
						System.out.print("Masukkan ID Karyawan yang akan dihapus: ");
						int hapusId = scanner.nextInt();
						controller.hapusKaryawan(hapusId);
						view.tampilkanPesan("Karyawan berhasil dihapus!");
						break;
					case 6:
						System.out.println("Keluar dari aplikasi.");
						scanner.close();
						System.exit(0);
					default:
						view.tampilkanPesan("Pilihan tidak valid. Silakan coba lagi.");
						break;
				}
			}
			catch (Exception e){
				System.out.println("Terjadi kesalahan: " + e.getMessage());
			}

		}

	}

}
