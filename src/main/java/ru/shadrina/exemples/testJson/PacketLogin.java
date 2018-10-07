package ru.shadrina.exemples.testJson;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PacketLogin extends Packet {
    {
        setType(PacketType.LOGIN);
    }

    private String login;
    private String password;

}
