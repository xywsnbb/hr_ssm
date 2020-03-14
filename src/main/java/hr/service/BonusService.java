package hr.service;

import java.util.List;

import hr.pojo.Bonus;

public interface BonusService {
	public boolean addBonus(Bonus b);
	public boolean modifyBonus(Bonus bonus);
	public Bonus queryBonusById(int id);
	public List<Bonus> queryAll();
}
