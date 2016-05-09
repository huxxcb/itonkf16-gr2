angular.module('gateway', []).controller('navigation',
    function($http) {
        var self = this;

        self.template = "home.html";
        self.home = function(){
            self.template = "home.html";
        }

        self.hammers = function(){
            self.template = "hammers.html";
        };
        
        self.tents = function(){
            self.template = "tents.html"
        }
    });