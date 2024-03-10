This project is replicated from [Spring Boot Integration Testing with Test Containers (PostgreSQL)](https://blog.devgenius.io/spring-boot-integration-testing-with-test-containers-postgresql-fcb8e46d43b3) and [GitHub Repository](https://github.com/mertcakmak2/Medium-Stories-Projects/tree/master/spring-test-containers).

# Integration Test

Start up PostgreSQL server with _user-db_ database before executing the integration tests.

## Create Image
```
docker pull postgres:latest
```

## Create/Start PostgresSQL Container
```
docker run --name spring-test-postgres-container -e POSTGRES_PASSWORD=mysecretpassword -e POSTGRES_DB=user-db -p 5432:5432 -d postgres
```

## Access PostgresSQL Database/Container
```
docker exec -it spring-test-postgres-container psql -U postgres
```

# The application can be run from IntelliJ
## Invoke the API either from Postman or using curl
```
C:\Users\kenwu>curl http://localhost:8080/api/v1/users
[{"id":"1","name":"Ada"},{"id":"2","name":"Bob"}]
C:\Users\kenwu>curl http://localhost:8080/api/v1/users/2
{"id":"2","name":"Bob"}
```