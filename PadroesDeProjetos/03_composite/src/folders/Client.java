package folders;

import folders.model.FileSystemItem;
import folders.model.Folder;

import folders.model.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    public static FileSystemItem createCompositeFromFile(java.io.File file) {
        if (!file.isDirectory()) return new folders.model.File(file.getName());
        List<FileSystemItem> childs = new ArrayList<>();
        java.io.File[] files = file.listFiles();
        for (java.io.File javaFile : files) {
            childs.add(createCompositeFromFile(javaFile));
        }

        return new Folder(file.getName(), childs);
    }

    public static void main(String[] args) {
        FileSystemItem file1 = new File("file1");
        FileSystemItem file2 = new File("file2");
        FileSystemItem file3 = new File("file3");
        FileSystemItem file4 = new File("file4");

        FileSystemItem sf1 = new Folder("sf1", Arrays.asList(file1));
        FileSystemItem sf2 = new Folder("sf2", Arrays.asList(file2, sf1));
        FileSystemItem folder = new Folder("folder", Arrays.asList(sf2, file3, file4));



        folder.print("");

        System.out.println("--------------------------------------------------");

        String dir = System.getProperty("user.dir");
        FileSystemItem fromDisk = createCompositeFromFile(new java.io.File(dir + java.io.File.separator + "src"));
        fromDisk.print(">");


    }



}
