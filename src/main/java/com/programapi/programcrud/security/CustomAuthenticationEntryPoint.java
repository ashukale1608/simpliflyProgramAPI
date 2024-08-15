//package com.programapi.programcrud.security;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.oauth2.jwt.JwtException;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;

//@Component
//public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {
//
//    @Override
//    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException {
//        response.setContentType("application/json");
//        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//        response.getOutputStream().println("{ \"error\": \"Unauthorized\", \"message\": \"Authorization is wrong\" }");
//    }
//}
package com.programapi.programcrud.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.jwt.JwtException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException {
        int statusCode = HttpServletResponse.SC_UNAUTHORIZED;
        String message;

        if (authException.getCause() instanceof JwtException) {
            message = "Invalid or expired JWT token.";
        } else {
            message = "Unauthorized.";
        }

        response.setContentType("application/json");
        response.setStatus(statusCode);
        response.getOutputStream().println("{ \"error\": \"Unauthorized\", \"message\": \"" + message + "\" }");
    }
}
