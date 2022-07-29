/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assnm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 84352
 */
public class Validation {

    Scanner in = new Scanner(System.in);

    int checkIntLimit(int min, int max, String mess, String error) {
        while (true) {
            try {
                System.out.println(mess);
                int n = Integer.parseInt(in.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException ex) {
                System.err.println(error);
            }
        }
    }

    String checkRegex(String str, String mess, String error) {
        while (true) {
            try {
                System.out.println(mess);
                String result = in.nextLine().trim().toLowerCase();
                if (result.matches(str)) {
                    return result;
                } else {
                    System.err.println(error);
                }
            } catch (NumberFormatException ex) {
                System.err.println(error);
            }
        }
    }

    String checkOption(String str, String mess, String error) {
        while (true) {
            try {
                System.out.println(mess);
                String result = in.nextLine().trim().toLowerCase();

                if (result.matches(str)) {
                    return result;
                } else {
                    System.err.println(error);
                }
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                System.err.println(error);

            }
        }

    }

    public String inputDate(String mess) {
        System.out.print(mess);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        while (true) {
            String input = in.nextLine();
            try {
                Date date = dateFormat.parse(input);

                return dateFormat.format(date);

            } catch (Exception e) {
                System.out.print("Please input valid date (dd-MM-yyyy): ");
            }
        }
    }

}
