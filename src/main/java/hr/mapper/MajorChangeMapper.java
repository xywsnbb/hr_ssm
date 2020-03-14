package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.MajorChange;

@Repository
public interface MajorChangeMapper {
	public boolean insertMajorChange(MajorChange majorchange);
	public boolean deleteMajorChange(int id);
	public boolean updateMajorChange(MajorChange majorchange);
	public MajorChange selectMajorChangeById(int id);
	public List<MajorChange> selectMajorChange();
}
