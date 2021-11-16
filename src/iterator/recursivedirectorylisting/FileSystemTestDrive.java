package iterator.recursivedirectorylisting;

public class FileSystemTestDrive {
    public static void main(String[] args) {

        FileSystem fs = new FileSystem("./");

        while(fs.hasNext()){
            System.out.println(fs.next().getName());
        }

    }
}