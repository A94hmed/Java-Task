package test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Student;
import model.Course;
import util.HibernateUtil;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Ahmed");

        Course java = new Course("Java");
        Course hibernate = new Course("Hibernate");

        student.addCourse(java);
        student.addCourse(hibernate);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.save(student);
        session.save(java);
        session.save(hibernate);

        tx.commit();

        session.close();

        System.out.println("Data Saved Successfully");
        
        
        Course spring = new Course("Spring");

        Student student1 = new Student("Ahmed");
        Student student2 = new Student("Mohamed");

        spring.getStudents().add(student1);
        spring.getStudents().add(student2);

        student1.getCourses().add(spring);
        student2.getCourses().add(spring);

        session.save(student1);
        session.save(student2);
        session.save(spring);
    }
}