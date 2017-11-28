package com.example.security_17_21;

import com.example.security_17_21.Repository.RoleRepository;
import com.example.security_17_21.Repository.UserRepository;
import com.example.security_17_21.entities.Role;
import com.example.security_17_21.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    RoleRepository appRoles;

    @Autowired
    UserRepository userRepo;

    @Override
    public void run(String... strings) throws Exception {
        Role aRole = new Role();
        aRole.setRole("ADMIN");
        appRoles.save(aRole);
        System.out.println("Admin role has been created");
        User user = new User();

        User u = new User();
        u.setPassword("password");
        u.setUsername("user");
        u.setEmail("person@person.com");
        u.addRole(appRoles.findRoleByRole("ADMIN"));
        userRepo.save(u);
    }
}
