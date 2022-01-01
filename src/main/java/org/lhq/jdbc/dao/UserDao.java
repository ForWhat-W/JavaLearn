package org.lhq.jdbc.dao;

import org.lhq.anno.Select;
import org.lhq.entity.User;

import java.util.List;

public interface UserDao {
    @Select(sql = "select * from wd_user where user_id = 1")
    User selectOne();
    @Select(sql = "select * from wd_user")
    List<User> selectUserList();
}
