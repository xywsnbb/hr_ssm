package hr.mapper;

import java.util.List;

import hr.pojo.Bonus;
import hr.pojo.Salary_grant;

public interface BonusMapper {
	public boolean insertBonus(Bonus bonus);
	public boolean updateBonus(Bonus bonus);
	public Bonus selectBonusById(int id);
	public List<Bonus> getBonus();
	public boolean deleteBonusById(int sid);
}
