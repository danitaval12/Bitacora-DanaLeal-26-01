package dosw.CorteDosCode.desafioCodigo.service;

import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.stream.Collectors;

import dosw.CorteDosCode.desafioCodigo.model.Student;
import dosw.CorteDosCode.desafioCodigo.model.Grade;

public class Service {

    public List<Student> getRosadoStudents(List<Student> students) {
        return students.stream()
                .filter(student -> student.getTeam().equals("ROSADO"))
                .toList();
    }

    public List<String> getStudentNames(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .sorted()
                .toList();
    }

    public double getGlobalAverage(List<Student> students) {
        return students.stream()
                .flatMap(s -> s.getGrades().stream())
                .mapToDouble(g -> g.getScore())
                .average()
                .orElse(0);
    }

    public Map<String, Double> getAverageBySubject(List<Student> students) {
        return students.stream()
                .flatMap(s -> s.getGrades().stream())
                .collect(Collectors.groupingBy(
                        Grade::getSubject,
                        Collectors.averagingDouble(Grade::getScore)
                ));
    }

    public Student getBestStudent(List<Student> students) {
        return students.stream()
                .max(Comparator.comparingDouble(s ->
                        s.getGrades().stream()
                                .mapToDouble(Grade::getScore)
                                .average()
                                .orElse(0)
                ))
                .orElse(null);
    }


    public Map<String, Long> getFailedSubjectsByTeam(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getTeam,
                        Collectors.flatMapping(
                                s -> s.getGrades().stream()
                                        .filter(g -> !g.isPassed()),
                                Collectors.counting()
                        )
                ));
    }

    public List<Student> getTop3Students(List<Student> students) {

        return students.stream()
                .sorted(Comparator.comparingLong(
                        (Student s) -> s.getGrades().stream()
                                .filter(Grade::isPassed)
                                .count()
                ).reversed())
                .limit(3)
                .toList();
    }


    public Map<String, List<Student>> groupStudentsByPerformance(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(s -> {

                    double avg = s.getGrades().stream()
                            .mapToDouble(Grade::getScore)
                            .average()
                            .orElse(0);

                    if (avg >= 4.5) return "ALTO RENDIMIENTO";
                    else if (avg >= 3.5) return "REGULAR";
                    else return "RIESGO";

                }));
    }

    public String getSubjectWithMostFailures(List<Student> students) {

        Map<String, Long> failures = students.stream()
                .flatMap(s -> s.getGrades().stream())
                .filter(g -> !g.isPassed())
                .collect(Collectors.groupingBy(
                        Grade::getSubject,
                        Collectors.counting()
                ));

        return failures.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }

    public Map<String, Double> getRosadoApprovedAverages(List<Student> students) {
        return students.stream()
                .filter(s -> s.getTeam().equals("ROSADO"))
                .flatMap(s -> s.getGrades().stream())
                .filter(Grade::isPassed)
                .collect(Collectors.groupingBy(
                        Grade::getSubject,
                        Collectors.averagingDouble(Grade::getScore)
                ));
    }


    public Map<String, Double> getSemesterAverageByStudent(List<Student> students) {

        return students.stream()
                .collect(Collectors.toMap(
                        Student::getId,
                        s -> s.getGrades().stream()
                                .mapToDouble(Grade::getScore)
                                .average()
                                .orElse(0)
                ));
    }

    public List<Student> getStudentsAboveFour(List<Student> students) {
        return students.stream()
                .filter(s -> s.getGrades().stream()
                        .mapToDouble(Grade::getScore)
                        .average()
                        .orElse(0) > 4.0)
                .toList();
    }
}