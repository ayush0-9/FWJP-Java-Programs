public class Percentage {
    public static void main(String[] args) {
        
        int totalMarks = 500;
        int obtainedMarks = 430;

        double percentage = (double) obtainedMarks / totalMarks * 100;

        System.out.println("The student scored " + obtainedMarks + " marks out of " + totalMarks);
        System.out.println("The percentage is: " + percentage + "%");
    }
}
