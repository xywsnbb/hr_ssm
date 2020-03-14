package hr.mapper;

import java.util.List;

import hr.pojo.EngageSubjects;

public interface EngageSubjectsMapper {
	public boolean saveEngageSubjects(EngageSubjects engageSubjects);
	public boolean deleteEngageSubjectsById(int id);
	public boolean updateEngageSubjectsById(EngageSubjects engageSubjects);
	public EngageSubjects selectEngageSubjectsById(int id);
	public List<EngageSubjects> selectAllEngageSubjects();
}
