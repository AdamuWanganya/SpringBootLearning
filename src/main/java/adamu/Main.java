package adamu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doctor = context.getBean(Doctor.class);
//        Staff staff = context.getBean(Nurse.class);
//        doctor.setQualification("P.H.D");
//        System.out.println(doctor);
//        doctor.assist();
//        staff.assist();
//
//        Doctor doctor1 = context.getBean(Doctor.class);
//        System.out.println(doctor1);

    }
}
