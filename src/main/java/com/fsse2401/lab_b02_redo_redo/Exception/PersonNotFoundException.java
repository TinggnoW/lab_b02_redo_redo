package com.fsse2401.lab_b02_redo_redo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.BAD_REQUEST)
public class PersonNotFoundException extends RuntimeException {
}
