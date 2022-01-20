import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/11 20:20
 * @Computer CJJ_IT
 */
public class MybatisTest {
    @Test
    public void getUserByLimit(){
        /*1、固定*/
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userById = mapper.getUserById(1);
        User user=mapper.getUserById(2);
        System.out.println(user);
        System.out.println(userById);
        //2、固定
        sqlSession.close();
    }

}
