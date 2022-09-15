package String;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


import java.util.Date;

public class JWTTokenCreation {


    public String generateJwtToken(String clientName, String expiryToken)
    {
        return Jwts.builder()
                .setSubject((clientName))
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + Long.valueOf("10800000000")))
                .signWith(SignatureAlgorithm.HS512, expiryToken.getBytes())
                .compact();
    }

    public static void main(String[] args) {
        JWTTokenCreation jwtTokenCreation = new JWTTokenCreation();
        System.out.println("Token is --> " + jwtTokenCreation.generateJwtToken("cebu", "c885cae4904d4f11403b262a61b5b4b8"));
    }
}
