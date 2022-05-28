package pl.sda.finalproject.travelagency.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.finalproject.travelagency.Entity.UserEntity;
import pl.sda.finalproject.travelagency.Repositories.UsersRepository;

@Service
public class UserService {

    private UsersRepository usersRepository;

    public UserEntity getUserById(int id){
        return usersRepository.findById(id).get();
    }






}
