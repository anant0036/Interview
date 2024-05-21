package com.bhushan.todo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "todo")
public class Todo {

    @Id
    private String id;
    private String action;
    private Boolean isCompleted;

}
