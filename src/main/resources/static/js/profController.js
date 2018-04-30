 

angular.module('ecole').controller('profController', ['$scope', '$http', function($scope, $http) {
//app.controller('profController',function($scope,$http){
    $scope.elevesList=null;
    $scope.matiersList=null;
    $scope.classesList=null;
    
    $scope.eleve={}
    $scope.matiere={}
	$scope.type={}
    $scope.classe={}
	$scope.absence={};
    $scope.devoir={};
    $scope.observation={};
    $scope.note={};
    $scope.cahierTexte={};
    
      //absence et retard     
		$scope.getEleves=function(){
			$http({
			      method: 'GET',
			      url: 'http://localhost:8080/eleves'
			   }).then(function (response){
		               $scope.elevesList = response.data._embedded.eleves;
		  
			   },function (error){
				    console.log(err);
			   });
			}	
		$scope.getEleves();
//		
		$scope.getMatieres=function(){
			$http({
			      method: 'GET',
			      url: 'http://localhost:8080/matieres'
			   }).then(function (response){
		               $scope.matieresList = response.data._embedded.matieres;
		  
			   },function (error){
				    console.log(err);
			   });
			}	
		$scope.getMatieres();
//		
		$scope.saveAbsenceRetard=function(){
		
			$http.post('http://localhost:8080/'+$scope.type.a+'/'+$scope.eleve.matricule+'/'+$scope.matiere.nomMatiere,$scope.absence)
			.then(function (response){
				if($scope.type.a=="absences"){
				$scope.absence=response.data._embedded.absences;} 
			
				else{
				$scope.absence=response.data._embedded.retards;} 
				
			   },function (error){
				    console.log(err);
			   });
			
			
			}
		
		//devoir
		$scope.saveDevoir=function(){
			
			$http.post('http://localhost:8080/devoirs/'+$scope.matiere.nomMatiere+'/'+$scope.classe.nomClasse,$scope.devoir)
			.then(function (response){
				 
				$scope.devoir=response.data._embedded.devoirs;
				
			   },function (error){
				    console.log(err);
			   });
			
			
			}	
		$scope.getClasses=function(){
			$http({
			      method: 'GET',
			      url: 'http://localhost:8080/classes'
			   }).then(function (response){
		               $scope.classesList = response.data._embedded.classes;
		  
			   },function (error){
				    console.log(err);
			   });
			}	
		$scope.getClasses();
		
		//observations:
		
         $scope.saveObservation=function(){
			
			$http.post('http://localhost:8080/observations/'+$scope.matiere.nomMatiere+'/'+$scope.eleve.matricule,$scope.observation)
			.then(function (response){
				 
				$scope.observation=response.data._embedded.observations;
				
			   },function (error){
				    console.log(err);
			   });
			
			}	
         //cahier de text:
         
         $scope.saveCahierText=function(){
 			
 			$http.post('http://localhost:8080/cahierTextes/'+$scope.matiere.nomMatiere+'/'+$scope.classe.nomClasse,$scope.cahierTexte)
 			.then(function (response){
 				 
 				$scope.cahierTexte=response.data._embedded.cahierTextes;
 				
 			   },function (error){
 				    console.log(err);
 			   });
 			
 			}
         //notes:
         
         $scope.saveNote=function(){
  			
  			$http.post('http://localhost:8080/notes/'+$scope.matiere.nomMatiere+'/'+$scope.eleve.matricule,$scope.note)
  			.then(function (response){
  				 
  				$scope.note=response.data._embedded.notes;
  				
  			   },function (error){
  				    console.log(err);
  			   });
  			
  			}
}]);