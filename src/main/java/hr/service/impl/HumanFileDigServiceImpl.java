package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.HumanFileDigMapper;
import hr.pojo.HumanFileDig;
import hr.service.HumanFileDigService;

@Service
public class HumanFileDigServiceImpl implements HumanFileDigService{
	@Autowired
	private HumanFileDigMapper mapper = null;
	
	@Override
	public boolean saveHumanFileDig(HumanFileDig humanfiledig) {
		return mapper.insertHumanFileDig(humanfiledig);
	}

	@Override
	public boolean modifyHumanFileDigById(HumanFileDig humanfiledig) {
		return mapper.updateHumanFileDigById(humanfiledig);
	}

	@Override
	public boolean removeHumanFileDigById(int id) {
		return mapper.deleteHumanFileDigById(id);
	}

	@Override
	public HumanFileDig queryHumanFileDigById(int id) {
		return mapper.selectHumanFileDigById(id);
	}

	@Override
	public List<HumanFileDig> queryHumanFileDig() {
		return mapper.selectHumanFileDig();
	}

}
