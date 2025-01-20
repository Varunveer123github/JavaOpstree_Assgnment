public class Student {
    static class StudentDetails {
        String S_name = "Varun";
        int S_rollno = 28;
        double S_marks = 21;

        void DisplayGrade() {
            if (S_marks >= 90) {
                System.out.println("Hello " + S_name + " Your Grade is A and Roll nummber is " + S_rollno);
            } else if (S_marks >= 60 && S_marks < 90) {
                System.out.println("Hello " + S_name + " Your Grade is B and Roll nummber is " + S_rollno);
            } else if (S_marks >= 45 && S_marks < 60) {
                System.out.println("Hello " + S_name + " Your Grade is C and Roll nummber is " + S_rollno);
            } else if (S_marks >= 33 && S_marks < 45) {
                System.out.println("Hello " + S_name + " Your Grade is D and Roll nummber is " + S_rollno);
            } else {
                System.out.println("Sorry " + S_name + " but you are Fail!!! and Roll nummber is " + S_rollno);

            }
        }
    }

    public static void main(String[] args) {
        StudentDetails GetStudentDetail = new StudentDetails();
        GetStudentDetail.DisplayGrade();
    }
}
