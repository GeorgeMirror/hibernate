package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Pavlov", (byte) 12);
        userService.saveUser("Denis", "Kalev", (byte) 26);
        userService.saveUser("Roman", "Suvorov", (byte) 32);
        userService.saveUser("Pavel", "Ivanov", (byte) 44);
        userService.removeUserById(3);
        List<User> result = userService.getAllUsers();
        Iterator<User> it = result.iterator();
        while (it.hasNext()) {
            User user = it.next();
            System.out.println(user.toString());
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
