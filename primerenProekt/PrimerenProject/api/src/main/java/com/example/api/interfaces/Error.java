package com.example.api.interfaces;

import org.springframework.http.HttpStatus;

public interface Error {
    String getMessage();
    HttpStatus getCode();
}
