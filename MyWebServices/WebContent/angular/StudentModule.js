var serviceModule=angular.module("StudentModule",[]);

serviceModule.service("StudentRegistrationService",function($http){
	this.registerStudent=function(sObj)
	{
		console.log("service register")
		var promise=$http.post("http://localhost:8080/MyWebServices/rest/studentWeb/insertStudentJSON",sObj);
		return promise;
	};
	
	this.getDetails=function()
	{
		console.log("service getdetails")
		var promise=$http.get("http://localhost:8080/MyWebServices/rest/studentWeb/studentJSON");
		return promise;
	};
	
	this.deleteStudent=function(id)
	{
		console.log("delete details")
		var promise=$http.delete("http://localhost:8080/MyWebServices/rest/studentWeb/delete?id="+id);
		return promise;
	};
	
	this.updateStudent=function(sObj)
	{
		console.log("update service details")
		var promise=$http.post("http://localhost:8080/MyWebServices/rest/studentWeb/update",sObj);
		return promise;
	};
});

