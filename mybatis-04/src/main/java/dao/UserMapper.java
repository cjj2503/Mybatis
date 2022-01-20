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

    //分页
    List<User> getUserByLimit(Map<String,Integer> map);

}
