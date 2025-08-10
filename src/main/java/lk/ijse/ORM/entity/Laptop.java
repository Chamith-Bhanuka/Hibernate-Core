package lk.ijse.ORM.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Laptop {
    @Id
    private int id;
    private String brand;
    private double price;

    @ManyToMany(mappedBy = "laptops")
    private List<Student> students;
}
