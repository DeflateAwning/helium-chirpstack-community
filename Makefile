POSTGRESIP=$(shell docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' `docker ps | grep postgres | cut -d " " -f 1`) 
REDISIP=$(shell docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' `docker ps | grep redi | cut -d " " -f 1`) 
MQTTIP=$(shell docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' `docker ps | grep mosqui | cut -d " " -f 1`) 
NETWORK=$(shell docker network ls | grep chirpstack | cut -d " " -f 1)
.FORCE:
build: .FORCE
	./gradlew build -x test && docker build -t disk91/console .
start:
	-docker rm console
	docker run --name console \
	           --restart always \
	           --port 8090:8090 \
               --network=$(NETWORK) \
	           --add-host postgres:$(POSTGRESIP) \
               --add-host redis:$(REDISIP) \
               --add-host mqtt:$(MQTTIP) \
       	       -d disk91/console


