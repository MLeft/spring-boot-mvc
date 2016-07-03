package demo.hugh.mvc.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.hugh.mvc.mapper.UserMapper;
import demo.hugh.mvc.po.User;
import demo.hugh.mvc.po.UserExample;
import demo.hugh.mvc.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	private static Logger log = Logger.getLogger(UserServiceImpl.class);

	@Resource
	UserMapper userMapper;

	@Override
	public User getUserByName(String name) {

		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo(name);
		List<User> list = userMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else if (list.size() > 1) {
			log.warn("根据user_name[" + name + "]查找到多条数据！");
		}
		return list.get(0);
	}

}
