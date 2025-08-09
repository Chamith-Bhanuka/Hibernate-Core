package lk.ijse.ORM;

import lk.ijse.ORM.config.FactoryConfiguration;
import lk.ijse.ORM.entity.Student;
import org.hibernate.Session;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Kamal");
        student1.setAddress("Colombo");

        session.save(student1);
    }
}