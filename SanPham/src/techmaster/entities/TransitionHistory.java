package techmaster.entities;

import java.time.LocalDate;
import java.util.List;

public class TransitionHistory {
    private int id;
    private static int autoId;
    private LocalDate registerDate;
    private String status;
    private List<Integer> CourseId;
    private Integer UserId;

    public TransitionHistory( LocalDate registerDate, String status, List<Integer> courseId, Integer userId) {
        this.id = ++autoId;
        this.registerDate = registerDate;
        this.status = status;
        CourseId = courseId;
        UserId = userId;
    }

    @Override
    public String toString() {
        return "TransitionHistory{" +
                "id=" + id +
                ", registerDate=" + registerDate +
                ", status='" + status + '\'' +
                ", CourseId=" + CourseId +
                ", UserId=" + UserId +
                '}';
    }

    public int getId() {
        return id;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public String getStatus() {
        return status;
    }

    public List<Integer> getCourseId() {
        return CourseId;
    }

    public Integer getUserId() {
        return UserId;
    }
}
