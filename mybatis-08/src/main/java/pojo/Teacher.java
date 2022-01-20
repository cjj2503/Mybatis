package pojo;

import lombok.Data;

import java.util.List;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/14 21:39
 * @Computer CJJ_IT
 */
@Data
public class Teacher {
    private int id;
    private String name;

    //一个老师拥有多个学生
    private List<Student> students;
}

