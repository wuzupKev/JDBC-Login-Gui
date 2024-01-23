/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package loginclient.logic.dao;

import java.util.List;
import java.util.Optional;
import loginclient.logic.modelos.User;

/**
 *
 * @author Kevin Chavarria
 */
public interface DAO<T,K> {
    void create(T u);
    List<T> allUser();
    void deleteUser(T u);
    Optional<T> userById(int id);
    void updateUser(T u);
    Boolean verifyAcc(String user, String pass);
    
}
