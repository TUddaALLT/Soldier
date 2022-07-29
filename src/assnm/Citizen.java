/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assnm;

/**
 *
 * @author 84352
 */
public class Citizen {

    String name, rank, dor, ssn, basd, ets, dob, mos, tig, tis,
            promtable, points, weight, height, hair, eyes, age, materialStatus;

    public Citizen(String name, String rank, String dor, String ssn, String basd, String ets, String dob, String mos, String tig, String tis, String promtable, String points, String weight, String height, String hair, String eyes, String age, String materialStatus) {
        this.name = name;
        this.rank = rank;
        this.dor = dor;
        this.ssn = ssn;
        this.basd = basd;
        this.ets = ets;
        this.dob = dob;
        this.mos = mos;
        this.tig = tig;
        this.tis = tis;
        this.promtable = promtable;
        this.points = points;
        this.weight = weight;
        this.height = height;
        this.hair = hair;
        this.eyes = eyes;
        this.age = age;
        this.materialStatus = materialStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDor() {
        return dor;
    }

    public void setDor(String dor) {
        this.dor = dor;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBasd() {
        return basd;
    }

    public void setBasd(String basd) {
        this.basd = basd;
    }

    public String getEts() {
        return ets;
    }

    public void setEts(String ets) {
        this.ets = ets;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMos() {
        return mos;
    }

    public void setMos(String mos) {
        this.mos = mos;
    }

    public String getTig() {
        return tig;
    }

    public void setTig(String tig) {
        this.tig = tig;
    }

    public String getTis() {
        return tis;
    }

    public void setTis(String tis) {
        this.tis = tis;
    }

    public String getPromtable() {
        return promtable;
    }

    public void setPromtable(String promtable) {
        this.promtable = promtable;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMaterialStatus() {
        return materialStatus;
    }

    public void setMaterialStatus(String materialStatus) {
        this.materialStatus = materialStatus;
    }

    @Override
    public String toString() {
        return "Citizen{" + "name=" + name + ", rank=" + rank + ", dor=" + dor + ", ssn=" + ssn + ", basd=" + basd + ", ets=" + ets + ", dob=" + dob + ", mos=" + mos + ", tig=" + tig + ", tis=" + tis + ", promtable=" + promtable + ", points=" + points + ", weight=" + weight + ", height=" + height + ", hair=" + hair + ", eyes=" + eyes + ", age=" + age + ", materialStatus=" + materialStatus + '}';
    }
    
}
