var module=angular.module("InsertRegistration",[]);
module.service("insertService",function(){
	this.insertEmp=function(userObj)
	{
		var userJSONText=JSON.stringify(userObj);	
		localStorage.setItem(userObj.uname,userJSONText);
		
	};
	
});