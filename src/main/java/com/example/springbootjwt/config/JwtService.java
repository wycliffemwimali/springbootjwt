package com.example.springbootjwt.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    //secret key
    private static final String SECRET_KEY = "";
    public String extractUsername(String token) {
        return null;
    }

    //class to extract all claims
    private Claims extractAllClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}
