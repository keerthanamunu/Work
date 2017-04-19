(function(){
var module=angular.module("demo");
module.controller("pageCtrl1",function($scope){
	console.log("in page1Ctrl");
	$scope.content=["ramesh","suresh","naveen"];
});
module.controller("pageCtrl2",function($scope){
	$scope.content=["keeru","chandra","suji"];
});
module.controller("pageCtrl3",function($scope,$routeParams){
	$scope.content=["keeru","chandra","suji"];
	console.log($routeParams.name)
	if($routeParams.name=="keeru"){
		$scope.namek="my name is ............";
	};
	
});
})();