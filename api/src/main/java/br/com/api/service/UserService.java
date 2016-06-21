package br.com.api.service;

import br.com.api.model.User;

import java.util.Collection;

/**
 * Created by João on 21/06/2016.
 */

public interface UserService {

    User save(User user);

    User find(String id);

    Collection<User> find();

}
