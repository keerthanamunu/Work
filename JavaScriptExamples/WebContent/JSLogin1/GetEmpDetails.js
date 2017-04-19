var module=angular.module("GetEmpDetails",[]);
module.factory("EmpDetails",function(){
	
	var obj={
			
			getEmp:function()
			{	
				alert("Get employeesss in factory obj getEmp");
				var details = [];

				for (var i = 0; i < localStorage.length; i++) 
				{
					var key = localStorage.key(i);
					var JSONobj = localStorage.getItem(key);
					var JSobject = JSON.parse(JSONobj);
					details.push(JSobject);
				}
				return details;
			}
			
		}
	return obj;
});