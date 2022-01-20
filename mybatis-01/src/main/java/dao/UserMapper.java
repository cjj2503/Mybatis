package dao;
import pojo.User;
import java.util.List;
import java.util.Map;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/11 20:18
 * @Computer CJJ_IT
 */
public interface UserMapper {
    //1、查询全部用户
    public List<User> getUserList();
    //一、CRUD
    //2、根据id查询
    User getUserById(int id);
    //3、添加操作
    int addUser(User user);
    //4、更新操作
    int updateUser(User user);
    //5、删除操作:根据id删除
    int deleteUser(int id);
    //6、万能Map
    int addUser2(Map<String,Object> map);

}
