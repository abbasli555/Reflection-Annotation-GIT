package Task1;

public class GradeProsessor {
    public static void printGradeInfo(Class<?> clazz){
        if (clazz.isAnnotationPresent(Gradeİnfo.class)) {
            Gradeİnfo info = clazz.getAnnotation(Gradeİnfo.class);

            System.out.println("Teacher : " + info.teacher());
            System.out.println("Max score : " + info.maxScore());
        }
        else System.out.println("Bu calssda GradeInfo annotationu yoxdur" + clazz.getSimpleName());
    }
}
