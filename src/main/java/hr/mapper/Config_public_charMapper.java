package hr.mapper;

import java.util.List;

import hr.pojo.Config_public_char;
import hr.pojo.Salary_grant;
import hr.pojo.Salary_standard_details;
import hr.pojo.Training;

public interface Config_public_charMapper {
	public void insertConfig_public_char(Config_public_char config_public_char);
	public void updateConfig_public_char(Config_public_char config_public_char);
	public Config_public_char selectConfig_public_charById(int id);
	public List<Config_public_char> getConfig_public_char();
	public boolean deleteConfig_public_charById(int sid);
	public int selectConfig_public_charMaxId();
	public List<Config_public_char> selectConfig_public_charKind();
	public List<Config_public_char> selectNotConfig_public_charKind();
}
