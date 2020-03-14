package hr.mapper;

import java.util.List;

import hr.pojo.EngageExamDetails;



public interface EngageExamDetailsMapper {
	public boolean saveEngageExamDetails(EngageExamDetails engageExamDetails);
	public boolean deleteEngageExamDetailsById(int id);
	public boolean updateEngageExamDetailsById(EngageExamDetails engageExamDetails);
	public EngageExamDetails selectEngageExamDetailsById(int id);
	public List<EngageExamDetails> selectAllEngageExamDetails();
}
