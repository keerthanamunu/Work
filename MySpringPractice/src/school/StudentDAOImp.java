package school;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDAOImp implements StudentDAO {


	@Autowired
	private JdbcTemplate jdbcTemplate;


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addStudent(Student obj) 
	{
		// TODO Auto-generated method stub
		String query=" insert into school values("+obj.getId()+",'"+obj.getName()+"',"+obj.getMarks()+","+obj.getAge()+")";
		int output = jdbcTemplate.update(query);
		System.out.println(output);
		return output;
	}

	@Override
	public int updateDetails(Student obj1) 
	{
		// TODO Auto-generated method stub
		String query=" update school set name='"+obj1.getName()+"',age="+obj1.getAge()+",marks="+obj1.getMarks()+"where id="+obj1.getId();
		int output = jdbcTemplate.update(query);
		System.out.println(output);
		return output;
	}

	@Override
	public int deleteStudentDetail(int id) {
		// TODO Auto-generated method stub
		System.out.println("Id   :"+id);
		String query="delete from school where id='"+id+"'";
		int output = jdbcTemplate.update(query);
		System.out.println("Deleted in DAO"+output);
		return output;
	}

	@Override
	public List<Student> getAllStudents()
	{
		//check query forlist- it will be called many times
		//List<Student> studentList = jdbcTemplate.query(query)
		/*Employee e=jdbcTemplate.queryForObject("select * from Employee where id = 1001", new EmployeeMapper());
		List<Employee> actors = this.jdbcTemplate.query(
        "select * from Employee", new EmployeeMapper());
        query is simple returns list
        queryforObject - one value*/
		int rowCount= this.jdbcTemplate.queryForObject("select count(*) from school",Integer.class);
		System.out.println(rowCount);
		String query="select * from school";

		List<Student> studentList = jdbcTemplate.query(query, new RowMapper<Student>()
		{
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException
			{

				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setMarks(rs.getInt(3));
				s.setAge(rs.getInt(4));
				return s;
			}
		});
		return studentList;

	}

	@Override
	public List<Student> getbyId(int id) {
		// TODO Auto-generated method stub
		String query= " select * from school where id="+id;

		List<Student> studentList = jdbcTemplate.query(query, new RowMapper<Student>()
		{
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException{

				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setMarks(rs.getInt(3));
				s.setAge(rs.getInt(4));
				return s;
			}
		});
		return studentList;
	}

}
