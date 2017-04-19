var serviceModule=angular.module("courseModule",[]);

serviceModule.service("CourseRegistrationService",function(){
	this.registerCourse=function(cObj)
	{
		var CourseJSONText=JSON.stringify(cObj);	
		localStorage.setItem(cObj.courseId,CourseJSONText);
	};
});

serviceModule.service("CourseDetailService",function(){
	
	this.getCourseDetails=function()
	{
		var courseDetails = [];

		for (var i = 0; i < localStorage.length; i++) 
		{
			var key = localStorage.key(i);
			var JSONobj = localStorage.getItem(key);
			var JSobject = JSON.parse(JSONobj);
			courseDetails.push(JSobject);
		}
		return courseDetails;
	};
});


/*serviceModule.service("studentService",function($http){
	this.getStudentDetail=function(){
		var promise=$http.get("student.json");
		var student={};
		promise.success(function(response){
			return student;
		});
	};
});
*/



