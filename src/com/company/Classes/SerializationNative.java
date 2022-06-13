package com.company.Classes;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class SerializationNative {


    public static void save_Quadrilateral(Quadrilateral_List quadrilateral_list) {
        try {

            FileOutputStream fileOut = new FileOutputStream("./src/Native_Quadrilaterals_Parallelograms/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() + ".txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(quadrilateral_list);
            out.close();
            fileOut.close();
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }
    public static Quadrilateral_List load_Quadrilateral() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(Objects.requireNonNull(new File("./src/Native_Quadrilaterals_Parallelograms").listFiles())[Objects.requireNonNull(new File("./src/Native_Quadrilaterals_Parallelograms").listFiles()).length-1]);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Quadrilateral_List quadrilateral_list = (Quadrilateral_List) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return quadrilateral_list;
    }


    public static void save_Parallelogram(Parallelogram_List parallelogram_list) {
        try {

            FileOutputStream fileOut = new FileOutputStream("./src/Native_Quadrilaterals_Parallelograms/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject( parallelogram_list);
            out.close();
            fileOut.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static Parallelogram_List load_Parallelogram() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(Objects.requireNonNull(new File("./src/Native_Quadrilaterals_Parallelograms").listFiles())[Objects.requireNonNull(new File("./src/Native_Quadrilaterals_Parallelograms").listFiles()).length-2]);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Parallelogram_List  parallelogram_list = (Parallelogram_List) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return  parallelogram_list;
    }


}
