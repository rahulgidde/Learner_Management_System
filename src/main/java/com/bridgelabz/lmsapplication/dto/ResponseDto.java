package com.bridgelabz.lmsapplication.dto;

public class ResponseDto {
    public Object data;
    public String message;

    public ResponseDto(Object data, String message) {
        this.data = data;
        this.message = message;
    }
}
