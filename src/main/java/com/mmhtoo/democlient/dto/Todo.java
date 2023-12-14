package com.mmhtoo.democlient.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Todo {

    private Integer userId;
    private Integer id;
    private String title;
    private Boolean completed;

}
