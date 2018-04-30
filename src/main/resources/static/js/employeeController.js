
angular.module('ecole').controller('NewEmpController', ['$scope', '$http', function($scope, $http) {

 
	$scope.perso={};
	$scope.test={};
	$scope.employees=null;
	$rootScope.empt=null;
	
	$scope.saveEmp=function(){
		$http.post('http://localhost:8080/'+$scope.test.type+'/',$scope.perso)
	     .success(function(data){
		    $scope.perso =data;
		})
	     .error(function(err){
		     console.log(err);
	 });
	}
	
	 

	
	$scope.getEmployeeParType=function(){
		$http({
		      method: 'GET',
		      url: 'http://localhost:8080/'+$scope.emp.type
		   }).then(function (response){
			   
			   $scope.getEmpedded($scope.emp.type,response);
	
	  
		   },function (error){
			    console.log(err);
		   });
		}
	
	$scope.getempTest=function(){
		$http({
		      method: 'GET',
		      url: 'http://localhost:8080/professeurs/6'
		   }).then(function (response){
			   
			   $scope.empt=response.data;
	
	  
		   },function (error){
			    console.log(err);
		   });
		}
	
	
	//get elemets with empedded:
	$scope.getEmpedded=function(x,response){
		
		   if (x == "professeurs") {
               $scope.employees= response.data._embedded.professeurs;
			} 
		   
		   else if (x == "gestionnaires") {
               $scope.employees= response.data._embedded.gestionnaires;
			}
		   
		   else if (x == "femmeDeMenages") {
               $scope.employees= response.data._embedded.femmeDeMenages;
               $rootScope.typePersonne="femmeDeMenages"
		   }
		   
		   else if (x == "secretaires") {
               $scope.employees= response.data._embedded.secretaires;
		   }
		   
		   else if (x == "directeurs") {
               $scope.employees= response.data._embedded.directeurs;
           }
		   
		   else if (x== "chauffeurs") {
               $scope.employees= response.data._embedded.chauffeurs;
               
           }else if (x== "gardiens") {
               $scope.employees= response.data._embedded.gardiens;
           }
		   
           else {
               $scope.employees= response.data._embedded.aides;
               $rootScope.typePersonne="aides";
               
               
           }
		
		}
	
	$scope.getEmp=function(id){
		$rootScope.url=id;
		$http({
		      method: 'GET',
		      // url: 'http://localhost:8080/'+$scope.emp.type+'/'+id
		      //  url:  "\'"+id+"\'"
		      
		      url:id
		        
		   }).then(function (response){
			   $rootScope.empt=response.data;
	              // $scope.getEmpedded($scope.emp.type,response);
	  
		   },function (error){
			    console.log(err);
		   });
		}
	 
	
	$scope.delete = function(param){

	    var r = confirm("Are you sure?");
	    if (r == true) {
	    	
	       // your delete code
	    	
	    	$http({
			      method: 'DELETE',
			      url: $rootScope.url
			     
			     // data:
			   }).then(function (response){
				 //  $rootScope.empt=response.data;
		              // $scope.getEmpedded($scope.emp.type,response);
		  
			   },function (error){
				    console.log(err);
			   });
	    } else {

	    }

	}
// 
//	$scope.profs();
//	$scope.chauffeurs(chaffeurs);
//	$scope.menages();
	 
	// });
}]);