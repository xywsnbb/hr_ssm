package hr.mapper;

import java.util.List;

import hr.pojo.EngageAnswerDetails;

public interface EngageAnswerDetailsMapper {
	public boolean saveEngageAnswerDetails(EngageAnswerDetails engageAnswerDetails);
	public boolean deleteEngageAnswerDetailsById(int id);
	public boolean updateEngageAnswerDetailsById(EngageAnswerDetails engageAnswerDetails);
	public EngageAnswerDetails selectEngageAnswerDetailsById(int id);
	public List<EngageAnswerDetails> selectAllEngageAnswerDetails();
}
