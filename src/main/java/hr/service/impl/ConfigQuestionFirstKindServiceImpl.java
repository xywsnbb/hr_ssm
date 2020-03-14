package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigQuestionFirstKindMapper;
import hr.pojo.ConfigQuestionFirstKind;
import hr.service.ConfigQuestionFirstKindService;

@Service
public class ConfigQuestionFirstKindServiceImpl implements ConfigQuestionFirstKindService{
	@Autowired
	private ConfigQuestionFirstKindMapper configQuestionFirstKindMapper = null;
	@Override
	public boolean addQuestionFirstKind(ConfigQuestionFirstKind configQuestionFirstKind) {
		// TODO Auto-generated method stub
		return configQuestionFirstKindMapper.saveQuestionFirstKind(configQuestionFirstKind);
	}

	@Override
	public boolean modifyQuestionFirstKind(ConfigQuestionFirstKind configQuestionFirstKind) {
		// TODO Auto-generated method stub
		return configQuestionFirstKindMapper.updateQuestionFirstKind(configQuestionFirstKind);
	}

	@Override
	public List<ConfigQuestionFirstKind> queryAllConfigQuestionFirstKind() {
		// TODO Auto-generated method stub
		return configQuestionFirstKindMapper.selectAllConfigQuestionFirstKind();
	}

	@Override
	public ConfigQuestionFirstKind queryConfigQuestionFirstKindById(int qfk_id) {
		// TODO Auto-generated method stub
		return configQuestionFirstKindMapper.selectConfigQuestionFirstKindById(qfk_id);
	}

	@Override
	public boolean removeConfigQuestionFirstKindById(int qfk_id) {
		// TODO Auto-generated method stub
		return configQuestionFirstKindMapper.deleteConfigQuestionFirstKindById(qfk_id);
	}

	@Override
	public Integer queryMaxId() {
		return configQuestionFirstKindMapper.selectMaxId();
	}

}
