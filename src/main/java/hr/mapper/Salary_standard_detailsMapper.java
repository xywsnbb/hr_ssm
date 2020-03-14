package hr.mapper;

import java.util.List;

import hr.pojo.Salary_grant;
import hr.pojo.Salary_standard_details;

public interface Salary_standard_detailsMapper {
	public void insertSalary_standard_details(Salary_standard_details salary_standard_details);
	public void updateSalary_standard_details(Salary_standard_details salary_standard_details);
	public Salary_standard_details selectSalary_standard_detailsById(int id);
	public List<Salary_standard_details> getSalary_standard_details();
	public boolean deleteSalary_standard_detailsById(int sid);

}
