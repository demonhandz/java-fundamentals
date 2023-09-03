package associativeArraysPractice;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            //1. we have such student
            if (studentGrades.containsKey(studentName)) {
                List<Double> currentGrades = studentGrades.get(studentName);
                currentGrades.add(grade);
            }
            //2. student doesn't exist
            else {
                studentGrades.put(studentName, new ArrayList<>());
                studentGrades.get(studentName).add(grade);
            }
        }

        //avg grade of every student
        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();
        //students with average grade >= 4.50

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            //entry: key(name of the student) -> value (list of grades)
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);

            if (averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }
        }
        //print
        //map: key(name of the student -> value(avg grade)
        studentAverageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> grades) {
        //{5, 4, 6, 2}
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
