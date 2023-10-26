package com.TDDSample.TDDSample;

import com.TDDSample.TDDSample.dto.UserDTORequest;
import com.TDDSample.TDDSample.dto.UserDTOResponse;
import com.TDDSample.TDDSample.entity.User;
import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@RequiredArgsConstructor
public class UserRepositoryTest {
    private final UserRepository userRepository;

    @Test
    public void testSave(){
        UserDTORequest u = new UserDTORequest("Test", "passoword", "Teste@gmail.com");
        UserDTOResponse user = new UserDTOResponse(userRepository.save(new User(u)));
        

    }

}
