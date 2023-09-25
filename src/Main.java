import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        while(true){
            System.out.println("Enter 1: to add Student");
            System.out.println("Enter 2: to view Student");
            System.out.println("Enter 3: to search Student with sbd");
            System.out.println("Enter 4: to exit");
            String line = scanner.nextLine();
            switch(line){
                case "1"  : {
                    System.out.println("Enter a: Them hoc sinh khoi A");
                    System.out.println("Enter b: Them hoc sinh khoi B");
                    System.out.println("Enter c: Them hoc sinh khoi C");
                    String type = scanner.nextLine();
                    switch(type){
                        case "a": {
                            System.out.println("Input So bao danh:");
                            String sbd = scanner.nextLine();
                            System.out.println("Input Ho va Ten: ");
                            String name = scanner.nextLine();
                            System.out.println("Input Muc uu tien: ");
                            String prioririty = scanner.nextLine();
                            Student student = new StudentA(sbd, name, prioririty,type);
                            tuyenSinh.addStudent(student);
                            break;
                        }
                        case "b": {
                            System.out.println("Input So bao danh:");
                            String sbd = scanner.nextLine();
                            System.out.println("Input Ho va Ten: ");
                            String name = scanner.nextLine();
                            System.out.println("Input Muc uu tien: ");
                            String prioririty = scanner.nextLine();
                            Student student = new StudentB(sbd, name, prioririty,type);
                            tuyenSinh.addStudent(student);
                            break;
                        }
                        case "c": {
                            System.out.println("Input So bao danh:");
                            String sbd = scanner.nextLine();
                            System.out.println("Input Ho va Ten: ");
                            String name = scanner.nextLine();
                            System.out.println("Input Muc uu tien: ");
                            String prioririty = scanner.nextLine();
                            Student student = new StudentC(sbd, name, prioririty,type);
                            tuyenSinh.addStudent(student);
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                }
                case "2" : {
                    tuyenSinh.viewStudent();
                    break;
                }
                case "3" : {
                    System.out.println("Input sbd");
                    String sbd = scanner.nextLine();
                    Student ts = (Student) tuyenSinh.searchStudent(sbd);
                    if(ts == null){
                        System.out.println("Not found");
                    } else {
                        System.out.println(ts.toString());
                    }
                    break;
                }
                case "4" : {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}