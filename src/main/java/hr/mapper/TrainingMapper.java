package hr.mapper;

import java.util.List;

import hr.pojo.Salary_grant;
import hr.pojo.Salary_standard_details;
import hr.pojo.Training;

public interface TrainingMapper {
	public void insertTraining(Training training);
	public void updateTraining(Training training);
	public Training selectTrainingById(int id);
	public List<Training> getTraining();
	public boolean deleteTrainingById(int sid);

}
