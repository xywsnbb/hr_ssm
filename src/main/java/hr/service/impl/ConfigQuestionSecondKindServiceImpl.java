package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.ConfigQuestionSecondKindMapper;
import hr.pojo.ConfigQuestionFirstKind;
import hr.pojo.ConfigQuestionSecondKind;
import hr.service.ConfigQuestionSecondKindService;
@Service
public class ConfigQuestionSecondKindServiceImpl implements ConfigQuestionSecondKindService{
	
	@Autowired
	private ConfigQuestionSecondKindMapper configQuestionSecondKindMapper = null;

	@Override
	public boolean addQuestionSecondKind(ConfigQuestionSecondKind configQuestionSecondKind) {
		return configQuestionSecondKindMapper.saveQuestionSecondKind(configQuestionSecondKind);
	}

	@Override
	public boolean modifyQuestionSecondKind(ConfigQuestionSecondKind configQuestionSecondKind) {
		return configQuestionSecondKindMapper.updateQuestionSecondKind(configQuestionSecondKind);
	}

	@Override
	public List<ConfigQuestionSecondKind> queryAllConfigQuestionSecondKind() {
		return configQuestionSecondKindMapper.selectAllConfigQuestionSecondKind();
	}

	@Override
	public ConfigQuestionSecondKind queryConfigQuestionSecondKindById(int qfk_id) {
		return configQuestionSecondKindMapper.selectConfigQuestionSecondKindById(qfk_id);
	}

	@Override
	public boolean removeConfigQuestionSecondKindById(int qfk_id) {
		return configQuestionSecondKindMapper.deleteConfigQuestionSecondKindById(qfk_id);
	}

	@Override
	public Integer queryMaxId() {
		return configQuestionSecondKindMapper.selectMaxId();
	}
	
	public List<ConfigQuestionSecondKind> linkageSelect(){
		return configQuestionSecondKindMapper.linkageSelect();
		
	}
	
}
