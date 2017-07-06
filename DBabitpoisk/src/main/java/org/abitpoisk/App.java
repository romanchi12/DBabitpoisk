package org.abitpoisk;

import com.fasterxml.classmate.AnnotationConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        RegionDAO region = new RegionDAO(/*"kyiv", 40,50,20,10*/);
        region.setRegionName("kyiv");
        region.setMaxBudgetPlaces(40);
        region.setAllPlaces(50);
        region.setApplies(20);
        region.setOriginals(10);
        UniversityDAO university = new UniversityDAO(/*"politech",50,23,123,4, region*/);
        university.setUniversityName("politech");
        university.setMaxBudgetPlaces(50);
        university.setAllPlaces(23);
        university.setApplies(123);
        university.setOriginals(4);

        SpecialityDAO speciality = new SpecialityDAO("Б", "system analisys", 23,43,52, "math 0.4", university);
        speciality.setOkr("B");
        speciality.setDirection("system analysys");
        speciality.setApplies(23);
        speciality.setAllPlaces(43);
        speciality.setMaxBudgetPlaces(52);
        speciality.setSubjects("math 0.4");

        ApplyDAO apply = new ApplyDAO(5, "malyarchuk roman","1", 194.45,194.54,200, 10, speciality);
        apply.setPlace(5);
        apply.setPib("malyarchuk roman");
        apply.setPriority("1");
        apply.setBal(194.45);
        apply.setAtestat(194.54);
        apply.setZno(200);
        apply.setExtraBaly(10);
        session.save(apply);
        /*session.save(region);
        session.save(university);
        session.save(speciality);*/
        session.getTransaction().commit();
    }
}
