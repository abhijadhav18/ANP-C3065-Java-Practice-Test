package com.assignment.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.assignment.model.Employee;
import com.assignment.util.HibernateUtil;

public class EmployeeDao{

	// save Student
    // get All Students
    // get Student By Id
    // Update Student
    // Delete Student
	public void getEmployee(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            // start a transaction
            transaction = session.beginTransaction();



            // get Student entity using get() method
            Employee employee = session.get(Employee.class, id);
            System.out.println(employee.getFirstName());
            System.out.println(employee.getEmail());



            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }



    public void loadEmployee(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            // start a transaction
            transaction = session.beginTransaction();



            // get Student entity using load() method
            Employee employee = session.load(Employee.class, id);
            System.out.println(employee.getFirstName());
            System.out.println(employee.getEmail());



            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }



    public void getEmployeeById(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();



            // Obtain an entity using byId() method
            Employee employee = session.byId(Employee.class).getReference(id);
            System.out.println(employee.getFirstName());
            System.out.println(employee.getEmail());



            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void saveEmployee(Employee employee) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(employee);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
            {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}