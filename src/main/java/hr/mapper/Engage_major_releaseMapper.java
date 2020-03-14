package hr.mapper;

import java.util.List;

import hr.pojo.Engage_major_release;
import hr.pojo.Salary_grant;

public interface Engage_major_releaseMapper {
	public void insertEngage_major_release(Engage_major_release engage_major_release);
	public void updateEngage_major_release(Engage_major_release engage_major_release);
	public Engage_major_release selectEngage_major_releaseById(int id);
	public List<Engage_major_release> getEngage_major_release();
	public boolean deleteEngage_major_releaseById(int sid);

}
