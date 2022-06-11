# Demo 1

Creating a basic spring boot server with a unit test

# How to Build

```bash
mvn clean install
```

# How to Run

```bash
mvn spring-boot:run
```

# How to envoke

Post Example

```bash
curl --location --request POST 'localhost:8080/isPrime' \
--header 'Content-Type: application/json' \
--data-raw '{
    "potentialPrime": 11
}'
```