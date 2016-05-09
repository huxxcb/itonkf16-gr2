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
         };

         self.bikes = function(){
                     self.template = "bikes.html";
         };
    });