package collections.list.arrayList.student;
import java.util.*;

public class Main {
    public static void main(String[] args){
        //Creating user-defined class objects
        Student s1=new Student(101,"Jack",23);
        Student s2=new Student(102,"Mili",21);
        Student s3=new Student(103,"Nadya",25);
        //creating arraylist
        List<Student> al=new ArrayList<>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);

        List<Student> al2= Arrays.asList(s1,s2,s3);

        System.out.println(al);

        for (Student st:al){
            System.out.printf("Id is %s, and name is %s, and age is %s%n", st.Id, st.name, st.age);
        }
    }
}
