import dao.TeacherMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Teacher;
import utils.MybatisUtils;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/11 20:20
 * @Computer CJJ_IT
 */
public class MybatisTest {
    /*1*/
    @Test
    public void testTeacher(){
        /*1、固定*/
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        /*2、传值*/
        Teacher teacher1 = mapper.getTeacher(1);
        System.out.println(teacher1);
        //固定
        sqlSession.close();
    }

    /*2、测试一对多*/
    @Test
    public void testTeacher2(){
        /*1、固定*/
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        /*2、传值*/
        Teacher teacher2 = mapper.getTeacher2(1);
        System.out.println(teacher2);
        //固定
        sqlSession.close();
    }

}
