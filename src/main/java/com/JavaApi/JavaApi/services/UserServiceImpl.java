package com.JavaApi.JavaApi.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.JavaApi.JavaApi.entities.User;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private User userDao;
	
//	List<User> list;
	public UserServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new User(142,"Hritik Saxena","IT"));
//		list.add(new User(140,"Hritik Saxena","CS"));
	}

	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	}
	
	@Override
	public User getUser(long userId) {
//		User u=null;
//		for(User user:list) 
//		{
//			if(user.getId()==userId)
//			{
//				u=user;
//				break;
//			}
//		}
		return userDao.getone(userId);
	}
	@Override
	public User addUser(User user) {
//		list.add(user);
		userDao.save(user);
		return user;
	}
	@Override
	public User updateUser(User user) {
//		list.forEach(e ->{
//			if(e.getId()==user.getId()) {
//				e.setName(user.getName());
//				e.setDepartment(user.getDepartment());
//			}
//		});
		userDao.save(user);
		return user;
		
	}
	
	@Override
	public void deleteUser(long parseLong) {
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		User entity = userDao.getone(parseLong);
		userDao.delete(entity);
	}
	
	

}
