package lk.ijse.ORM.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Laptop {
    @Id
    private int id;
    private String brand;
    private double price;

    @ManyToOne
    @JoinColumn(name = "student_id_custom")
    private Student student;
}
