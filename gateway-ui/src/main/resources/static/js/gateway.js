angular.module('gateway', []).controller('navigation',
    function($http) {
        var self = this;

        self.template = "home.html";
        self.home = function(){
            self.template = "home.html";
        }

        self.hammers = function(){
            self.template = "hammers.html";
            $http.get('hammers', {
                        }).success(function(data) {
                            self.hammerList = data;
                        }).error(function() {
                            alert("Error");
                        });
        };


         self.tents = function(){
                    self.template = "tents.html";
             $http.get('tents', {
             }).success(function(data) {
                 self.tentList = data;
             }).error(function() {
                 alert("Error");
             });
         };

         self.bikes = function(){
            self.template = "bikes.html";
            $http.get('bikes', {
                        }).success(function(data) {
                            self.bikeList = data;
                        }).error(function() {
                            alert("Error");
                        });
         };

    });