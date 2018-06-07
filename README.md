# A sample project using spring boot and redis. Jedis is the java client.

To run this demo follow the below steps:
* Download the redis zip file for windows from https://github.com/MicrosoftArchive/redis/releases.
* Start the Redis server(redis-server.exe). Redis accepts connection on default port 6379.
* Start the spring boot application to query REST endpoints on localhost:8082/book
* Operations supported: /book/add/{id}/{title}/{author}, /book/all, /book/update/{id}/{title}, /book/delete/{id}
