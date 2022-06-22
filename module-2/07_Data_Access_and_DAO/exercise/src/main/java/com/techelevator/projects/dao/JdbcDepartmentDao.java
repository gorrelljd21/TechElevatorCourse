package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcDepartmentDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Department getDepartment(int id) {
        String getDepartment = "select department_id, name from department where department_id = ?;";
        SqlRowSet departmentRowSet = jdbcTemplate.queryForRowSet(getDepartment, id);
        if (departmentRowSet.next()) {
            return mapRowToDepartment(departmentRowSet);
        }
		return null;
    }

    @Override
    public List<Department> getAllDepartments() {
        List<Department> depList = new ArrayList<>();

        SqlRowSet allDepsRowState = jdbcTemplate.queryForRowSet("select department_id, name from department;");
        while (allDepsRowState.next()) {
            depList.add(mapRowToDepartment(allDepsRowState));
        }
        return depList;
    }

    @Override
    public Department updateDepartment(Department updatedDepartment) {
        String updateDep =
                "update department" +
                        " set name = ?" +
                        " where department_id = ?;";
        jdbcTemplate.update(updateDep, updatedDepartment.getName(), updatedDepartment.getId());
        return updatedDepartment;
    }

    private Department mapRowToDepartment(SqlRowSet departmentRowSet) {

        Department department = new Department();

        department.setId(departmentRowSet.getInt("department_id"));
        department.setName(departmentRowSet.getString("name"));

        return department;
    }
}
