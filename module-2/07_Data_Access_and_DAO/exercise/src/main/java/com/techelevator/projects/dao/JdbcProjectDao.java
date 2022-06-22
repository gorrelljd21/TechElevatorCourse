package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
		String getProjectId =
				"select" +
						" project_id, name, from_date, to_date" +
						" from" +
						" project" +
						" where" +
						" project_id = ?;";

		SqlRowSet getProjectRowSet = jdbcTemplate.queryForRowSet(getProjectId, projectId);

		if (getProjectRowSet.next()) {
			return mapToRowProject(getProjectRowSet);
		} else {
			return null;
		}
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> allProjectsList = new ArrayList<>();

		String getAllProjects =
				"select project_id, name, from_date, to_date from project;";
		SqlRowSet allProjectsRowSet = jdbcTemplate.queryForRowSet(getAllProjects);

		while (allProjectsRowSet.next()) {
			allProjectsList.add(mapToRowProject(allProjectsRowSet));
		}
		return allProjectsList;
	}

	@Override
	public Project createProject(Project newProject) {
		String createProject =
				"insert into project(name, from_date, to_date)" +
						" values(?, ?, ?) returning project_id;";
		Integer newProjectId = jdbcTemplate.queryForObject(createProject, Integer.class, newProject.getName(),
				newProject.getFromDate(), newProject.getToDate());

		newProject.setId(newProjectId);

		return newProject;
	}

	@Override
	public void deleteProject(int projectId) {
		String deleteProjectEmployee =
				"delete from project_employee where project_id = ?";
		jdbcTemplate.update(deleteProjectEmployee, projectId);
		String deleteProject =
				"delete from project where project_id = ?;";
		jdbcTemplate.update(deleteProject, projectId);

	}

	public Project mapToRowProject(SqlRowSet projectRowSet) {
		Project project = new Project();

		project.setId(projectRowSet.getInt("project_id"));
		project.setName(projectRowSet.getString("name"));

		if (projectRowSet.getDate("from_date") != null) {
			project.setFromDate(projectRowSet.getDate("from_date").toLocalDate());
		} else {
			project.setFromDate(null);
		}

		if (projectRowSet.getDate("to_date") != null) {
			project.setToDate(projectRowSet.getDate("to_date").toLocalDate());
		} else {
			project.setToDate(null);
		}

		return project;
	}

}