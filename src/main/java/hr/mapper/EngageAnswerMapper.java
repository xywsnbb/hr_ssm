package hr.mapper;

import java.util.List;

public interface EngageAnswerMapper {
	public boolean saveEngageAnswer(EngageAnswerMapper engageAnswer);
	public boolean deleteEngageAnswerById(int id);
	public boolean updateEngageAnswerById(EngageAnswerMapper engageAnswer);
	public EngageAnswerMapper selectEngageAnswerById(int id);
	public List<EngageAnswerMapper> selectAllEngageAnswer();
}
