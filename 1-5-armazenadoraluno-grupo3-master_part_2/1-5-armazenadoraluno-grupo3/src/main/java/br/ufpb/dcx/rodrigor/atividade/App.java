package br.ufpb.dcx.rodrigor.atividade;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class App {

    public static void main(String[] argsadd){
        System.out.println("Alo Mundo");


        Aluno aluno = new Aluno("John Doe", "010255", "20/07/2000");
        
        String json = toJson(aluno);
        
        saveJsonToFile(json, "aluno.json");
    }
    
    private static String toJson(Aluno aluno) {
        Gson gson = new Gson();
        return gson.toJson(aluno);
    }
    
    private static void saveJsonToFile(String json, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(json);
            writer.close();
            System.out.println("JSON saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
