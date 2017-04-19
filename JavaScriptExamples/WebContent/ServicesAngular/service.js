var serviceModule=angular.module("serviceModule",[]);
serviceModule.factory('greetingService',function($http)
{	
	var greetingObj={
			sayHi:function(){
				return "hi from function";
							},
							
			sayHellos:function(){
				return "hellooooo from function";
			},
				
			getStudentDetails:function()
			{	
				var promise = $http.get("stuent.json");							
				return promise;
			}
	}
	
	return greetingObj;
});

