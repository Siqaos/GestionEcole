angular.module('ecole').controller('serviceController', ['$scope', '$http', function($scope, $http) {

    $scope.professeursList=null;
    $scope.aidesList=null;
    $scope.garde={}
	$scope.prof={};
    $scope.aide={};
    
           
		$scope.getProfesseurs=function(){
			$http({
			      method: 'GET',
			      url: 'http://localhost:8080/professeurs'
			   }).then(function (response){
		               $scope.professeursList = response.data._embedded.professeurs;
		  
			   },function (error){
				    console.log(err);
			   });
			}	
		$scope.getProfesseurs();
		
		$scope.getAides=function(){
			$http({
			      method: 'GET',
			      url: 'http://localhost:8080/aides'
			   }).then(function (response){
		               $scope.aidesList = response.data._embedded.aides;
		  
			   },function (error){
				    console.log(err);
			   });
			}	
		$scope.getAides();
		
		$scope.saveGarde=function(){
		//	$scope.matricule={};
//			$http.post('http://localhost:8080/gardes/'+$scope.matricule.prof,$scope.garde)
//			.then(function (response){
//				$scope.garde=response.data;     
//			   },function (error){
//				    console.log(err);
//			   });
			
			//$http({
//			      method: 'POST',
//			      url: 'http://localhost:8080/gardes/'+$scope.prof.matricule+'/'+$scope.aide.matricule,
//			      data:$scope.garde
			      $http.post('http://localhost:8080/gardes/'+$scope.prof.matricule+'/'+$scope.aide.matricule,$scope.garde)
 				
			   .then(function (response){
					 $scope.garde=response.data._embedded.gardes;  
		  
			   },function (error){
				    console.log(err);
			   });
			}	

		//$scope.professeursList=Object.keys($scope.professeursList);
}]);