import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;


/**
 * @Autor $(CJJ)
 * @DATE 2021/8/11 20:20
 * @Computer CJJ_IT
 */
public class MybatisTest {

    //使用log4j日志输出
    static Logger logger= Logger.getLogger(MybatisTest.class);

    //1、查询测试
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

    //2、log4j日志
    @Test
    public void log(){
        logger.info("info:");
        logger.warn("warnning:");
    }

}
