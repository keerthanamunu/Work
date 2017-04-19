var module=angular.module("routeApp");

module.controller("loginController",function($scope,$location,$rootScope){
    console.log("loginController");

    $scope.clicking=function() {
        //console.log($scope.loginForm);
        $location.path("employee");
        $rootScope.currentUser=$scope.loginForm;

        /*if ($scope.loginForm.userName == 'ramesh' && $scope.loginForm.phoneNo == 1234567890) {
            $location.path("employee");
        } else {
            $scope.errorMsg = 'invalid username and password'
        }*/
    }
})

module.controller("registrationController",function($scope){
    console.log("inside the registration");
    $location.path("login");
})


module.controller("employeeController", function ($scope) {
    $scope.employees = [
        { name: "ramesh", department: "software", salary: 56561.1, age: 35 },
        { name: "suresh", department: "account", salary: 25656.50, age: 75 },
        { name: "dhinesh", department: "software", salary: 2565.120, age: 78 },
    ];

    var selectedDepartment= null;
    $scope.selectDepartmentHandler = function (dept) {
        console.log('selected department:'+dept);
        selectedDepartment = dept;
    }
    $scope.departmentFilterFn = function (employee) {
        console.log('inside department filter function:'+employee.department);
        return selectedDepartment == null ||
            employee.department == selectedDepartment;
    }

});

module.controller("employeeDetailsController", function ($scope,$routeParams) {
    console.log("employeeDetailsController");
    console.log($routeParams);
    $scope.employee = { name: "ramesh", department: "software", salary: 56561.1, age: 35 };
});


module.controller("employeeMainController", function ($scope,$rootScope,$location) {

    console.log('inside the root controller');

    $rootScope.$on('$locationChangeStart', function (event, next, current) {

        console.log('inside the root $locationChangeStart');
        console.log('inside the root $locationChangeStart'+$location.path());

        var restrictedPage = true;
        if($location.path()=='/login' &&  $location.path() =='/register') {
            restrictedPage = false;
        }

        console.log('employeeDetailsController');
        console.log(restrictedPage);
        console.log($rootScope);

        var loggedIn = $rootScope.currentUser;
        if (restrictedPage && !loggedIn) {
            $location.path('/login');
        }
    });

})