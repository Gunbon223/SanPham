package techmaster.service;

import techmaster.entities.AccountBanking;
import techmaster.entities.Role;
import techmaster.entities.User;

import java.util.List;

public class UserService {

    public void display(User user, List<AccountBanking> accountBankingList, List<Role> roleList) {
        System.out.println( "User{" +
                "id=" + user.getId() +
                ", name='" + user.getName() + '\'' +
                ", email='" + user.getEmail() + '\'' +
                ", phone='" + user.getPhone() + '\'' +
                ", roleId=" + findRoleById(user.getId(),roleList).getId() +
                ", bankId=" + findAccountBankingById(user.getBankId(),accountBankingList).getId() +
                ", listCourseId=" + user.getListCourseId() + '}'
        );
    }

    public void findOnlineUser(List<User> userList, List<AccountBanking> accountBankingList, List<Role> roleList) {
        int count = 0;
        for (User user : userList) {
            if (user.getRoleId() == 1) {
                count++;
                System.out.println("User online: ");
                display(user, accountBankingList, roleList);
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay user hoc online");
        }    }

    public AccountBanking findAccountBankingById(int id, List<AccountBanking> accountBankingList) {
        for (AccountBanking accountBanking : accountBankingList) {
            if (accountBanking.getId() == id) {
                return accountBanking;
            }
        }
        return null;
    }
    public Role findRoleById(int id, List<Role> roleList) {
        for (Role role : roleList) {
            if (role.getId() == id) {
                return role;
            }
        }
        return null;
    }
}
