import dao.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Student;
import utils.MybatisUtils;

import java.util.List;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/11 20:20
 * @Computer CJJ_IT
 */
public class MybatisTest {
    /*1、测试普通查询方法（不完善）*/
    @Test
    public void testStudent(){
        /*1、固定*/
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        /*2、实现接口*/
        List<Student> studentList = mapper.getStudent();
        for (Student student1 : studentList) {
            System.out.println(student1);
        }
        //固定
        sqlSession.close();
    }

    /*2、测试多对一*/
    @Test
    public void testStudent2(){
        /*1、固定*/
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        /*2、实现接口*/
        List<Student> student = mapper.getStudent2();
        for (Student student2 : student) {
            System.out.println(student2);
        }
        //固定
        sqlSession.close();
    }

}
