package com.moneyline.srvgateway.filter.dto.response;

import lombok.Data;

@Data
public class DefaultResponse {
    private boolean success = false;
    private String code;
    private String message;
}
