package techmaster.service;

import techmaster.entities.TransitionHistory;
import techmaster.entities.User;

import java.util.ArrayList;

public class TransistionService {
    public void displayHistoryTransistion(ArrayList<User> user, ArrayList<TransitionHistory> transitionHistories) {
        for (User i : user) {
            for (TransitionHistory j : transitionHistories) {
                if (i.getId() == j.getUserId()) {
                    System.out.println("User: " + i.getName() +"Co lich su giao dich: ");
                    System.out.println(j.toString());
                }
            }
        }
    }
}
