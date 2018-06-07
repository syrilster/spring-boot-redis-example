# A sample project using spring boot and redis. Jedis is the java client.

To run this demo follow the below steps:
* Download the redis zip file for windows from https://github.com/MicrosoftArchive/redis/releases.
* Start the Redis server(redis-server.exe). Redis accepts connection on default port 6379.
* Start the spring boot application to query REST endpoints on localhost:8082/book
* Operations supported: /book/add/{id}/{title}/{author}, /book/all, /book/update/{id}/{title}, /book/delete/{id}
* Jedis is a blazingly small and sane Redis java client.

## So what can I do with Jedis?
All of the following redis features are supported:

- Sorting
- Connection handling
- Commands operating on any kind of values
- Commands operating on string values
- Commands operating on hashes
- Commands operating on lists
- Commands operating on sets
- Commands operating on sorted sets
- Transactions
- Pipelining
- Publish/Subscribe
- Persistence control commands
- Remote server control commands
- Connection pooling
- Sharding (MD5, MurmurHash)
- Key-tags for sharding
- Sharding with pipelining
- Scripting with pipelining
- Redis Cluster
