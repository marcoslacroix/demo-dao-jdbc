package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Department obj2 = new Department(2, "Eletronics")
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 2000.00, obj);
        System.out.println(obj);
        System.out.println(seller);
    }
}
