package com.zeeeu.houseutils.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    INVALID_REQUEST( message: 'invalid request.'),
    INTERVAL_ERROR( message: 'invalid request.'),
    ENTITY_NOT_FOUND( message: 'invalid request.');

    private String message;
}
