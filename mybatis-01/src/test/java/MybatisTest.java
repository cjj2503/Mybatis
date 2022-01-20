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
    //mybatis初体验
    @Test
    public void test() {
        //1、第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2、方式一：getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //获取所有数据，存储到列表中
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        //3、关闭SqlSession
        sqlSession.close();
    }

    /*CRUD
    固定操作：
    1、获得SqlSession对象
    2、反射获取Mapper
    3、mapper.xxxx
    4、提交事务
    5、关闭
    */
    //查询操作
    @Test
    public void getUserById() {
        //1、获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2、反射获取Mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //获取id值存储到User中
        User user = mapper.getUserById(4);
        //打印值
        System.out.println(user);
        //3、提交事务
        sqlSession.commit();
        //4、关闭SqlSession
        sqlSession.close();
    }

    //添加操作
    @Test
    public void addUser() {
        //1、获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2、反射获取Mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //插入值
        int user = mapper.addUser(new User(7, "CJJ07", "15207"));
        //打印值
        System.out.println(user);
        //3、提交事务
        sqlSession.commit();
        //4、关闭SqlSession
        sqlSession.close();
    }

    //更新操作
    @Test
    public void updateUser() {
        //1、获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2、反射获取Mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //更新值
        int user = mapper.updateUser(new User(7, "DKK", "15207"));
        //打印值
        System.out.println(user);
        //3、提交事务
        sqlSession.commit();
        //4、关闭SqlSession
        sqlSession.close();
    }

    //删除操作
    @Test
    public void deleteUser() {
        //1、获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2、反射获取Mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //删除值
        int user = mapper.deleteUser(6);
        //打印值
        System.out.println(user);
        //3、提交事务
        sqlSession.commit();
        //4、关闭SqlSession
        sqlSession.close();
    }
    //Map操作
    @Test
    public void addUser2(){
        //1、获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2、反射获取Mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userid",6);
        map.put("username","DKK23");
        map.put("password","123321");
        mapper.addUser2(map);
        //3、提交事务
        sqlSession.commit();
        //4、关闭SqlSession
        sqlSession.close();
    }
}
