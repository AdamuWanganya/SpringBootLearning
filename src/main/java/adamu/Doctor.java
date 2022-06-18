package adamu;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    @PostConstruct
    public void PostConstruct(){
        System.out.println("Post Construct method is called!!");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("Doctor is assisting!!");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("set Bean name method is called");
    }
}
