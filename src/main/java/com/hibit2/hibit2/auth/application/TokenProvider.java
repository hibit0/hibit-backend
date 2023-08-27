package com.hibit2.hibit2.auth.application;

public interface TokenProvider {

    String createAccessToken(final String payload);

    String createRefreshToken(final String payload);

    String getPayload(final String token);

    void validateToken(final String accessToken);
}
