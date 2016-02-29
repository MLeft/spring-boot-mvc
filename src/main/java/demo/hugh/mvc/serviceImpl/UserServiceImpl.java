package demo.hugh.mvc.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.hugh.mvc.mapper.UserMapper;
import demo.hugh.mvc.po.User;
import demo.hugh.mvc.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	UserMapper userMapper;

	@Override
	public User getUserByName(String name) {

		return userMapper.selectByPrimaryKey(name);
	}

}
