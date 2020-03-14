package hr.mapper;

import java.util.List;

import hr.pojo.EngageResume;

public interface EngageResumeMapper {
	public boolean saveEngageResume(EngageResume engageResume);
	public boolean deleteEngageResumeById(int id);
	public boolean updateEngageResumeById(EngageResume engageResume);
	public EngageResume selectEngageResumeById(int id);
	public List<EngageResume> selectAllEngageResume();
}
