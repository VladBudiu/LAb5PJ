package org.BudiuVlad;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        PerecheNumere pereche = new PerecheNumere(5, 8);
//        System.out.println("Sunt consecutive in Fibonacci: " + pereche.suntConsecutiveInFibonacci());
//        System.out.println("Cel mic multiplu comun: " + pereche.celMicMultipluComun());
//        System.out.println("Suma cifrelor egala: " + pereche.sumaCifrelorEgala());
//        System.out.println("Numar cifre pare egale: " + pereche.numarCifrePareEgale());
            List<PerecheNumere> lista =new ArrayList<PerecheNumere>();
//        lista.add(new PerecheNumere(1,2));
//        lista.add(new PerecheNumere(5,8));
//        lista.add(new PerecheNumere(2,3));
        //scriere(lista);
        lista=citire();
        for (PerecheNumere p : lista)
        {
            System.out.println(p.toString()+"\n");
        }

       // lista.add(new PerecheNumere(6,23));
        scriere(lista);




    }

    public static void scriere(List <PerecheNumere> lista) throws IOException {

            ObjectMapper mapper=new ObjectMapper();
            File file=new File("C:\\Users\\vlada\\Lab5PjMaven2\\src\\main\\resources\\numere.json");
           // mapper.writeValue(file,lista);
           if(file.exists())
            mapper.writeValue(file,lista);
            else System.out.println("nu e bine(");
    }

    public static List<PerecheNumere> citire()
    {
        try {
            File file=new File("src/main/resources/numere.json");
            ObjectMapper mapper=new ObjectMapper();
            List<PerecheNumere> lista = mapper
                    .readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return lista;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}