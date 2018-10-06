package ru.shadrina.chat.testJson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJson {

    public static void main(String[] args) {
        PacketLogin packetLogin = new PacketLogin();
        packetLogin.setLogin("olga");
        packetLogin.setPassword("dom1212");

        System.out.println("LOGIN: " + packetLogin.getLogin());
        System.out.println("PASSWORD : " + packetLogin.getPassword());
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(packetLogin);

            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String newJson = "{ \"login\": \"123\", \"password\": \"456\" }";
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            PacketLogin newPacketLogin = objectMapper.readValue(newJson, PacketLogin.class);
            System.out.println(newJson);
            System.out.println("LOGIN: " + newPacketLogin.getLogin());
            System.out.println("PASSWORD: " + newPacketLogin.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
