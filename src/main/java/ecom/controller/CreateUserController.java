package ecom.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.api.UsersApi;
import com.model.UsersResponse;
import com.model.UsersRequest;
import java.util.List;

@Slf4j
@RestController
public class CreateUserController implements UsersApi {
    @Override
    public  ResponseEntity<List<UsersResponse>> usersPost(UsersRequest usersRequest){
     log.info(usersRequest.getName());
        return null;
    }
}
