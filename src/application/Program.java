package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        sellerDao.insert(new Seller(null, "Jim", "jim@gmail.com", new Date(), 10400.00, new Department(2, "Eletronics")));
        sellerDao.insert(new Seller(null, "Pedro", "pedro@gmail.com", new Date(), 1000.00, new Department(2, "Eletronics")));
        Department dep = new Department(3, null);

        sellerDao.update(new Seller(5, "Donal Green", "donalgreen@gmail.com", new Date(), 5600.40, new Department(2, "Eletronics")));

        List<Seller> list = sellerDao.findByDepartment(dep);
        List<Seller> lista = sellerDao.findAll();
        sellerDao.findById(50);


        for(Seller sel : lista) {
            System.out.println(sel);
        }

        DB.closeConnection();

    }
}
