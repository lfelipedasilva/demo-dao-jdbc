package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        sellerDao.insert(new Seller(22, "Jim", "jim@gmail.com", new Date(), 10400.00, new Department(2, "Eletronics")));
        sellerDao.insert(new Seller(33, "Pedro", "pedro@gmail.com", new Date(), 1000.00, new Department(2, "Eletronics")));
        Department dep = new Department(3, null);

        sellerDao.deleteById(19);
        sellerDao.deleteById(21);
        sellerDao.deleteById(22);

        List<Seller> list = sellerDao.findByDepartment(dep);
        List<Seller> lista = sellerDao.findAll();


        for(Seller sel : lista) {
            System.out.println(sel);
        }

    }
}
