package dao;

import pojo.User;

import java.util.List;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/11 20:18
 * @Computer CJJ_IT
 */
public interface UserMapper {
    //2、根据id查询
    User getUserById(int id);
}
