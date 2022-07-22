package creational_patterns.builder.before;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ZeroBaseBackEndSchool {
    private int price;
    private List<String> curriculum = new ArrayList<>();
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    public ZeroBaseBackEndSchool() {
    }

    public ZeroBaseBackEndSchool(int price, List<String> curriculum, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        this.price = price;
        this.curriculum = curriculum;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(List<String> curriculum) {
        this.curriculum = curriculum;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }
}
