package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface UserService {

    List<User> findAllByOrderByFullNameAsc();

    Optional<User> findById(Long id);

    User findByEmail(String email);

    String registerUser(User userToRegister);

    String userActivation(String code);

    void switchSelectedStatus(User loggedInUser, String SelectedStatus);

    ArrayList<String> rolesToList(Set<Role> roles);

    void switchSelectedCategory(User loggedInUser, String selectedCategory);

    Set<Role> findUserRolesInnerJoin(Long loggedInUserId);

    Set<Role> findUserPossibleRoles(Long loggedInUserId);

    List<Category> findUserCategoriesInnerJoin(Long loggedInUserId);

    List<Category> findUserPossibleCategories(Long loggedInUserId);

    //Admin options
    List<User> userSearch(String fullName, String email, String address, String phoneNumber);

    List<User> userSearch(String fullName, String email, String address, String phoneNumber, String selectedCategory);

    List<User> findByCategoryId(Long selectedCategoryId);

    List<User> findCategoryPossibleUsers(Long selectedCategoryId);

    String editUser(User loggedInUser,String newName,String newEmail,String newAddress,String newPhoneNumber);

    String changePassword(User user, String oldPassword, String newPassword, String confirmPassword);

    String changePassword(User user, String newPassword, String confirmPassword);

    void addCategoryToUserCategories(User selectedUser, String categoryToAdd);

    void removeCategoryFromUserCategories(User selectedUser, String categoryToRemove);

    void addRoleToUserRoles(User selectedUser, String roleToAdd);

    void removeRoleFromUserRoles(User selectedUser, String roleToRemove);

    void disableUser(User selectedUser, String disableUser);

    boolean userIsAdmin(User selectedUser);

    void changeAdminRole(User selectedUser, String adminRole);

}