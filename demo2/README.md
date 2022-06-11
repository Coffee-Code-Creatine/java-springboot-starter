# Demo 2

Creating a basic spring boot server with a post and a get call

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
curl --location --request POST 'localhost:8080/addItem' \
--header 'Content-Type: application/json' \
--data-raw '{
    "key":"dummyKey",
    "value":"dummyValue"
}'
```

Get Example

```bash
curl --location --request GET 'localhost:8080/getItem/dummyKey'
```