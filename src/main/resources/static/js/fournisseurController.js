angular.module('ecole').controller('NewFournisseurController', ['$scope', '$http', function($scope, $http) {
 
	$scope.fournisseur={};
	$scope.perso={};
	
	$scope.saveFournisseur=function(){
		
		$http.post('http://localhost:8080/fournisseurs',$scope.fournisseur)
		$http.post('http://localhost:8080/contacts/'+$scope.fournisseur.nom+'/',$scope.perso)
	     .success(function(data){
		    $scope.fournisseur =data;
		    $scope.perso =data;
		})
	     .error(function(err){
		     console.log(err);
	 });
	}
 




 
    $scope.fournisseurs=null;
	
	$scope.fournisseurs=function(){
	$http({
	      method: 'GET',
	      url: 'http://localhost:8080/eleves?page=1&size=2'
	   }).then(function (response){
               $scope.fournisseurs = response.data;
  
	   },function (error){
		    console.log(err);
	   });
	}
	
	$scope.fournisseurs();
	
	
	//});

}]);