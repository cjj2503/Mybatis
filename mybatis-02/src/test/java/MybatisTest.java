import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @Autor $(CJJ)
 * @DATE 2021/8/11 20:20
 * @Computer CJJ_IT
 */
public class MybatisTest {
    //属性名和字段名不一致
    @Test
    public void getUserById() {
        //1、第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2、getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);
        //3、关闭SqlSession
        sqlSession.close();
    }
}
