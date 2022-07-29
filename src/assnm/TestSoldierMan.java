/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assnm;

import java.util.ArrayList;

/**
 *
 * @author 84352
 */
public class TestSoldierMan {

    public static void main(String[] args) {
        Validation validation = new Validation();
        ArrayList<Citizen> citizens = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter Name:", "Wrong format");
            String rank = validation.checkRegex("lieutenant|senior lieutenant|captain|major", "Enter rank:", "Wrong format");
            String dor = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter dor:", "Wrong format");
            String ssn = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter ssn:", "Wrong format");
            String basd = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter basd:", "Wrong format");
            String ets = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter ets:", "Wrong format");
            String dob = validation.inputDate("Enter date");
            String mos = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter mos:", "Wrong format");
            String tig = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter tig:", "Wrong format");
            String tis = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter tis:", "Wrong format");
            String promtable = validation.checkRegex("yes|no", "Enter promtable:", "Wrong format");
            String points = String.valueOf(validation.checkIntLimit(0, Integer.MAX_VALUE, "Enter points", "Wrong format"));
            String weight = String.valueOf(validation.checkIntLimit(0, Integer.MAX_VALUE, "Enter weight", "Wrong format"));
            String height = String.valueOf(validation.checkIntLimit(0, Integer.MAX_VALUE, "Enter height", "Wrong format"));
            String hair = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter hair:", "Wrong format");
            String eyes = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter eyes:", "Wrong format");
            String age = String.valueOf(validation.checkIntLimit(0, Integer.MAX_VALUE, "Enter age", "Wrong format"));
            String materialStatus = validation.checkRegex("married|single|divorced|seperated", "Enter materialStatus:", "Wrong format");
            String religion = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter religion:", "Wrong format");
            String bloodType = validation.checkRegex("a|b|o", "Enter bloodType:", "Wrong format");
            String weaponSerial = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter weaponSerial:", "Wrong format");
            String mask = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter mask:", "Wrong format");
            String insertRequired = validation.checkRegex("yes|no", "Enter insertRequired:", "Wrong format");
            String dateNBCProf = validation.inputDate("Enter dateNBCProf: ");
            String conf = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter conf:", "Wrong format");
            String dateWeaponQual = validation.inputDate("Enter dateWeaponQual");
            String type = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter type:", "Wrong format");
            String qualified = validation.checkRegex("mark|sharp|expert", "Enter qualified:", "Wrong format");
            String dateLast = validation.inputDate("Enter dateLast");
            String score = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter score:", "Wrong format");
            String pushUp = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter pushUp:", "Wrong format");
            String sitUp = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter sitUp:", "Wrong format");
            String run = validation.checkRegex("[a-zA-z\\s]{1,}", "Enter run:", "Wrong format");
            Citizen citizen = new Soldier(religion, bloodType, weight, weaponSerial,
                    mask, insertRequired, dateNBCProf, conf, dateWeaponQual,
                    type, qualified, dateLast, score, pushUp, sitUp, run,
                    name, rank, dor, ssn, basd, ets, dob, mos, tig, tis, promtable,
                    points, weight, height, hair, eyes, age, materialStatus);
            citizens.add(citizen);
        }

        String input = validation.checkRegex("lieutenant|senior lieutenant|captain|major", "Enter rank:", "Wrong format");
        if (input.equalsIgnoreCase("major")) {
            System.out.println("No bigger");
            return;
        }
        String result = "";
        if (input.equalsIgnoreCase("lieutenant")) {
            for (Citizen citizen1 : citizens) {
                if (citizen1.rank.equalsIgnoreCase("senior lieutenant")) {
                    result += citizen1.toString() + "\n";
                } else if (citizen1.rank.equalsIgnoreCase("captain")) {
                    result += citizen1.toString() + "\n";

                } else if (citizen1.rank.equalsIgnoreCase("major")) {
                    result += citizen1.toString() + "\n";
                }
            }
        }
        else if (input.equalsIgnoreCase("senior lieutenant")) {
            for (Citizen citizen1 : citizens) {
                if (citizen1.rank.equalsIgnoreCase("captain")) {
                    result += citizen1.toString() + "\n";

                } else if (citizen1.rank.equalsIgnoreCase("major")) {
                    result += citizen1.toString() + "\n";
                }
            }
        }
        else if (input.equalsIgnoreCase("captain")) {
            for (Citizen citizen1 : citizens) {
                if (citizen1.rank.equalsIgnoreCase("major")) {
                    result += citizen1.toString() + "\n";
                }
            }
        }
        System.out.println(result); 
    }
}
