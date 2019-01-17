package id.co.bankaltimtara.authserver.configuration;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Gen {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
        System.out.println(encoder.encode("bankaltimtara1234#"));
    }

}
