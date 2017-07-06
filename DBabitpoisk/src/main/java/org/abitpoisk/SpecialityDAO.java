package org.abitpoisk;

import javax.persistence.*;

/**
 * Created by Роман on 03.07.2017.
 */
@Entity
@Table(name = "specialities")
public class SpecialityDAO {
    @Id
    @Column(name = "speciality_id")
    private int specialityId;
    @Column(name = "okr")
    private String okr;
    @Column(name = "direction")
    private String direction;
    @Column(name = "applies")
    private int applies;
    @Column(name = "all_places")
    private int allPlaces;
    @Column(name = "max_budget_places")
    private int maxBudgetPlaces;
    @Column(name = "subjects")
    private String subjects;

    public SpecialityDAO(String okr, String direction, int applies, int allPlaces, int maxBudgetPlaces, String subjects, UniversityDAO university) {
        this.okr = okr;
        this.direction = direction;
        this.applies = applies;
        this.allPlaces = allPlaces;
        this.maxBudgetPlaces = maxBudgetPlaces;
        this.subjects = subjects;
        this.university = university;
    }

    public int getSpecialityId() {

        return specialityId;
    }

    public void setSpecialityId(int specialityId) {
        this.specialityId = specialityId;
    }

    public String getOkr() {
        return okr;
    }

    public void setOkr(String okr) {
        this.okr = okr;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getApplies() {
        return applies;
    }

    public void setApplies(int applies) {
        this.applies = applies;
    }

    public int getAllPlaces() {
        return allPlaces;
    }

    public void setAllPlaces(int allPlaces) {
        this.allPlaces = allPlaces;
    }

    public int getMaxBudgetPlaces() {
        return maxBudgetPlaces;
    }

    public void setMaxBudgetPlaces(int maxBudgetPlaces) {
        this.maxBudgetPlaces = maxBudgetPlaces;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public UniversityDAO getUniversity() {
        return university;
    }

    public void setUniversity(UniversityDAO university) {
        this.university = university;
    }

    public SpecialityDAO() {
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "university_id")
    private UniversityDAO university;
}
