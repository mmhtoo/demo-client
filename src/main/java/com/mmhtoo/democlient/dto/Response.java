package com.mmhtoo.democlient.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Response<T> {

    private String message;
    private T data;

}


