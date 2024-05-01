package lk.ijse.gdse66.HelloShoes.service;

import lk.ijse.gdse66.HelloShoes.auth.request.SignInRequest;
import lk.ijse.gdse66.HelloShoes.auth.request.SignUpRequest;
import lk.ijse.gdse66.HelloShoes.auth.response.JWTAuthResponse;

public interface AuthenticationService {
    JWTAuthResponse signIn(SignInRequest signInRequest);
    JWTAuthResponse signUp(SignUpRequest signUpRequest);
}
