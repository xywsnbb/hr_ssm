package hr.mapper;

import java.util.List;

import hr.pojo.EngageInterview;


public interface EngageInterviewMapper {
	public boolean saveEngageInterview(EngageInterview engageInterview);
	public boolean deleteEngageInterviewById(int id);
	public boolean updateEngageInterviewById(EngageInterview engageInterview);
	public EngageInterview selectEngageInterviewById(int id);
	public List<EngageInterview> selectAllEngageInterview();
}
