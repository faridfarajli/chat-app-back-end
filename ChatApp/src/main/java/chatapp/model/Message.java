package chatapp.model;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Message {

    private String receiverName;
    private String senderName;
    private String message;
    private Status status;
}
