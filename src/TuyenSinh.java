// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TuyenSinh {
    List<Student> tuyensinh;
    public TuyenSinh(){
        this.tuyensinh = new ArrayList<>();
    }
    public void addStudent(Student student){
        tuyensinh.add(student);
    }
    public void viewStudent(){
        this.tuyensinh.forEach(student -> System.out.println(student));
    }
    public Student searchStudent(String sbd){
        return this.tuyensinh.stream().filter(candidate -> candidate.getSbd().equals(sbd)).findFirst().orElse(null);
    }
}
