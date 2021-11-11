package state.celingfanpullchain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StateDemo {

    public static void main(String[] args) {

        CeilingFan chain = new CeilingFan();

        while (true) {
            System.out.print("Press");
            Scanner s = new Scanner(System.in);
            s.nextLine();
            chain.pull();
        }

    }
}