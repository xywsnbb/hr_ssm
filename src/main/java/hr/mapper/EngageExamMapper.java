package hr.mapper;

import java.util.List;

import hr.pojo.EngageExam;

public interface EngageExamMapper {
	public boolean saveEngageExam(EngageExam engageExam);
	public boolean deleteEngageExamById(int id);
	public boolean updateEngageExamById(EngageExam engageExam);
	public EngageExam selectEngageExamById(int id);
	public List<EngageExam> selectAllEngageExam();
}
