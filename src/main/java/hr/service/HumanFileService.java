package hr.service;

import java.util.List;

import hr.pojo.HumanFile;

public interface HumanFileService {
	public boolean saveHumanFile(HumanFile humanfile);
	public boolean modifyHumanFileById(HumanFile humanfile);
	public boolean removeHumanFileById(int id);
	public HumanFile queryHumanFileById(int id);
	public List<HumanFile> queryHumanFile();
}
