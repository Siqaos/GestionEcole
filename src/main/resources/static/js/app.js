angular.module('ecole',[]);
var app = angular.module('ecole',['ui.router','angularUtils.directives.dirPagination']);
app.config(function($stateProvider,$urlRouterProvider){
	
	 
	$stateProvider.state('newEleve',{
		url:'/newEleve',
		templateUrl:'views/newEleve.html',
		controller:'NewResponsableController'

});
	

	$stateProvider.state('newInscription',{
		url:'/newInscription',
		templateUrl:'inscription.html',
		controller:'NewResponsableController'

	});
	
	$stateProvider.state('fraisinscription',{
		url:'/fraisinscription',
		templateUrl:'views/fraisinscription.html',
		controller:'fraisinscriptionController'

});
	
	$stateProvider.state('listeinscriptions',{
		url:'/listeinscriptions',
		templateUrl:'views/listeinscriptions.html',
		controller:'listeinscriptions'

});
	
//	$stateProvider.state('listedeseleves',{
//		url:'/listeEleves',
//		templateUrl:'views/listeEleves.html',
//		controller:'listedeseleves'
//
//});
	
	
	//Directeur
	
	
	$stateProvider.state('listeprofesseurs',{
		url:'/listeprofesseurs',
		templateUrl:'views/directeur/listedesprofesseurs.html',
		controller:'listeprofesseurs'

	});
	
	$stateProvider.state('ficheProf',{
		url:'/ficheProf',
		templateUrl:'views/directeur/ficheprofesseur.html',
		controller:'listeprofesseurs'

	});
	
	$stateProvider.state('listematieres',{
		url:'/listematieres',
		templateUrl:'views/directeur/listedescours.html',
		controller:'listematieres'

	});
	
	$stateProvider.state('listeniveaux',{
		url:'/listeniveaux',
		templateUrl:'views/directeur/listedeniveau.html',
		controller:'listeniveaux'

	});
	

	$stateProvider.state('listeeleves',{
		url:'/listeeleves',
		templateUrl:'views/directeur/listedeseleves.html',
		controller:'listeeleves'

	});
	
	$stateProvider.state('newMatiere',{
		url:'/newMatiere',
		templateUrl:'views/directeur/ajoutdecours.html',
		controller:'newMatiere'

	});
		
	$stateProvider.state('newNiveau',{
		url:'/newNiveau',
		templateUrl:'views/directeur/ajoutdeniveau.html',
		controller:'newNiveau'
	});
	
	$stateProvider.state('ficheEleve',{
		url:'/ficheEleve',
		templateUrl:'views/directeur/ficheetudiant.html',
		controller:'listeeleves'
	});
});

 

	app.controller('NewEleveController',function($scope,$http){
		$scope.eleve={};
		$scope.saveEleve=function(){
			$http.post('http://localhost:8080/eleves',$scope.eleve)
		    .success(function(data){
			    $scope.eleve=data;
			})
		    .error(function(err){
			     console.log(err);
		    });
		}
	});

//    $http.post('http://localhost:8080/responsables/',$scope.respo)
	
//	app.controller('NewResponsableController',function($scope,$http){
//    	$scope.eleve={};
//    	$scope.respo={};
//		$scope.saveInscription=function(){	
//			$http.post('http://localhost:8080/eleves/',$scope.eleve,$scope.respo])
//	        .success(function(data){
//	        	$scope.eleve=data;
//	        	$scope.respo=data;
//	        })
//	        .error(function(err){
//	        	console.log(err);
//	        });
//		}	
//	});

	
	
	app.controller('NewResponsableController',function($scope,$http){
    	$scope.eleve={};
    	$scope.respo={};
		$scope.saveInscription=function(){	
			$http.post('http://localhost:8080/eleves/',$scope.eleve)
			$http.post('http://localhost:8080/responsables/',$scope.respo)
	        .success(function(data){
	        	$scope.eleve=data;
	        	$scope.respo=data;
	        	$scope.eleve.responsable=$scope.respo;
	        })
	        .error(function(err){
	        	console.log(err);
	        });
		}	
	});
	
	

app.controller('listeinscriptions',function($scope,$http){
	$scope.eleves=null;
	$scope.nbreleves=0;
	$scope.motCle="";
	$scope.pageCourante=0;
	$scope.size=100;
	$scope.pages=[];
//	$scope.chercherEleves=function(){
	$http.get('http://localhost:8080/chercherEleves?mc='+$scope.motCle+"&page="+$scope.pageCourante+"&size="+$scope.size)
	    .success(function(data){
		    $scope.eleves=data;
//		    $scope.nbreleves=data.length;
//		    $scope.pages=new Array(data.totalPages)
	     })
	     .error(function(err){
		     console.log(err);
	     });
//	}

	
	$scope.sort = function(keyname){
	    $scope.sortKey = keyname;   //set the sortKey to the param passed
	    $scope.reverse = !$scope.reverse; //if true make it false and vice versa
	}
	
});



app.controller('listedeseleves',function($scope,$http){
	$scope.eleves=null;
	$http.get('http://localhost:8080/listeEleves?mc=')
	     .success(function(data){
	    	 $scope.eleves=data;
	     })
	     .error(function(err){
		     console.log(err);
	     });

});


//Directeur

//////Professeur

app.controller('listeprofesseurs',function($scope,$rootScope,$http){
	$scope.professeurs=null;
	$scope.professeur=null;
	$scope.motCle="";
	$scope.pageCourante=0;
	$scope.size=100;
	$scope.pages=[];
	$rootScope.prof=null;
	
//	$scope.afficherlistProf=function(){
	$http({
	      method: 'GET',
	      url: 'http://localhost:8080/chercherProfesseurs?mc='+$scope.motCle+"&page="+$scope.pageCourante+"&size="+$scope.size
	   }).then(function (response){
         $scope.professeurs = response.data;
         document.getElementById("fiche").style.display = "block";
//         window.scrollTo(0,820);
	   },function (error){
		    console.log(err);
	   });
	
//	}
	
	$scope.afficher=function(id){
		$http({
		      method: 'GET',
		      url: 'http://localhost:8080/professeurs/'+id
		   }).then(function (response){
	           $scope.professeur = response.data;
	           document.getElementById("fiche").style.display = "block";
//	           window.scrollTo(0,820);
		   },function (error){
			    console.log(err);
		   });
	}
	
	$scope.getProf=function(id){
		$rootScope.url=id;
		$http({
		      method: 'GET',
		      // url: 'http://localhost:8080/'+$scope.emp.type+'/'+id
		      //  url:  "\'"+id+"\'"
		      
		      url:id
		        
		   }).then(function (response){
			   $rootScope.prof=response.data;
	              // $scope.getEmpedded($scope.emp.type,response);
	  
		   },function (error){
			    console.log(err);
		   });
		}
	
	
	
	
	$scope.sort = function(keyname){
	    $scope.sortKey = keyname;   //set the sortKey to the param passed
	    $scope.reverse = !$scope.reverse; //if true make it false and vice versa
	}
	
});



app.controller('listematieres',function($scope,$http){
    $scope.matieres=null;
	
//	$scope.matieres=function(){
	$http({
	      method: 'GET',
	      url: 'http://localhost:8080/matieres'
	   }).then(function (response){
               $scope.matieres = response.data;
  
	   },function (error){
		    console.log(err);
	   });
//	}

});


app.controller('listeniveaux',function($scope,$http){
	$scope.niveaux=null;
//	$http.get('http://localhost:8080/niveaux')
//	     .success(function(data){
//	    	 $scope.niveaux=data;
//	     })
//	     .error(function(err){
//		     console.log(err);
//	     });
	$http({
	      method: 'GET',
	      url: 'http://localhost:8080/niveaux'
	   }).then(function (response){
             $scope.niveaux = response.data;

	   },function (error){
		    console.log(err);
	   });

});


app.controller('listeeleves',function($scope,$http){
	$scope.eleves=null;
	$scope.eleve=null;
//	$scope.eleve1=null;
	$http({
	      method: 'GET',
	      url: 'http://localhost:8080/eleves'
	   }).then(function (response){
           $scope.eleves = response.data;

	   },function (error){
		    console.log(err);
	   });
	
	$scope.valider=function(id){	
//		$http.get('http://localhost:8080/eleves/'+id)
//        .success(function(data){
//        	$scope.eleve=data;
//        	$scope.eleve.etats=true;
//        })
//        .error(function(err){
//        	console.log(err);
//        });		
		
		$http.put('http://localhost:8080/eleves/'+id,$scope.eleve)
        .success(function(data){
        	$scope.eleve.nom="";
        })
        .error(function(err){
        	console.log(err);
        });
		
	}
	
	$scope.fiche=function(id){
		$http({
		      method: 'GET',
		      url: 'http://localhost:8080/eleves/'+id
		   }).then(function (response){
	           $scope.eleve = response.data;
	           document.getElementById("fiche").style.display = "block";
//	           window.scrollTo(0,820);
		   },function (error){
			    console.log(err);
		   });
		
	}

});



app.controller('ficheEleve',function($scope,$http){
	$scope.eleve={};
	$scope.saveEleve=function(){
		$http.post('http://localhost:8080/eleves',$scope.eleve)
	    .success(function(data){
		    $scope.eleve=data;
		})
	    .error(function(err){
		     console.log(err);
	    });
	}
});



app.controller('newMatiere',function($scope,$http){
	$scope.matiere={};
	$scope.niveaux=null;
	
	$http.get('http://localhost:8080/niveaux')
    .success(function(data){
    	$scope.niveaux=data;
    })
    .error(function(err){
    	console.log(err);
    });
	
	$scope.saveCours=function(){	
		$http.post('http://localhost:8080/matieres/',$scope.matiere)
        .success(function(data){
        	$scope.matiere=data;
        })
        .error(function(err){
        	console.log(err);
        });		
	}	
});


app.controller('newNiveau',function($scope,$http){
	$scope.niveau={};
	$scope.saveNiveau=function(){	
		$http.post('http://localhost:8080/niveaux/',$scope.niveau)
        .success(function(data){
        	$scope.niveau=data;
        })
        .error(function(err){
        	console.log(err);
        });
	}	
});