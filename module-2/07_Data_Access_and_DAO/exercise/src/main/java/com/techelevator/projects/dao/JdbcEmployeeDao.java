package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcEmployeeDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();

        SqlRowSet allEmployeesRowState = jdbcTemplate.queryForRowSet("select employee_id, department_id, first_name," +
                " last_name, birth_date, hire_date from employee");
        while (allEmployeesRowState.next()) {
            employeeList.add(mapRowToEmployee(allEmployeesRowState));
        }
        return employeeList;
    }

    @Override
    public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
        List<Employee> employeeByName = new ArrayList<>();
        String employeeName =
                "select employee_id, department_id, first_name," +
                        " last_name, birth_date, hire_date" +
                        " from employee" +
                        " where first_name ilike ? and last_name ilike ?;";
        SqlRowSet employeeNameRowState = jdbcTemplate.queryForRowSet(employeeName, "%" +
                firstNameSearch + "%", "%" + lastNameSearch + "%");
        while (employeeNameRowState.next()) {
            employeeByName.add(mapRowToEmployee(employeeNameRowState));
        }
        return employeeByName;
    }

    @Override
    public List<Employee> getEmployeesByProjectId(int projectId) {
        String gettingEmployeeByProjectId =
                "select" +
                        " employee.employee_id, department_id, first_name, last_name, birth_date, hire_date" +
                        " from" +
                        " employee" +
                        " join project_employee on employee.employee_id = project_employee.employee_id" +
                        " join project on project_employee.project_id = project.project_id" +
                        " where" +
                        " project.project_id = ?;";
        SqlRowSet projectIdRowSet = jdbcTemplate.queryForRowSet(gettingEmployeeByProjectId, projectId);

        List<Employee> employeeProjectId = new ArrayList<>();

        while(projectIdRowSet.next()){
            employeeProjectId.add(mapRowToEmployee(projectIdRowSet));
        }
        return employeeProjectId;
    }

    @Override
    public void addEmployeeToProject(int projectId, int employeeId) {
        String employeeProject =
                "insert into project_employee (employee_id, project_id)" +
                        " values((select employee_id from employee where employee_id = ?)," +
                        " (select project_id from project where project_id = ?));";
        jdbcTemplate.update(employeeProject, employeeId, projectId);
    }
// object for when you need a return clause on end of insert statement, the returning state at the end to get id
    // update for when there is no return, fire and forget
    @Override
    public void removeEmployeeFromProject(int projectId, int employeeId) {
        String deleteEmployeeProject =
                "delete from project_employee where employee_id = ? and project_id = ?;";
        jdbcTemplate.update(deleteEmployeeProject, employeeId, projectId);
    }

    @Override
    public List<Employee> getEmployeesWithoutProjects() {
        String employeeNoProject =
                "select" +
                        " e.employee_id, department_id, first_name, last_name, birth_date, hire_date" +
                        " from" +
                        " employee as e" +
                        " left outer join project_employee as pe on e.employee_id = pe.employee_id" +
                        " where" +
                        " project_id is null;";
        SqlRowSet noProjectRowSet = jdbcTemplate.queryForRowSet(employeeNoProject);

        List<Employee> noProjects = new ArrayList<>();

        if (noProjectRowSet.next()) {
            noProjects.add(mapRowToEmployee(noProjectRowSet));
        }

        return noProjects;

    }

    private Employee mapRowToEmployee(SqlRowSet employeeRowSet) {
        Employee employee = new Employee();

        employee.setId(employeeRowSet.getInt("employee_id"));
        employee.setDepartmentId(employeeRowSet.getInt("department_id"));
        employee.setFirstName(employeeRowSet.getString("first_name"));
        employee.setLastName(employeeRowSet.getString("last_name"));
        employee.setBirthDate(employeeRowSet.getDate("birth_date").toLocalDate());
        employee.setHireDate(employeeRowSet.getDate("hire_date").toLocalDate());

        return employee;
    }

}
