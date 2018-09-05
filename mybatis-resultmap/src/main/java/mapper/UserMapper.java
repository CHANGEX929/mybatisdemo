package mapper;

/**
 * @Author Xie Chenxi
 * @Date 2018/9/5 9:54
 */

import pojo.User;

public interface UserMapper {
    User getById(Integer id);
}