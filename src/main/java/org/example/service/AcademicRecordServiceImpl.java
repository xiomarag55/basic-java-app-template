package org.example.service;

import java.util.List;
import org.example.model.Grade;
import org.example.repository.GradeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AcademicRecordServiceImpl implements AcademicRecordService {

  private static final Logger logger = LoggerFactory.getLogger(AcademicRecordServiceImpl.class);

  public AcademicRecordServiceImpl(GradeRepository gradeRepository) {
  }

  @Override
  public Double calculateAverage(List<Grade> grades) {

    double averageGrades = 0;
    if (!grades.isEmpty()) {
      for (Grade grade : grades) {
        averageGrades = averageGrades + grade.grade();
      }
      return averageGrades/grades.size();
    }else{
      return null;
    }
  }

  @Override
  public Integer sumNumberOfGrades(List<Grade> grades) {
    int numberOfGrades = 0;
    if(!grades.isEmpty()){
      for (Grade grade : grades) {
        numberOfGrades ++;

      }
      return numberOfGrades;

    }
    return null;
  }
}
