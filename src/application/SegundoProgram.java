package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class SegundoProgram {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        //departmentDao.insert(new Department(null, "Kaiju"));
        //departmentDao.update(new Department(4, "Kindle"));

        List<Department> lista = departmentDao.findAll();

        for(Department d : lista) {
            System.out.println(d);
        }


        DB.closeConnection();

    }
}
