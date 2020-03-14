package hr.service;

import java.util.List;

import hr.pojo.Config_public_char;

public interface Config_public_charService {
	public void saveConfig_public_char(Config_public_char config_public_char);
	public void modifyConfig_public_char(Config_public_char config_public_char);
	public Config_public_char queryConfig_public_charById(int id);
	public List<Config_public_char> queryConfig_public_char();
	public boolean removeConfig_public_charById(int sid);
	public int queryConfig_public_charMaxId();
	public List<Config_public_char> queryConfig_public_charKind();
	public List<Config_public_char> queryNotConfig_public_charKind();
}
