package uz.project.jerseycrud.dto;

public class StudentDto {
    private Integer id;

    private String name;

    private String group;

    public StudentDto(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
