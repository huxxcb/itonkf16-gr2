kubectl create -f ConfigServer/config-server-deployment.yaml
kubectl expose deployment haraldskrald-config --port=9000 --target-port=9000 --external-ip=192.168.1.21 -l visualize="true",run=haraldskrald-config
echo sleeping for 120 sec while configserver starts
sleep 120s
kubectl create -f gateway-ui/gateway-ui-deployment.yaml
kubectl expose deployment gateway-ui --port=8081 --target-port=8080 --external-ip=192.168.1.21 -l visualize="true",run=gateway-ui
kubectl create -f tentRest/tent-service-deployment.yaml
kubectl expose deployment tent-service --port=9001 --target-port=9001 --external-ip=192.168.1.21 -l visualize="true",run=tent-service
kubectl create -f bikeRest/bike-service-deployment.yaml
kubectl expose deployment bike-service --port=9002 --target-port=9002 --external-ip=192.168.1.21 -l visualize="true",run=bike-service
kubectl create -f hammerRest/hammer-service-deployment.yaml
kubectl expose deployment hammer-service --port=9003 --target-port=9003 --external-ip=192.168.1.21 -l visualize="true",run=hammer-service

