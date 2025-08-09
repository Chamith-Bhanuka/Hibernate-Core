package lk.ijse.ORM;

import lk.ijse.ORM.config.FactoryConfiguration;
import lk.ijse.ORM.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction tx = session.beginTransaction();

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Anura");
        student1.setAddress("Colombo");

        //save
        //session.save(student1);

        //update
        //session.update(student1);

        //get
        //Student student = session.get(Student.class,1);
        //System.out.println(student.getName());

        //delete
        //session.delete(student1);

        tx.commit();
        session.close();
    }
}