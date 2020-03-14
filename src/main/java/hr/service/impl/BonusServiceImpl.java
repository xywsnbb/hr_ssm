package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.BonusMapper;
import hr.pojo.Bonus;
import hr.service.BonusService;
@Service
public class BonusServiceImpl implements BonusService{
	@Autowired
	private BonusMapper bm = null;

	@Override
	public boolean addBonus(Bonus b) {
		return bm.insertBonus(b);
	}

	@Override
	public boolean modifyBonus(Bonus bonus) {
		return bm.updateBonus(bonus);
	}

	@Override
	public Bonus queryBonusById(int id) {
		return bm.selectBonusById(id);
	}

	@Override
	public List<Bonus> queryAll() {
		return bm.getBonus();
	}
	
}
