# Demo 1

Creating a basic spring boot server with a singular rest call that can be dockerized.

# How to Build App

```bash
mvn clean install
```

## How to Build Container

```bash
docker build -t bootdocker:1 .
```

# How to Run App

```bash
mvn spring-boot:run
```

# How to Run Container

```bash
docker run -d --name bootdocker -p 8080:8080 bootdocker:1
```

# How to Stop Container

```bash
docker kill {ID}
```

Container ID can be found by running:

```bash
docker ps
```

# How to envoke

This invocation will work for both the app, and the containerized app
Get Example

```bash
curl --location --request GET 'localhost:8080/helloWorld'
```