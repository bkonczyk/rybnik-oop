package pl.sda.collections.maps;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class FirstMap {

    public static void main(String[] args) {
        Map<String, EmploymentInfo> empIds = new HashMap<>();
        empIds.put("Andrew", new EmploymentInfo(2000, LocalDate.of(1990, 4, 10)));
        empIds.put("Maryla", new EmploymentInfo(6000, LocalDate.of(2011, 4, 10)));
        empIds.put("Joseph", new EmploymentInfo(6000, LocalDate.of(2015, 4, 10)));
        System.out.println(empIds);
    }
}

class EmploymentInfo {
    Integer id;
    LocalDate employmentDate;

    public EmploymentInfo(Integer id, LocalDate employmentDate) {
        this.id = id;
        this.employmentDate = employmentDate;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    @Override
    public String toString() {
        return "{id=" + id +
                ", employmentDate=" + employmentDate +
                '}';
    }
}