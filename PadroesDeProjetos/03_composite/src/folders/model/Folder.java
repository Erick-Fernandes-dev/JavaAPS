package folders.model;

import java.util.List;

public class Folder implements FileSystemItem {

    private String name;
    private List<FileSystemItem> children;

    public Folder(String name, List<FileSystemItem> children) {
        this.name = name;
        this.children = children;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + "Folder");
        for (FileSystemItem child : children) {
            child.print(structure + "| ");
        }

    }
}
