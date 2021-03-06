package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Test1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== Test2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("=== Test3: seller finAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("=== Test4: seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + seller.getId());

        System.out.println("=== Test5: seller Update ===");
        seller = sellerDao.findById(1);
        seller.setName("Martia Waine");
        sellerDao.update(seller);
        System.out.println("Updated completed");

        System.out.println("=== Test6: seller Delete ===");
        System.out.println("Enter id for delete test: ");
        int idForDelete = sc.nextInt();
        sellerDao.deleteById(idForDelete);
        System.out.println("Delete completed");

    }
}
