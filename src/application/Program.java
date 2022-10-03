package application;


import entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Pasta de candidatos e votos: ");
        String path= sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Map<String, Integer> map = new TreeMap<>();

            String line = br.readLine();
            while (line != null){

                String[] fields = line.split(",");
                String candidato = fields[0];
                int votos = Integer.parseInt(fields[1]);
                if (map.containsKey(candidato)){
                    int votesSoFar = map.get(candidato);
                    map.put(candidato, votos + votesSoFar);


                }else {
                    map.put(candidato, votos);
                }



                line = br.readLine();
            }

            for (String key : map.keySet()) {

                System.out.println(key + ": " + map.get(key));
            }




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
