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
public class Soldier extends Citizen {

    private String religion, bloodType, weapon, weaponSerial, mask,
            insertRequired, dateNBCProf,
            conf, dateWeaponQual, type, qualified,
            dateLast, score, pushUp, sitUp, run;

    public Soldier(String name, String rank, String dor, String ssn, String basd, String ets, String dob, String mos, String tig, String tis, String promtable, String points, String weight, String height, String hair, String eyes, String age, String materialStatus) {
        super(name, rank, dor, ssn, basd, ets, dob, mos, tig, tis, promtable, points, weight, height, hair, eyes, age, materialStatus);
    }

    public Soldier(String religion, String bloodType, String weapon, String weaponSerial, String mask, String insertRequired, String dateNBCProf, String conf, String dateWeaponQual, String type, String qualified, String dateLast, String score, String pushUp, String sitUp, String run, String name, String rank, String dor, String ssn, String basd, String ets, String dob, String mos, String tig, String tis, String promtable, String points, String weight, String height, String hair, String eyes, String age, String materialStatus) {
        super(name, rank, dor, ssn, basd, ets, dob, mos, tig, tis, promtable, points, weight, height, hair, eyes, age, materialStatus);
        this.religion = religion;
        this.bloodType = bloodType;
        this.weapon = weapon;
        this.weaponSerial = weaponSerial;
        this.mask = mask;
        this.insertRequired = insertRequired;
        this.dateNBCProf = dateNBCProf;
        this.conf = conf;
        this.dateWeaponQual = dateWeaponQual;
        this.type = type;
        this.qualified = qualified;
        this.dateLast = dateLast;
        this.score = score;
        this.pushUp = pushUp;
        this.sitUp = sitUp;
        this.run = run;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeaponSerial() {
        return weaponSerial;
    }

    public void setWeaponSerial(String weaponSerial) {
        this.weaponSerial = weaponSerial;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getInsertRequired() {
        return insertRequired;
    }

    public void setInsertRequired(String insertRequired) {
        this.insertRequired = insertRequired;
    }

    public String getDateNBCProf() {
        return dateNBCProf;
    }

    public void setDateNBCProf(String dateNBCProf) {
        this.dateNBCProf = dateNBCProf;
    }

    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

    public String getDateWeaponQual() {
        return dateWeaponQual;
    }

    public void setDateWeaponQual(String dateWeaponQual) {
        this.dateWeaponQual = dateWeaponQual;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQualified() {
        return qualified;
    }

    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    public String getDateLast() {
        return dateLast;
    }

    public void setDateLast(String dateLast) {
        this.dateLast = dateLast;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getPushUp() {
        return pushUp;
    }

    public void setPushUp(String pushUp) {
        this.pushUp = pushUp;
    }

    public String getSitUp() {
        return sitUp;
    }

    public void setSitUp(String sitUp) {
        this.sitUp = sitUp;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
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
        return super.toString() + "Soldier{" + "religion=" + religion + ", bloodType=" + bloodType + ", weapon=" + weapon + ", weaponSerial=" + weaponSerial + ", mask=" + mask + ", insertRequired=" + insertRequired + ", dateNBCProf=" + dateNBCProf + ", conf=" + conf + ", dateWeaponQual=" + dateWeaponQual + ", type=" + type + ", qualified=" + qualified + ", dateLast=" + dateLast + ", score=" + score + ", pushUp=" + pushUp + ", sitUp=" + sitUp + ", run=" + run + '}';
    }

}
