package hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.mapper.Config_public_charMapper;
import hr.pojo.Config_public_char;
import hr.service.Config_public_charService;

@Service
public class Config_public_charServiceImpl implements Config_public_charService{
	@Autowired
	private Config_public_charMapper mapper = null;

	@Override
	public void saveConfig_public_char(Config_public_char config_public_char) {
		mapper.insertConfig_public_char(config_public_char);
	}

	@Override
	public void modifyConfig_public_char(Config_public_char config_public_char) {
		mapper.updateConfig_public_char(config_public_char);
	}

	@Override
	public Config_public_char queryConfig_public_charById(int id) {
		return mapper.selectConfig_public_charById(id);
	}

	@Override
	public List<Config_public_char> queryConfig_public_char() {
		return mapper.getConfig_public_char();
	}

	@Override
	public boolean removeConfig_public_charById(int sid) {
		return mapper.deleteConfig_public_charById(sid);
	}

	@Override
	public int queryConfig_public_charMaxId() {
		return mapper.selectConfig_public_charMaxId();
	}

	@Override
	public List<Config_public_char> queryConfig_public_charKind() {
		return mapper.selectConfig_public_charKind();
	}

	@Override
	public List<Config_public_char> queryNotConfig_public_charKind() {
		return mapper.selectNotConfig_public_charKind();
	}
}
