package hr.service;

import java.util.List;

import hr.pojo.HumanFileDig;

public interface HumanFileDigService {
	public boolean saveHumanFileDig(HumanFileDig humanfiledig);
	public boolean modifyHumanFileDigById(HumanFileDig humanfiledig);
	public boolean removeHumanFileDigById(int id);
	public HumanFileDig queryHumanFileDigById(int id);
	public List<HumanFileDig> queryHumanFileDig();
}
