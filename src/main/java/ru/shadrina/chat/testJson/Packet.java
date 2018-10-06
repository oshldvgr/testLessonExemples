package ru.shadrina.chat.testJson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Packet {
    private String packetId = UUID.randomUUID().toString();
    private PacketType type = PacketType.NONE;

}
