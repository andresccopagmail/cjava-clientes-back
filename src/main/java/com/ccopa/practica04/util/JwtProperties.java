package com.ccopa.practica04.util;

public class JwtProperties {

    private String secretKey;
    private String tokenPrefix;
    private Integer tokenExpirationAfterHours;

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getTokenPrefix() {
        return tokenPrefix;
    }

    public void setTokenPrefix(String tokenPrefix) {
        this.tokenPrefix = tokenPrefix;
    }

    public Integer getTokenExpirationAfterHours() {
        return tokenExpirationAfterHours;
    }

    public void setTokenExpirationAfterHours(Integer tokenExpirationAfterHours) {
        this.tokenExpirationAfterHours = tokenExpirationAfterHours;
    }

}
