package org.example;

import java.text.MessageFormat;
import org.example.repository.GradeInMemoryRepositoryImpl;
import org.example.repository.GradeRepository;
import org.example.service.AcademicRecordService;
import org.example.service.AcademicRecordServiceImpl;

public class ApplicationRunner {
  public static void main(String[] args) {

    AcademicRecordService academicRecordService =
        new AcademicRecordServiceImpl(new GradeInMemoryRepositoryImpl());

    GradeRepository gradeRepository = new GradeInMemoryRepositoryImpl();

    System.out.println(
        MessageFormat.format(
            "The sum of number of grades is: {0}", academicRecordService.sumNumberOfGrades(gradeRepository.findAllGrades())));

    System.out.println(
        MessageFormat.format("The average of grades is: {0}", academicRecordService.calculateAverage(gradeRepository.findAllGrades())));
  }
}
