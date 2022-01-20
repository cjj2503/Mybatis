package dao;
import org.apache.ibatis.annotations.Param;
import pojo.Teacher;
public interface TeacherMapper {
    //List<Teacher> getTeacher();
    //获取指定老师下的所有的学生

    //@Param注解的作用是给参数命名，参数命名后就能根据名字得到参数值，正确的将参数传入sql语句中
    //给入参id命名为tid
    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id);
}
