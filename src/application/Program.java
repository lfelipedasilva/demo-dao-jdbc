package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.println(obj.toString());

        Seller seller = new Seller(22, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Department dep = new Department(3, null);

        List<Seller> list = sellerDao.findByDepartment(dep);
        List<Seller> lista = sellerDao.findAll();


        for(Seller sel : lista) {
            System.out.println(sel);
        }

    }
}
