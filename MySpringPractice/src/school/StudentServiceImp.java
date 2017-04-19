package school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	StudentDAO StudentDao;

	@Override
	public int addStudent(Student obj) 
	{
		// TODO Auto-generated method stub
		System.out.println("Reached insert of Dao");
		int a=StudentDao.addStudent(obj);
		return a;
	}

	@Override
	public int updateDetails(Student obj) 
	{
		// TODO Auto-generated method stub
		int a=StudentDao.updateDetails(obj);
		return a;
	}

	@Override
	public int deleteStudentDetail(int id) 
	{
		// TODO Auto-generated method stub
		int a=StudentDao.deleteStudentDetail(id);
		return a;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> list = StudentDao.getAllStudents();
		return list;
	}

	@Override
	public List<Student> getbyId(int id) {
		// TODO Auto-generated method stub
		List<Student> list = StudentDao.getbyId(id);
		return list;
	}

}
