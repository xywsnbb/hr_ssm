package hr.service;

import java.util.List;

import hr.pojo.ConfigQuestionSecondKind;

public interface ConfigQuestionSecondKindService {
	public boolean addQuestionSecondKind(ConfigQuestionSecondKind configQuestionSecondKind);
	public boolean modifyQuestionSecondKind(ConfigQuestionSecondKind configQuestionSecondKind);
	public List<ConfigQuestionSecondKind> queryAllConfigQuestionSecondKind();
	public ConfigQuestionSecondKind queryConfigQuestionSecondKindById(int qfk_id);
	public boolean removeConfigQuestionSecondKindById(int qfk_id);
	public Integer queryMaxId();
	
	public List<ConfigQuestionSecondKind> linkageSelect();
}
