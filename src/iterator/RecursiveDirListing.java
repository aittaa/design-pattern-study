package iterator;

import java.io.File;

public class RecursiveDirListing {

    public static void print(int indent, File file){

        for(int i = 0; i < indent; i++){
            System.out.print("\t");
        }

        System.out.println(file.getName());

        File [] childList = file.listFiles();

        if(childList != null) {
            for (File x : childList) {
                print(indent + 1, x);
            }
        }

    }


    public static void main(String[] args) {

        File parentDir = new File("./");

        print(0, parentDir);


    }
}
