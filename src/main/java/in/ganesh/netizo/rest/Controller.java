package in.ganesh.netizo.rest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
class Student
{
    int rollNo;
    String studentName;
    String Studentaddress;
}


@RestController
public class Controller {
   @GetMapping("/get")
   public ResponseEntity<List<Student>> nameReturn(){
      Student s1 = new Student();
      s1.setRollNo(1);
      s1.setStudentName("Ganesh Chaudhary");
      s1.setStudentaddress("Ahmad nagar");
      Student s2 = new Student();
      s2.setRollNo(2);
      s2.setStudentName("Mohan Mahajan");
      s2.setStudentaddress("Pune");
      Student s3 = new Student();
      s3.setRollNo(3);
      s3.setStudentName("Rahul Mahajan");
      s3.setStudentaddress("Raver");
      Student s4 = new Student();
      s4.setRollNo(4);
      s4.setStudentName("Dwarka Patil");
      s4.setStudentaddress("Dhabe-Pimpri");

      return new ResponseEntity<>(Arrays.asList(s1,s2,s3,s4), HttpStatusCode.valueOf(200));
    }
}
