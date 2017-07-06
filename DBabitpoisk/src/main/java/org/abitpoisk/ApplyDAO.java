package org.abitpoisk;

import javax.persistence.*;

/**
 * Created by Роман on 03.07.2017.
 */
@Entity
@Table(name = "applies")
public class ApplyDAO {
    @Id
    @Column(name = "apply_id")
    private int applyId;
    @Column(name = "place")
    private int place;
    @Column(name = "pib")
    private String pib;
    @Column(name = "priority")
    private String priority;
    @Column(name = "bal")
    private double bal;
    @Column(name = "atestat")
    private double atestat;
    @Column(name = "zno")
    private double zno;
    @Column(name = "extra_baly")
    private double extraBaly;

    public ApplyDAO( int place, String pib, String priority, double bal, double atestat, double zno, double extraBaly, SpecialityDAO speciality) {
        this.place = place;
        this.pib = pib;
        this.priority = priority;
        this.bal = bal;
        this.atestat = atestat;
        this.zno = zno;
        this.extraBaly = extraBaly;
        this.speciality = speciality;
    }

    public int getApplyId() {

        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public double getAtestat() {
        return atestat;
    }

    public void setAtestat(double atestat) {
        this.atestat = atestat;
    }

    public double getZno() {
        return zno;
    }

    public void setZno(double zno) {
        this.zno = zno;
    }

    public double getExtraBaly() {
        return extraBaly;
    }

    public void setExtraBaly(double extraBaly) {
        this.extraBaly = extraBaly;
    }

    public SpecialityDAO getSpeciality() {
        return speciality;
    }

    public void setSpeciality(SpecialityDAO speciality) {
        this.speciality = speciality;
    }

    public ApplyDAO() {
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "speciality_id")
    private SpecialityDAO speciality;
}
