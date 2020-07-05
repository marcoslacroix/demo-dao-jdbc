package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    Department findById(Integer id);

    void insert(Department obj);

    List<Department> findAll();

    void update(Department obj);

    void deleteById(Integer id);
}
