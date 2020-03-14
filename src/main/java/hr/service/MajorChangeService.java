package hr.service;

import java.util.List;

import hr.pojo.MajorChange;

public interface MajorChangeService {
	public boolean saveMajorChange(MajorChange majorchange);
	public boolean removeMajorChange(int id);
	public boolean modifyMajorChange(MajorChange majorchange);
	public MajorChange queryMajorChangeById(int id);
	public List<MajorChange> queryMajorChange();
}
