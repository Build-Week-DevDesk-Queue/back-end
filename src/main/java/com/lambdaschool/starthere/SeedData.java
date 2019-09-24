package com.lambdaschool.starthere;

import com.lambdaschool.starthere.models.Role;
import com.lambdaschool.starthere.models.User;
import com.lambdaschool.starthere.models.UserRoles;
import com.lambdaschool.starthere.models.Useremail;
import com.lambdaschool.starthere.services.RoleService;
import com.lambdaschool.starthere.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;


    @Override
    public void run(String[] args) throws Exception
    {
        Role adminRole = new Role("admin");
        Role studentRole = new Role("student");
        Role helperRole = new Role("helper");

        roleService.save(adminRole);
        roleService.save(studentRole);
        roleService.save(helperRole);

        // admin
        ArrayList<UserRoles> admins = new ArrayList<>();
        admins.add(new UserRoles(new User(), adminRole));
        User u1 = new User("admin", "password", admins);
        u1.getUseremails()
          .add(new Useremail(u1, "admin@email.local"));
        userService.save(u1);

        // student
//        User stud1 = new User("Max", "pass123");
//        stud1.getUseremails()
//                .add(new Useremail(stud1))
    }
}