package model.dao;

import model.dao.model.dao.impl.SellDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellDaoJDBC();
    }
}
