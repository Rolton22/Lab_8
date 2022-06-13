package com.company.Classes;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;


public class Serialization_Jackson {

    public static void save_Quadrilateral_JSON(Quadrilateral_List quadrilateral_list) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("./src/JSON_Quadrilaterals_Parallelograms/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() +"1.json"), quadrilateral_list);


    }

    public static Quadrilateral_List load_Quadrilateral_JSON() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(Objects.requireNonNull(new File("./src/JSON_Quadrilaterals_Parallelograms").listFiles())[Objects.requireNonNull(new File("./src/JSON_Quadrilaterals_Parallelograms").listFiles()).length-1], Quadrilateral_List.class);
    }

    public static void save_Parallelogram_JSON(Parallelogram_List parallelogram_list) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("./src/JSON_Quadrilaterals_Parallelograms/" + LocalDate.now() + "," + LocalDateTime.now().getHour() + "," + LocalDateTime.now().getMinute() + "," + LocalDateTime.now().getSecond() +"0.json"), parallelogram_list);

    }

    public static Parallelogram_List load_Parallelogram_JSON() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(Objects.requireNonNull(new File("./src/JSON_Quadrilaterals_Parallelograms").listFiles())[Objects.requireNonNull(new File("./src/JSON_Quadrilaterals_Parallelograms").listFiles()).length-2], Parallelogram_List.class);
    }

}
