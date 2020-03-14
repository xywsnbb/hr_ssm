package hr.mapper;

import java.util.List;

import hr.pojo.Salary_grant;

public interface Salary_grantMapper {
	public void insertSalary_grant(Salary_grant salary_grant);
	public void updateSalary_grant(Salary_grant salary_grant);
	public Salary_grant selectSalary_grantById(int id);
	public List<Salary_grant> getSalary_grant();
	public boolean deleteSalary_grantById(int sid);

}
