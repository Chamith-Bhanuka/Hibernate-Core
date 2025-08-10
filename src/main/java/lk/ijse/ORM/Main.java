package lk.ijse.ORM;

import lk.ijse.ORM.config.FactoryConfiguration;
import lk.ijse.ORM.entity.Laptop;
import lk.ijse.ORM.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction tx = session.beginTransaction();

        //Student student1 = new Student();
        //student1.setId(1);
        //student1.setName("Anura");
        //student1.setAddress("Colombo");

        //save
        //session.save(student1);

        //update
        //session.update(student1);

        //get
        //Student student = session.get(Student.class,1);
        //System.out.println(student.getName());

        //delete
        //session.delete(student1);

        //one-to-one relationship
        //Student student = new Student();
        //student.setId(1);
        //student.setName("Tom");
        //student.setAddress("Galle");

        //Laptop laptop = new Laptop();
        //laptop.setId(1);
        //laptop.setBrand("Asus");
        //laptop.setPrice(257000.0);

        //student.setLaptop(laptop);

        //session.save(laptop);
        //session.save(student);

        //One-to-Many
//        Laptop laptop1 = new Laptop();
//        laptop1.setId(1);
//        laptop1.setBrand("Asus");
//        laptop1.setPrice(100000);
//
//        Laptop laptop2 = new Laptop();
//        laptop2.setId(2);
//        laptop2.setBrand("HP");
//        laptop2.setPrice(20000);
//
//        List<Laptop> laptopList = new ArrayList<>();
//        laptopList.add(laptop1);
//        laptopList.add(laptop2);
//
//        Student student = new Student();
//        student.setId(1);
//        student.setName("Jack");
//        student.setAddress("Colombo");
////        student.setLaptops(laptopList);
//
//        laptop1.setStudent(student);
//        laptop2.setStudent(student);
//
//        session.save(laptop1);
//        session.save(laptop2);
//        session.save(student);

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Kamal");
        student1.setAddress("Colombo");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Bimal");
        student2.setAddress("Kandy");

        Laptop laptop1 = new Laptop();
        laptop1.setId(1);
        laptop1.setBrand("Asus");
        laptop1.setPrice(100000);

        Laptop laptop2 = new Laptop();
        laptop2.setId(2);
        laptop2.setBrand("Hp");
        laptop2.setPrice(20000);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        student1.setLaptops(laptops);
        student2.setLaptops(laptops);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        laptop1.setStudents(students);
        laptop2.setStudents(students);

        session.save(student1);
        session.save(student2);
        session.save(laptop1);
        session.save(laptop2);

        tx.commit();
        session.close();
    }
}