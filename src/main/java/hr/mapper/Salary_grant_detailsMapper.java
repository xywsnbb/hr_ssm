package hr.mapper;

import java.util.List;

import hr.pojo.Salary_grant;
import hr.pojo.Salary_grant_details;

public interface Salary_grant_detailsMapper {
	public void insertSalary_grant_details(Salary_grant_details salary_grant_details);
	public void updateSalary_grant_details(Salary_grant_details salary_grant_details);
	public Salary_grant_details selectSalary_grant_detailsById(int id);
	public List<Salary_grant_details> getSalary_grant_details();
	public boolean deleteSalary_grant_detailsById(int sid);

}
