package school;

import java.util.List;

public interface StudentService {
	
	 public int addStudent(Student obj);
	 public int updateDetails(Student obj);
	 public int deleteStudentDetail(int id);
	 public List<Student> getAllStudents();
	 public List<Student> getbyId(int id);
}
