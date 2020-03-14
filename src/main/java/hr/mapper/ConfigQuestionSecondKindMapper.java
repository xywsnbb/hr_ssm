package hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hr.pojo.ConfigQuestionSecondKind;
@Repository
public interface ConfigQuestionSecondKindMapper {
	public boolean saveQuestionSecondKind(ConfigQuestionSecondKind configQuestionSecondKind);
	public boolean updateQuestionSecondKind(ConfigQuestionSecondKind configQuestionSecondKind);
	public List<ConfigQuestionSecondKind> selectAllConfigQuestionSecondKind();
	public ConfigQuestionSecondKind selectConfigQuestionSecondKindById(int qfk_id);
	public boolean deleteConfigQuestionSecondKindById(int qfk_id);
	public Integer selectMaxId(); 
	
	public List<ConfigQuestionSecondKind> linkageSelect();
}
