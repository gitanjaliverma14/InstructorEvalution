package com.instructor_evaluation_portal.dao;

import java.util.List;

import com.instructor_evaluation_portal.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class DataDaoImplementation implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

    /*// Hibernate Query handling of Inventory InstructorDetails
	@Override
	public boolean addInventoryItem(Dean inventoryItem) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(inventoryItem);
		tx.commit();
		session.close();

		return false;
	}

	@Override
	public Dean getInventoryById(long id) throws Exception {

		session = sessionFactory.openSession();
		Dean inventoryItem = (Dean)session.load(Dean.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return inventoryItem;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dean> getInventoryList() throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Dean> inventoryItemList = session.createCriteria(Dean.class)
				.list();
		tx.commit();
		session.close();
		return inventoryItemList;
	}
	
	@Override
	public boolean deleteInventory(long id) throws Exception {

		session = sessionFactory.openSession();
		Object o = session.load(Dean.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}*/

    //Hibernate Query handling of the Admin
    @Override
    public boolean addAdmin(Admin adminUser) throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(adminUser);
        tx.commit();
        session.close();

        return false;
    }

    @Override
    public Admin getAdminById(long id) throws Exception {

        session = sessionFactory.openSession();
        Admin adminUser = (Admin)session.load(Admin.class,
                new Long(id));
        tx = session.getTransaction();
        session.beginTransaction();
        tx.commit();
        return adminUser;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Admin> getAdminList() throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<Admin> adminList = session.createCriteria(Admin.class)
                .list();
        tx.commit();
        session.close();
        return adminList;
    }

    @Override
    public  boolean deleteAdmin(long id) throws Exception {

        session = sessionFactory.openSession();
        Object o = session.load(Admin.class, id);
        tx = session.getTransaction();
        session.beginTransaction();
        session.delete(o);
        tx.commit();

        return false;
    }

    //Hibernate Query handling of the Dean
    @Override
    public boolean addDean(Dean dean) throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(dean);
        tx.commit();
        session.close();

        return false;
    }

    @Override
    public Dean getDeanById(long id) throws Exception {

        session = sessionFactory.openSession();
        Dean dean = (Dean)session.load(Dean.class,
                new Long(id));
        tx = session.getTransaction();
        session.beginTransaction();
        tx.commit();
        return dean;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Dean> getDeanList() throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<Dean> deanList = session.createCriteria(Dean.class)
                .list();
        tx.commit();
        session.close();
        return deanList;
    }

    @Override
    public  boolean deleteDean(long id) throws Exception {

        session = sessionFactory.openSession();
        Object o = session.load(Dean.class, id);
        tx = session.getTransaction();
        session.beginTransaction();
        session.delete(o);
        tx.commit();

        return false;
    }

    //Hibernate Query handling of the Student
    @Override
    public boolean addStudent(Student student) throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();

        return false;
    }

    @Override
    public Student getStudentById(long id) throws Exception {

        session = sessionFactory.openSession();
        Student student = (Student)session.load(Student.class,
                new Long(id));
        tx = session.getTransaction();
        session.beginTransaction();
        tx.commit();
        return student;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Student> getStudentList() throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<Student> studentList = session.createCriteria(Student.class)
                .list();
        tx.commit();
        session.close();
        return studentList;
    }

    @Override
    public  boolean deleteStudent(long id) throws Exception {

        session = sessionFactory.openSession();
        Object o = session.load(Student.class, id);
        tx = session.getTransaction();
        session.beginTransaction();
        session.delete(o);
        tx.commit();

        return false;
    }

    //Hibernate Query handling of Faculty
    @Override
    public boolean addFaculty(Faculty faculty) throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(faculty);
        tx.commit();
        session.close();

        return false;
    }

    @Override
    public Faculty getFacultyById(long id) throws Exception {

        session = sessionFactory.openSession();
        Faculty faculty = (Faculty)session.load(Faculty.class,
                new Long(id));
        tx = session.getTransaction();
        session.beginTransaction();
        tx.commit();
        return faculty;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Faculty> getFacultyList() throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<Faculty> facultyList = session.createCriteria(Faculty.class)
                .list();
        tx.commit();
        session.close();
        return facultyList;
    }

    @Override
    public  boolean deleteFaculty(long id) throws Exception {

        session = sessionFactory.openSession();
        Object o = session.load(Faculty.class, id);
        tx = session.getTransaction();
        session.beginTransaction();
        session.delete(o);
        tx.commit();

        return false;
    }


    // Hibernate Query handling of InstructorDetails
    @Override
    public boolean createNewInstructorAccount(InstructorDetails instructor) throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(instructor);
        tx.commit();
        session.close();

        return false;
    }

    @Override
    public InstructorDetails viewInstructorDetails(long id) throws Exception {

        session = sessionFactory.openSession();
        InstructorDetails instructor = (InstructorDetails)session.load(InstructorDetails.class,
                new Long(id));
        tx = session.getTransaction();
        session.beginTransaction();
        tx.commit();
        return instructor;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<InstructorDetails> getInstructorList() throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<InstructorDetails> instructorList = session.createCriteria(InstructorDetails.class)
                .list();
        tx.commit();
        session.close();
        return instructorList;
    }

    @Override
    public  boolean deleteInstructor(long id) throws Exception {

        session = sessionFactory.openSession();
        Object o = session.load(InstructorDetails.class, id);
        tx = session.getTransaction();
        session.beginTransaction();
        session.delete(o);
        tx.commit();
        return false;
    }

    @Override
    public boolean removeFeedback(long id) throws Exception {

        session = sessionFactory.openSession();
        Object o = session.load(Feedback.class, id);
        tx = session.getTransaction();
        session.beginTransaction();
        session.delete(o);
        tx.commit();
        return false;
    }

    @Override
    public boolean fillFeedback(Feedback feedback) throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(feedback);
        tx.commit();
        session.close();

        return false;
    }



    /*// Hibernate Query Handing for Complaints
    @Override
    public boolean addComplaint(Admin complaint) throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(complaint);
        tx.commit();
        session.close();

        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Admin> getAllComplaints() throws Exception {

        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<Admin> complaintList = session.createCriteria(Admin.class)
                .list();
        tx.commit();
        session.close();
        return complaintList;
    }*/
}
