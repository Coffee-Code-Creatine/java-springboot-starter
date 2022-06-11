# Demo 1

Creating a basic spring boot server with an in memory database

# How to Build

```bash
mvn clean install
```

# How to Run

```bash
mvn spring-boot:run
```

# How to envoke

Get Example

```bash
curl --location --request GET 'localhost:8080/getItems'
```

Get Example

```bash
curl --location --request GET 'localhost:8080/getItem/3'
```

Post Example

```bash
curl --location --request POST 'localhost:8080/addItem' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "add a new item",
    "details": "making sure things work"
}'
```

Put Example

```bash
curl --location --request PUT 'localhost:8080/updateItem/3' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "add a new item",
    "details": "needed to change this"
}'
```

Delete Example

```bash
curl --location --request DELETE 'localhost:8080/deleteItem/3'
```
