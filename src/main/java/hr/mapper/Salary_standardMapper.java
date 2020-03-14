package hr.mapper;

import java.util.List;

import hr.pojo.Salary_grant;
import hr.pojo.Salary_standard;

public interface Salary_standardMapper {
	public void insertSalary_standard(Salary_standard salary_standard);
	public void updateSalary_standard(Salary_standard salary_standard);
	public Salary_standard selectSalary_standardById(int id);
	public List<Salary_standard> getSalary_standard();
	public boolean deleteSalary_standardById(int sid);

}
