package id.aplikasi.karyawan.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer Id;
    private String name;
    private LocalDateTime dob;
    private String address;
}
