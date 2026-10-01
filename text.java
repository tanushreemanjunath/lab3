public class text {
    public static void main(String[] args) {

        String name = "Rahul";
        int age = 18;

        int java = 85;
        int maths = 90;
        int science = 80;

        int total = java + maths + science;
        double average = total / 3.0;

        System.out.println("Student Details");
        System.out.println("----------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Java: " + java);
        System.out.println("Maths: " + maths);
        System.out.println("Science: " + science);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (average >= 90)
            System.out.println("Grade: A+");
        else if (average >= 75)
            System.out.println("Grade: A");
        else if (average >= 60)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}
